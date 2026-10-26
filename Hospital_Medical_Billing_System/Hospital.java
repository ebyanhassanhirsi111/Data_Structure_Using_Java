package Hospital_Medical_Billing_System;

public class Hospital {
    static void main() {
        MedicalServices[] Medical={
                new consultation(001,"Maxamed","consultation",1000,7),
                new LaboratoryTest(002,"kowther","Laboratory",25,50),
                new UltraSound(003,"Ebyan","UltraSound",90,10)
        };
        for(MedicalServices M: Medical){
            M.display();
            System.out.println();
        }
    }

}
abstract class MedicalServices{
    int ServiceID;
    String ServiceName;
    private final String serviceType;
    double baseCost;

    MedicalServices(int ServiceID, String ServiceName,String serviceType ,double baseCost){
        this.ServiceID=ServiceID;
        this.ServiceName=ServiceName;
        this.serviceType=serviceType;
        this.baseCost=baseCost;

    }

    public String getServiceType() {
        return serviceType;
    }

    void display(){
        System.out.println("service ID: "+ ServiceID);
        System.out.println("service name: "+ ServiceName);
        System.out.println("service: "+ getServiceType());
        System.out.println("Total Cost: "+ CalculateTotalCost());
    }
    abstract double CalculateTotalCost();
}
class consultation extends MedicalServices{
    double doctorFee;
    consultation(int ServiceID, String ServiceName,String serviceType ,double baseCost,
                 double doctorFee){
        super(ServiceID,ServiceName,serviceType,baseCost);
        this.doctorFee=doctorFee;
    }

    @Override
    double CalculateTotalCost() {
        return baseCost + doctorFee;
    }
}
class LaboratoryTest extends MedicalServices{
    double Test_charge;

    LaboratoryTest(int ServiceID, String ServiceName,String serviceType ,double baseCost,
                   double Test_charge){
        super(ServiceID,ServiceName,serviceType,baseCost);
        this.Test_charge=Test_charge;
    }

    @Override
    double CalculateTotalCost() {
        return baseCost + Test_charge;
    }
}
class UltraSound extends MedicalServices{
    double additional;
    UltraSound(int ServiceID, String ServiceName,String serviceType,double baseCost,
               double additional){
        super(ServiceID,ServiceName,serviceType,baseCost);
        this.additional=additional;
    }

    @Override
    double CalculateTotalCost() {
        return baseCost + additional;
    }
}