public class CreditPaymentService {
    public double calculate(int creditАmount, int monthlyPayment, double interestRate, int creditPeriod) {
        double annuityPayment = creditАmount * interestRate * Math.pow ((1 + interestRate), 12)/ Math.pow ((1 + interestRate), 12) - 1;

        return annuityPayment;
    }
}