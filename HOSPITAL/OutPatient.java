package HOSPITAL;

public class OutPatient extends Patients {
    double labCharge;

    // Constructor
    OutPatient(String name, double Fee, double labCharge) {
        super(name,Fee);
        this.labCharge = labCharge;
    }

    double CalculateBill() {
        return labCharge + Fee;
    }
}
