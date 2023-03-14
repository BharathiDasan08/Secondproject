package amazon;
import java.util.Scanner;
public class MainofAmzon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	AmazonLogic am=new AmazonLogic();
	while(true)
	{		System.out.println("1.cash on delivery\n2.Card\n3.upi\n4.exit");
	     int choice=sc.nextInt();
		switch(choice)
		{
			
		     case 1 : am.payment();
		     break;
		     case 2 : System.out.println("Enter card no");
		     long cardno=sc.nextLong();
		     System.out.println("Enter cvv");
		     int cvv=sc.nextInt();
		     am.payment(cardno,cvv);
		     break;
		     
		     case 3 :
		     System.out.println("Enter upi id");
		     String upi=sc.next();
		     System.out.println("Enter pass");
		     String pass=sc.next();
		     am.payment(upi,pass);
		     break;
		     
		     case 4 : System.exit(0);
		     
		     default : System.out.println("Invali payment option");
				Sysytem.out.println(New Code Added);
		}
	}
	
}
}
