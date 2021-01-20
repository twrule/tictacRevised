public class Computer{
	public int compMove(String[] currBoard) throws InterruptedException{
		System.out.print("Thinking");

		int count = (int)(Math.random() * 5 + 1);
		
		for(int i = 0; i < count; i++){
			Thread.sleep(400);
			System.out.print(".");
		}
		
		Thread.sleep(600);


		int random = (int)(Math.random() * 9 + 1);

		while(true){
			if(currBoard[random-1].equals(" ")){
				break;
			} else{
				random = (int)(Math.random() * 9 + 1);
			}
		}
		return random;
	}

	public boolean checkForWinner(String[] currBoard){
		boolean gameOver = false;
		// Horizontal Winning Moves
		if(currBoard[0] == currBoard[1] && currBoard[1] == currBoard[2]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[3] == currBoard[4] && currBoard[4] == currBoard[5]){
			if(currBoard[3].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[3].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[6] == currBoard[7] && currBoard[7] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
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
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[1] == currBoard[4] && currBoard[4] == currBoard[7]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[2] == currBoard[5] && currBoard[5] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
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
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
			println("");
			println(""); 
		} else if(currBoard[2] == currBoard[4] && currBoard[4] == currBoard[6]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
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