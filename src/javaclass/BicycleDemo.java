package javaclass;
//inheritance 
class BicycleDemo extends Bicycle{
	
	public void speedDouble(int increment) {
         speed = speed * increment;   
    }
	
	 public static void main(String[] args) {
	    	
	    	BicycleDemo bike1 = new BicycleDemo();
	    	bike1.printStates();
	    	bike1.speedDouble(5);
	    	bike1.printStates();
	      
	    }
	 
	 //speed up
	// speedup >> 
	
	
	
}

