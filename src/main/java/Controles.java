import www.rodrigoledesmagarcia.com.mx.modelo.*;
import www.rodrigoledesmagarcia.com.mx.servicio.*;


public class Controles {
    public static void main(String[] args) {
        System.out.println(" ");

        // COMPUTADORA DELL

        Raton ratonDell = new Raton("USB", "DELL");
        //System.out.println(ratonLenovo);
        Teclado tecladoDell = new Teclado("bluetooth", "DELL");
        //System.out.println(tecladoDell);
        Monitor monitorDell = new Monitor("HDMI", 32);
        //System.out.println(monitorHP);
        Computadora computadoraDELL = new Computadora("Alien Ware", monitorDell, tecladoDell, ratonDell);
        //ystem.out.println(computadoraDELL);

        // COMPUTADORA HP

        Raton ratonHP = new Raton("bluetooth", "hp");
        //System.out.println(ratonLenovo);
        Teclado tecladoHP = new Teclado("bluetooth", "hp");
        //System.out.println(tecladoDell);
        Monitor monitorHP = new Monitor("HDMI", 27);
        //System.out.println(monitorHP);
        Computadora computadoraHP = new Computadora("HP", monitorHP, tecladoHP, ratonHP);

        //COMPUTADORA LENOVO

        Raton ratonLenovo = new Raton("USB", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        //System.out.println(tecladoDell);
        Monitor monitorLenovo = new Monitor("Tunder bolt", 36);
        //System.out.println(monitorHP);
        Computadora computadoraLenovo = new Computadora("Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);

        // COMPUTADORA HUAWEI

        Raton ratonHuawei = new Raton("bluetooth", "Huawei");
        //System.out.println(ratonLenovo);
        Teclado tecladoHuawei = new Teclado("bluetooth", "Huawei");
        //System.out.println(tecladoDell);
        Monitor monitorHuawei = new Monitor("HDMI 2", 29);
        //System.out.println(monitorHP);
        Computadora computadoraHuawei = new Computadora("Huawei", monitorHuawei, tecladoHuawei, ratonHuawei);

        // ORDENES

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraDELL);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraHuawei);
        orden1.mostrarOrden();
        System.out.println(" ");
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraHuawei);
        orden2.mostrarOrden();




    }
}
