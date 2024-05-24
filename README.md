## Explicación del Código de AplicacioBancaria

El código proporcionado es un programa simple en Java que simula un sistema de gestión de cuentas bancarias. A continuación, se presenta una explicación detallada de cada parte del código:

### Importación de la Clase Scanner:

La línea `import java.util.Scanner;` importa la clase `Scanner` desde el paquete `java.util`, que se utiliza para leer la entrada del usuario desde la consola.

### Declaración de la Clase Principal `Main`:

Se declara la clase principal `Main`, que contiene el método `main`, el punto de entrada del programa.

### Método `main`:

El método `main` es donde comienza la ejecución del programa.

### Declaración de Variables:

Se declaran y se inicializan algunas variables, como `nombreCliente`, `tipoDeCuenta`, `saldoDisponible`, y `menu`.

### Mostrar Datos de la Cuenta:

Se imprimen los datos de la cuenta del cliente, como el nombre y el tipo de cuenta.

### Bucle Principal `for`:

Se utiliza un bucle `for` para mostrar continuamente el menú y leer la opción del usuario hasta que el usuario decide salir del programa.

### Switch-Case para las Opciones del Menú:

Se utiliza una estructura de control `switch-case` para manejar las diferentes opciones seleccionadas por el usuario. Las opciones son: consultar saldo, retirar dinero, depositar dinero y salir del programa.

### Manipulación del Saldo:

Dependiendo de la opción seleccionada por el usuario, se realizarán diferentes operaciones en el saldo de la cuenta, como consultar, retirar o depositar dinero.

### Salida del Programa:

Cuando el usuario elige salir del programa, se actualiza la variable `i` para salir del bucle y se muestra un mensaje de despedida.

Este código simula un simple sistema de gestión de cuentas bancarias que permite al usuario consultar saldo, retirar dinero, depositar dinero y salir del programa.
