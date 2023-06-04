public class Singleton {
    private static Singleton instance; // Variable estática que almacena la única instancia de la clase

    private Singleton() {} // Constructor privado para evitar la creación de instancias directamente

    public static Singleton getInstance() { // Este es el unico metodo que se utiliza para crear una instancia
        if (instance == null) { // Comprueba si la instancia aún no ha sido creada
            instance = new Singleton(); // Crea una nueva instancia si no existe
        }
        return instance; // Devuelve la instancia existente o recién creada
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton instancia1 = Singleton.getInstance(); // Variable de una instancia
        Singleton instancia2 = Singleton.getInstance(); // Variable de otra instancia

        System.out.println(instance1 == instance2); // true, las dos variables hacen referencia a la misma instancia de Singleton
    }
}
