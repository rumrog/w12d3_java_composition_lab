package components;

public class VehicleEngine {

   private int fuelEfficiency;
   private int horsePower;
   private int mileage;

   public VehicleEngine(int fuelEfficiency, int horsePower, int mileage){
      this.fuelEfficiency = fuelEfficiency;
      this.horsePower = horsePower;
      this.mileage = mileage;
   }

   public int getFuelEfficiency() {
      return this.fuelEfficiency;
   }

   public int getHorsePower() {
      return this.horsePower;
   }

   public int getMileage() {
      return this.mileage;
   }

}
