import java.util.*;
public class Gussing_Game {

	public static void main(String[] args) {
		Random r = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To The Number Gussing Game");
		
		int bound = 100;
		int ranNum =r.nextInt(bound);
		int i;
		
		for(i=0;i<3;i++){
			System.out.println("Enter Your Guss :");
			int ip = sc.nextInt();
			
			if(ip>ranNum){
				System.out.println("Your Guss is High!");
			}
			else if(ip<ranNum){
				System.out.println("Your Guss is Low!");
			}
			else{
				
				System.out.println("Your Guss is Correct!");
				i=2;
			}
			if(i==2)
				System.out.println("Ran Out of Attempt! The Correct Number is :"+ranNum);
		}
		sc.close();
	}

}
