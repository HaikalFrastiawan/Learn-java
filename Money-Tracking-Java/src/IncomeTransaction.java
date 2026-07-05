
public class IncomeTransaction extends Transaction {

    String source;

    public void printIncomeInfo() {
        System.out.println("[INCOME] Rp " + amount + " | Ket: " + description + " | Sumber: " + source);
    }
}
