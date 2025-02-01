package wordle;

public class Categories {

    private String word;
    private String hint;
    private String category;

    public String getWord() {
        return word;
    }

    public String getHint() {
        return hint;
    }

    // Category 1
    public void eCountry() {
        int random = (int) (Math.random() * 25 + 1);

        switch (random) {
            case 1:
                word = "france";
                hint = "Known for the Eiffel Tower and delicious cuisine.";
                break;
            case 2:
                word = "canada";
                hint = "Famous for its maple syrup and vast wilderness.";
                break;
            case 3:
                word = "japan";
                hint = "Renowned for sushi, cherry blossoms, and technology.";
                break;
            case 4:
                word = "brazil";
                hint = "Known for its vibrant carnival celebrations and Amazon rainforest.";
                break;
            case 5:
                word = "italy";
                hint = "Famous for pizza, pasta, and historic landmarks like the Colosseum.";
                break;
            case 6:
                word = "spain";
                hint = "Known for flamenco dancing, bullfighting, and beautiful beaches.";
                break;
            case 7:
                word = "egypt";
                hint = "Famous for its ancient pyramids and the Nile River.";
                break;
            case 8:
                word = "america";
                hint = "Home to diverse landscapes, Hollywood, and the Statue of Liberty.";
                break;
            case 9:
                word = "china";
                hint = "Renowned for the Great Wall, pandas, and rich cultural heritage.";
                break;
            case 10:
                word = "russia";
                hint = "Famous for its vast land area, Kremlin, and ballet.";
                break;
            case 11:
                word = "germany";
                hint = "Renowned for its beer, sausages, and historic castles.";
                break;
            case 12:
                word = "jordan";
                hint = "Known for Petra, the Dead Sea, and warm hospitality.";
                break;
            case 13:
                word = "poland";
                hint = "Famous for its rich history, pierogi, and stunning medieval architecture.";
                break;
            case 14:
                word = "iraq";
                hint = "Known for its ancient Mesopotamian civilizations, Tigris and Euphrates rivers, and significant historical sites.";
                break;
            case 15:
                word = "syria";
                hint = "Renowned for its ancient cities like Damascus and Aleppo, and the historic ruins of Palmyra.";
                break;
            case 16:
                word = "kuwait";
                hint = "Famous for its oil reserves, modern skyline, and rich cultural heritage.";
                break;
            case 17:
                word = "qatar";
                hint = "Known for its futuristic architecture, wealth, and hosting major international sporting events.";
                break;
            case 18:
                word = "oman";
                hint = "Renowned for its stunning desert landscapes, historic forts, and warm hospitality.";
                break;
            case 19:
                word = "yemen";
                hint = "Famous for its ancient civilization, unique architecture, and being the Arabian Peninsula's 'Arabian Felix.'";
                break;
            case 20:
                word = "somalia";
                hint = "Known for its coastline along the Indian Ocean, nomadic culture, and the Horn of Africa's instability.";
                break;
            case 21:
                word = "turkey";
                hint = "Renowned for its blend of Eastern and Western cultures, historic sites like the Hagia Sophia, and delicious cuisine.";
            case 22:
                word = "sudan";
                hint = "Famous for the Nile River, ancient civilizations like the Kingdom of Kush, and diverse cultural heritage.";
                break;
            case 23:
                word = "algeria";
                hint = "Known for its Sahara Desert, ancient ruins of Timgad and Djémila, and vibrant culture.";
                break;
            case 24:
                word = "morocco";
                hint = "Renowned for its bustling souks, beautiful mosques, and the stunning Atlas Mountains.";
                break;
            case 25:
                word = "england";
                hint = "Famous for its rich history, iconic landmarks like Big Ben and Buckingham Palace, and contributions to literature and music.";
                break;
        }

    }

    public void mCountry() {
        int random = (int) (Math.random() * 29 + 1);

        switch (random) {
            case 1:
                word = "greece";
                hint = "Known for its rich history, stunning islands, and delicious cuisine.";
                break;
            case 2:
                word = "india";
                hint = "Known for its diverse culture, Bollywood, and the Taj Mahal.";
                break;
            case 3:
                word = "britain";
                hint = "Home to the royal family, Big Ben, and tea.";
                break;
            case 4:
                word = "mexico";
                hint = "Famous for its tacos, ancient ruins, and vibrant culture.";
                break;
            case 5:
                word = "sweden";
                hint = "Renowned for IKEA, meatballs, and stunning natural beauty.";
                break;
            case 6:
                word = "norway";
                hint = "Famous for fjords, Northern Lights, and high quality of life.";
                break;
            case 7:
                word = "denmark";
                hint = "Famous for its fairy-tale castles, picturesque countryside, and the charming city of Copenhagen.";
                break;
            case 8:
                word = "austria";
                hint = "Famous for its classical music, Alpine landscapes, and historic architecture.";
                break;
            case 9:
                word = "estonia";
                hint = "Renowned for its digital society, medieval Old Town, and beautiful coastline.";
                break;
            case 10:
                word = "belgium";
                hint = "Known for chocolate, waffles, and being the headquarters of the European Union.";
                break;
            case 11:
                word = "uruguay";
                hint = "Famous for its mate tea culture, beautiful beaches, and progressive social policies.";
                break;
            case 12:
                word = "ghana";
                hint = "Renowned for its vibrant culture, rich history, and being the first African nation to gain independence.";
                break;
            case 13:
                word = "jamaica";
                hint = "Famous for reggae music, beautiful beaches, and its vibrant culture.";
                break;
            case 14:
                word = "libya";
                hint = "Known for its Sahara Desert landscapes, ancient Roman ruins, and Mediterranean coastline.";
                break;
            case 15:
                word = "cyprus";
                hint = "Renowned for its beautiful beaches, ancient history, and delicious cuisine.";
                break;
            case 16:
                word = "bhutan";
                hint = "Famous for its Gross National Happiness index, stunning Himalayan landscapes, and traditional Buddhist culture.";
                break;
            case 17:
                word = "latvia";
                hint = "Known for its rich cultural heritage, beautiful Baltic coastline, and Art Nouveau architecture.";
                break;
            case 18:
                word = "malawi";
                hint = "Renowned for its stunning Lake , diverse wildlife, and friendly people.";
                break;
            case 19:
                word = "zambia";
                hint = "Famous for its majestic Victoria Falls, diverse wildlife, and vibrant culture.";
                break;
            case 20:
                word = "uganda";
                hint = "Known for its mountain gorillas, diverse landscapes, and welcoming people.";
                break;
            case 21:
                word = "panama";
                hint = "Renowned for its Canal, beautiful beaches, and diverse wildlife.";
                break;
            case 22:
                word = "ireland";
                hint = "Famous for its lush green landscapes, Guinness beer, and rich literary tradition.";
                break;
            case 23:
                word = "ukraine";
                hint = "Known for its Orthodox churches, rich history, and diverse cultural heritage.";
                break;
            case 24:
                word = "finland";
                hint = "Renowned for its sauna culture, Northern Lights, and high-quality education system.";
                break;
            case 25:
                word = "nigeria";
                hint = "Famous for its diverse cultures, Nollywood film industry, and vibrant music scene.";
                break;
            case 26:
                word = "mali";
                hint = "Known for its ancient cities of Timbuktu and Djenné, rich cultural heritage, and traditional music.";
                break;
            case 27:
                word = "niger";
                hint = "Renowned for its Saharan landscapes, diverse wildlife, and vibrant culture.";
                break;
            case 28:
                word = "chad";
                hint = "Famous for its Sahara Desert landscapes, and diverse ethnic groups.";
                break;
            case 29:
                word = "romania";
                hint = "Known for its medieval castles, picturesque landscapes, and rich folklore.";
                break;

        }

    }

    public void hCountry() {
        int random = (int) (Math.random() * 23 + 1);

        switch (random) {
            case 1:
                word = "australia";
                hint = "Famous for its unique wildlife, stunning beaches, and the Outback.";
                break;
            case 2:
                word = "thailand";
                hint = "Renowned for its beautiful beaches, vibrant street food culture, and ornate temples.";
                break;
            case 3:
                word = "argentina";
                hint = "Known for tango, delicious steaks, and the breathtaking landscapes of Patagonia.";
                break;
            case 4:
                word = "netherlands";
                hint = "Famous for windmills, tulip fields, and picturesque canals.";
                break;
            case 5:
                word = "switzerland";
                hint = "Renowned for its stunning Alps, luxury watches, and delicious chocolate.";
                break;
            case 6:
                word = "palestine";
                hint = "Known for its rich history, religious significance.";
                break;
            case 7:
                word = "ethiopia";
                hint = "Famous for its ancient history, unique cuisine, and diverse landscapes.";
                break;
            case 8:
                word = "djibouti";
                hint = "Renowned for its beautiful beaches, diverse marine life, and unique landscapes.";
                break;
            case 9:
                word = "indonesia";
                hint = "Known for its stunning beaches, vibrant culture, and rich biodiversity.";
                break;
            case 10:
                word = "portugal";
                hint = "Famous for its historic landmarks, delicious pastries, and beautiful coastline.";
                break;
            case 11:
                word = "kazakhstan";
                hint = "Renowned for its vast steppes, nomadic culture, and modern cities like Astana.";
                break;
            case 12:
                word = "uzbekistan";
                hint = "Known for its ancient Silk Road cities, stunning mosques, and rich cultural heritage.";
                break;
            case 13:
                word = "philippines";
                hint = "Famous for its beautiful islands, friendly people, and delicious cuisine.";
                break;
            case 14:
                word = "madagascar";
                hint = "Renowned for its unique wildlife, lush rainforests, and stunning beaches.";
                break;
            case 15:
                word = "azerbaijan";
                hint = "Known for its rich cultural heritage, delicious cuisine, and the historic city of Baku.";
                break;
            case 16:
                word = "bangladesh";
                hint = "Famous for the Bengal tiger, the Sundarbans, and being one of the most densely populated countries.";
                break;
            case 17:
                word = "afghanistan";
                hint = "Renowned for its rugged landscapes, ancient history, and the Hindu Kush mountains.";
                break;
            case 18:
                word = "pakistan";
                hint = "Known for its diverse culture, stunning mountain ranges like the Karakoram, and delicious cuisine.";
                break;
            case 19:
                word = "scotland";
                hint = "Famous for its picturesque Highlands, tartan kilts, and historic castles.";
                break;
            case 20:
                word = "zimbabwe";
                hint = "Renowned for Victoria Falls, Hwange National Park, and the great ruins of the country.";
                break;
            case 21:
                word = "mauritania";
                hint = "Known for the Sahara Desert, ancient caravan routes, and Banc d'Arguin National Park.";
                break;
            case 22:
                word = "tanzania";
                hint = "Famous for Mount Kilimanjaro, Serengeti National Park, and Zanzibar's beaches.";
                break;
            case 23:
                word = "mongolia";
                hint = "Renowned for its nomadic culture, vast steppes, and the Gobi Desert.";
                break;
        }
    }

