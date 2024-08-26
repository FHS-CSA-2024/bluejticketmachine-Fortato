package src.main.java;

public class myTicketMachine
{
    private int balance;
    private int price;
    private int total; 
    private int seniorOrChild;
    private boolean checkPrice;
    
    public myTicketMachine(int cost)
    {
        price = cost;
        total = 0;
        balance = 0;
        seniorOrChild = 0; //set to 1 for true and 0 for false
    }
        
    public void checkAge(int age)
    {
        if(age <= 13)
        {
            seniorOrChild = 1; //set to 1 for true and 0 for false
        }
        else if(age >= 65)
        {
            seniorOrChild = 1;
        }
        else
        {
            seniorOrChild = 0;
        }
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void insertMoney(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than " + amount);
        }
    }
    
    public void printTicket()
    {
        boolean checkPrice = (balance >= price);
        if (seniorOrChild == 1) //1 = true | 0 = false
        {
            if (balance >= price - 100)
            {
            System.out.println("#################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + (price - 100) + " cents");
            System.out.println("#################");
            System.out.println("");
            
            total = total + (price - 100);
            balance = balance - (price - 100);
            }
        }
        else if (checkPrice == true)
        { 
            System.out.println("#################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents");
            System.out.println("#################");
            System.out.println("");
            
            total = total + price;
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " + (price - balance) + " more cents.");
        }
    }
    
    public int emptyMachine()
    {
        int originalTotal = total;
        total = 0;
        return originalTotal;
    }
    
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
