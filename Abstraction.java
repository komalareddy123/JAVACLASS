package javaclass2;


abstract class Flowers{ //Parent
	abstract void smell(); //Abstract method
	
}

class Rose extends Flowers{
	@Override
	void smell() {  //normal method
		System.out.println("ROSE SMELL");
		
	}
	
}

class Sunflower extends Flowers{
	@Override
	void smell() {  //normal method
		System.out.println("SUNFLOWER SMELL");
		
	}
	
}

public class Abstraction {  //showing functionality and hiding internal (2 possible ways);this method dosen't have any body
	
	public static void main(String[]  args) {
		Rose r = new Rose();
		r.smell();
		Sunflower s = new Sunflower();
		s.smell();
		
	}

}