    // Category 2
    public void eGames() {
        int random = (int) (Math.random() * 37 + 1);

        switch (random) {
            case 1:
                word = "doom";
                hint = "Classic first-person shooter game known for its fast-paced action and iconic demons.";
                break;
            case 2:
                word = "risk";
                hint = "Popular board game involving strategy and world domination.";
                break;
            case 3:
                word = "uno";
                hint = "Classic card game where the objective is to be the first to get rid of all your cards.";
                break;
            case 4:
                word = "lor";
                hint = "Online collectible card game set in the world of Azeroth.";
                break;
            case 5:
                word = "ludo";
                hint = "Traditional board game where players race their tokens around the board.";
                break;
            case 6:
                word = "dune";
                hint = "Classic science fiction novel series that inspired multiple games and adaptations.";
                break;
            case 7:
                word = "soma";
                hint = "Atmospheric horror game set in an underwater research facility.";
                break;
            case 8:
                word = "fate";
                hint = "Action role-playing game featuring dungeon crawling and random events.";
                break;
            case 9:
                word = "golf";
                hint = "Popular sport game involving hitting a ball into a series of holes in as few strokes as possible.";
                break;
            case 10:
                word = "fifa";
                hint = "Popular soccer video game series developed by EA Sports.";
                break;
            case 11:
                word = "halo";
                hint = "Iconic first-person shooter video game series set in a futuristic science fiction universe.";
                break;
            case 12:
                word = "rage";
                hint = "First-person shooter game set in a post-apocalyptic wasteland.";
                break;
            case 13:
                word = "pubg";
                hint = "Popular battle royale game where players fight to be the last one standing.";
                break;
            case 14:
                word = "dirt";
                hint = "Racing video game series known for its off-road and rally racing.";
                break;
            case 15:
                word = "tft";
                hint = "Auto battler game mode within the League of Legends universe.";
                break;
            case 16:
                word = "dota";
                hint = "Popular multiplayer online battle arena game developed by Valve Corporation.";
                break;
            case 17:
                word = "xcom";
                hint = "Turn-based tactical video game series where players command a team of soldiers against alien threats.";
                break;
            case 18:
                word = "ark";
                hint = "Survival video game featuring crafting, building, and taming dinosaurs.";
                break;
            case 19:
                word = "nier";
                hint = "Action role-playing game series known for its complex storylines and unique gameplay mechanics.";
                break;
            case 20:
                word = "lego";
                hint = "Popular toy brand that has inspired a wide range of video games.";
                break;
            case 21:
                word = "sims";
                hint = "Life simulation video game series where players control virtual characters and build their lives.";
                break;
            case 22:
                word = "wwe";
                hint = "Professional wrestling video game series featuring wrestlers.";
                break;
            case 23:
                word = "ufc";
                hint = "Mixed martial arts video game series featuring fighters.";
                break;
            case 24:
                word = "ico";
                hint = "Adventure game known for its minimalist design and emotional storytelling.";
                break;
            case 25:
                word = "ori";
                hint = "Platform adventure game series known for its beautiful art style and emotional storytelling.";
                break;
            case 26:
                word = "pray";
                hint = "First-person shooter game set in a space station overrun by hostile aliens.";
                break;
            case 27:
                word = "sifu";
                hint = "Indie action game known for its challenging combat and martial arts theme.";
                break;
            case 28:
                word = "nba";
                hint = "Video game series featuring professional basketball teams and players.";
                break;
            case 29:
                word = "mlb";
                hint = "Video game series featuring Major League Baseball teams and players.";
                break;
            case 30:
                word = "nioh";
                hint = "Action role-playing game set in a fictionalized version of the Sengoku period in Japan.";
                break;
            case 31:
                word = "tron";
                hint = "Action game inspired by the movie of the same name, featuring light cycles and disc battles.";
                break;
            case 32:
                word = "cs go";
                hint = "Popular first-person shooter game known for its competitive multiplayer gameplay.";
                break;
            case 33:
                word = "raft";
                hint = "Survival video game where players are stranded on a raft in the ocean and must gather resources to survive.";
                break;
            case 34:
                word = "rust";
                hint = "Survival video game where players must survive in a harsh open world environment.";
                break;
            case 35:
                word = "lol";
                hint = "Popular multiplayer online battle arena game developed by Riot Games.";
                break;
            case 36:
                word = "gta";
                hint = "Open-world action-adventure game series known for its crime-themed gameplay.";
                break;
            case 37:
                word = "wow";
                hint = "Massively multiplayer online role-playing game set in the Warcraft universe.";
                break;

        }
    }

    public void mGames() {
        int random = (int) (Math.random() * 26 + 1);

        switch (random) {
            case 1:
                word = "sonic";
                hint = "Iconic blue hedgehog known for his speed and platforming adventures.";
                break;
            case 2:
                word = "limbo";
                hint = "Atmospheric puzzle-platformer game with a monochromatic art style.";
                break;
            case 3:
                word = "hades";
                hint = "Action roguelike game set in Greek mythology, known for its engaging combat and storytelling.";
                break;
            case 4:
                word = "fable";
                hint = "Action role-playing game series known for its moral choices and whimsical fantasy setting.";
                break;
            case 5:
                word = "bully";
                hint = "Open-world action-adventure game set in a boarding school, developed by Rockstar Games.";
                break;
            case 6:
                word = "mario";
                hint = "Iconic video game character known for his platforming adventures and saving Princess Peach.";
                break;
            case 7:
                word = "tetris";
                hint = "Classic puzzle game where players arrange falling blocks to complete lines.";
                break;
            case 8:
                word = "portal";
                hint = "First-person puzzle-platform game series known for its innovative gameplay mechanics.";
                break;
            case 9:
                word = "anthem";
                hint = "Online multiplayer action role-playing game set in a science fiction universe.";
                break;
            case 10:
                word = "skyrim";
                hint = "Open-world action role-playing game set in the fantasy world of Tamriel.";
                break;
            case 11:
                word = "gears";
                hint = "Third-person shooter game series set in a post-apocalyptic world overrun by monstrous creatures.";
                break;
            case 12:
                word = "yakuza";
                hint = "Action-adventure game series set in the Japanese criminal underworld.";
                break;
            case 13:
                word = "chess";
                hint = "Classic strategy board game with origins dating back centuries.";
                break;
            case 14:
                word = "forza";
                hint = "Racing video game series known for its realistic driving mechanics and extensive car customization.";
                break;
            case 15:
                word = "tennis";
                hint = "Sports video game genre featuring racket using simulator.";
                break;
            case 16:
                word = "fallout";
                hint = "Post-apocalyptic action role-playing game series known for its immersive world and moral choices.";
                break;
            case 17:
                word = "black";
                hint = "First-person shooter game known for its intense action and destructible environments.";
                break;
            case 18:
                word = "mafia";
                hint = "Action-adventure game series set in the world of organized crime.";
                break;
            case 19:
                word = "sekiro";
                hint = "Action-adventure game set in feudal Japan, developed by FromSoftware.";
                break;
            case 20:
                word = "inside";
                hint = "Puzzle-platformer game known for its atmospheric storytelling and minimalist design.";
                break;
            case 21:
                word = "stray";
                hint = "Upcoming adventure game where players control a cat navigating a futuristic city.";
                break;
            case 22:
                word = "tekken";
                hint = "Popular fighting game series known for its diverse roster of characters and deep combat mechanics.";
                break;
            case 23:
                word = "crysis";
                hint = "can it run .... .";
                break;
            case 24:
                word = "valorant";
                hint = "Tactical first-person shooter game developed by Riot Games, featuring unique character abilities.";
                break;
            case 25:
                word = "pedro";
                hint = "Indie action platformer game featuring a sentient banana.";
                break;
            case 26:
                word = "thief";
                hint = "Stealth video game series where players take on the role of a master robber.";
                break;

        }
    }

