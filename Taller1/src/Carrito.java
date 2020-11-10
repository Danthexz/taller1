import java.util.Random;
public class Carrito {
    public Carrito() {
    }
    private int crearCantidadProducto ( ) {
        Random azar = new Random();
        int cantidad = azar.netInt(15);
        return cantidad;
    }


    public int crearLargoCarrito() {
        Random azar = new Random();
        int largo = azar.nextInt(20);
        return largo;
    }

    private int[] crearLugares(int largo) {
        int[] lugares = new int[largo];
        for (int i = 0; i < largo; i++) {
            lugares[i] = i + 1;
        }
        return lugares;
    }

    private int[] crearValores(int[] lugares) {
        int largoArray = lugares.length;
        int[] valores = new int[largoArray];
        valores[0] = 500;
        for (int i = 0; i < largoArray; i++) {
            valores[i] = (lugares[i] * 150) + valores[0];
        }
        return valores;
    }

    private int[] crearCantidades(int largo) {
        int[] cantidades = new int[largo];
        for (int i = 0; i < largo; i++) {
            cantidades[i] =this.crearCantidadProducto();
        }
        return cantidades;
    }

    private void mostrarCantidadProductos(){
        System.out.println("El carrito contiene"+this.crearCantidadProducto()+"productos");
        }


    private void mostrarValorTotal(int []cantidades ){
        int valorTotal=0;
        fas

        for (int i = 0; i < cantidades.length; i++) {
            valorTotal =valorTotal+(cantidades[i]*;
        }
    }

    }



}
