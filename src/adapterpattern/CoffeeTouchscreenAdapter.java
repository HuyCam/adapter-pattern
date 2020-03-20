package adapterpattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	OldCoffeeMachine oldMachine;
	
	CoffeeTouchscreenAdapter() {
		oldMachine = new OldCoffeeMachine();
	}

	@Override
	public void chooseFirstSelection() {
		oldMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldMachine.selectB();
	}
	
	
}
