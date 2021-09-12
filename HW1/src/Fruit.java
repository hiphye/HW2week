import java.util.Comparator;

public class Fruit {
	
	int n;
	String name;
	int price;
	public Fruit(int i, String string, int j) {
	 n= i;
	 name =string;
	 price = j;
	}
	@Override
	public String toString() {
		return "Student [no=" + n + ", name=" + name + ", price=" + price + "]";
	}
}

class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
	
}

