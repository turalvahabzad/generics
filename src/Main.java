public class Main {
    public static void main(String[] args) {

        BMW bmw=new BMW();
        Mercedes mercedes=new Mercedes();
        MyCar<BMW> myCar=new MyCar<BMW>(bmw);

         myCar.getCar();

         MyCar<Mercedes> myCar2=new MyCar<Mercedes>(mercedes);
         myCar2.saveToFile();
         Mercedes car= myCar2.getCar();





    }
}