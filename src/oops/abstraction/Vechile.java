package oops.abstraction;

public abstract class Vechile {
private String number;
private String model;
private String color;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public void strt()
{
	System.out.println("strting");
	
}
public void stop()
{
	System.out.println("stoping");
}
@Override
public String toString() {
	return "Vechile [number=" + number + ", model=" + model + ", color=" + color + "]";
}
}

