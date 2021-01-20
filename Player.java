import java.util.Scanner;

public class Player{
	public Scanner sc = new Scanner(System.in);
	private String name;

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getMove(String[] board){
		int move;
		System.out.print(name + " where would you like to move [1 - 9]: ");
		move = sc.nextInt();
		boolean askAgain = moveAllowed(move, board);
		while(askAgain){
			System.out.println("Move not allowed, try again " + name + ": ");
			move = sc.nextInt();
			askAgain = moveAllowed(move, board);
		}
		
		return move;
	}

	public boolean moveAllowed(int move, String[] board){
		if(move < 1 || move > 9)
			return true;
		else if(board[move - 1].equals("X") || board[move - 1].equals("O"))
			return true;
		return false;
	}

	public boolean checkForWinner(String[] currBoard){
		boolean gameOver = false;
		// Horizontal Winning Moves
		if(currBoard[0] == currBoard[1] && currBoard[1] == currBoard[2]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[3] == currBoard[4] && currBoard[4] == currBoard[5]){
			if(currBoard[3].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[3].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[6] == currBoard[7] && currBoard[7] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		}
		// Vertical Winning Moves
		else if(currBoard[0] == currBoard[3] && currBoard[3] == currBoard[6]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[1] == currBoard[4] && currBoard[4] == currBoard[7]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[2] == currBoard[5] && currBoard[5] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		}
		// Diagonal Winning Moves
		else if(currBoard[0] == currBoard[4] && currBoard[4] == currBoard[8]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[2] == currBoard[4] && currBoard[4] == currBoard[6]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations " + name + " you Won!!!");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		}
		return gameOver;
	}

	public static void println(String args){
		System.out.println(args);
	}
}