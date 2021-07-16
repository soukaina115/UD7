public class Activitat3 {
	
	private static final int Producto = 0;

	public static void mostrarLista(Collection lista) {
		
		System.out.println("Lista del mercado con " + lista.size() + " productos ");
		
	 
	}
}

  public static void main(String[] args) {
	  //Definer 5 productes
	  double = Producto;
	  
	     Producto pan = new Producto("Pan", 3);
	     Producto leche = new Producto("Lee", 2);
	     Producto carne = new Producto("Carne", 3);
	     Producto manzana = new Producto("Manzana", 5);
	     Producto tomate = new Producto("Tomate", 2);
	  
	 
	     TreeSet lista = new TreeSet();
	     lista.add(pan);
	     lista.add(leche);
	     lista.add(carne);
	     lista.add(manzana);
	     lista.add(tomate);
	     
	     //Imprimir contendido
	     mostrarLista(lista);
	     
	     lista.remove(manzana);
	     mostrarLista(lista);
	     
	     //Eliminar todos los valores del TreeSet
	     lista.clear();
	     mostrarLista(lista);     
      }   	     
  }
  
      class Producto implements comparable {
    	  
    	  public String nombre;
    	  public int cantidad;
    	  
    	  public Producto(String s, int i) {
    		  nombre = s;
    		  cantidad = i;
    		 }
    	  
    	  public String toString() {
    		  return("Nombre: "+nombre+" cantidad: "+cantidad);
    		 }
    	  
    	  public int compareTo(object objeto) {
    		  
    		  Producto producto = (Producto)objeto;
    		  String nombreObjeto = producto.nombre.toLowerCase();
    		  String nombreThis = this.nombre.toLowerCase();
    		  
    		  return(nombreThis.compareTo( nombreObjeto ) );
    	  }
      }