public class CarRunner 
{
    public static void main(String[] args)
    {
        HybridVehicle myCar = new HybridVehicle();

        myCar.setGasPrice(3.50);
        myCar.setElectricPrice(0.24);

        myCar.setMilesfromGas(150.0);
        myCar.setGallonsfromGas(7.0);


        myCar.setElectricMiles(400.0);
        myCar.setTotalkWh(70.0);

        double gasMPG = myCar.calcGasMPG();
        double MPGe = myCar.calcMPGe();
        double hybridAverg = myCar.calcHybridavg();

        System.out.println(gasMPG);
        System.out.println(MPGe);
        System.out.println(hybridAverg);






    }
    


}
