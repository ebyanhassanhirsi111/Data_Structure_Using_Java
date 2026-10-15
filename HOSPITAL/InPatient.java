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
    // Display Method
    @Override
    void Display() {
        System.out.println("Inpatient Details");
        System.out.println("================================");
        System.out.println("Name: " + name);
        System.out.println("Fee: " + Fee);
        System.out.println("Room Charge: " + roomCharge);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: " + CalculateBill());
    }
}
