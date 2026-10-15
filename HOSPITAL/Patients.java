package HOSPITAL;

public class Patients {
      String name;
    double Fee;

    // Constructor
    Patients(String name, double consultFee) {
        this.name = name;
        this.Fee = consultFee;
    }

    // Display Method
    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Fee: " + Fee);
        System.out.println("Total Bill: " + Fee);
    }
}
