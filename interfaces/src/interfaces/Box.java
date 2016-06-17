package interfaces;

public class Box implements IBox {

	private Object obj;
	
	@Override
	public void put(Object o) {
		if (o != null && this.obj == null) {			
			this.obj = o;
		}
	}

	@Override
	public Object get() {
		Object temp = this.obj;
		this.obj = null;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return this.obj == null;
	}

}








