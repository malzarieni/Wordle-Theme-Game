
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.text.Document;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.Scanner;
import linkedList.LinkedList;
import main.Handler;
import wordle.Categories;

public class WOW1 extends Frame {

    private final String green = "\u001b[32m";
    private final String yellow = "\u001b[33m";
    private final String magenta = "\u001b[35m";
    private final String gray = "\u001b[30m";
    private final String reset = "\033[0m";

    private JPanel startPanel;
    private JPanel buttonPanel;
    private JPanel inputPanel;
    private JPanel hintButtonPanel;
    private JPanel rpsPanel;
    private JButton startButton;
    private JButton howToPlayButton;
    private JButton[] gameButton;
    private JButton[] difficultyButton = new JButton[3];
    private JPanel exitPanel;

    private LinkedList random = new LinkedList();
    private LinkedList guess = new LinkedList();
    private LinkedList copy = new LinkedList();
    private Categories cat = new Categories();
    private Handler h = new Handler();
    private String currentCategory;
    private String currentDifficulty;
    private String correctWord = "test";
    private String hint = "testing";
    private String userTest = "";
    private int f = 0;
    private int d = 0;

    private JPanel rockPaperScissorsPanel;
    private CardLayout cardLayout;
    private JLabel scoreLabel;
    private JButton[] choiceButtons;
    private JLabel resultLabel;
    private JLabel computerChoiceLabel;
    private int userScore = 0;
    private int computerScore = 0;
    private int rpsTries = 0;
    private boolean rpsWin = false;

