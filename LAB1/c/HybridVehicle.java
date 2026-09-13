public class HybridVehicle implements Gasoline, Electric
{
      
    private double gasMiles;
    private double gasGallons;
    private double gasPrice;
    private double electricMiles;
    private double electrickWh;
    private double electricPrice;

    //gasoline interface goes first (og)
    public void setMilesfromGas(double miles) 
    {
        this.gasMiles = miles;
    }

    public void setGallonsfromGas(double gallons)
    {
        this.gasGallons = gallons;
    }

    public void setGasPrice(double price)
    {
        this.gasPrice = price;
    }

    public double calcGasMPG()
    {
        return(this.gasMiles / this.gasGallons);
    }

    public double getGasPrice()
    {
        return(this.gasPrice);
    }

    //electric time
    public void setElectricMiles(double totalElectricMiles)
    {
        this.electricMiles = totalElectricMiles;
    }
    
    public void setTotalkWh(double totalkWh)
    {
        this.electrickWh = totalkWh;
    }
    
    public void setElectricPrice(double ePrice)
    {
        this.electricPrice = ePrice;
    }

    public double getElectricPrice()
    {
        return(this.electricPrice);
    }

    public double calcMPGe()
    {
        return(this.electricMiles / this.electrickWh) * 33.7;
    }

    //hybrid

    public double calcHybridavg()
    {
        return(calcGasMPG() + calcMPGe()) / 2.0;
    }




    
}
