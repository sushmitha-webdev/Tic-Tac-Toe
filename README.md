# Java Tic-Tac-Toe Game

A classic Tic-Tac-Toe game implemented in Java, playable directly within your console. This project serves as a practical example of Object-Oriented Programming (OOP) principles, separating game logic from player behavior. It features both a human player and a simple AI opponent, providing a complete, interactive gaming experience.

## Features

*   **Console-Based Gameplay:** Engage in the game directly through your terminal or IDE console.
*   **Human vs. AI:** Challenge a basic AI that makes random but valid moves.
*   **Clear Board Display:** The game board is visually represented in a 3x3 grid format.
*   **Comprehensive Win Conditions:** Accurately detects winning lines across rows, columns, and both diagonals.
*   **Draw Detection:** Identifies when the game ends in a stalemate.
*   **Object-Oriented Design:**
    *   `TicTacToe` class: Manages the game board state, places marks, and checks for win/draw conditions.
    *   `Player` abstract class: Provides a foundational structure for all players, defining common attributes (name, mark) and behaviors (`makeMove`).
    *   `HumanPlayer` class: Extends `Player`, handling move input from a human user via the console.
    *   `AIPlayer` class: Extends `Player`, implementing a simple AI that chooses valid moves randomly.

## How to Run

### Using Command Line (Terminal)

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/java-tic-tac-toe.git
    cd java-tic-tac-toe
    ```
    *(Replace `your-username` with your GitHub username and `java-tic-tac-toe` with your repository name.)*

2.  **Compile all Java files:**
    ```bash
    javac *.java
    ```
    *(This command compiles all `.java` files present in the directory.)*

3.  **Execute the game:**
    ```bash
    java LaunchGame
    ```
    The game will start in your terminal. Follow the on-screen prompts to enter your moves (row and column numbers, from 0 to 2).

### Using Eclipse IDE

1.  **Create a New Java Project:**
    *   Open Eclipse.
    *   Go to `File > New > Java Project`.
    *   Enter `TicTacToeGame` as the "Project name" and click `Finish`.

2.  **Create Individual Java Files:**
    *   For each of the five class definitions (`TicTacToe`, `Player`, `HumanPlayer`, `AIPlayer`, `LaunchGame`):
        *   In the "Package Explorer," right-click on the `src` folder of your `TicTacToeGame` project.
        *   Select `New > Class`.
        *   Enter the exact class name (e.g., `TicTacToe`) in the "Name:" field.
        *   Ensure the "Package" field is empty.
        *   Click `Finish`.

3.  **Paste Code into Respective Files:**
    *   Open each newly created `.java` file in the Eclipse editor.
    *   Paste the *entire* code for that specific class into its corresponding file (e.g., the `TicTacToe` class code into `TicTacToe.java`, `Player` class code into `Player.java`, and so on for all five files).
    *   Save all files (`Ctrl+S` or `Cmd+S`). Eclipse will automatically compile them.

4.  **Run the Application:**
    *   Locate the `LaunchGame.java` file in your "Package Explorer" (this file contains the `main` method).
    *   Right-click on `LaunchGame.java`.
    *   Select `Run As > Java Application`.

5.  **Play in the Console:**
    *   The game will execute, and its output will appear in the "Console" view at the bottom of your Eclipse window.
    *   Enter your desired row and column for each move when prompted.

## Project Files

*   `TicTacToe.java`: Manages the game board and checks for win/draw conditions.
*   `Player.java`: Abstract base class for all players.
*   `HumanPlayer.java`: Concrete class for a human player, handling user input.
*   `AIPlayer.java`: Concrete class for an AI player, making random moves.
*   `LaunchGame.java`: The entry point for the application, setting up and running the game.

## Technologies Used

*   Java

## Contributing

Contributions are welcome! If you have suggestions for improvements (e.g., a more intelligent AI, additional game modes, GUI), please feel free to fork this repository and submit a pull request.

## License

This project is open-source and available under the [MIT License](LICENSE).
