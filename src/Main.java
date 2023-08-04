public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditАmount = 1_000_000;
        int monthlyPayment = 1_000_000;
        int interestRate = 1_000_000;
        int creditPeriod = 1_000_000;

        int annuityPayment = service.calculate(creditАmount, monthlyPayment, interestRate, creditPeriod);
        System.out.println(annuityPayment);
    }
}