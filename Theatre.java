class Theatre
{
   public static void main(String[]args)
{
  Theatre raja = new Theatre();
   int balance_amount = raja.bookticket(200);
} 
int bookticket (int ticket)
{
int ticket_price = 120;
int balance = ticket - ticket_price;
System.out.println("After booking ticket " + balance);
return balance;
}
}


 
