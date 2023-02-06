
public class TestCuentaExceptionChecked {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.depositar(200);
		}catch (MiException e) {
			e.printStackTrace();
		}
	}
}
