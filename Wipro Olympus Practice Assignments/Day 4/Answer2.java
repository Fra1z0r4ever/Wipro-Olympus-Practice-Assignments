public class Answer2 {

    public static void main(String[] args) {

        //write your answer here
         Vehicle v = new Vehicle();
        v.noOfWheels();
        System.out.println();

        Scooter s = new Scooter();
        s.noOfWheels();
        System.out.println();

        Car c = new Car();
        c.noOfWheels();
    }
    
}
class Vehicle{
    void noOfWheels(){
        System.out.print("No of wheels undefined");
    }
    

}
class Scooter extends Vehicle{
   void noOfWheels(){
        System.out.print("No of wheels 2");
    }
}

class Car extends Vehicle{
    void noOfWheels(){
        System.out.print("No of wheels 4");
    }  


}