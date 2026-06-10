package bank;
import java.util.Scanner;
public class CircketInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Team Id:");
		int TID=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Team Match:");
		String TName=sc.nextLine();
		
		System.out.println("Enter the player ID:");
		int PID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the player Name:");
		String PName=sc.nextLine();
		
		System.out.println("Enter Number of 	Fours:");
		int NOF=sc.nextInt();
		
		System.out.println("Enter Number of Sixes:");
		int NOS=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Match ID:");
		int MID=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Match Type:");
		String MType=sc.nextLine();
		
		Team team=new Team(TID,TName);
		Player player=new Player(PID,PName,NOF,NOS);
		Match match=new Match(MID,MType);
		
		System.out.println("----------CRICKET COUNCIL DETAILS----------");
		System.out.println("Team ID:"+TID);
		System.out.println("Team Name:"+TName);
		System.out.println("playerID:"+PID);
		System.out.println("player ID:"+PName);
		System.out.println("No.of.Fours:"+NOF);
		System.out.println("No.of.Sixes:"+NOS);
		System.out.println("Match ID:"+MID);
		System.out.println("Match Type:"+MType);
		
	}

}
