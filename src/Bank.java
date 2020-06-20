import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branchesList;

    public Bank(String name) {
        this.name = name;
        this.branchesList = new ArrayList<Branch>();
    }

    public boolean addBranch (String branchName){
        if (validateBranch(branchName) == null){
            this.branchesList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initialTransactionAmount){
        Branch branch = validateBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialTransactionAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double newTransactionAmount){
        Branch branch = validateBranch(branchName);
        if (branch != null){
            return branch.addTransactions(customerName, newTransactionAmount);
        }
        return false;
    }

    private Branch validateBranch (String branchName){
        for (int i = 0; i< this.branchesList.size(); i++) {
            Branch checkedBranch = this.branchesList.get(i);
            if (checkedBranch.getName().equals(branchName)){
                return branchesList.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers (String branchName, boolean showTransactions){
        Branch branch = validateBranch(branchName);
        if (branch != null){
            System.out.println("Customers details for branch " + branchName);
            ArrayList<Customer> customersList = branch.getCustomersArrayList();
            for (int i = 0; i < customersList.size();i++){
                Customer branchCustomer = customersList.get(i);
                System.out.println((i + 1) + ". " + branchCustomer.getName() + ".");

                if (showTransactions){
                    System.out.print("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j ++){
                        System.out.println(transactions.get(j));
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }

    }


    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchesList() {
        return branchesList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