    public void hGames() {
        int random = (int) (Math.random() * 144 + 1);

        switch (random) {
            case 1:
                word = "starfield";
                hint = "Upcoming space exploration game from Bethesda Game Studios.";
                break;
            case 2:
                word = "the witcher";
                hint = "Action role-playing game series based on the book series by Andrzej Sapkowski.";
                break;
            case 3:
                word = "bioshock";
                hint = "First-person shooter game series known for its immersive storytelling and unique settings.";
                break;
            case 4:
                word = "bloodborne";
                hint = "Action role-playing game known for its challenging gameplay and dark atmosphere.";
                break;
            case 5:
                word = "dark souls";
                hint = "Action role-playing game series known for its punishing difficulty and intricate level design.";
                break;
            case 6:
                word = "horizon zero dawn";
                hint = "Action role-playing game set in a post-apocalyptic world overrun by robotic creatures.";
                break;
            case 7:
                word = "dead space";
                hint = "Survival horror game series set in space, known for its tense atmosphere and gruesome enemies.";
                break;
            case 8:
                word = "devil may cry";
                hint = "Action-adventure game series known for its stylish combat and demon-hunting protagonist.";
                break;
            case 9:
                word = "shadow of the colossus";
                hint = "Action-adventure game where players must defeat massive creatures.";
                break;
            case 10:
                word = "terraria";
                hint = "2D Minecraft.";
                break;
            case 11:
                word = "little nightmares";
                hint = "Horror puzzle-platformer game where players navigate through eerie environments.";
                break;
            case 12:
                word = "uncharted";
                hint = "Action-adventure game series following the adventures of a treasure hunter.";
                break;
            case 13:
                word = "tomb raider";
                hint = "Action-adventure game series featuring an archaeologist.";
                break;
            case 14:
                word = "control";
                hint = "Action-adventure game where players wield supernatural abilities in a mysterious government facility.";
                break;
            case 15:
                word = "the last of us";
                hint = "Action-adventure game set in a post-apocalyptic world overrun by infected creatures.";
                break;
            case 16:
                word = "god of war";
                hint = "Action-adventure game series based on Greek mythology.";
                break;
            case 17:
                word = "infamous";
                hint = "Action-adventure game series where players control characters with superhuman abilities.";
                break;
            case 18:
                word = "metal gear";
                hint = "Stealth game series created by Hideo Kojima, known for its complex storytelling.";
                break;
            case 19:
                word = "silent hill";
                hint = "Survival horror game series known for its psychological horror elements and unsettling atmosphere.";
                break;
            case 20:
                word = "dragon ball";
                hint = "Action fighting game series based on the popular anime and manga franchise.";
                break;
            case 21:
                word = "hitman";
                hint = "Stealth game series where players assume the role of a professional assassin.";
                break;
            case 22:
                word = "final fantasy";
                hint = "Iconic role-playing game series known for its rich storytelling and memorable characters.";
                break;
            case 23:
                word = "deadcells";
                hint = "Rogue-lite metroidvania game featuring challenging combat and procedurally generated levels.";
                break;
            case 24:
                word = "super smash bros";
                hint = "Fighting game series featuring characters from various Nintendo franchises battling it out.";
                break;
            case 25:
                word = "inscryption";
                hint = "Card-based roguelike game with elements of deck-building, puzzle-solving, and narrative.";
                break;
            case 26:
                word = "minecraft";
                hint = "3D Terraria.";
                break;
            case 27:
                word = "elden ring";
                hint = "Action RPG developed by FromSoftware in collaboration with George R. R. Martin.";
                break;
            case 28:
                word = "mortal kombat";
                hint = "Iconic fighting game series known for its brutal combat, fatalities, and diverse character roster.";
                break;
            case 29:
                word = "lethal company";
                hint = "Explore abandoned moons, scavenge for scrap, and survive the horrors lurking in the depths..";
                break;
            case 30:
                word = "content warning";
                hint = "This game contains intense horror elements, jump scares, and disturbing imagery. Player discretion is advisede.";
                break;
            case 31:
                word = "injustice";
                hint = "Fighting game series featuring DC Comics characters engaged in epic battles and clashes.";
                break;
            case 32:
                word = "civilisation";
                hint = "Turn-based strategy game series where players build and manage their kingdom's throughout history.";
                break;
            case 33:
                word = "rocket league";
                hint = "Combines soccer with vehicular mayhem, where players control cars to score goals.";
                break;
            case 34:
                word = "fortnite";
                hint = "Popular battle royale game known for its building mechanics, colorful art style, and live events.";
                break;
            case 35:
                word = "plague inc";
                hint = "Strategy simulation game where players create and evolve a pathogen to infect and wipe out humanity.";
                break;
            case 36:
                word = "ninja gaiden";
                hint = "Action-adventure game series known for its fast-paced combat and challenging difficulty.";
                break;
            case 37:
                word = "no mans sky";
                hint = "Open-world exploration game set in a procedurally generated universe with billions of planets.";
                break;
            case 38:
                word = "cyberpunk";
                hint = "Dystopian open-world RPG set in a future metropolis obsessed with power, glamour, and body modification.";
                break;
            case 39:
                word = "pink panther";
                hint = "Adventure game based on the iconic Pink Panther cartoon character.";
                break;
            case 40:
                word = "grand theft auto";
                hint = "Open-world action-adventure game series known for its satirical take on American culture and criminal gameplay.";
                break;
            case 41:
                word = "persona";
                hint = "Japanese role-playing game series known for its deep storytelling, social simulation, and dungeon exploration.";
                break;
            case 42:
                word = "apex legends";
                hint = "Free-to-play battle royale game set in the Titanfall universe, featuring unique characters with special abilities.";
                break;
            case 43:
                word = "league of legends";
                hint = "Massively popular multiplayer online battle arena (MOBA) game known for its competitive gameplay.";
                break;
            case 44:
                word = "firewatch";
                hint = "First-person mystery adventure game set in the Wyoming wilderness.";
                break;
            case 45:
                word = "kingdom hearts";
                hint = "Action role-playing game series featuring characters from Disney and Square Enix properties.";
                break;
            case 46:
                word = "overwatch";
                hint = "Team-based multiplayer first-person shooter game known for its diverse cast of heroes and vibrant art style.";
                break;
            case 47:
                word = "candy crush";
                hint = "Popular puzzle game where players match items to progress through levels.";
                break;
            case 48:
                word = "superhot";
                hint = "First-person shooter game where time moves only when you move.";
                break;
            case 49:
                word = "valheim";
                hint = "Survival sandbox game set in a procedurally generated world inspired by Norse mythology.";
                break;
            case 50:
                word = "wolfenstein";
                hint = "First-person shooter game series known for its alternate history setting where Nazis rule the world.";
                break;
            case 51:
                word = "hogwarts legacy";
                hint = "Action role-playing game, that allows players to attend a magic academy and explore the wizarding world.";
                break;
            case 52:
                word = "batman arkham knight";
                hint = "Action-adventure game series featuring the scarecrow, known for its fluid combat and detective gameplay.";
                break;
            case 53:
                word = "genshin impact";
                hint = "Open-world action role-playing game featuring elemental magic, exploration, and gacha mechanics.";
                break;
            case 54:
                word = "call of duty";
                hint = "Popular first-person shooter franchise known for its intense multiplayer battles and cinematic campaigns.";
                break;
            case 55:
                word = "battlefield";
                hint = "First-person shooter game series known for its large-scale multiplayer battles and destructible environments.";
                break;
            case 56:
                word = "world war z";
                hint = "Cooperative third-person shooter game based on a film and novel.";
                break;
            case 57:
                word = "outlast";
                hint = "Survival horror game where players navigate through a psychiatric hospital while avoiding terrifying enemies.";
                break;
            case 58:
                word = "dead island";
                hint = "Open-world action role-playing game set on a tropical island overrun by zombies.";
                break;
            case 59:
                word = "plants vs zombies";
                hint = "Tower defense game where players defend their homes from waves of undead.";
                break;
            case 60:
                word = "midnight club";
                hint = "Open-world racing game series featuring customizable vehicles and illegal street racing.";
                break;
            case 61:
                word = "need for speed";
                hint = "Racing game series known for its high-speed police chases and extensive car customization.";
                break;
            case 62:
                word = "grounded";
                hint = "Survival game where players are shrunk to the size of insects and must navigate a backyard filled with dangers.";
                break;
            case 63:
                word = "assassins creed";
                hint = "Action-adventure game series featuring historical settings and stealthy assassinations.";
                break;
            case 64:
                word = "splinter cell";
                hint = "Stealth action game series where players take on the role of Sam Fisher, a highly trained operative.";
                break;
            case 65:
                word = "rainbow six siege";
                hint = "Tactical shooter game focused on team-based multiplayer combat and environmental destruction.";
                break;
            case 66:
                word = "watch dogs";
                hint = "Open-world action-adventure game series where players hack into a near-future city's interconnected systems.";
                break;
            case 67:
                word = "sleeping dogs";
                hint = "Open-world action-adventure game set in Hong Kong, where players assume the role of an undercover cop.";
                break;
            case 68:
                word = "overcooked";
                hint = "Cooperative cooking simulation game where players work together to prepare and serve meals under pressure.";
                break;
            case 69:
                word = "pico park";
                hint = "Cooperative puzzle game where players must work together to overcome various challenges and obstacles.";
                break;
            case 70:
                word = "hollow knight";
                hint = "Metroidvania game set in a dark and atmospheric world filled with challenging enemies and intricate level design.";
                break;
            case 71:
                word = "balloons tower defense";
                hint = "Tower defense game series where players defend against waves using monkeys.";
                break;
            case 72:
                word = "resident evil";
                hint = "Survival horror game series known for its zombies, puzzles, and tense atmosphere.";
                break;
            case 73:
                word = "dying light";
                hint = "Open-world survival horror game featuring parkour movement and dynamic day-night cycles.";
                break;
            case 74:
                word = "far cry";
                hint = "Open-world first-person shooter game series known for its exotic locales and chaotic gameplay.";
                break;
            case 75:
                word = "death stranding";
                hint = "Action-adventure game set in a post-apocalyptic world where players deliver packages and connect isolated communities.";
                break;
            case 76:
                word = "marvels spiderman";
                hint = "Action-adventure game featuring the iconic superhero, known for its traversal and combat mechanics.";
                break;
            case 77:
                word = "deathloop";
                hint = "First-person shooter game featuring time mechanics, where players must assassinate targets.";
                break;
            case 78:
                word = "heavy rain";
                hint = "Interactive drama and psychological thriller game featuring multiple protagonists and branching storylines.";
                break;
            case 79:
                word = "dishonored";
                hint = "Steampunk-inspired stealth action game where players use supernatural abilities to navigate levels.";
                break;
            case 80:
                word = "for honor";
                hint = "Action fighting game featuring knights, samurai, and vikings battling in intense melee combat.";
                break;
            case 81:
                word = "the crew";
                hint = "Open-world racing game set in a scaled-down version of the United States, featuring various vehicles and activities.";
                break;
            case 82:
                word = "beyond two souls";
                hint = "Interactive drama and action-adventure game featuring supernatural elements and branching narratives.";
                break;
            case 83:
                word = "detroit become human";
                hint = "Interactive drama game set in a future where robots struggle for equal rights and freedom.";
                break;
            case 84:
                word = "human fall flat";
                hint = "Physics-based puzzle platformer game where players control customizable characters and solve challenges.";
                break;
            case 85:
                word = "gang beasts";
                hint = "Party game featuring gelatinous characters engaged in chaotic brawls.";
                break;
            case 86:
                word = "sea of thieves";
                hint = "Open-world pirate adventure game.";
                break;
            case 87:
                word = "team fortress";
                hint = "Team-based multiplayer first-person shooter game featuring distinctive character classes and cartoonish art style.";
                break;
            case 88:
                word = "honkai star rail";
                hint = "Mobile action RPG set in the hoyo universe, featuring anime-style characters and fast-paced combat.";
                break;
            case 89:
                word = "yu gi oh";
                hint = "Trading card game based on the popular manga and anime series, where players summon monsters and cast spells.";
                break;
            case 90:
                word = "yu gi oh duel links";
                hint = "Mobile version of a famous trading card game, offering online multiplayer battles and deck-building.";
                break;
            case 91:
                word = "hearthstone";
                hint = "Digital collectible card game set in the blizard universe, featuring iconic characters and strategic gameplay.";
                break;
            case 92:
                word = "mount and blade";
                hint = "Action role-playing game series known for its medieval setting, sandbox gameplay, and large-scale battles.";
                break;
            case 93:
                word = "beat saber";
                hint = "Virtual reality rhythm game where players slash blocks with swords to the beat of the music.";
                break;
            case 94:
                word = "suicide squad";
                hint = "action-adventure game featuring DC Comics' antihero team.";
                break;
            case 95:
                word = "gotham knights";
                hint = "Action-adventure game featuring superheroes, known for its open-world dark setting with a co-op option.";
                break;
            case 96:
                word = "clash of clans";
                hint = "Mobile strategy game where players build and defend their village, train troops, and raid other players' bases.";
                break;
            case 97:
                word = "pokemon";
                hint = "Role-playing game series where players capture and train creatures to battle each other.";
                break;
            case 98:
                word = "mega man";
                hint = "Action-platformer game series featuring the titular character, known for its challenging levels and boss battles.";
                break;
            case 99:
                word = "duck hunt";
                hint = "Classic light gun shooter game for the Nintendo Entertainment System (NES).";
                break;
            case 100:
                word = "luigis mansion";
                hint = "Action-adventure Nintendo game , capturing ghosts, and solves puzzles.";
                break;
            case 101:
                word = "mario kart";
                hint = "Kart racing game series featuring characters from Nintedo competing in colorful and chaotic races.";
                break;
            case 102:
                word = "a plague tale";
                hint = "Action-adventure game set in medieval France, where siblings must survive amidst the pandemic and Inquisition.";
                break;
            case 103:
                word = "the legend of zelda";
                hint = "Action-adventure game series known for its exploration, puzzle-solving, and heroic quests.";
                break;
            case 104:
                word = "medal of honor";
                hint = "First-person shooter game series set during various historical conflicts, featuring realistic combat and storytelling.";
                break;
            case 105:
                word = "atomic heart";
                hint = "First-person shooter game set in an alternate universe Soviet Union, featuring strange creatures and technology.";
                break;
            case 106:
                word = "dead by daylight";
                hint = "Asymmetric survival horror game where players either try to escape a killer or hunt down survivors.";
                break;
            case 107:
                word = "payday";
                hint = "Cooperative first-person shooter game where players take on the role of criminals conducting heists.";
                break;
            case 108:
                word = "counter strike global offensive";
                hint = "Tactical first-person shooter game known for its competitive multiplayer matches and esports scene.";
                break;
            case 109:
                word = "team fight tactics";
                hint = "Auto battler, where players strategically deploy champions on a chess-like board.";
                break;
            case 110:
                word = "ghost recon";
                hint = "Tactical shooter game series where players control special forces operatives engaged in covert operations.";
                break;
            case 111:
                word = "ghost of tsushima";
                hint = "Action-adventure game set in feudal Japan, where players assume the role of a samurai battling against invaders.";
                break;
            case 112:
                word = "world of warcraft";
                hint = "Massively multiplayer online role-playing game, known for its expansive world and player-driven economy.";
                break;
            case 113:
                word = "the elder scrolls";
                hint = "Open-world fantasy RPG series known for its rich lore, immersive worlds, and extensive modding community.";
                break;
            case 114:
                word = "red dead redemption";
                hint = "Open-world action-adventure game set in the Wild West, featuring a compelling story and vast open landscapes.";
                break;
            case 115:
                word = "mass effect";
                hint = "Science fiction action role-playing game series known for its branching narratives and player choices.";
                break;
            case 116:
                word = "gears of war";
                hint = "Third-person shooter game series featuring futuristic soldiers battling against monstrous creatures known as the Locust Horde.";
                break;
            case 117:
                word = "destiny";
                hint = "Online multiplayer first-person shooter game with role-playing elements, set in a science fiction universe.";
                break;
            case 118:
                word = "borderlands";
                hint = "Action role-playing first-person shooter game series known for its colorful art style, humor, and cooperative gameplay.";
                break;
            case 119:
                word = "minecraft dungeons";
                hint = "Action-adventure game, featuring dungeon crawling and cooperative gameplay.";
                break;
            case 120:
                word = "diablo";
                hint = "Action role-playing game series known for its dungeon crawling, loot, and dark fantasy setting.";
                break;
            case 121:
                word = "star wars jedi fallen order";
                hint = "Action-adventure game Developed by Respawn Entertainment and published by Electronic Arts, the game was released in 2019.";
                break;
            case 122:
                word = "monster hunter";
                hint = "Action role-playing game series where players kill and trap creatures in diverse environments.";
                break;
            case 123:
                word = "gran turismo";
                hint = "Racing simulation game series known for its realistic driving mechanics and extensive car roster.";
                break;
            case 124:
                word = "half life";
                hint = "First-person shooter game series known for its immersive storytelling and groundbreaking gameplay mechanics.";
                break;
            case 125:
                word = "mortal shell";
                hint = "Action role-playing game featuring challenging combat and a dark fantasy world.";
                break;
            case 126:
                word = "outriders";
                hint = "Cooperative third-person shooter game set in a sci-fi universe, featuring customizable characters and intense combat.";
                break;
            case 127:
                word = "among us";
                hint = "Sus.";
                break;
            case 128:
                word = "helldivers";
                hint = "Top-down twin-stick shooter game where players engage in cooperative missions against alien enemies.";
                break;
            case 129:
                word = "hellblade";
                hint = "Action-adventure game featuring Norse mythology and psychological themes.";
                break;
            case 130:
                word = "goose goose duck";
                hint = "Online multiplayer social deduction game inspired by Among Us.";
                break;
            case 131:
                word = "untitled goose game";
                hint = "Puzzle stealth game where players try to be mischievous causing havoc in a peaceful village.";
                break;
            case 132:
                word = "powerwash simulator";
                hint = "Simulation game where players clean various objects and surfaces.";
                break;
            case 133:
                word = "deus ex";
                hint = "Cyberpunk-themed action role-playing game series known for its player choice and branching narratives.";
                break;
            case 134:
                word = "marvels guardians of the galaxy";
                hint = "Action-adventure game featuring superheroes, known for its humor and storytelling.";
                break;
            case 135:
                word = "ghostrunner";
                hint = "First-person cyberpunk action game featuring fast-paced parkour and combat.";
                break;
            case 136:
                word = "saints row";
                hint = "Open-world action-adventure game series known for its over-the-top humor and chaotic gameplay.";
                break;
            case 137:
                word = "the outer worlds";
                hint = "Single-player action role-playing game set in a satirical sci-fi universe, featuring branching narratives and player choices.";
                break;
            case 138:
                word = "ghostwire tokyo";
                hint = "Action-adventure game set in japan, where players battle supernatural forces using mystical abilities.";
                break;
            case 139:
                word = "the evil within";
                hint = "Survival horror game series featuring psychological horror and grotesque creatures.";
                break;
            case 140:
                word = "fall guys";
                hint = "Online multiplayer party game where players compete in colorful obstacle courses and challenges.";
                break;
            case 141:
                word = "pac man";
                hint = "Classic arcade game where players control a yellow character, to eat pellets and avoid ghosts.";
                break;
            case 142:
                word = "red dead revolver";
                hint = "Western-themed third-person shooter game set in the 1880s, known for its story-driven gameplay.";
                break;
            case 143:
                word = "donkey kong";
                hint = "Arcade game featuring the titular character, and the first appearance of Mario.";
                break;
            case 144:
                word = "forza horizon";
                hint = "Racing video game series known for its realistic driving mechanics and extensive car customization.";
                break;

        }
    }

