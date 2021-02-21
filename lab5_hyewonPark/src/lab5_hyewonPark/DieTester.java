package lab5_hyewonPark;

public class DieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dices = new Die(6);
		
		
		/*
		 * At first, throw the die and see the faceValue and sides using the toString method
		 */
		System.out.println("DieTestrunning . . .");
		dices.throwDie();
		System.out.println("Test 1: Test Constructor using toString");
		dices.toString();
		
		
		//Test 2
		System.out.println("Test 2: Test getFaceValue");
		System.out.println("Inspecting die face ...");
		System.out.println("Face value = " + dices.getFaceValue());
	
		
		//Test 3
		System.out.println("Test 3: Test throwDie");
		System.out.println("Die is being thrown ...");
		
		System.out.print("Face values generated ");
		for(int i = 0;i<36;i++) {
			dices.throwDie();
			System.out.print(dices.getFaceValue() + ", ");
			
		}
		
		System.out.println("...\n\nTest finished");
		
		
		
		
	}

}
