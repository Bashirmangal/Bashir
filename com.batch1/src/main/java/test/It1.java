package test;

public interface It1 {
	
	interface Bicycle {

	    //  wheel revolutions per minute
	    void changeCadence(int newValue);

	    void changeGear(int newValue);

	    void speedUp(int increment);

	    void applyBrakes(int decrement);
	}
}