    // Category 3
    public void eMovies() {
        int random = (int) (Math.random() * 54 + 1);

        switch (random) {
            case 1:
                word = "tenet";
                hint = "Christopher Nolan's mind-bending action thriller about time inversion.";
                break;
            case 2:
                word = "joker";
                hint = "DC Comics' supervillain origin story starring Joaquin Phoenix.";
                break;
            case 3:
                word = "split";
                hint = "Psychological horror film directed by M. Night Shyamalan about a man with multiple personalities.";
                break;
            case 4:
                word = "it";
                hint = "Horror film based on Stephen King's novel about a shape-shifting entity terrorizing a small town.";
                break;
            case 5:
                word = "thor";
                hint = "Marvel superhero film about the Norse god of thunder.";
                break;
            case 6:
                word = "venom";
                hint = "Superhero film featuring a Marvel character, who becomes the anti-hero.";
                break;
            case 7:
                word = "dune";
                hint = "Science fiction epic based on Frank Herbert's novel, directed by Denis Villeneuve.";
                break;
            case 8:
                word = "seven";
                hint = "Psychological thriller film directed by David Fincher about two detectives hunting a serial killer.";
                break;
            case 9:
                word = "alien";
                hint = "Classic science fiction horror film directed by Ridley Scott, featuring a deadly extraterrestrial creature.";
                break;
            case 10:
                word = "coco";
                hint = "Animated film from Pixar set in the Land of the Dead, celebrating Mexican culture and traditions.";
                break;
            case 11:
                word = "old";
                hint = "Thriller film directed by M. Night Shyamalan about a family on a beach where they rapidly age.";
                break;
            case 12:
                word = "the matrix";
                hint = "Red or Blue Pill.";
                break;
            case 13:
                word = "avengers";
                hint = "Marvel superhero film featuring a team of iconic characters.";
                break;
            case 14:
                word = "batman";
                hint = "Superhero film featuring the iconic DC Comics character.";
                break;
            case 15:
                word = "room";
                hint = "Drama film about a woman and her son held captive in a single room, based on the novel by Emma Donoghue.";
                break;
            case 16:
                word = "fargo";
                hint = "Crime film directed by the Coen Brothers, featuring a pregnant police chief and a botched kidnapping.";
                break;
            case 17:
                word = "logan";
                hint = "Superhero film featuring a Marvel charecter in his final adventure.";
                break;
            case 18:
                word = "aladdin";
                hint = "Disney animated film about a street urchin who finds a magic lamp and befriends a genie.";
                break;
            case 19:
                word = "spiderman";
                hint = "Superhero film featuring a Marvel character , and is one of the most famous .";
                break;
            case 20:
                word = "ironman";
                hint = "Superhero film featuring a Marvel character, whose rich.";
                break;
            case 21:
                word = "star wars";
                hint = "Epic space opera franchise created by George Lucas, featuring iconic characters, owned by disney.";
                break;
            case 22:
                word = "the godfather";
                hint = "Crime film directed by Francis Ford Coppola, chronicling the Corleone family's rise to power.";
                break;
            case 23:
                word = "the shining";
                hint = "Horror film directed by Stanley Kubrick, based on Stephen King's novel about a haunted hotel.";
                break;
            case 24:
                word = "the terminator";
                hint = "Sci-fi action film directed by James Cameron, featuring a cyborg assassin sent back in time.";
                break;
            case 25:
                word = "cars";
                hint = "Animated film from Pixar about anthropomorphic veichles, featuring talking veichles.";
                break;
            case 26:
                word = "toy story";
                hint = "Animated film from Pixar about toys that come to life when humans aren't around.";
                break;
            case 27:
                word = "kung fu panda";
                hint = "Animated film about a clumsy bear who becomes a martial arts hero.";
                break;
            case 28:
                word = "the lion king";
                hint = "Disney animated film about a young lion prince, inspired by Shakespeare's Hamlet.";
                break;
            case 29:
                word = "aquaman";
                hint = "Superhero film featuring the DC Comics character Arthur Curry, who can communicate with marine life.";
                break;
            case 30:
                word = "shazam";
                hint = "Superhero film featuring the DC Comics character Billy Batson, who transforms into a powerful hero.";
                break;
            case 31:
                word = "black panther";
                hint = "Superhero film featuring the Marvel character T'Challa, the king of the fictional African nation.";
                break;
            case 32:
                word = "green lantern";
                hint = "Superhero film featuring a DC Comics character, who's powers are limited by his imagination.";
                break;
            case 33:
                word = "deadpool";
                hint = "Superhero film featuring a Marvel character, known for his irreverent humor and breaking the fourth wall.";
                break;
            case 34:
                word = "the departed";
                hint = "Crime film directed by Martin Scorsese, featuring an undercover cop and a mob informant.";
                break;
            case 35:
                word = "passengers";
                hint = "Science fiction romance film set on a spacecraft traveling to a distant colony planet.";
                break;
            case 36:
                word = "chucky";
                hint = "Horror film series featuring a possessed doll, who goes on a killing spree.";
                break;
            case 37:
                word = "predator";
                hint = "Science fiction action film featuring an alien hunter stalking soldiers in a Central American jungle.";
                break;
            case 38:
                word = "halloween";
                hint = "Horror film directed by John Carpenter, featuring a masked killer.";
                break;
            case 39:
                word = "up";
                hint = "Animated film from Pixar about an elderly man who embarks on a journey by tying thousands of balloons to his house.";
                break;
            case 40:
                word = "the notebook";
                hint = "Romantic drama film based on Nicholas Sparks' novel about a young couple's enduring love.";
                break;
            case 41:
                word = "titanic";
                hint = "Epic romance and disaster film directed by James Cameron.";
                break;
            case 42:
                word = "fast and furious";
                hint = "Family (and cars).";
                break;
            case 43:
                word = "godzilla";
                hint = "Monster film series featuring a giant fictional creature, known for its destructive rampages.";
                break;
            case 44:
                word = "king kong";
                hint = "Monster film featuring a giant ape, who is captured and brought to New York City.";
                break;
            case 45:
                word = "unbreakable";
                hint = "Superhero thriller film directed by M. Night Shyamalan, featuring characters with extraordinary abilities.";
                break;
            case 46:
                word = "pirates of the caribbean";
                hint = "Fantasy swashbuckler film series based on a theme park ride, owned by disney.";
                break;
            case 47:
                word = "shrek";
                hint = "Animated comedy film featuring an ogre, who embarks on a quest to rescue a Princess.";
                break;
            case 48:
                word = "avatar";
                hint = "Science fiction film directed by James Cameron, set on the alien planet Pandora.";
                break;
            case 49:
                word = "john wick";
                hint = "Action thriller film series starring Keanu Reeves as a retired hitman seeking vengeance.";
                break;
            case 50:
                word = "ant man";
                hint = "Superhero film featuring the Marvel character Scott Lang, who can shrink in size.";
                break;
            case 51:
                word = "harry potter";
                hint = "Fantasy film series based on J.K. Rowling's novels, following the adventures of a young wizard.";
                break;
            case 52:
                word = "the hunger games";
                hint = "Dystopian science fiction film series based on Suzanne Collins' novels, featuring a brutal televised competition.";
                break;
            case 53:
                word = "bird box";
                hint = "Thriller film featuring a post-apocalyptic world where people must avoid supernatural entities.";
                break;
            case 54:
                word = "frozen";
                hint = "Animated film from Disney about two sisters, in the kingdom of Arendelle.";
                break;

        }
    }

