package amazon;

public class AmazonLogic {
public void payment()
{
	System.out.println("Cash on Delivery done\n");
}

public void payment(long cardno,int cvv)
{
	System.out.println("card payment\n");
}
public void payment(String upi,String pass)
{
	System.out.println("Payment done via upi\n");}
}