    public WOW1() {
        // Set up the JFrame
        setUndecorated(true); // Remove window decorations (title bar, borders)
        setLayout(new BorderLayout());

        // Label with image
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon(getClass().getResource("/wow.png"));
        setIconImage(img.getImage());
        label.setIcon(img);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Create and add a red panel
        startPanel = new JPanel(new BorderLayout());
        startPanel.add(label, BorderLayout.NORTH);
        add(startPanel, BorderLayout.NORTH);

        // Create and add a button panel with "Start" and "How to Play" buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        startButton = createStyledButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hide the button panel when Start button is clicked
                buttonPanel.setVisible(false);
                showCategoryButtons();
            }
        });

        howToPlayButton = createStyledButton("How to Play");
        howToPlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "<html><body style='width: 300px;'>"
                        + "<h2 style='color: #FF5733;'>How to Play</h2>"
                        + "<p>War Of Words is a word puzzle game where you have to guess a phrase that consists of several words. You have only six tries to correctly guess the phrase, and each guess must include only valid words. With each new guess, you will receive colored clues about the placement of letters in individual words and in the entire phrase. There are 4 types of color hints in total:</p>"
                        + "<p style='color: #32CD32;'>[Green] - The letter is in the first word and in the correct position.</p>"
                        + "<p style='color: #FFD700;'>[Yellow] - Although it is in the first word, the letter is in the incorrect location.</p>"
                        + "<p style='color: #800080;'>[Purple] - The letter is not in this word, but it is in another word of the phrase..</p>"
                        + "<p style='color: #808080;'>[Gray] - Letters are not in the phrase.</p>"
                        + "</body></html>";

                JOptionPane.showMessageDialog(null, message, "How to Play", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(startButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(howToPlayButton, gbc);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setVisible(false);

        // Create and add a button to exit the program
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("serif", Font.BOLD, 20));
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFocusPainted(false);
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        exitButton.setPreferredSize(new Dimension(200, 75));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the program when the button is clicked
            }
        });
        exitPanel = new JPanel();
        exitPanel.add(exitButton);
        add(exitPanel, BorderLayout.SOUTH);
        exitPanel.setVisible(false);

        // Timer to make the red panel disappear after 3 seconds
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startPanel.setVisible(false); // Hide the red panel after 3 seconds
                buttonPanel.setVisible(true);
                exitPanel.setVisible(true);
                setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
        timer.setRepeats(false); // Only execute once
        timer.start();

        pack();
        setLocationRelativeTo(null);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("serif", Font.BOLD, 30));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        button.setPreferredSize(new Dimension(500, 150));
        return button;
    }

    private void showCategoryButtons() {
        JPanel gameButtonPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        gameButtonPanel.setBackground(Color.BLACK);

        String[] buttonNames = {"Countries", "Games", "Movies", "Currencies", "Fruits", "Animals", "Instruments",
            "Special"};
        String[] imagePaths = {"/Countries test.png", "/Games test.png", "/Movies test.png",
            "/Currencies test.png", "/Fruits test.png", "/Animals test.png", "/Instruments test.png",
            "/Special test.png"};

        // Create and add the buttons
        for (int i = 0; i < buttonNames.length; i++) {
            gameButton = new JButton[buttonNames.length];
            if (i < imagePaths.length) {
                // If there's an image path for this button, set its icon
                ImageIcon buttonImg = new ImageIcon(getClass().getResource(imagePaths[i]));
                gameButton[i] = new JButton((i + 1) + ": " + buttonNames[i], buttonImg);
            } else {
                // For buttons without images, just set text
                gameButton[i] = new JButton((i + 1) + ": " + buttonNames[i]);
            }
            gameButton[i].setForeground(Color.WHITE);
            gameButton[i].setBackground(Color.BLACK);
            gameButton[i].setFont(new Font("serif", Font.BOLD, 70));
            gameButton[i].setFocusPainted(false);
            gameButton[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
            gameButton[i].setPreferredSize(new Dimension(400, 150));
            int index = i;
            gameButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Hide the category buttons
                    gameButtonPanel.setVisible(false);

                    if (buttonNames[index].equalsIgnoreCase("special")) {
                        currentCategory = buttonNames[index];
                        System.out.println(currentCategory);
                        // Special case for "special" category
                        showSpecialButtons(gameButtonPanel);
                    } else {
                        // Store the current category
                        currentCategory = buttonNames[index];
                        System.out.println(currentCategory);
                        // Show difficulty buttons
                        showDifficultyButtons(gameButtonPanel);
                    }
                }
            });
            gameButtonPanel.add(gameButton[i]);
        }
        add(gameButtonPanel, BorderLayout.CENTER);
        gameButtonPanel.setVisible(true);
    }

    private void showSpecialButtons(JPanel previousPanel) {
        JPanel specialButtonPanel = new JPanel(new BorderLayout());
        specialButtonPanel.setBackground(Color.BLACK);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        buttonsPanel.setBackground(Color.BLACK);

        // Special button names
        String[] specialNames = {"Classic", "??????"};

        // Create and add the special buttons
        for (String name : specialNames) {
            JButton specialButton = new JButton(name);
            specialButton.setForeground(Color.WHITE);
            specialButton.setBackground(Color.BLUE);
            specialButton.setFont(new Font("serif", Font.BOLD, 20));
            specialButton.setFocusPainted(false);
            specialButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            specialButton.setPreferredSize(new Dimension(200, 50));
            specialButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Hide the special buttons
                    specialButtonPanel.setVisible(false);
                    // Start the special game
                    if (name.equalsIgnoreCase("Classic")) {
                        cat.classic();
                        correctWord = cat.getWord();
                        promptUserInput();
                        hintButtonPanel.setVisible(false);
                    } else if (name.equals("??????")) {
                        currentDifficulty = "??????";
                        cat.special();
                        correctWord = cat.getWord();
                        hint = cat.getHint();
                        promptUserInput();
                    }
                }
            });
            buttonsPanel.add(specialButton);
        }

        specialButtonPanel.add(buttonsPanel, BorderLayout.CENTER);

        // Add the back button
        addBackButton(specialButtonPanel, previousPanel);

        // Add the special button panel to the frame's center
        add(specialButtonPanel, BorderLayout.CENTER);

        // Add the special button panel to the frame's center
        add(specialButtonPanel, BorderLayout.CENTER);
        specialButtonPanel.setVisible(true);
    }

    private void showDifficultyButtons(JPanel previousPanel) {
        JPanel difficultyButtonPanel = new JPanel(new BorderLayout());
        difficultyButtonPanel.setBackground(Color.BLACK);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonsPanel.setBackground(Color.darkGray);

        // Difficulty button names
        String[] difficultyNames = {"Easy", "Medium", "Hard"};

        // Create and add the difficulty buttons
        for (int i = 0; i < difficultyNames.length; i++) {
            difficultyButton[i] = new JButton(difficultyNames[i]);
            difficultyButton[i].setForeground(Color.WHITE);
            difficultyButton[i].setBackground(Color.BLUE);
            difficultyButton[i].setFont(new Font("serif", Font.BOLD, 40));
            difficultyButton[i].setFocusPainted(false);
            difficultyButton[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 7));
            difficultyButton[i].setPreferredSize(new Dimension(400, 100));
            int index = i;
            difficultyButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Hide the difficulty buttons
                    difficultyButtonPanel.setVisible(false);
                    // Store the current difficulty
                    currentDifficulty = difficultyNames[index];
                    System.out.println(currentDifficulty);
                    // Prompt the user for input
                    promptUserInput();
                }
            });
            buttonsPanel.add(difficultyButton[i]);
        }

        difficultyButtonPanel.add(buttonsPanel, BorderLayout.CENTER);

        // Add the back button
        addBackButton(difficultyButtonPanel, previousPanel);

        // Add the difficulty button panel to the frame's center
        add(difficultyButtonPanel, BorderLayout.CENTER);
        difficultyButtonPanel.setVisible(true);
    }

    private void promptUserInput() {
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical stacking
        inputPanel.setBackground(Color.WHITE);

        getCorrectWord();
        System.out.println(cat.getWord());

        List<List<JLabel>> allRows = new ArrayList<>();
        addNewRow(allRows, inputPanel);

        add(inputPanel, BorderLayout.CENTER);
        inputPanel.setVisible(true);

        // Set focusable and request focus
        inputPanel.setFocusable(true);
        inputPanel.requestFocusInWindow();

        // Key listener to capture key events
        inputPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) { // Accept only letters
                    List<JLabel> currentRow = allRows.get(allRows.size() - 1);
                    for (JLabel label : currentRow) {
                        if (label.getText().isEmpty()) {
                            label.setText(String.valueOf(c).toUpperCase()); // Convert to uppercase
                            break;
                        }
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                List<JLabel> currentRow = allRows.get(allRows.size() - 1);

                if (keyCode == KeyEvent.VK_BACK_SPACE) { // Handle backspace key
                    for (int i = currentRow.size() - 1; i >= 0; i--) {
                        JLabel label = currentRow.get(i);
                        if (!label.getText().isEmpty()) {
                            label.setText("");
                            label.setBackground(Color.WHITE);
                            label.setOpaque(true);
                            break;
                        }
                    }
                } else if (keyCode == KeyEvent.VK_ENTER) { // Handle enter key
                    boolean rowComplete = true;
                    for (JLabel label : currentRow) {
                        if (label.getText().isEmpty()) {
                            rowComplete = false;
                            break;
                        }
                    }

                    if (rowComplete) {
                        StringBuilder userInput = new StringBuilder();

                        for (int i = 0; i < cat.getWord().length(); i++) {
                            if (cat.getWord().charAt(i) == ' ') {
                                userInput.append(" ");
                                f++;
                            } else {
                                userInput.append(currentRow.get(i - f).getText());
                            }
                        }
                        f = 0;

                        // for (JLabel label : currentRow) {
                        // userInput.append(label.getText());
                        // }
                        userTest = userInput.toString().toLowerCase();
                        System.out.println("User input: " + userTest);
                        String userGuess = userTest.replaceAll("\\s", "");

                        random.add(cat.getWord());
                        guess.add(userTest);

                        random.checkUI(guess, copy);

                        boolean allCorrect = true;
                        String correctWordTest = correctWord.replaceAll("\\s", "").toLowerCase();

                        for (int i = 0; i < userTest.length(); i++) {
                            JLabel label;
                            if (copy.getNode(i).getData().contains(" ")) {
                                d++;
                            } else if (guess.getNode(i).getData().contains(green)) {
                                label = currentRow.get(i - d);
                                label.setBackground(Color.GREEN);
                                label.setOpaque(true);
                            }
                        }
                        d = 0;

                        for (int i = 0; i < userTest.length(); i++) {
                            JLabel label;
                            if (copy.getNode(i).getData().contains(" ")) {
                                d++;
                            } else if (guess.getNode(i).getData().contains(yellow)
                                    && !guess.getNode(i).getData().contains(green)) {
                                label = currentRow.get(i - d);
                                label.setBackground(Color.orange);
                                label.setOpaque(true);
                                allCorrect = false;
                            }
                        }
                        d = 0;

                        for (int i = 0; i < userTest.length(); i++) {
                            JLabel label;
                            if (copy.getNode(i).getData().contains(" ")) {
                                d++;
                            } else if (guess.getNode(i).getData().contains(magenta)
                                    && !guess.getNode(i).getData().contains(yellow)
                                    && !guess.getNode(i).getData().contains(green)) {
                                label = currentRow.get(i - d);
                                label.setBackground(Color.MAGENTA);
                                label.setOpaque(true);
                                allCorrect = false;
                            }
                        }
                        d = 0;

                        for (int i = 0; i < userTest.length(); i++) {
                            JLabel label;
                            if (copy.getNode(i).getData().contains(" ")) {
                                d++;
                            } else if (!guess.getNode(i).getData().contains(magenta)
                                    && !guess.getNode(i).getData().contains(yellow)
                                    && !guess.getNode(i).getData().contains(green)) {
                                label = currentRow.get(i - d);
                                label.setBackground(Color.lightGray);
                                label.setOpaque(true);
                                allCorrect = false;
                            }
                        }
                        d = 0;

                        if (userGuess.equalsIgnoreCase(correctWordTest)) {
                            int response = JOptionPane.showOptionDialog(null,
                                    "Congratulations! You guessed the word correctly: " + correctWord
                                    + "\nDo you want to play again?",
                                    "Correct Guess",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                    new String[]{"Play Again", "Exit"}, "Play Again");

                            if (response == JOptionPane.YES_OPTION) {
                                // Logic to reset the game and go back to categories
                                resetGame();
                                // Assuming there's a method to go back to categories selection
                                goBackToCategories();
                            } else {
                                System.exit(0);
                            }
                        } else {
                            if (allCorrect) {
                                JOptionPane.showMessageDialog(null,
                                        "Sorry, your guess was incorrect. Please try again.", "Incorrect Guess",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                addNewRow(allRows, inputPanel);
                                inputPanel.revalidate();
                                inputPanel.repaint();
                                inputPanel.requestFocusInWindow();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please fill in all the letters before pressing Enter.",
                                "Incomplete Input", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        // Create a panel for the hint button and add it to the top right
        hintButtonPanel = new JPanel(new BorderLayout()); // Align hint button to the right
        hintButtonPanel.setBackground(Color.BLACK);
        JButton hintButton = new JButton("Hint");
        hintButton.setFont(new Font("serif", Font.BOLD, 20));
        hintButton.setBackground(Color.ORANGE);
        hintButton.setForeground(Color.WHITE);
        hintButton.setFocusPainted(false);
        hintButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        hintButton.setPreferredSize(new Dimension(200, 50));
        String hintOut = "hint: \n" + hint;
        hintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentDifficulty.equals("Easy") || currentDifficulty.equals("??????")) {
                    JOptionPane.showMessageDialog(null, hintOut, "Hint", JOptionPane.INFORMATION_MESSAGE);
                    inputPanel.requestFocusInWindow();
                } else if (currentDifficulty.equals("Medium")) {
                    JOptionPane.showMessageDialog(null, hintOut, "Hint", JOptionPane.INFORMATION_MESSAGE);
                    inputPanel.requestFocusInWindow();
                } else if (currentDifficulty.equals("Hard")) {
                    if (rpsWin) {
                        JOptionPane.showMessageDialog(null, hintOut, "Hint", JOptionPane.INFORMATION_MESSAGE);
                        inputPanel.requestFocusInWindow();
                    } else {
                        if (rpsTries < 3) {
                            rpsTries++;
                            inputPanel.setVisible(false);
                            hintButtonPanel.setVisible(false);
                            RockPaperScissorsGame();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "You don't have any more tries, so no hint for you, (skill issue)", "Hint",
                                    JOptionPane.INFORMATION_MESSAGE);
                            inputPanel.requestFocusInWindow();
                        }
                    }
                }
            }
        });
        JButton UltraBack = new JButton("← Back");
        UltraBack.setForeground(Color.WHITE);
        UltraBack.setBackground(Color.GREEN);
        UltraBack.setFont(new Font("serif", Font.BOLD, 20));
        UltraBack.setFocusPainted(false);
        UltraBack.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        UltraBack.setPreferredSize(new Dimension(200, 50));
        UltraBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToCategories();
            }
        });
        JLabel exp = new JLabel("Type your guess");
        exp.setForeground(Color.WHITE);
        exp.setFont(new Font("Times New Roman",Font.BOLD,24));
        exp.setHorizontalAlignment(SwingConstants.CENTER);
        hintButtonPanel.add(exp,BorderLayout.CENTER);
        hintButtonPanel.add(hintButton,BorderLayout.EAST);
        hintButtonPanel.add(UltraBack,BorderLayout.WEST);

        add(hintButtonPanel, BorderLayout.NORTH); // Add hint button to top
    }

    // Method to add a new row of labels
    private void addNewRow(List<List<JLabel>> allRows, JPanel inputPanel) {
        // Check if the maximum number of rows (6) is already reached
        if (allRows.size() >= 6) {
            // Show a popup message with the correct answer
            int response = JOptionPane.showOptionDialog(null,
                    "Sorry, you've used all your attempts. The correct word was: " + correctWord
                    + "\nDo you want to play again?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new String[]{"Play Again", "Exit"}, "Play Again");

            if (response == JOptionPane.YES_OPTION) {
                // Logic to reset the game and go back to categories
                resetGame();
                // Assuming there's a method to go back to categories selection
                goBackToCategories();
            } else {
                System.exit(0);
            }
            return; // Exit the method
        }

        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        rowPanel.setBackground(Color.white);
        List<JLabel> labelList = new ArrayList<>();

        for (int i = 0; i < correctWord.length(); i++) {
            if (correctWord.charAt(i) != ' ') {
                JLabel letterLabel = new JLabel("");
                letterLabel.setBorder(BorderFactory.createLineBorder(Color.darkGray));
                letterLabel.setPreferredSize(new Dimension(40, 40));
                letterLabel.setFont(new Font("serif", Font.PLAIN, 40));
                letterLabel.setForeground(Color.black);
                letterLabel.setHorizontalAlignment(SwingConstants.CENTER);
                labelList.add(letterLabel);
                rowPanel.add(letterLabel);
            } else {
                rowPanel.add(Box.createRigidArea(new Dimension(20, 0)));
            }
        }

        allRows.add(labelList);
        inputPanel.add(rowPanel);
        inputPanel.revalidate();
        inputPanel.repaint();
    }

    // Method to reset the game
    private void resetGame() {
        // Add logic to reset the game state here
        // For example, clear variables, reset UI elements, etc.
    }

    // Method to go back to the categories selection
    private void goBackToCategories() {
        // Add logic to navigate back to the categories selection screen
        rpsWin = false;
        rpsTries = 0;
        f = 0;
        d = 0;
        inputPanel.setVisible(false);
        hintButtonPanel.setVisible(false);
        showCategoryButtons();
    }

    // Method to get the correct word based on difficulty
    private void getCorrectWord() {
        String correct;
        if (currentCategory.equalsIgnoreCase("Countries") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eCountry();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Countries") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mCountry();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Countries") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hCountry();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Games") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eGames();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Games") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mGames();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Games") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hGames();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Movies") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eMovies();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Movies") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mMovies();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Movies") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hMovies();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Currencies") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eCoins();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Currencies") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mCoins();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Currencies") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hCoins();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Fruits") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eFruit();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Fruits") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mFruit();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Fruits") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hFruit();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Animals") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eAnimal();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Animals") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mAnimal();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Animals") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hAnimal();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        // --------------------------------------------------------------------------------------------------
        if (currentCategory.equalsIgnoreCase("Instruments") && currentDifficulty.equalsIgnoreCase("Easy")) {
            cat.eInstrument();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Instruments") && currentDifficulty.equalsIgnoreCase("Medium")) {
            cat.mInstrument();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
        if (currentCategory.equalsIgnoreCase("Instruments") && currentDifficulty.equalsIgnoreCase("Hard")) {
            cat.hInstrument();
            correctWord = cat.getWord();
            hint = cat.getHint();
        }
    }

    private void addBackButton(JPanel currentPanel, JPanel previousPanel) {
        // Create a back button with arrow indicator
        JButton backButton = new JButton("← Back");
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.GREEN);
        backButton.setFont(new Font("serif", Font.BOLD, 20));
        backButton.setFocusPainted(false);
        backButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        backButton.setPreferredSize(new Dimension(200, 50));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPanel.setVisible(false);
                previousPanel.setVisible(true);
            }
        });

        // Create a panel for the back button and add it to the top left
        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(Color.BLACK);
        backButtonPanel.add(backButton);

        currentPanel.add(backButtonPanel, BorderLayout.NORTH);
    }

    public void RockPaperScissorsGame() {
    rpsPanel = new JPanel();
    rpsPanel.setLayout(new BorderLayout());

    // Score panel
    JPanel scorePanel = new JPanel();
    scorePanel.setBackground(Color.BLACK);
    scoreLabel = new JLabel("Score: You 0 - 0 Computer");
    scoreLabel.setForeground(Color.WHITE);
    scorePanel.add(scoreLabel);
    rpsPanel.add(scorePanel, BorderLayout.NORTH);

    // Buttons panel
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
    String[] choices = {"Rock", "Paper", "Scissors"};
    choiceButtons = new JButton[choices.length];
    String[] imagePaths = {"/rock.png", "/paper.png", "/scissors.png"}; // Modify paths as per your images
    for (int i = 0; i < choices.length; i++) {
        JButton button;
        if (i < imagePaths.length) {
            ImageIcon buttonImg = new ImageIcon(getClass().getResource(imagePaths[i]));
            button = new JButton(choices[i], buttonImg);
        } else {
            button = new JButton(choices[i]);
        }
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.addActionListener(new WOW1.ButtonClickListenerTest());
        choiceButtons[i] = button;
        buttonsPanel.add(button);
    }
    rpsPanel.add(buttonsPanel, BorderLayout.CENTER);

    // Result panel
    JPanel resultPanel = new JPanel(new BorderLayout());
    resultLabel = new JLabel("Make your choice!");
    resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
    resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
    resultPanel.add(resultLabel, BorderLayout.SOUTH);

    // Computer choice label
    computerChoiceLabel = new JLabel("", SwingConstants.CENTER);
    computerChoiceLabel.setFont(new Font("Arial", Font.BOLD, 24));
    computerChoiceLabel.setForeground(Color.RED);
    resultPanel.add(computerChoiceLabel, BorderLayout.CENTER);

    rpsPanel.add(resultPanel, BorderLayout.SOUTH);
    rpsPanel.setVisible(true);
    add(rpsPanel);
}

    private class ButtonClickListenerTest implements ActionListener {

        private Timer timer;

        @Override
        public void actionPerformed(ActionEvent e) {
            String userChoice = e.getActionCommand();
            String computerChoice = getComputerChoice();
            String result = determineWinner(userChoice, computerChoice);

            computerChoiceLabel.setText("Computer chose: " + computerChoice);
            computerChoiceLabel.setVisible(true);
            setButtonsEnabled(false);

            // Hide computer choice after 2 seconds
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1200, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    computerChoiceLabel.setVisible(false);
                    updateScore(result);
                    scoreLabel.setText("Score: You " + userScore + " - " + computerScore + " Computer");
                    resultLabel
                            .setText("You chose " + userChoice + ", Computer chose " + computerChoice + ". " + result);
                    setButtonsEnabled(true);

                    if (userScore == 2 || computerScore == 2) {
                        determineGameWinner();
                    }
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    private void setButtonsEnabled(boolean enabled) {
        for (JButton button : choiceButtons) {
            button.setEnabled(enabled);
        }
    }

    private String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    private String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors"))
                || (userChoice.equals("Paper") && computerChoice.equals("Rock"))
                || (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "You win this round!";
        } else {
            return "Computer wins this round!";
        }
    }

    private void updateScore(String result) {
        if (result.contains("You win")) {
            userScore++;
        } else if (result.contains("Computer wins")) {
            computerScore++;
        }
    }

    private void determineGameWinner() {
        String message;
        if (userScore == 2) {
            rpsWin = true;
            message = "Congratulations! You win the game!";
        } else {
            message = "Sorry! Computer wins the game!";
        }

        JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        userScore = 0;
        computerScore = 0;
        scoreLabel.setText("Score: You 0 - 0 Computer");
        resultLabel.setText("Make your choice!");
        rpsPanel.setVisible(false);
        inputPanel.setVisible(true);
        hintButtonPanel.setVisible(true);
        String lost = "You lost, you have " + (3 - rpsTries) + " tries left.";
        if (rpsWin) {
            JOptionPane.showMessageDialog(null, hint, "Hint", JOptionPane.INFORMATION_MESSAGE);
            inputPanel.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(null, lost, "Hint", JOptionPane.INFORMATION_MESSAGE);
            inputPanel.requestFocusInWindow();
        }
    }
}
