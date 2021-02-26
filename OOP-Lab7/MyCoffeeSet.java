import java.util.*;

public class MyCoffeeSet implements Set<Coffee>{
	private static final int INIT_SIZE = 15;
	private static final float INCREASE_SIZE = 0.3f;
	private Coffee[] element;
	private Coffee[] empty;
	private int size;
	private int size_zero;
	private Coffee[] arrs;
	MyCoffeeSet(){
		element = new Coffee[INIT_SIZE];
		size = 0;
	}
	MyCoffeeSet(Coffee coffee){
		this();
		add(coffee);
	}
	MyCoffeeSet(Collection<Coffee> collection) {
		this();
		int i=0;
		Coffee [] ambuf = new Coffee[(int)(element.length * (1 + INCREASE_SIZE))];
		for (Coffee coffee : collection) {
			ambuf[i]= coffee;
			i++;
		}
		size = i;
		element = ambuf;
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public boolean contains(Object o) {
		for (Coffee anElement : element) {
			if (anElement != null) {
				if (anElement.equals(o)) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public Iterator<Coffee> iterator() {
		return new Iterator<Coffee>() {
			private int currentIndex = 0;
			@Override
			public boolean hasNext() {
				return currentIndex < size;
			}
			@Override
			public Coffee next() {
				return element[currentIndex++];
			}
		};
	}
	@Override
	public Coffee[] toArray() {
		int pointer = 0;
		for (Coffee anElement : element) {
			if (anElement != null) {
				pointer++;
			}
		}
		Coffee[] array = new Coffee[pointer];
		System.arraycopy(element, 0, array, 0, array.length);
		return array;


	}
	@Override
	public <T> T[] toArray(T[] array) {
		return array;
	}
	@Override
	public boolean add(Coffee coffee) {
		for (Coffee anElement : element) {
			if (anElement != null) {
				if (anElement.equals(coffee) &&
						anElement.getCon().equals(coffee.getCon())) {
					return false;
				}
			}
		}
		if(size == element.length){
			System.out.println("Collection length before resizing:" + " " + element.length);
			resize();
			element[size] = coffee;
			System.out.println("Collection length after resizing:" + " " + element.length + "\n");
		}
		else
			element[size] = coffee;
		size++;
		return true;
	}
	private void resize(){
		int new_size = (int)(element.length * (1 + INCREASE_SIZE));
		Coffee[] new_element = new Coffee[new_size];
		System.arraycopy(element, 0, new_element, 0, element.length);
		element = new_element;
	}
	@Override
	public boolean remove(Object o) {
		int i=0;
		if (contains(o)){
			Coffee [] am = new Coffee[(int)(element.length * (1 + INCREASE_SIZE))];
			for (Coffee coffee : this) {
				if (!coffee.equals(o)) {
					am[i] = coffee;
					i++;
				}
			}
			element= am;
			size--;
			return true;
		}
		else return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		int cou = 0;
		Object[] col = c.toArray();
		if (col.length == 0){
			return false;
		}
		for (Coffee anElement : element) {
			for (Object aCol : col) {
				if (anElement != null) {
					if (anElement.equals(aCol)) {
						cou++;
					}
				}
			}
		}
		return cou == col.length;
	}
	@Override
	public boolean addAll(Collection<? extends Coffee> c) {
		int p = 0;
		int cont = 0;
		Object[] ar = c.toArray();
		for (Object anAr : ar) {
			p = 0;
			for (int j = 0; j < element.length; j++) {
				p++;
				if (element[j] != null) {
					if (element[j].equals(anAr)) {
						cont++;
						break;
					} else {
						if (p == element.length) {
							if (size == element.length) {
								resize();
								element[size] = (Coffee) anAr;
								size++;
								break;
							} else {
								element[size] = (Coffee) anAr;
								size++;
								break;
							}
						}
					}
				} else {
					if (size == element.length) {
						resize();
						element[size] = (Coffee) anAr;
						System.out.print("");
						size++;
						break;
					} else {
						element[size] = (Coffee) anAr;
						size++;
						break;
					}
				}
			}
		}
		return cont != ar.length;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		Object[] arry = c.toArray();
		int p = 0;
		int pon = 0;
		for (Object anArry : arry) {
			if (contains(anArry)) {
				pon++;
			}
		}
		Coffee[] newCoffee = new Coffee[element.length];
		for (Object anArry : arry) {
			if (contains(anArry)) {
				newCoffee[p] = (Coffee) anArry;
				p++;
			}
		}
		if (newCoffee[0] != null) {
			element = newCoffee;
			return true;
		}
		else
			return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		Object [] ray = c.toArray();
		for (Object aRay : ray) {
			for (Coffee anElement : element) {
				if (anElement != null) {
					if (anElement.equals(aRay)) {
						remove(aRay);
					}
				}
			}
		}
		return true;
	}
	@Override
	public void clear() {
		int new_size1 = (int)(element.length * (1 + INCREASE_SIZE));
		element = new Coffee[new_size1];
		size = 0;
		System.out.println("The collection is empty!");
	} }