package laboratorio2;

public class Assento {
	private boolean ocupado;

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String toString() {
		String str = "";
		if (ocupado == true) {
			str = str + "*";
		} else {
			str = " ";
		}
		return str;
	}

}
