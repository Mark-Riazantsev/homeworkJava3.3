public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Первый кредит ");
        int creditАmount = 1_000_000;
        System.out.println("Сумма кредита " + creditАmount + " руб");
        int monthlyPayment = 87_911;
        System.out.println("Ежемесячный платеж " + creditАmount + " руб");
        double interestRate = 0.999;
        System.out.println("Процентная ставка " + creditАmount);
        int creditPeriod = 12;
        System.out.println("Срок кредита " + creditАmount + " месяцев");

        double annuityPayment = service.calculate(creditАmount, monthlyPayment, interestRate, creditPeriod);
        System.out.println(annuityPayment);
    }
}