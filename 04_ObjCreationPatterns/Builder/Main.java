public class Main {
    public static void main(String[] args) {
        Account.AccountBuilder builder = new Account("Sergey").new AccountBuilder();

        Account account = builder.withPhone("555-0144").withCredit(1000).build();
        System.out.println(account.getInfo());
    }
}