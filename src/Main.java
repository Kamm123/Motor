//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Motor M1 = new Motor();
    Motor M2 = new Motor();
    Motor M3 = new Motor();

    M1.setNombre("Motor 1");
    M1.setPotencia(200);
    M1.setVelocidad(50);
    M1.setEncendido(true);

    M2.setNombre("Motor 2");
    M2.setPotencia(175);
    M2.setVelocidad(90);
    M2.setEncendido(true);

    M3.setNombre("Motor 3");
    M3.setPotencia(250);
    M3.setVelocidad(140);
    M3.setEncendido(false);

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
