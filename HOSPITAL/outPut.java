package HOSPITAL;

public class outPut {
    public static void main(String[] args) {
        
         OutPatient p1 = new OutPatient("Ebyan", 20, 15,35);
         p1.Display();

        System.out.println();

        InPatient p2 = new InPatient("Mohamed", 20, 30, 4);
        p2.Display();
    }
}