    public void mMovies() {
        int random = (int) (Math.random() * 43 + 1);

        switch (random) {
            case 1:
                word = "inception";
                hint = "Mind-bending thriller directed by Christopher Nolan, involving dreams within dreams.";
                break;
            case 2:
                word = "interstellar";
                hint = "Sci-fi epic directed by Christopher Nolan, exploring space travel and time dilation.";
                break;
            case 3:
                word = "fight club";
                hint = "Cult classic directed by David Fincher, featuring underground fighting and an iconic twist.";
                break;
            case 4:
                word = "the dark knight";
                hint = "Superhero film directed by Christopher Nolan.";
                break;
            case 5:
                word = "the hobbit";
                hint = "Fantasy adventure film directed by Peter Jackson, based on J.R.R. Tolkien's novel.";
                break;
            case 6:
                word = "back to the future";
                hint = "Classic science fiction film directed by Robert Zemeckis, involving time travel and a DeLorean.";
                break;
            case 7:
                word = "the tooth fairy";
                hint = "Comedy film starring Dwayne Johnson as a hockey player turned magical tooth fairy.";
                break;
            case 8:
                word = "spirited away";
                hint = "Animated fantasy film directed by Hayao Miyazaki, set in a mysterious spirit world.";
                break;
            case 9:
                word = "parasite";
                hint = "Award-winning South Korean film directed by Bong Joon-ho, exploring class dynamics.";
                break;
            case 10:
                word = "gladiator";
                hint = "Epic historical drama directed by Ridley Scott, featuring a Roman general turned fighter.";
                break;
            case 11:
                word = "man of steel";
                hint = "Superhero film directed by Zack Snyder, featuring an iconic DC Comics character .";
                break;
            case 12:
                word = "jurassic park";
                hint = "Science fiction adventure film directed by Steven Spielberg, featuring genetically engineered dinosaurs.";
                break;
            case 13:
                word = "whiplash";
                hint = "Drama film directed by Damien Chazelle, focusing on a young drummer and his abusive teacher.";
                break;
            case 14:
                word = "ghost rider";
                hint = "Superhero film starring Nicolas Cage as a stunt motorcyclist possessed by a demon.";
                break;
            case 15:
                word = "ghost in the shell";
                hint = "Science fiction film based on the Japanese manga, exploring cybernetic enhancements and identity.";
                break;
            case 16:
                word = "the prestige";
                hint = "Mystery thriller film directed by Christopher Nolan, featuring rival magicians in Victorian London.";
                break;
            case 17:
                word = "your name";
                hint = "Anime film directed by Makoto Shinkai, focusing on a high school boy and girl who mysteriously swap bodies.";
                break;
            case 18:
                word = "a silent voice";
                hint = "Anime film directed by Naoko Yamada, exploring themes of bullying and redemption.";
                break;
            case 19:
                word = "jumanji";
                hint = "Fantasy adventure film featuring a magical board game that comes to life.";
                break;
            case 20:
                word = "la la land";
                hint = "Musical romantic comedy-drama film directed by Damien Chazelle, starring Emma Stone and Ryan Gosling.";
                break;
            case 21:
                word = "the italian job";
                hint = "Crime caper film about a gold heist, featuring Mini Cooper car chases.";
                break;
            case 22:
                word = "the irishman";
                hint = "Crime film directed by Martin Scorsese, featuring mobsters and union leaders.";
                break;
            case 23:
                word = "green book";
                hint = "Drama film based on the true story of a friendship between a pianist and his chauffeur.";
                break;
            case 24:
                word = "prisoners";
                hint = "Thriller film directed by Denis Villeneuve, about a father searching for his missing daughter.";
                break;
            case 25:
                word = "top gun maverick";
                hint = "Action drama film starring Tom Cruise as a daring fighter pilot.";
                break;
            case 26:
                word = "godzilla vs king kong";
                hint = "Monster film featuring epic battles between two iconic cinematic creatures.";
                break;
            case 27:
                word = "batman vs superman";
                hint = "Superhero film featuring a showdown between two iconic DC Comics characters.";
                break;
            case 28:
                word = "mad max";
                hint = "Post-apocalyptic action film series featuring brutal car chases and a desert wasteland.";
                break;
            case 29:
                word = "sherlock holmes";
                hint = "Mystery film featuring an iconic detective.";
                break;
            case 30:
                word = "doctor strange";
                hint = "Superhero film featuring a Marvel character, a former surgeon turned sorcerer.";
                break;
            case 31:
                word = "spotlight";
                hint = "Biographical drama film about investigative journalists uncovering systemic abuse within the Catholic Church.";
                break;
            case 32:
                word = "robocop";
                hint = "Science fiction action film featuring a cyborg law enforcement officer in a dystopian future.";
                break;
            case 33:
                word = "the incredibles";
                hint = "Animated superhero film featuring a family of superheroes with unique powers.";
                break;
            case 34:
                word = "puss in boots";
                hint = "Animated adventure film featuring the swashbuckling cat from the Shrek series.";
                break;
            case 35:
                word = "dont look up";
                hint = "Satirical black comedy film about scientists warning the world about an approaching comet.";
                break;
            case 36:
                word = "a quiet place";
                hint = "Horror thriller film directed by John Krasinski, featuring a family surviving in silence to avoid deadly creatures.";
                break;
            case 37:
                word = "wonder woman";
                hint = "Superhero film featuring an iconic female DC Comics character.";
                break;
            case 38:
                word = "the conjuring";
                hint = "Horror film based on the real-life paranormal investigations of Ed and Lorraine Warren.";
                break;
            case 39:
                word = "the maze runner";
                hint = "Dystopian science fiction film based on the novel by James Dashner, featuring a group of teens that are trapped.";
                break;
            case 40:
                word = "captain america";
                hint = "Superhero film series featuring an iconic Marvel character, a patriotic super-soldier.";
                break;
            case 41:
                word = "arrival";
                hint = "Science fiction film directed by Denis Villeneuve, focusing on linguistics and extraterrestrial communication.";
                break;
            case 42:
                word = "knives out";
                hint = "Mystery whodunit film directed by Rian Johnson, featuring a wealthy family and a clever detective.";
                break;
            case 43:
                word = "annabelle";
                hint = "Horror film featuring a possessed doll terrorizing a young family.";
                break;
        }
    }

    public void hMovies() {
        int random = (int) (Math.random() * 24 + 1);

        switch (random) {
            case 1:
                word = "mission impossible";
                hint = "Action spy film series featuring Ethan Hunt, known for its thrilling stunts and missions.";
                break;
            case 2:
                word = "insidous";
                hint = "It involves a haunted house and a family facing supernatural occurrences, with a focus on astral projection and malevolent spirits.";
                break;
            case 3:
                word = "justice league";
                hint = "Superhero film featuring DC Comics characters teaming up.";
                break;
            case 4:
                word = "guardians of the galaxy";
                hint = "Marvel superhero film featuring a group of intergalactic misfits.";
                break;
            case 5:
                word = "the shawshank redemption";
                hint = "Drama film directed by Frank Darabont, based on a Stephen King novella about hope and friendship in a prison.";
                break;
            case 6:
                word = "the lord of the rings";
                hint = "Epic fantasy film series based on J.R.R. Tolkien's novels, featuring the journey to destroy the One Ring.";
                break;
            case 7:
                word = "forrest gump";
                hint = "Drama film starring Tom Hanks as a simple man who unwittingly influences significant events in history.";
                break;
            case 8:
                word = "goodfellas";
                hint = "Crime film directed by Martin Scorsese, focusing on the rise and fall of a mob associate.";
                break;
            case 9:
                word = "saving private ryann";
                hint = "War film directed by Steven Spielberg, about a group of soldiers sent to find a paratrooper during World War II.";
                break;
            case 10:
                word = "the green mile";
                hint = "Drama film directed by Frank Darabont, based on a Stephen King novel about a prison guard's experiences with an inmate.";
                break;
            case 11:
                word = "howls moving castle";
                hint = "Animated fantasy film directed by Hayao Miyazaki, featuring a young woman cursed by a witch.";
                break;
            case 12:
                word = "persute of happiness";
                hint = "Biographical drama film starring Will Smith as a struggling salesman and single father.";
                break;
            case 13:
                word = "grave of the fireflies";
                hint = "Animated war film directed by Isao Takahata, focusing on two siblings' struggle to survive during World War II.";
                break;
            case 14:
                word = "once upon a time";
                hint = "Various films with this title, including a Quentin Tarantino film set in 1969 Hollywood.";
                break;
            case 15:
                word = "django unchained";
                hint = "Western film directed by Quentin Tarantino, about a freed slave seeking to rescue his wife from a brutal plantation owner.";
                break;
            case 16:
                word = "oppenheimer";
                hint = "biographical drama film directed by Christopher Nolan, focusing on Nukes.";
                break;
            case 17:
                word = "the revenant";
                hint = "Historical drama film directed by Alejandro González Iñárritu, featuring a frontiersman seeking revenge.";
                break;
            case 18:
                word = "the wolf of wall street";
                hint = "Biographical black comedy directed by Martin Scorsese, based on the true story of a stockbroker's rise and fall.";
                break;
            case 19:
                word = "oceans eleven";
                hint = "Heist film directed by Steven Soderbergh, featuring a group of criminals planning a casino robbery.";
                break;
            case 20:
                word = "catch me if you can";
                hint = "Biographical crime film directed by Steven Spielberg, based on the life of a skilled con artist.";
                break;
            case 21:
                word = "extraction";
                hint = "Action thriller film starring Chris Hemsworth as a black ops mercenary tasked with rescuing a kidnapped boy.";
                break;
            case 22:
                word = "el camino";
                hint = "Crime drama film set in the Breaking Bad universe, focusing on the character Jesse Pinkman.";
                break;
            case 23:
                word = "dunkirk";
                hint = "War film directed by Christopher Nolan, depicting the Dunkirk evacuation during World War II.";
                break;
            case 24:
                word = "the hatefull eight";
                hint = "Western thriller film directed by Quentin Tarantino, featuring a group of strangers trapped in a Wyoming haberdashery.";
                break;

        }
    }

