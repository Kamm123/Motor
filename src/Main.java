//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Motor M1 = new Motor();
    Motor M2 = new Motor();
    Motor M3 = new Motor();

    M1.nombre = "Motor 1";
    M1.potencia = 200;
    M1.velocidad = 50;
    M1.encendido= true;

    M2.nombre = "Motor 2";
    M2.potencia = 175;
    M2.velocidad = 90;
    M2.encendido= true;

    M3.nombre = "Motor 3";
    M3.potencia = 250;
    M3.velocidad = 140;
    M3.encendido= false;

    System.out.println("--------------MOTOR CARROS-------------");
    System.out.println("=====Motor 1=====");
    M1.mostrarInformacion();
    M1.apagar();
    M1.mostrarEstado();
    M1.encender();
    M1.mostrarEstado();


    System.out.println("=====Motor 2=====");
    M2.mostrarInformacion();

    System.out.println("=====Motor 3=====");
    M3.mostrarInformacion();

}
