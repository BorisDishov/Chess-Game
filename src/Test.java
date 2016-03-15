import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Board b = new Board();
		b.printBoard();
		Scanner input = new Scanner(System.in);
		int[] moves = new int[4];
		
		System.out.println("Please enter your moves in the following order: (old x, old y, new x, new y), as the old x and y");
		System.out.println("being the position of the piece you want to move, followed by the position on which you want to move it!");
		System.out.println("Important note : The checkmate method is not working correctly!");
		while(Board.isGameGoing()){
			System.out.print("Enter your move: ");
			try{
				moves[0] = input.nextInt();
				moves[1] = input.nextInt();
				moves[2] = input.nextInt();
				moves[3] = input.nextInt();
				b.play(moves[0], moves[1], moves[2], moves[3]);
			} catch(Exception e){
				System.out.println("Wrong input, try again!");
			}
		}
		
		
		//These were just for testing purposes
		
//		b.play(6, 5, 4, 5);
//		b.play(1, 4, 3, 4);
//		b.play(6, 6, 4, 6);
//		b.play(0, 3, 4, 7);
//		b.play(4, 5, 3, 4);
		
//		b.play(6, 6, 5, 6);
//		b.play(0, 1, 2, 2);
//		b.play(7, 5, 6, 6);
//		b.play(1, 4, 2, 4);
//		b.play(6, 6, 2, 2);
//		b.play(1, 3, 2, 2);
//		b.play(6, 4, 4, 4);
//		b.play(0, 4, 1, 4);
//		b.play(7, 1, 5, 0);
//		b.play(1, 4, 2, 5);
//		b.play(7, 3, 5, 5);
//		b.play(2, 5, 2, 6);
//		b.play(6, 3, 5, 3);
//		b.play(2, 6, 2, 7);
//		b.play(2, 4, 3, 4);
//		b.play(5, 0, 3, 1);
//		b.play(2, 2, 3, 1);
//		b.play(0, 2, 2, 4);
//		b.play(6, 0, 4, 0);
//		b.play(2, 4, 4, 2);
//		b.play(5, 5, 3, 5);
//		b.play(2, 6, 3, 5);
//		b.play(3, 1, 4, 3);
//		b.play(0, 1, 0, 0);
//		b.play(4, 3, 2, 4);
		
		
		
	}

}