    // Category 4
    public void eCoins() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "GBP"; // الجنيه البريطاني
                hint = "The currency abbreviation for the United Kingdom's money, often symbolized with £.";
                break;
            case 2:
                word = "ARS"; // البيزو الارجنتيني
                hint = "The currency abbreviation for Argentina's money, often symbolized with $.";
                break;
            case 3:
                word = "AUD"; // الدولار الاسترالي
                hint = "The currency abbreviation for Australia's money, often symbolized with $ or A$.";
                break;
            case 4:
                word = "SAR"; // الريال السعودي
                hint = "The currency abbreviation for Saudi Arabia's money, often symbolized with ر.س or SR.";
                break;
            case 5:
                word = "BRL"; // الريال البرازيلي
                hint = "The currency abbreviation for Brazil's money, often symbolized with R$.";
                break;
            case 6:
                word = "USD"; // الدولار الامريكي
                hint = "The currency abbreviation for the United States' money, often symbolized with $.";
                break;
            case 7:
                word = "CAD"; // الدولار الكندي
                hint = "The currency abbreviation for Canada's money, often symbolized with $ or C$.";
                break;
            case 8:
                word = "EGP"; // الجنيه المصري
                hint = "The currency abbreviation for Egypt's money, often symbolized with E£ or ج.م.";
                break;
            case 9:
                word = "INR"; // الروبيه الهندية
                hint = "The currency abbreviation for India's money, often symbolized with ₹ or Rs.";
                break;
            case 10:
                word = "IQD"; // الدينار العراقي
                hint = "The currency abbreviation for Iraq's money, often symbolized with ع.د or ID.";
                break;
            case 11:
                word = "JPY"; // الين الياباني
                hint = "The currency abbreviation for Japan's money, often symbolized with ¥ or 円.";
                break;
            case 12:
                word = "JOD"; // الدينار الاردني
                hint = "The currency abbreviation for Jordan's money, often symbolized with د.ا or JD.";
                break;
            case 13:
                word = "KWD"; // الدينار الكويتي
                hint = "The currency abbreviation for Kuwait's money, often symbolized with د.ك or KD.";
                break;
            case 14:
                word = "LBS"; // الليرة اللبنانية
                hint = "The currency abbreviation for Lebanon's money, often symbolized with ل.ل or L£.";
                break;
            case 15:
                word = "QAR"; // الريال القطري
                hint = "The currency abbreviation for Qatar's money, often symbolized with ر.ق or QR.";
                break;
            case 16:
                word = "RUB"; // الروبل الروسي
                hint = "The currency abbreviation for Russia's money, often symbolized with ₽ or руб.";
                break;
            case 17:
                word = "TRY"; // الليرة التركية
                hint = "The currency abbreviation for Turkey's money, often symbolized with ₺ or TL.";
                break;
            case 18:
                word = "AED"; // الدرهم الاماراتي
                hint = "The currency abbreviation for the United Arab Emirates' money, often symbolized with د.إ .";
                break;
            case 19:
                word = "EUR"; // اليورو
                hint = "The currency abbreviation for the euro, used by the Eurozone countries, often symbolized with €.";
                break;
            case 20:
                word = "ILS"; // الشيكل
                hint = "The currency abbreviation for Israel's money, often symbolized with ₪ or שח.";
                break;
        }
    }

    public void mCoins() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "ANG"; // الجيلدر الهولندي
                hint = "The currency abbreviation for the Dutch guilder, used in the Kingdom of the Netherlands and its territories.";
                break;
            case 2:
                word = "BHD";// الدينار البحريني
                hint = "The currency abbreviation for the Bahraini dinar, the currency of Bahrain, often symbolized with BD.";
                break;
            case 3:
                word = "CHF"; //  الفرنك السويسري
                hint = "The currency abbreviation for the Swiss franc, the currency and legal tender of Switzerland and Liechtenstein.";
                break;
            case 4:
                word = "DZD";// الدينار الجزائري 
                hint = "The currency abbreviation for the Algerian dinar, the currency of Algeria.";
                break;
            case 5:
                word = "HKD";//دولار هونج جونج
                hint = "The currency abbreviation for the Hong Kong dollar, the official currency of Hong Kong.";
                break;
            case 6:
                word = "IRR";//  الريال الايراني
                hint = "The currency abbreviation for the Iranian rial, the currency of Iran.";
                break;
            case 7:
                word = "LKR";//الروبية السريلانكية
                hint = "The currency abbreviation for the Sri Lankan rupee, the currency of Sri Lanka.";
                break;
            case 8:
                word = "LYD";// الدينار الليبي
                hint = "The currency abbreviation for the Libyan dinar, the currency of Libya.";
                break;
            case 9:
                word = "MAD";// الدرهم المغربي
                hint = "The currency abbreviation for the Moroccan dirham, the currency of Morocco.";
                break;
            case 10:
                word = "OMR";// الريال العماني
                hint = "The currency abbreviation for the Omani rial, the currency of Oman.";
                break;
            case 11:
                word = "PKR";//الرزبية الباكستانية
                hint = "The currency abbreviation for the Pakistani rupee, the currency of Pakistan.";
                break;
            case 12:
                word = "SDG";// الجنيه السوداني
                hint = "The currency abbreviation for the Sudanese pound, the currency of Sudan.";
                break;
            case 13:
                word = "SGD";//الدولار السنغفوري
                hint = "The currency abbreviation for the Singapore dollar, the official currency of Singapore.";
                break;
            case 14:
                word = "SYP";// الليرة السورية
                hint = "The currency abbreviation for the Syrian pound, the currency of Syria.";
                break;
            case 15:
                word = "TND";// الدينار التونسي
                hint = "The currency abbreviation for the Tunisian dinar, the currency of Tunisia.";
                break;
            case 16:
                word = "YER";//  الريال اليمني
                hint = "The currency abbreviation for the Yemeni rial, the currency of Yemen.";
                break;
            case 17:
                word = "UAH";//هيرفانا اوكرانية
                hint = "The currency abbreviation for the Ukrainian hryvnia, the currency of Ukraine.";
                break;
            case 18:
                word = "TWD";// الدولار التيواني
                hint = "The currency abbreviation for the New Taiwan dollar, the currency used in Taiwan.";
                break;
            case 19:
                word = "SVC";//الكولون السلفادوري
                hint = "The currency abbreviation for the Salvadoran colón, the former currency of El Salvador.";
                break;
            case 20:
                word = "SOS";//الشلن الصومالي
                hint = "The currency abbreviation for the Somali shilling, the currency of Somalia.";
                break;
        }
    }

    public void hCoins() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "BTC";//BITCOIN
                hint = "The first and most well-known cryptocurrency.";
                break;
            case 2:
                word = "ETH";//ETHEREUM
                hint = "A decentralized platform for smart contracts and decentralized applications (DApps).";
                break;
            case 3:
                word = "SOL";//SOLANA
                hint = "A high-performance blockchain platform.";
                break;
            case 4:
                word = "USDC";//USDC
                hint = "A stablecoin cryptocurrency pegged to the US dollar.";
                break;
            case 5:
                word = "XRP";//XRP
                hint = "The digital currency used on the Ripple payment protocol.";
                break;
            case 6:
                word = "TON";//TONCOIN
                hint = "The native cryptocurrency of the TON blockchain.";
                break;
            case 7:
                word = "ADA";// CARDANO
                hint = "A blockchain platform for decentralized applications.";
                break;
            case 8:
                word = "TRX";// TRON
                hint = "A blockchain-based decentralized platform.";
                break;
            case 9:
                word = "DOT";// POLKADOT
                hint = "A multi-chain blockchain platform.";
                break;
            case 10:
                word = "LINK";// CHAINLINK
                hint = "A decentralized oracle network.";
                break;
            case 11:
                word = "NEAR";//NRAR PTOTOCOL
                hint = "A decentralized application platform.";
                break;
            case 12:
                word = "LTC";// LITECOIN
                hint = "A peer-to-peer cryptocurrency.";
                break;
            case 13:
                word = "DAI";// DAI
                hint = "A stablecoin cryptocurrency on the Ethereum blockchain.";
                break;
            case 14:
                word = "UNI";// UNISWAP
                hint = "A decentralized finance (DeFi) protocol.";
                break;
            case 15:
                word = "ICP";// INTERNET COPMUTER
                hint = "A blockchain-based decentralized platform.";
                break;
            case 16:
                word = "MATIC";// POLYGON
                hint = "A scaling solution for Ethereum.";
                break;
            case 17:
                word = "WBTC";// WRAPPED BITCOIN
                hint = "A tokenized version of Bitcoin (BTC) on the Ethereum blockchain.";
                break;
            case 18:
                word = "AVAX";//AVALANCHE
                hint = "A decentralized platform for custom blockchain networks.";
                break;
            case 19:
                word = "SHIB";// SHIBA INU
                hint = "A meme cryptocurrency token.";
                break;
            case 20:
                word = "DOGE";// DOGECOIN
                hint = "A cryptocurrency that started as a joke.";
                break;
        }
    }

    // Category 5
public void special() {
        int random = (int) (Math.random() * 19 + 1);

        switch (random) {
            case 1:
                word = "ghaith almahadin";
                hint = "Best DR who`s ganna give us 5 mark`s bonus (each)";
                break;
            case 2:
                word = "majed abu safeyeh";
                hint = "Usually lectures Logic and Computer Organization & Architecture";
                break;
            case 3:
                word = "khalid alkaabneh";
                hint = "Prof and usually lectures Introduction for Software Engineering";
                break;
            case 4:
                word = "mahran alzyoud";
                hint = "One of the Cyber Security DR & was recently commemorated";
                break;
            case 5:
                word = "yousef alrabanah";
                hint = "Responsible for most Data Science competitions";
                break;
            case 6:
                word = "sumaya alkhatib";
                hint = "Honey";
                break;
            case 7:
                word = "abdelrahman hussein";
                hint = "Prof & coordinator of Software Sngineering";
                break;
            case 8:
                word = "ahmad alshamayleh";
                hint = "Most feiendly & helpful DR";
                break;
            case 9:
                word = "wael toghuj";
                hint = "Usually lectures Visual Programming";
                break;
            case 10:
                word = "laith bani ata";
                hint = "One of our newest faculty additions";
                break;
            case 11:
                word = "mohammad alhyari";
                hint = "The longest lecture forever";
                break;
            case 12:
                word = "mosleh abu alhaj";
                hint = "This professor is a certified CISCO instructor (ICP/CCSI)";
                break;
            case 13:
                word = "ahmad abushareha";
                hint = "Coordinator of Data Science & AI department";
                break;
            case 14:
                word = "adeeb alsaaidah";
                hint = "Coordinator of Cyber Security";
                break;
            case 15:
                word = "mohammad alsharaiah";
                hint = "Coordinator of Computer Science";
                break;
            case 16:
                word = "nedal mustafa";
                hint = "his full name has a similar name to one of our team members";
                break;
            case 17:
                word = "qusai shambour";
                hint = "got his PHD in australia";
                break;
            case 18:
                word = "mwaffaq abu alhija";
                hint = "got his PHD in the National technical universityof ukraine";
                break;
            case 19:
                word = "osama albaik";
                hint = "Taught in Canada for some time ";
                break;
        }
    }

    // Category 6
    public void classic() {
        Dictionary d = new Dictionary();
        word = d.getWord();
    }

    // Category 7
