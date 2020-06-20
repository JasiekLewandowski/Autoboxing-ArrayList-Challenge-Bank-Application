import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customersArrayList;

    public Branch(String name) {
        this.name = name;
        this.customersArrayList = new ArrayList<Customer>();
    }


    public boolean addCustomer (String customerName, double initialTransactionsAmount){
        if (validateCustomer(customerName) == null) {
            this.customersArrayList.add(new Customer(customerName, initialTransactionsAmount));
            return true;
        }
        return false;
    }

    public boolean addTransactions (String customerName, double newTransactionsAmount){
        Customer existingCustomerAdress = validateCustomer(customerName);
        if (validateCustomer(customerName) != null){
            existingCustomerAdress.addTransactions(newTransactionsAmount);
            return true;
        }
        return false;
    }

    private Customer validateCustomer (String customerName){
        for (int i = 0; i < this.customersArrayList.size(); i ++){
            Customer checkedCustomer = customersArrayList.get(i);
            if (checkedCustomer.getName().equals(customerName)){
               return customersArrayList.get(i);
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomersArrayList() {
        return customersArrayList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
