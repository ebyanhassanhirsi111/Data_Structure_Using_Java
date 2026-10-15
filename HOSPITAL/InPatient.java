package HOSPITAL;

public class InPatient  extends Patients {

        double roomCharge;
        int numberOfDays;
        // Constructor
        InPatient(String name, double Fee,
                  double roomCharge, int numberOfDays) {
            super(name, Fee);
            this.roomCharge = roomCharge;
            this.numberOfDays = numberOfDays;
        }
    double CalculateBill() {
        return (numberOfDays * roomCharge) + Fee;
    }
}
