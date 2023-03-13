package amazon;

public class AmazonLogic {
public void payment()
{
	System.out.println("Cash on Delivery done\n");
}

public void payment(long cardno,int cvv)
{
	System.out.println("card payment done\n");
}
public void payment(String upi,String pass)
{
	System.out.println("Payment done via upi\n");
	}

public void payment(String email,String pass2)
{
	System.out.println("Payment done via internet banking\n");
	}
}
