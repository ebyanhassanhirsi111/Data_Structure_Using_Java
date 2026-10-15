package HOSPITAL;

public class outPut {
        public static void main(String[] args) {

            OutPatient p1 = new OutPatient("ebyan", 20, 15);

            System.out.println("Outpatient Details");
            System.out.println("=========================================================");
            System.out.println("Name: " + p1.name);
            System.out.println("Fee: " + p1.Fee);
            System.out.println("Lab Charge: " + p1.labCharge);
            System.out.println("Total Bill: " + p1.CalculateBill());

            System.out.println();

            InPatient p2 = new InPatient("mohamed", 20, 30, 4);

            System.out.println("Inpatient Details");
            System.out.println("=========================================================");
            System.out.println("Name: " + p2.name);
            System.out.println("Consult Fee: " + p2.Fee);
            System.out.println("Room Charge: " + p2.roomCharge);
            System.out.println("Number of Days: " + p2.numberOfDays);
            System.out.println("Total Bill: " + p2.CalculateBill());
        }
}
