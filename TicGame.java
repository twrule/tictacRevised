import java.util.Scanner;
import java.lang.Thread;

public class TicGame{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException{
		Player playerOne = new Player();
		boolean playOn = true, gameOver = false;
		String oneOrTwo;
		int nextMove;
		String[] currBoard = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

		println("Welcome to Tic-Tac-Toe!");
		String getName = playerStart(1);
		playerOne.setName(getName);
		
		while(playOn){
			int random = (int)(Math.random() * 50 + 1);

			oneOrTwo = checkPlayer(playerOne.getName());

			while(!gameOver){
				if(oneOrTwo.equals("n")){
					gameOver = twoPlayerGame(playerOne, random, currBoard);
				} else{
					Computer comp = new Computer();
				}
			}


			playOn = playAgain();
		}
	}

	public static boolean twoPlayerGame(Player playerOne, int random, String[] currBoard) throws InterruptedException{
		Player playerTwo = new Player();
		String getName = playerStart(2);
		playerTwo.setName(getName);
		boolean gameOver = false;
		int nextMove;

		print("Picking who goes first");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(600);
		println("\n");

		if(random > 25){
			println(playerOne.getName() + " goes First.");
		} else{
			println(playerTwo.getName() + " goes First.");
		}

		println("Let us start the game!");
		println("Here is the board and each position's corresponding number.");
		printBoard(currBoard);
		Thread.sleep(1400);
		currBoard = clearBoard(currBoard);

		while(!gameOver){
			if(random > 25){
				nextMove = playerOne.getMove(currBoard);
				currBoard = setMove(currBoard, nextMove, 1);
				gameOver = playerOne.checkForWinner(currBoard);
				random -= 25;
				printBoard(currBoard);
			}else{
				nextMove = playerTwo.getMove(currBoard);
				currBoard = setMove(currBoard, nextMove, 2);
				gameOver = playerTwo.checkForWinner(currBoard);
				random += 25;
				printBoard(currBoard);
			}
		}

		return gameOver;
	}

	// int x will be 1 or 2 depending on which player it is called for
	public static String playerStart(int x){
		if(x != 1)
			println("Welcome Player Two");

		print("What is your name? ");
		String name = sc.next();
		println("Welcome " + name + "!");
		return name;
	}

	public static String checkPlayer(String playerOneName){
		print(playerOneName + ", will you be playing alone this round [y or n]: ");
		String yOrN = sc.next();
		while(!(yOrN.equalsIgnoreCase("y") || yOrN.equalsIgnoreCase("n"))){
			println("Answer Not Permitted");
			print("Please enter [y] if you are playing alone or [n] if you have a partner: ");
			yOrN = sc.next();
		}
		return yOrN.toLowerCase();
	}

	public static boolean playAgain(){
		println("Game Over");
		print("Would you like to play again [y or n]: ");
		String yOrN = sc.next();
		while(!(yOrN.equalsIgnoreCase("y") || yOrN.equalsIgnoreCase("n"))){
			println("Answer Not Permitted");
			print("Please enter [y] to play again or [n] to exit: ");
			yOrN = sc.next();
		}

		return(yOrN.toLowerCase().equals("y"));
	}

	public static String[] clearBoard(String[] board){
		for(int i = 0; i < 9; i++){
			board[i] = " ";
		}
		return board;
	}

	public static void printBoard(String[] currBoard){
		println("");
		println(currBoard[0] + " | " + currBoard[1] + " | " + currBoard[2]);
		println("--+---+--");
		println(currBoard[3] + " | " + currBoard[4] + " | " + currBoard[5]);
		println("--+---+--");
		println(currBoard[6] + " | " + currBoard[7] + " | " + currBoard[8]);
		println("");
		println("+++++++++");
		println("*********");
		println("+++++++++");
		println("");
	}

	public static String[] setMove(String[] board, int move, int player){
		if(player == 1)
			board[move - 1] = "X";
		else
			board[move - 1] = "O";

		return board;
	}


	public static void println(String args){
		System.out.println(args);
	}
	public static void print(String args){
		System.out.print(args);
	}
}