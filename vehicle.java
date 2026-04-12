class vehicle{
    public void run(){
        System.out.println("vehicle can run");
    }
}
class car extends vehicle {
    public void fuel(){
        System.out.println("car uses fuel");
    }
}
class electriccar extends car {
    public void battery (){
        System.out.println("electric car use a battery");
    }
}
public static void main(String[] args ){
    electriccar e = new electriccar();
    e.run();
    e.fuel();
    e.battery();
}