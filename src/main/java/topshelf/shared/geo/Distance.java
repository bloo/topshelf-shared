package topshelf.shared.geo;


public class Distance<E> {

	public static enum Unit {
		m, km;
	}
	
	private E result;
	private Double distance;
	private Distance.Unit unit;
	
	public Distance(E result, Double distance, Distance.Unit unit) {
		this.result = result;
		this.distance = distance;
		this.unit = unit;
	}

	public E getResult() {
		return result;
	}
	
	public Double getDistance() {
		return distance;
	}
	
	public Distance.Unit getUnit() {
		return unit;
	}
}