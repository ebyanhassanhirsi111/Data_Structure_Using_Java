package HOSPITAL;

class Output {
    static void main() {
        Outpatient p1 = new Outpatient("Ebyan", 20, 15);
        p1.Display();

        System.out.println();

        Inpatient p2 = new Inpatient("mohamed", 20, 30, 4);
        p2.Display();
    }
}