public void eFruit() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "olive"; // زيتون
                hint = "use important in Mediterranean cuisines and beyond.";
                break;
            case 2:
                word = "orange";// برتقال
                hint = "They're not just deliciously juicy fruits but also rich in Vitamin C and antioxidants.";
                break;
            case 3:
                word = "dates";//تمر
                hint = "often symbolizing hospitality and generosity.";
                break;
            case 4:
                word = "avocado";//افوكادو
                hint = "Their creamy texture and mild flavor make them a versatile ingredient in both savory and sweet dishes";
                break;
            case 5:
                word = "Grapes";//عنب
                hint = "transformed into jams and jellies. ";
                break;
            case 6:
                word = "fig";//تين
                hint = "Knowledge and Wisdom In ancient Greek and Roman mythology";
                break;
            case 7:
                word = "guava"; //جوافة
                hint = "tropical yellow fruit";
                break;
            case 8:
                word = "Papaya"; //بابايا
                hint = "tropical fruits with a vibrant orange flesh and a sweet, tropical flavor.";
                break;
            case 9:
                word = "Manga";//مانجا
                hint = "It's a fascinating and vibrant part of Japanese culture.";
                break;
            case 10:
                word = "pomegranate";//رمان
                hint = "used as decorative elements in food presentation and as ornamental fruits in home decor.";
                break;
            case 11:
                word = "strawberry"; //فراولة
                hint = "delightful fruits loved for their sweet flavor and vibrant color";
                break;
            case 12:
                word = "Watermelon"; //بطيخ
                hint = "is a quintessential summer fruit loved for its juicy sweetness and refreshing taste";
                break;
            case 13:
                word = "banana"; //موز
                hint = "are packed with essential nutrients like potassium, vitamin C, vitamin B6, and fiber.";
                break;
            case 14:
                word = "Cherry"; //كرز
                hint = "their sweet and tangy flavor, vibrant color ";
                break;
            case 15:
                word = "Lemon";//ليمون اصفر
                hint = "effective for removing stains, freshening surfaces, and deodorizing.";
                break;
            case 16:
                word = "lime";//لليمون اخضر
                hint = "support immune health ,They're also low in calories and can be a refreshing addition to a balanced diet.";
                break;
            case 17:
                word = "Apple";//تفاح
                hint = "They're low in calories but high in antioxidants, which may help promote heart health,  and aid digestion";
                break;
            case 18:
                word = "Pineapple";//اناناس
                hint = "their spiky exterior and crown of leaves, appearance that sets them apart from other fruits.";
                break;
            case 19:
                word = "Peach"; //دراق
                hint = "One of the most distinctive features of  is their fuzzy skin, which ranges in color from yellow to red.";
                break;
            case 20:
                word = "apricot"; //مشمش
                hint = "nown for their beautiful golden-orange color";
                break;
        }
    }

    public void mFruit() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "Solanum muricatum";//اجاص الشمام
                hint = "smooth skin varies in color from yellow to purple, with prominent purple stripes or spots";
                break;
            case 2:
                word = "cantaloupe";//  شمام
                hint = "have a rough, netted rind with a color ranging from pale green to orange when ripe.";
                break;
            case 3:
                word = "flat peach";//   دراق مبلط
                hint = "have a flattened shape, resembling a doughnut or a Saturn's ring.";
                break;
            case 4:
                word = "Loquat fruit";//  اسكدنيا
                hint = "small, round or pear-shaped fruits with a smooth, yellow to orange skin when ripe";
                break;
            case 5:
                word = "green cherries";//  كرز اخضر
                hint = "Instead of the familiar deep red or purple color, they are green when unripe";
                break;
            case 6:
                word = "Green plum";// البرقوق الاخضر
                hint = "They have a sweet, honey-like taste with a subtle tartness that adds depth.";
                break;
            case 7:
                word = "plum"; // البرقوق
                hint = "offer numerous health benefits due to their rich nutritional profile and unique phytochemical composition.";
                break;
            case 8:
                word = "jujube"; // عناب
                hint = "aiding digestion, improving sleep quality, and reducing stress and anxiety.";
                break;
            case 9:
                word = "Persimmon";// كاكا
                hint = "High in Fiber";
                break;
            case 10:
                word = "green apple";// تفاح اخضر
                hint = "Their crisp texture and tart flavor ";
                break;
            case 11:
                word = "black grapes"; // عنب اسود
                hint = "Add to fruit salads to enhance their sweetness and juiciness.";
                break;
            case 12:
                word = "clementine"; //  كلمنتينا
                hint = "Add Slices of it salads for a burst of citrus flavor";
                break;
            case 13:
                word = "pomelo"; // ليمون هندي
                hint = "used in Asian salads.";
                break;
            case 14:
                word = "Grapefruit"; //برتفال مر
                hint = "tangy and slightly bitter flavor";
                break;
            case 15:
                word = "Morus nigra";//  توت اسود
                hint = "supporting cardiovascular health,  and regulating blood sugar levels";
                break;
            case 16:
                word = "red mulberry"; //  توت احمر
                hint = "The wood of it trees can be used for woodworking projects such as furniture, tool handles, and decorative items. ";
                break;
            case 17:
                word = "Blueberry";//  توت ازرق
                hint = "sweet and tart flavor";
                break;
            case 18:
                word = "Quince";// سفرجل
                hint = "make tea is aromatic and slightly tart, making it a comforting and warming beverage";
                break;
            case 19:
                word = "Kiwifruit"; //كيوي
                hint = "Boosts Immune Function";
                break;
            case 20:
                word = "Coconut"; //جوز هند
                hint = "Immune Support";
                break;
        }
    }

    public void hFruit() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "sugar cane";
                hint = "It improve overall digestive health.";
                break;
            case 2:
                word = "Rambutan";
                hint = "has a high water content, making it a hydrating fruit";
                break;
            case 3:
                word = "Jackfruit";
                hint = " contains calcium, magnesium, and phosphorus, which are essential minerals for bone health and strength.";
                break;
            case 4:
                word = "Gooseberry";
                hint = "Boosts Immune Function";
                break;
            case 5:
                word = "Raspberry";
                hint = "Supports Brain Health";
                break;
            case 6:
                word = "peach";
                hint = "Improve Eye Health";
                break;
            case 7:
                word = "sloe";
                hint = "Support Liver Health";
                break;
            case 8:
                word = "Passion Fruit";
                hint = "help reduce anxiety and promote relaxation";
                break;
            case 9:
                word = "mangosteen";
                hint = "help lower cholesterol levels, improve blood flow, and reduce the risk of heart disease";
                break;
            case 10:
                word = "Lychee";
                hint = "a tropical fruit native to Southeast Asia";
                break;
            case 11:
                word = "Star fruit";
                hint = "known as carambola";
                break;
            case 12:
                word = "Kumqut";
                hint = "small citrus fruits native to Asia, their unique flavor";
                break;
            case 13:
                word = "Durian";
                hint = "is high in carbohydrates, particularly sugars, making it an excellent source of quick energy";
                break;
            case 14:
                word = "Dragon Fruit";
                hint = "The flesh has a texture similar to kiwi or pear, with tiny edible seeds reminiscent of those found in kiwi fruit.";
                break;
            case 15:
                word = "Snake fruit";
                hint = "is a tropical fruit native to Indonesia and other regions of Southeast Asia.";
                break;
            case 16:
                word = "Longan";
                hint = "helps maintain fluid balance in the body,  and prevent dehydration";
                break;
            case 17:
                word = "Indian cream";
                hint = "that is creamy in texture or appearance";
                break;
            case 18:
                word = "atemoya";
                hint = "hybrid fruit, a cross between a cherimoya and a sugar apple ";
                break;
            case 19:
                word = "Breadfruit";
                hint = "used as a starchy staple food";
                break;
            case 20:
                word = "Musang King";
                hint = "known as Mao Shan Wang it is rich, creamy texture and intense flavor. ";
                break;
        }
    }
    //category 8
    public void eAnimal() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "dog";
                hint = "Man's best friend.";
                break;
            case 2:
                word = "cat";
                hint = "Known for being independent and curious.";
                break;
            case 3:
                word = "rabbit";
                hint = "Animal known for long ears and hopping gait.";
                break;
            case 4:
                word = "bird";
                hint = "Feathered creature known for flight.";
                break;
            case 5:
                word = "fish";
                hint = "Aquatic creature with gills for breathing.";
                break;
            case 6:
                word = "frog";
                hint = "Amphibian known for its jumping ability and croaking sound.";
                break;
            case 7:
                word = "snake";
                hint = "Reptile often associated with slithering and venom.";
                break;
            case 8:
                word = "turtle";
                hint = "Reptile with a hard shell that it can retract into.";
                break;
            case 9:
                word = "mouse";
                hint = "Small rodent often found in homes.";
                break;
            case 10:
                word = "horse";
                hint = "Large mammal often used for riding or pulling loads.";
                break;
            case 11:
                word = "hamster";
                hint = "Small rodent known for its cheek pouches and wheel-running.";
                break;
            case 12:
                word = "guinea pig";
                hint = "Small mammal often kept as a pet, known for its squeaks.";
                break;
            case 13:
                word = "parrot";
                hint = "Colorful bird often capable of mimicking human speech.";
                break;
            case 14:
                word = "goldfish";
                hint = "Popular aquarium fish known for its golden color and memory span.";
                break;
            case 15:
                word = "squirrel";
                hint = "Small mammal known for storing nuts and acorns.";
                break;
            case 16:
                word = "cow";
                hint = "Domesticated mammal often raised for milk and meat.";
                break;
            case 17:
                word = "bear";
                hint = "Large mammal known for its strength and hibernation.";
                break;
            case 18:
                word = "dolphin";
                hint = "Highly intelligent marine mammal known for its playful behavior.";
                break;
            case 19:
                word = "zebra";
                hint = "African equid known for its black and white stripes.";
                break;
            case 20:
                word = "penguin";
                hint = "Flightless bird found in the Southern Hemisphere, often associated with ice.";
                break;
        }
    }

    public void mAnimal() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "lion";
                hint = "King of the jungle.";
                break;
            case 2:
                word = "tiger";
                hint = "Large feline known for its stripes and strength.";
                break;
            case 3:
                word = "koala";
                hint = "Marsupial native to Australia, known for eating eucalyptus leaves.";
                break;
            case 4:
                word = "gorilla";
                hint = "Large primate native to Africa.";
                break;
            case 5:
                word = "panda";
                hint = "Bear native to China, known for its black and white fur.";
                break;
            case 6:
                word = "giraffe";
                hint = "Tallest land animal with a long neck.";
                break;
            case 7:
                word = "rhinoceros";
                hint = "Large herbivorous mammal with a horn on its nose.";
                break;
            case 8:
                word = "crocodile";
                hint = "Large reptile often found in rivers and swamps.";
                break;
            case 9:
                word = "hippopotamus";
                hint = "Large herbivorous mammal often found in African rivers, known for its size and aggression.";
                break;
            case 10:
                word = "cheetah";
                hint = "Fastest land animal known for its speed and spotted coat.";
                break;
            case 11:
                word = "leopard";
                hint = "Large spotted feline found in Africa and Asia.";
                break;
            case 12:
                word = "kangaroo";
                hint = "Marsupial known for its powerful hind legs and hopping locomotion.";
                break;
            case 13:
                word = "hedgehog";
                hint = "Small spiny mammal often found in gardens.";
                break;
            case 14:
                word = "wolf";
                hint = "Wild canine known for its pack behavior and howling.";
                break;
            case 15:
                word = "otter";
                hint = "Aquatic mammal known for its playful behavior.";
                break;
            case 16:
                word = "elephant";
                hint = "Largest land animal with a long trunk.";
                break;
            case 17:
                word = "bat";
                hint = "Nocturnal flying mammal.";
                break;
            case 18:
                word = "buuterfly";
                hint = "Insect known for its colorful wings and delicate flight.";
                break;
            case 19:
                word = "shark";
                hint = "Predatory fish with cartilaginous skeleton and multiple rows of teeth.";
                break;
            case 20:
                word = "crab";
                hint = "Decapod crustacean with a broad, flattened body and clawed limbs.";
                break;
        }
    }

    public void hAnimal() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "platypus";
                hint = "Mammal with a duck-like bill and webbed feet.";
                break;
            case 2:
                word = "narwhal";
                hint = "Whale with a long, spiral tusk protruding from its head.";
                break;
            case 3:
                word = "axolotl";
                hint = "Aquatic salamander known for regenerative abilities.";
                break;
            case 4:
                word = "quokka";
                hint = "Small marsupial known for its friendly and smiley appearance.";
                break;
            case 5:
                word = "okapi";
                hint = "Giraffe-like mammal native to the Democratic Republic of the Congo.";
                break;
            case 6:
                word = "fennec fox";
                hint = "Small fox species with large ears, native to North Africa.";
                break;
            case 7:
                word = "mantaray";
                hint = "Large ray with distinctive flattened body and cephalic fins resembling horns.";
                break;
            case 8:
                word = "tardigrade";
                hint = "Microscopic animal known for its ability to survive extreme conditions.";
                break;
            case 9:
                word = "komodo dragon";
                hint = "Large lizard native to Indonesia, known for its venomous bite.";
                break;
            case 10:
                word = "chameleon";
                hint = "Lizard known for its ability to change color.";
                break;
            case 11:
                word = "blue whale";
                hint = "Largest animal on Earth, known for its immense size and loud calls.";
                break;
            case 12:
                word = "armadillo";
                hint = "Mammal with a protective bony armor shell.";
                break;
            case 13:
                word = "porcupine";
                hint = "Rodent known for its sharp quills used for defense.";
                break;
            case 14:
                word = "tapir";
                hint = "Large mammal with a flexible snout, native to Central and South America.";
                break;
            case 15:
                word = "aardvark";
                hint = "Mammal known for its long snout and eating ants and termites.";
                break;
            case 16:
                word = "coelacanth";
                hint = "Primitive fish once thought to be extinct until rediscovered in 1938.";
                break;
            case 17:
                word = "hoopoe";
                hint = "Colorful bird known for its distinctive 'crown' of feathers and elaborate courtship displays.";
                break;
            case 18:
                word = "sloth";
                hint = "Slow-moving mammal found in Central and South America.";
                break;
            case 19:
                word = "aye aye";
                hint = "Nocturnal lemur with a long, thin middle finger used for extracting insects from tree bark.";
                break;
            case 20:
                word = "narwhal";
                hint = "Whale with a long, spiral tusk protruding from its head.";
                break;
        }
    }

    //category 9
    public void eInstrument() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "guitar";
                hint = "String instrument often used in popular music.";
                break;
            case 2:
                word = "piano";
                hint = "Keyboard instrument with keys.";
                break;
            case 3:
                word = "violin";
                hint = "String instrument played with a bow.";
                break;
            case 4:
                word = "trumpet";
                hint = "Brass instrument with a bright, powerful sound.";
                break;
            case 5:
                word = "flute";
                hint = "Woodwind instrument played by blowing across a hole.";
                break;
            case 6:
                word = "clarinet";
                hint = "Woodwind instrument with a single-reed mouthpiece.";
                break;
            case 7:
                word = "saxophone";
                hint = "Woodwind instrument with a single reed and conical bore.";
                break;
            case 8:
                word = "accordion";
                hint = "Portable wind instrument with a keyboard.";
                break;
            case 9:
                word = "banjo";
                hint = "String instrument with a round body and long neck.";
                break;
            case 10:
                word = "ukulele";
                hint = "Small, guitar-like string instrument from Hawaii.";
                break;
            case 11:
                word = "harmonica";
                hint = "Small wind instrument held between the lips.";
                break;
            case 12:
                word = "mandolin";
                hint = "String instrument with a pear-shaped body and double strings.";
                break;
            case 13:
                word = "xylophone";
                hint = "Percussion instrument with wooden bars struck by mallets.";
                break;
            case 14:
                word = "bassoon";
                hint = "Double-reed woodwind instrument with a distinctive tone.";
                break;
            case 15:
                word = "trombone";
                hint = "Brass instrument with a slide for changing pitch.";
                break;
            case 16:
                word = "bagpipes";
                hint = "Wind instrument with a bag and multiple pipes.";
                break;
            case 17:
                word = "djembe";
                hint = "African drum played with hands.";
                break;
            case 18:
                word = "marimba";
                hint = "Percussion instrument with wooden bars and resonators.";
                break;
            case 19:
                word = "ocarina";
                hint = "Small wind instrument shaped like a sweet potato.";
                break;
            case 20:
                word = "kazoo";
                hint = "Simple musical instrument with a membrane that creates a buzzing sound.";
                break;
        }
    }

    public void mInstrument() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "drums";
                hint = "Percussion instrument typically played with sticks or hands.";
                break;
            case 2:
                word = "cello";
                hint = "Large string instrument played with a bow.";
                break;
            case 3:
                word = "double bass";
                hint = "Largest and lowest-pitched string instrument in the orchestra.";
                break;
            case 4:
                word = "harp";
                hint = "Large string instrument played by plucking the strings with fingers.";
                break;
            case 5:
                word = "tambourine";
                hint = "Hand-held percussion instrument with jingling metal discs.";
                break;
            case 6:
                word = "xylophone";
                hint = "Percussion instrument with wooden bars struck by mallets.";
                break;
            case 7:
                word = "triangle";
                hint = "Percussion instrument consisting of a metal bar bent into a triangle.";
                break;
            case 8:
                word = "maracas";
                hint = "Latin American percussion instrument with a handle filled with beads or seeds.";
                break;
            case 9:
                word = "accordion";
                hint = "Portable wind instrument with a keyboard.";
                break;
            case 10:
                word = "oboe";
                hint = "Woodwind instrument with a double reed and conical bore.";
                break;
            case 11:
                word = "bass guitar";
                hint = "String instrument with a long neck and low pitch.";
                break;
            case 12:
                word = "timpani";
                hint = "Large, bowl-shaped percussion instrument played with mallets.";
                break;
            case 13:
                word = "sitar";
                hint = "Indian string instrument with a long neck and resonating gourd.";
                break;
            case 14:
                word = "bongo drums";
                hint = "Pair of small, open-bottomed drums played with hands.";
                break;
            case 15:
                word = "french horn";
                hint = "Brass instrument with a coiled tube and flared bell.";
                break;
            case 16:
                word = "tuba";
                hint = "Large brass instrument with a wide bell and conical bore.";
                break;
            case 17:
                word = "conga drums";
                hint = "Tall, narrow, single-headed drum originating from Cuba.";
                break;
            case 18:
                word = "piccolo";
                hint = "Small woodwind instrument, an octave higher than the flute.";
                break;
            case 19:
                word = "gong";
                hint = "Large metal disc struck with a mallet.";
                break;
            case 20:
                word = "didgeridoo";
                hint = "Wind instrument developed by Indigenous Australians.";
                break;
        }
    }

    public void hInstrument() {
        int random = (int) (Math.random() * 20 + 1);

        switch (random) {
            case 1:
                word = "balalaika";
                hint = "Russian string instrument with a triangular body.";
                break;
            case 2:
                word = "shamisen";
                hint = "Japanese string instrument with a long neck and three strings.";
                break;
            case 3:
                word = "dulcimer";
                hint = "String instrument with a trapezoidal body and hammered strings.";
                break;
            case 4:
                word = "sarangi";
                hint = "Indian string instrument played with a bow.";
                break;
            case 5:
                word = "theremin";
                hint = "Electronic instrument played without physical contact.";
                break;
            case 6:
                word = "erhu";
                hint = "Chinese string instrument with two strings and a bow.";
                break;
            case 7:
                word = "mbira";
                hint = "African thumb piano with metal tines.";
                break;
            case 8:
                word = "angklung";
                hint = "Indonesian musical instrument made of bamboo tubes.";
                break;
            case 9:
                word = "cuíca";
                hint = "Brazilian friction drum with a stick attached to the drumhead.";
                break;
            case 10:
                word = "saz";
                hint = "Turkish string instrument with a long neck and fretted fingerboard.";
                break;
            case 11:
                word = "koto";
                hint = "Japanese string instrument with a long, rectangular body.";
                break;
            case 12:
                word = "gamelan";
                hint = "Traditional Indonesian ensemble consisting of percussion instruments.";
                break;
            case 13:
                word = "pipa";
                hint = "Chinese string instrument with a pear-shaped body and four strings.";
                break;
            case 14:
                word = "sarod";
                hint = "Indian string instrument with a fretless fingerboard and metal strings.";
                break;
            case 15:
                word = "dizi";
                hint = "Chinese flute made of bamboo.";
                break;
            case 16:
                word = "oud";
                hint = "Middle Eastern string instrument with a pear-shaped body.";
                break;
            case 17:
                word = "hang";
                hint = "Swiss percussion instrument with a UFO-shaped body.";
                break;
            case 18:
                word = "mbira";
                hint = "African thumb piano with metal tines.";
                break;
            case 19:
                word = "guzheng";
                hint = "Chinese zither with movable bridges and multiple strings.";
                break;
            case 20:
                word = "kalimba";
                hint = "African thumb piano with metal tines mounted on a wooden board.";
                break;
        }
    }

    public void setCategory(String currentCategory) {
       this.category = currentCategory;
    }

}
