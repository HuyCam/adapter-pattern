package adapterpattern;

public class Driver {
	public static void main(String args[]) {
		CoffeeTouchscreenAdapter machine = new CoffeeTouchscreenAdapter();
		
		machine.chooseFirstSelection();
		machine.chooseSecondSelection();
	}
}


interface CoffeeMachineInterface {
	String chooseFirstSelection();
	String chooseSecondSelection();
}



class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	OldCoffeeMachine oldMachine;
	
	CoffeeTouchscreenAdapter() {
		oldMachine = new OldCoffeeMachine();
	}

	@Override
	public String chooseFirstSelection() {
		return oldMachine.selectA();
	}

	@Override
	public String chooseSecondSelection() {
		return oldMachine.selectB();
	}
	
	
}



class OldCoffeeMachine {
	public String selectA() {
		String inform = "A is selected";
		System.out.println(inform);
		return inform;
	}
	
	public String selectB() {
		String inform = "B is selected";
		System.out.println(inform);
		return inform;
	}
}
