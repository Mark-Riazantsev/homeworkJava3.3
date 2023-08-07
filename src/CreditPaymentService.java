public class CreditPaymentService {
    public double calculate(int creditАmount, double interestRate, int creditPeriod) {
        double annuityPayment = (creditАmount * interestRate * Math.pow((1+interestRate), creditPeriod)) / (Math.pow((1+interestRate), creditPeriod) - 1);

        return annuityPayment;
    }
}