package usjt_ccp3bnmcb_observer_animais;

public interface Subject {
	
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();

}
