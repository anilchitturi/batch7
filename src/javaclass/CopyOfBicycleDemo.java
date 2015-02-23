package javaclass;

class CopyOfBicycleDemo extends Bicycle{
    public static void main(String[] args) {
    	
    	//inheritance 
    	//class object instance
    	//classname objname = new classname();
    	Bicycle bike1 = new Bicycle();
    	bike1.printStates();
    	bike1.applyBrakes(4);
    	bike1.changeGear(3);
    	bike1.changeCadence(20);
    	bike1.printStates();
    	
    	Bicycle bike2 = new Bicycle();
    	bike2.printStates();
    	bike1.printStates();
    	bike2.applyBrakes(1);
    	bike2.changeGear(30);
    	bike2.changeCadence(40);
    	bike2.printStates();
    	
      
      
    }
}

