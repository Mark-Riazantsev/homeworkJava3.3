public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Первый кредит ");
        int creditАmount = 1_000_000;
        System.out.println("Сумма кредита " + creditАmount + " руб");
        double interestRate = 0.008325;
        System.out.println("Процентная ставка, в мясяц " + interestRate);
        int creditPeriod = 12;
        System.out.println("Срок кредита " + creditPeriod + " месяцев");

        int annuityPayment = (int) service.calculate(creditАmount, interestRate, creditPeriod);
        System.out.println("Аннуитетный платёж: " + annuityPayment);

        System.out.println();
        System.out.println("Второй кредит ");
        creditАmount = 1_000_000;
        System.out.println("Сумма кредита " + creditАmount + " руб");
        interestRate = 0.008325;
        System.out.println("Процентная ставка, в мясяц " + interestRate);
        creditPeriod = 24;
        System.out.println("Срок кредита " + creditPeriod + " месяцев");

        annuityPayment = (int) service.calculate(creditАmount, interestRate, creditPeriod);
        System.out.println("Аннуитетный платёж: " + annuityPayment);

        System.out.println();
        System.out.println("Третий кредит ");
        creditАmount = 1_000_000;
        System.out.println("Сумма кредита " + creditАmount + " руб");
        interestRate = 0.008325;
        System.out.println("Процентная ставка, в мясяц " + interestRate);
        creditPeriod = 36;
        System.out.println("Срок кредита " + creditPeriod + " месяцев");

        annuityPayment = (int) service.calculate(creditАmount, interestRate, creditPeriod);
        System.out.println("Аннуитетный платёж: " + annuityPayment);
    }
}