public class Account {
    private String name;
    private String phone;
    private int credit;

    public Account(String _name) {
        this.name = _name;
    }

    public String getInfo() {
        return name + " " + (phone != null ? phone : "no phone") + " " + (credit != 0 ? credit : "no credit");
    }

    public class AccountBuilder {

        public AccountBuilder withPhone(String _phone) {
            Account.this.phone = _phone;
            return this;
        }

        public AccountBuilder withCredit(int _credit) {
            Account.this.credit = _credit;
            return this;
        }

        public Account build() {
            return Account.this;
        }

    }
}