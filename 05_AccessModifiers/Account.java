public class Account {
    private String name;
    private String cardNum;
    private long credit;

    public Account(String _name, String _cardNum, long _credit) {
        this.name = _name; 
        this.cardNum = _cardNum; 
        this.credit = _credit; 
    }

    public static void testAccess() {
        Account account = new Account("Vova", "123456789", 10L);
        System.out.println("Account ownre name is " + account.name);

    }

}