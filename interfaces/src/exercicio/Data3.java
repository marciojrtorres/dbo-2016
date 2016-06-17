package exercicio;

public class Data3 extends Data {

	@Override
	public String get() {
		return getDia() + "/jun/" + getAno();
	}
}
