package usjt_ccp3bnmcb_observer_animais;

public abstract class Animal implements Observer {
	
	
	public abstract void agir (int n);
	@Override
	public void update(int n) {
		agir(n);
		
	}
}
