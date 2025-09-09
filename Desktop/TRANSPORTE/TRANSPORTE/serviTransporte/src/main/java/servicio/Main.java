/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Minuta> minutas = new ArrayList<>();
    private static final List<Vehiculo> vehiculos = new ArrayList<>();
    private static final List<Servicio> servicios = new ArrayList<>();
    private static final List<Conductor> conductores = new ArrayList<>();
    private static final List<Cliente> clientes = new ArrayList<>();
    private static String empleadoActual = null;

    public static void main(String[] args) {
        inicializarDatos();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearServicio();
                case 2 -> registrarMinuta();
                case 3 -> consultarConductor();
                case 4 -> consultarVehiculo();
                case 5 -> consultarCliente();
                case 6 -> consultarEmpleadoCreador();
                case 7 -> consultarServiciosPorCliente();
                case 8 -> consultarServiciosPorConductor();
                case 9 -> autenticarEmpleado();
                case 10 -> listarMinutasOrdenadas();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("️ Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n==== MENÚ DEL SISTEMA ====");
        System.out.println("1. Crear servicio ");
        System.out.println("2. Registrar minuta ");
        System.out.println("3. Consultar conductor ");
        System.out.println("4. Consultar vehículo ");
        System.out.println("5. Consultar cliente ");
        System.out.println("6. Consultar empleado creador ");
        System.out.println("7. Consultar servicios por cliente ");
        System.out.println("8. Consultar servicios por conductor ");
        System.out.println("9. Autenticar empleado ");
        System.out.println("10. Listar minutas ordenadas ");
        System.out.println("0. Salir");
    }

    private static void crearServicio() {
        if (empleadoActual == null) {
            System.out.println("️ Debe autenticarse como empleado antes de crear servicios.");
            return;
        }

        System.out.println("== Crear nuevo servicio ==");
        int id = leerEntero("Ingrese ID del servicio: ");
        sc.nextLine(); 

      
        System.out.print("Fecha del servicio (DD/MM/YYYY): ");
        String fecha = sc.nextLine();
        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();

        
        System.out.println("\n--- Datos del Cliente ---");
        System.out.print("Nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Cédula del cliente: ");
        int cc = leerEntero("");
        sc.nextLine();
        System.out.print("Tipo natural: ");
        String natural = sc.nextLine();
        System.out.print("Tipo jurídica: ");
        String juridica = sc.nextLine();
        Cliente cliente = new Cliente(nombreCliente, cc, natural, juridica);
        clientes.add(cliente);

       
        System.out.println("\n--- Selección de Conductor ---");
        System.out.println("Conductores disponibles:");
        for (int i = 0; i < conductores.size(); i++) {
            System.out.println((i + 1) + ". " + conductores.get(i).getNombre());
        }
        int indexConductor = leerEntero("Seleccione el número del conductor: ") - 1;
        Conductor conductor = conductores.get(indexConductor);

       
        System.out.println("\n--- Selección de Vehículo ---");
        System.out.println("Vehículos disponibles:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).getPlaca() + " - " + vehiculos.get(i).getMarca());
        }
        int indexVehiculo = leerEntero("Seleccione el número del vehículo: ") - 1;
        Vehiculo vehiculo = vehiculos.get(indexVehiculo);

        
        System.out.println("\n--- Registro de Minuta ---");
        System.out.print("Hora (HH:MM): ");
        String hora = sc.nextLine();
        System.out.print("Fecha minuta (DD/MM/YYYY): ");
        String fechaMinuta = sc.nextLine();
        System.out.print("Asunto: ");
        String asunto = sc.nextLine();
        System.out.print("Nota: ");
        String nota = sc.nextLine();
        Minuta minuta = new Minuta(hora, fechaMinuta, asunto, nota);
        minutas.add(minuta);

        
        Servicio servicio = new Servicio(id, fecha, origen, destino, cliente, conductor, vehiculo, minuta, empleadoActual);
        servicios.add(servicio);
        System.out.println(" Servicio creado exitosamente.");
    }

    private static void registrarMinuta() {
        System.out.println("== Registrar minuta ==");
        sc.nextLine();

        System.out.print("Hora (HH:MM): ");
        String hora = sc.nextLine();

        System.out.print("Fecha (DD/MM/YYYY): ");
        String fecha = sc.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(fecha, formato);
        } catch (DateTimeParseException e) {
            System.out.println("️ Formato de fecha inválido. Debe ser DD/MM/YYYY.");
            return;
        }

        System.out.print("Asunto: ");
        String asunto = sc.nextLine();
        System.out.print("Nota: ");
        String nota = sc.nextLine();

        Minuta m = new Minuta(hora, fecha, asunto, nota);
        minutas.add(m);
        System.out.println(" Minuta registrada correctamente.");
    }

    private static void consultarConductor() {
        System.out.println("== Consultar conductores registrados ==");
        if (conductores.isEmpty()) {
            System.out.println("️ No hay conductores registrados.");
            return;
        }
        conductores.forEach(Conductor::mostrarInfo);
    }

    private static void consultarVehiculo() {
        System.out.println("== Consultar vehículos registrados ==");
        vehiculos.forEach(Vehiculo::mostrarInfo);
    }

    private static void consultarCliente() {
        System.out.println("== Consultar clientes registrados ==");
        if (clientes.isEmpty()) {
            System.out.println("️ No hay clientes registrados.");
            return;
        }
        clientes.forEach(Cliente::mostrarInfo);
    }

    private static void consultarEmpleadoCreador() {
        System.out.println("== Consultar empleados creadores de servicios ==");
        if (servicios.isEmpty()) {
            System.out.println("️ No hay servicios registrados.");
            return;
        }
        servicios.forEach(s -> System.out.println("Servicio ID " + s.getIdServicio() +
                " creado por: " + s.getEmpleado()));
    }

    private static void consultarServiciosPorCliente() {
        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();
        servicios.stream()
                .filter(s -> s.getCliente().getNombre().equalsIgnoreCase(cliente))
                .forEach(s -> System.out.println("Servicio encontrado: ID " + s.getIdServicio()));
    }

    private static void consultarServiciosPorConductor() {
        System.out.print("Ingrese nombre del conductor: ");
        String conductor = sc.nextLine();
        servicios.stream()
                .filter(s -> s.getConductorAsignado().getNombre().equalsIgnoreCase(conductor))
                .forEach(s -> System.out.println("Servicio encontrado: ID " + s.getIdServicio()));
    }

    private static void autenticarEmpleado() {
        System.out.print("Ingrese nombre del empleado: ");
        empleadoActual = sc.nextLine().trim();
        System.out.println(" Bienvenido, " + empleadoActual);
    }

    private static void listarMinutasOrdenadas() {
        System.out.println("== Minutas ordenadas por fecha ==");
        if (minutas.isEmpty()) {
            System.out.println(" No hay minutas registradas.");
            return;
        }
        minutas.stream()
                .sorted(Comparator.comparing(m -> LocalDate.parse(m.getFecha(), 
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"))))
                .forEach(m -> System.out.println(m.getFecha() + " - " + m.getHora() + " - " + m.getAsunto()));
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("️ Debe ingresar un número válido.");
                sc.next();
            }
        }
    }

    private static void inicializarDatos() {
      
        vehiculos.add(new VehiculoLiviano(1, "AAA111", "Toyota", "Corolla", "Activo", "Zona Norte", 500));
        vehiculos.add(new Cisterna(2, "BBB222", "Volvo", "XC90", "En servicio", "Agua", 2000));
        vehiculos.add(new Camion(3, "CCC333", "Mercedes", "Actros", "Disponible", 3, 10.5));
        vehiculos.add(new Furgon(4, "DDD444", "Ford", "Transit", "Mantenimiento", true, 2.8));
        
       
        conductores.add(new Conductor(1, "Carlos López", "A12345", 123456789, "Calle 1"));
        conductores.add(new Conductor(2, "María Pérez", "B67890", 987654321, "Calle 2"));
        conductores.add(new Conductor(3, "Juan Torres", "C54321", 555666777, "Calle 3"));
        
       
        clientes.add(new Cliente("Empresa XYZ", 900123456, "No aplica", "S.A.S."));
        clientes.add(new Cliente("Ana Gómez", 123456789, "Persona natural", "No aplica"));
    }
}