
public class TestConexion {

	public static void main(String[] args) throws Exception{
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch (IllegalStateException ex){
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
		}
		
		/*
		Conexion con = null; //new Conexion();
		
		try {
			con = new Conexion();
			con.leerDatos();
			//con.cerrar();
		}catch (IllegalStateException e) {
			System.out.println("Recibiendo exception");
		
			e.printStackTrace();
			//con.cerrar();
		}finally {
			System.out.println("Ejecutando finally");
			if(con != null) {
				con.cerrar();
			}
			
		}*/
		
	}
	
}
