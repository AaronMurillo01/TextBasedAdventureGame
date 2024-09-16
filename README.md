
# Text-Based Adventure Game

## Project Overview
The Text-Based Adventure Game is a simple console-based game where the player explores different locations, collects items, and faces challenges. The game demonstrates basic Java concepts such as classes, objects, and control flow.

## Features
- Create a player with a name and initial health.
- Explore different locations such as a forest, cave, and village.
- Collect items like potions and heal when exploring locations.
- Move between different locations in the game world.
- Manage the player's health and inventory.

## Folder Structure
```
TextBasedAdventureGame/
│
├── src/
│   ├── Game.java             # Main class to run the game
│   ├── Player.java           # Class for player details
│   ├── Location.java         # Class to represent different locations in the game
│   └── GameManager.java      # Class to manage the game flow
└── .vscode/                  # Optional (for debugging in VSCode)
    └── launch.json           # Optional (VSCode debugging config)
```

## Prerequisites
Before running the game, ensure you have the following installed:
1. **Java Development Kit (JDK)**: Download and install JDK (version 17 or later recommended). You can check if it's installed using:
   ```bash
   java -version
   ```

2. **Text Editor or IDE**: You can use any text editor or IDE. We recommend using [Visual Studio Code](https://code.visualstudio.com/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## How to Run
1. Clone or download the project files to your local machine.
2. Open a terminal in the `TextBasedAdventureGame/` directory.
3. Navigate to the `src/` folder:
   ```bash
   cd src
   ```
4. Compile the Java files:
   ```bash
   javac Game.java Player.java Location.java GameManager.java
   ```
5. Run the game:
   ```bash
   java Game
   ```

## Future Enhancements
- **More Locations**: Add more diverse locations with different challenges.
- **Enemies**: Introduce enemies or obstacles that players must fight or avoid.
- **Storyline**: Expand the game with a more detailed storyline and quests.

## License
This project is open-source and available for personal use and learning purposes.
