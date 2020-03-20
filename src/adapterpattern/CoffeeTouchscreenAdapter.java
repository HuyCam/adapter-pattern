package adapterpattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
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
