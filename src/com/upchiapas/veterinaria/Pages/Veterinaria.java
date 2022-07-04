package com.upchiapas.veterinaria.Pages;

import com.upchiapas.veterinaria.modelos.Cliente;
import com.upchiapas.veterinaria.modelos.Mascota;
import com.upchiapas.veterinaria.modelos.Producto;
import com.upchiapas.veterinaria.modelos.Usuario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Veterinaria {

    ArrayList<Producto> listaProductos = new ArrayList<>();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static Usuario[] usuarios = new Usuario[5];
    static Mascota mascotas;
    public static void clientesRegistrado(){
        Scanner teclado = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Yahir", 12);
        Cliente cliente2 = new Cliente("Angel", 13);
        Cliente cliente3 = new Cliente("Osvaldo", 14);
        Cliente cliente4 = new Cliente("Gloria", 15);

        Usuario usuario1 = new Usuario("Yahir", 12);
        Usuario usuario2 = new Usuario("Angel", 13);
        Usuario usuario3 = new Usuario("Osvaldo", 14);
        Usuario usuario4 = new Usuario("Gloria", 15);
        Usuario usuario5 = new Usuario("Doctor", 20);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);

        usuarios[0] = usuario1;
        usuarios[1] = usuario2;
        usuarios[2] = usuario3;
        usuarios[3] = usuario4;
        usuarios[4] = usuario5;

        System.out.println("Folios registrados");
        for(int i=0; i<usuarios.length; i++){
            System.out.println(usuarios[i].getFolio());
        }

        int opcion;
        do{
            boolean auxliar = false;
            do{
                int usuario;
                opcion =0;
                auxliar = false;
                System.out.println("Ingrese folio: ");
                usuario = teclado.nextInt();

                for (int i=0; i<5 && !auxliar; i++){
                    if (usuarios[i].getFolio()==usuario){
                        auxliar = true;
                        opcion = (i+1);
                    }
                }
            }while (auxliar == false);
            switch (opcion){
                case 1:
                    System.out.println("Bienvendio: Yahir");
                    registrarMascota(opcion);
                    mostrarMascotas(opcion);
                    solicitarProductos(opcion);
                    break;
                case 2:
                    System.out.println("Bienvendio: Angel");
                    registrarMascota(opcion);
                    mostrarMascotas(opcion);
                    solicitarProductos(opcion);
                    break;
                case 3:
                    System.out.println("Bienvendio: Osvaldo");
                    registrarMascota(opcion);
                    mostrarMascotas(opcion);
                    solicitarProductos(opcion);
                    break;
                case 4:
                    System.out.println("Bienvendio: Gloria");
                    registrarMascota(opcion);
                    mostrarMascotas(opcion);
                    solicitarProductos(opcion);
                    break;
                case 5:
                    System.out.println("Bienvendio: Doctor");
                    eleirCliente();
                    break;
            }
        }while (opcion >=1 && opcion <=6);
    }


    public static void registrarMascota(int opcion){
        Scanner entrada = new Scanner(System.in);
        int posOp = opcion-1;
        int cantidad;
        String nombre;
        String tipo;
        String especie;
        String genero;
        System.out.println("Cuntas mascotas desea agregar: ");
        cantidad = entrada.nextInt();
        if (cantidad+listaClientes.get(posOp).listaMascotas.size()<=5){
            if(cantidad <=5){
                for(int i=0; i<cantidad; i++){
                    System.out.println("nombre: ");
                    nombre = entrada.next();
                    System.out.println("tipo: ");
                    tipo = entrada.next();
                    System.out.println("especie: ");
                    especie = entrada.next();
                    System.out.println("genero: ");
                    genero = entrada.next();
                    Mascota mascotas = new Mascota(nombre, tipo, especie, genero);
                    listaClientes.get((posOp)).listaMascotas.add(mascotas);
                }
            }else{
                System.out.println("Error");
            }
        }
    }

    public static void mostrarMascotas(int indice){
        indice -=1;
        int i=1;
        Iterator<Mascota> iterator = listaClientes.get(indice).listaMascotas.iterator();
        System.out.println("Mascota son:");
        while (iterator.hasNext()){
            mascotas = iterator.next();
            System.out.println("Nombre: "+mascotas.getNombreM()+" Especie: "+mascotas.getEspecieM()+" tipo: "+mascotas.getTipoM());
        }

    }

    public static void solicitarProductos(int usurio){
        Scanner entrada = new Scanner(System.in);
        int usuario = usurio-1;
        int opcion;
        String nombre;
        int codigo = 0;
        System.out.println("Desea relizar un servicio: ");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                int op1;
                System.out.println("1. vacunacion");
                System.out.println("2. Desparacitante");
                op1 = entrada.nextInt();
                switch (op1){
                    case 1:
                        System.out.println("Carnet de: "+mascotas.getNombreM());
                        System.out.println("Vacunacion");
                        codigo = (int) (Math.random()* 1000);
                        Producto productos = new Producto(codigo);
                        listaClientes.get(usuario).listaProductos.addLast(productos);
                        Calendar fecha = Calendar.getInstance();
                        String fechaVacunacion = fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR) + "|" + (fecha.get(Calendar.HOUR_OF_DAY)) + ":" + (fecha.get(Calendar.MINUTE));
                        System.out.println("codigo: "+productos.getCodigo()+" nombre Mascota:  "+mascotas.getNombreM()+ " Fecha de Vacunacion: " + fechaVacunacion);
                        System.out.println("Precio total es de: $100");
                    break;
                    case 2:
                        System.out.println("Carnet de: "+mascotas.getNombreM());
                        System.out.println("Desparacitante");
                        codigo = (int) (Math.random()* 1000);
                        Producto productos2 = new Producto(codigo);
                        listaClientes.get(usuario).listaProductos.addLast(productos2);
                        Calendar fecha1 = Calendar.getInstance();
                        String fechaPastilla = fecha1.get(Calendar.DAY_OF_MONTH) + "/" + (fecha1.get(Calendar.MONTH) + 1) + "/" + fecha1.get(Calendar.YEAR) + "|" + (fecha1.get(Calendar.HOUR_OF_DAY)) + ":" + (fecha1.get(Calendar.MINUTE));
                        System.out.println("HISTORIAL DE LA MASCOTA");
                        System.out.println("Codigo: "+productos2.getCodigo()+" nombre Mascota:  "+mascotas.getNombreM()+ " Fecha de Desparacitante: " + fechaPastilla);
                        System.out.println("Precio total es de: $110");
                        break;
                }
                /*System.out.println("Ingrese el nombre el servicio como *vacuna* o *desparacitante*");
                nombre = entrada.next();
                codigo = (int) (Math.random() * 1000);
                System.out.println("Solicitud correcta");
                Producto productos = new Producto(nombre, codigo);
                listaClientes.get(usuario).listaProductos.addLast(productos);*/
                break;
            case 2:
                System.out.println("no has solicitado servicio");
                clientesRegistrado();
        }
    }

    public static void verCarnetVacunacion(int lugar){
        int usuario =0;
        int codigo =0;
        System.out.println("Carnet de: "+mascotas.getNombreM());
        System.out.println("Vacunacion");
        codigo = (int) (Math.random()* 1000);
        Producto productos = new Producto(codigo);
        listaClientes.get(usuario).listaProductos.addLast(productos);
        Calendar fecha = Calendar.getInstance();
        String fechaVacunacion = fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR) + "|" + (fecha.get(Calendar.HOUR_OF_DAY)) + ":" + (fecha.get(Calendar.MINUTE));
        System.out.println("codigo: "+productos.getCodigo()+" nombre Mascota:  "+mascotas.getNombreM()+ " Fecha de Vacunacion: " + fechaVacunacion);
    }

    public static void verCarnetPastilla(int lugar){
        int usuario =0;
        int codigo =0;
        System.out.println("Carnet de: "+mascotas.getNombreM());
        System.out.println("Desparacitante");
        codigo = (int) (Math.random()* 1000);
        Producto productos2 = new Producto(codigo);
        listaClientes.get(usuario).listaProductos.addLast(productos2);
        Calendar fecha1 = Calendar.getInstance();
        String fechaPastilla = fecha1.get(Calendar.DAY_OF_MONTH) + "/" + (fecha1.get(Calendar.MONTH) + 1) + "/" + fecha1.get(Calendar.YEAR) + "|" + (fecha1.get(Calendar.HOUR_OF_DAY)) + ":" + (fecha1.get(Calendar.MINUTE));
        System.out.println("HISTORIAL DE LA MASCOTA");
        System.out.println("Codigo: "+productos2.getCodigo()+" nombre Mascota:  "+mascotas.getNombreM()+ " Fecha de Desparacitante: " + fechaPastilla);
    }

    public static void eleirCliente(){
        Scanner entrada = new Scanner(System.in);
        int lugar =0;
        int folio;
        System.out.println("Ingrese folio de cliente: ");
        folio = entrada.nextInt();
        boolean auxiliar = false;
        for(int i=0; i<4 && !auxiliar; i++){
            if(usuarios[i].getFolio() == folio){
                lugar = i+1;
                auxiliar = true;
            }
        }
        mostrarMascotas(lugar);
        menuDoctor(lugar);
        verCarnetVacunacion(lugar);
        verCarnetPastilla(lugar);
    }

    public static void menuDoctor(int lugar){
        Scanner entrada = new Scanner(System.in);
        lugar -=1;
        int op;
        int opcion;
        System.out.println("1. ver solicitud de servicio del cliente");
        System.out.println("2. salir");
        op = entrada.nextInt();
        switch (op){
            case 1:
                if(listaClientes.get(lugar).listaProductos.isEmpty()){
                    System.out.println("EL CLIENTE NO TIENE SERVICIO :(");
                }else{
                    System.out.println("La solicitud es la siguente: "+listaClientes.get(lugar).listaProductos.getFirst());
                    System.out.println("1. Aceptar");
                    System.out.println("2. Denegar");
                    opcion = entrada.nextInt();
                    if(opcion == 1){
                        listaClientes.get(lugar).listaMascotas.add(listaClientes.get(lugar).listaMascotas.get(lugar));
                        System.out.println("se ha cargado la servicio");
                        listaClientes.get(lugar).listaProductos.removeFirst();
                        mostrarMascotas((lugar+1));
                    }else{
                        listaClientes.get(lugar).listaProductos.removeFirst();
                        System.out.println("Adios");
                    }
                }
            case 2:
                System.out.println("Adios xd");
                break;
        }

    }
}
