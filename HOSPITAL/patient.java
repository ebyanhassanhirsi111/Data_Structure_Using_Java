package HOSPITAL;

public class patient {
    String name;
    double Fee;

    // Constructor
    patient(String name, double consultFee) {
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
