package HOSPITAL;

class Outpatient extends patient {
    double labCharge;

    // Constructor
    Outpatient(String name, double Fee, double labCharge) {
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
        System.out.println("Name: " + name);
        System.out.println("Fee: " + Fee);
        System.out.println("Lab Charge: " + labCharge);
        System.out.println("Total Bill: " + CalculateBill());
    }
}
