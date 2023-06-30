package proyecto;

import javax.swing.JOptionPane;

public class MainConversor {
    public static void main(String[] args) {

        Double inputMoneda = 0.0;
        Conversor valorMoneda = new Conversor(inputMoneda);

        // Arreglo con las opciones a mostrar
        String[] opciones = {"Conversor de Moneda", "Opción 2"};

        // Mostrar cuadro de diálogo de entrada con las opciones
        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción:",
                "Cuadro de diálogo", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        // Verificar la opción seleccionada
        if (seleccion != null) {
            // Realizar acciones basadas en la opción seleccionada
            if (seleccion.equals("Conversor de Moneda")) {
                inputMoneda = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor a convertir"));
                valorMoneda.setInputMoneda(inputMoneda);
                JOptionPane.showMessageDialog(null, valorMoneda.getInputMoneda());
                System.out.println("Seleccionaste la Opción 1");
            } else if (seleccion.equals("Opción 2")) {
                System.out.println("Seleccionaste la Opción 2");
            } else if (seleccion.equals("Opción 3")) {
                System.out.println("Seleccionaste la Opción 3");
            }
        } else {
            // El usuario cerró el cuadro de diálogo sin seleccionar una opción
            System.out.println("No seleccionaste ninguna opción");
        }
    }
}
