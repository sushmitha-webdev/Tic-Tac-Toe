# Java Tic-Tac-Toe Game

A classic Tic-Tac-Toe game implemented in Java, playable in the console. This project showcases Object-Oriented Programming (OOP) principles by separating game logic from player logic, and features both a human player and a simple AI opponent.

## Features

*   **Console-Based Gameplay:** Play directly in your terminal.
*   **Human vs. AI:** Challenge a basic AI opponent.
*   **Clear Board Display:** Visual representation of the Tic-Tac-Toe board.
*   **Win Conditions:** Detects wins across rows, columns, and diagonals.
*   **Draw Detection:** Recognizes when the game ends in a draw.
*   **OOP Design:**
    *   `TicTacToe` class for board management and win checks.
    *   `Player` abstract class for common player attributes and behaviors.
    *   `HumanPlayer` for user input.
    *   `AIPlayer` for random, valid moves.

## How to Run

1.  **Clone the repository (or save the Java files):**
    ```bash
    git clone https://github.com/your-username/java-tic-tac-toe.git
    cd java-tic-tac-toe
    ```
2.  **Compile the Java code:**
    ```bash
    javac *.java
    ```
    *(**Note:** `*.java` compiles all Java files in the current directory.)*

3.  **Execute the game:**
    ```bash
    java LaunchGame
    ```
    Follow the prompts in your terminal to play against the AI.

## How to Run in Eclipse
1.Create Project: In Eclipse, go to File > New > Java Project, name it TicTacToeGame, and click Finish.
2.Create Files: For each of your 5 classes (TicTacToe, Player, HumanPlayer, AIPlayer, LaunchGame):
3.Right-click src folder > New > Class.
4.Enter the class Name (e.g., TicTacToe).
5.Click Finish.
6.Paste Code: Open each new .java file and paste its corresponding class code into it (e.g., TicTacToe class code into TicTacToe.java).
7.Run: Right-click on LaunchGame.java in the "Package Explorer" or in its editor window, then choose Run As > Java Application.
8.Play: Interact with the game in the "Console" view at the bottom of Eclipse.

## Project Files

*   `TicTacToe.java`: Defines the game board, initialization, display, placing marks, and checking win/draw conditions.
*   `Player.java`: An abstract class providing a blueprint for game players, including name, mark, and a method for making moves.
*   `HumanPlayer.java`: Extends `Player` for human-controlled input via `Scanner`.
*   `AIPlayer.java`: Extends `Player` for an AI that makes random, valid moves.
*   `LaunchGame.java`: The main class to start and manage the game flow.

## Technologies Used

*   Java

## Contributing

Feel free to fork this repository, suggest improvements (e.g., a smarter AI, more game modes), and submit pull requests.

## License

This project is open-source and available under the [MIT License](LICENSE).
