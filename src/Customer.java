import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactionAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialTransactionAmount);
    }

    public void addTransactions (double transactionsAmount){
        this.transactions.add(transactionsAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
