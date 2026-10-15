package HOSPITAL;

public class OutPatient extends Patients {
      double labCharge;
    // Constructor
    OutPatient(String name, double Fee, double labCharge) {
        super(name, Fee);
        this.labCharge = labCharge;
    }

    double CalculateBill() {
        return labCharge + Fee;
    }

    // Display Method
    @Override
    void Display() {
        System.out.println("Outpatient Details");
         System.out.println("===================================");
        System.out.println("Name: " + name);
        System.out.println("Fee: " + Fee);
        System.out.println("Lab Charge: " + labCharge);
        System.out.println("Total Bill: " + CalculateBill());
    }
}
