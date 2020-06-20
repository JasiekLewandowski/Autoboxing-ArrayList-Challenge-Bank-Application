public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("PaKeO");
        bank.addBranch("Epple");
        bank.addCustomer("Epple", "Kowalski", 10);
        bank.addCustomer("Epple", "Geralt", 100.10);
        bank.addCustomer("Epple", "Yennefer", 200.20);

        bank.addBranch("Semsung");
        bank.addCustomer("Semsung", "Jaskier", 400.40);
        bank.addCustomer("Semsung", "Zoltan", 19.90);

        bank.addCustomerTransaction("Epple", "Geralt", 120.11);
        bank.listCustomers("Epple", true);

    }
}
