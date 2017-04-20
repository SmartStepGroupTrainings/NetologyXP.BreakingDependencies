package wrap;

import java.util.List;

public class Employee {
    private final int hourlyPayRateUsd;

    public Employee() {
        this.hourlyPayRateUsd = 35;
    }

    public void pay(List<TimeEntry> timeEntries, PaymentService paymentService) {
        Money totalAmount = new Money();

        for (int i = 0; i < timeEntries.size(); i++) {
            TimeEntry timeEntry = timeEntries.get(i);
            totalAmount.add(timeEntry.getHours() * this.hourlyPayRateUsd);
        }

        paymentService.pay(this, totalAmount);
    }


//    public void pay(List<TimeEntry> timeEntries, PaymentService paymentService) {
//        this.logPayment();
//
//        this.doPay(timeEntries, paymentService);
//
//        //
//    }
}
