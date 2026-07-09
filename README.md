# -_-_adivina_numero_java_- :.
# 🎯 AdivinaNumeroJava:

<img width="1254" height="1254" alt="image" src="https://github.com/user-attachments/assets/3a155bdf-3528-4b0d-9655-83ab27e0a12b" />  

```

Proyecto muy básico desarrollado en **Java 21**, ejecutado desde la **consola**, donde el
usuario debe adivinar un número aleatorio generado por el programa.

---

# 📋 Características

Este proyecto permite:

- ✅ Generar un número aleatorio entre **1 y 100**.
- ✅ Solicitar al usuario que adivine el número.
- ✅ Indicar si el número secreto es **mayor** o **menor**.
- ✅ Contar la cantidad de intentos realizados.
- ✅ Finalizar cuando el usuario adivina el número.

---

# 🛠 Tecnologías

- Java 21
- IntelliJ IDEA (Community o Ultimate)

> **No requiere Maven ni bibliotecas externas.**

---

# 📁 Estructura del proyecto

```text
AdivinaNumeroJava
│
└── src
    └── main
        └── java
            └── com
                └── ejemplo
                    └── Main.java
```

---

# 💻 Código fuente

## Main.java

```java
package com.ejemplo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int numeroUsuario = 0;
        int intentos = 0;

        System.out.println("==============================");
        System.out.println("     ADIVINA EL NUMERO");
        System.out.println("==============================");
        System.out.println("Debes adivinar un numero entre 1 y 100.");

        while (numeroUsuario != numeroSecreto) {

            System.out.print("\nIngrese un numero: ");
            numeroUsuario = teclado.nextInt();

            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es MENOR.");
            } else {
                System.out.println();
                System.out.println("****************************");
                System.out.println("¡FELICIDADES!");
                System.out.println("Adivinaste el numero.");
                System.out.println("Numero: " + numeroSecreto);
                System.out.println("Intentos: " + intentos);
                System.out.println("****************************");
            }

        }

        teclado.close();
    }
}
```

---

# ▶️ Ejecución del programa

Al iniciar la aplicación se muestra:

```text
==============================
     ADIVINA EL NUMERO
==============================
Debes adivinar un numero entre 1 y 100.
```

Ejemplo de una partida:

```text
Ingrese un numero: 50
El numero secreto es MAYOR.

Ingrese un numero: 75
El numero secreto es MENOR.

Ingrese un numero: 63
El numero secreto es MAYOR.

Ingrese un numero: 68
El numero secreto es MENOR.

Ingrese un numero: 66

****************************
¡FELICIDADES!
Adivinaste el numero.
Numero: 66
Intentos: 5
****************************
```

---

# ⚙️ Funcionamiento

1. El programa genera un número aleatorio entre **1 y 100**.
2. El usuario ingresa un número.
3. El sistema compara el número ingresado con el número secreto.
4. Si el número es menor, informa que el número secreto es **mayor**.
5. Si el número es mayor, informa que el número secreto es **menor**.
6. Se incrementa el contador de intentos.
7. El ciclo continúa hasta que el usuario adivina el número.
8. Finalmente se muestran:
   - Número secreto.
   - Cantidad de intentos realizados.

---

# 📌 Variables principales

| Variable | Tipo | Descripción |
|----------|------|-------------|
| `numeroSecreto` | `int` | Número generado aleatoriamente. |
| `numeroUsuario` | `int` | Número ingresado por el usuario. |
| `intentos` | `int` | Contador de intentos realizados. |
| `random` | `Random` | Generador de números aleatorios. |
| `teclado` | `Scanner` | Lee la entrada del usuario desde la consola. |

---

# 🔄 Lógica del programa

```text
Inicio
   │
   ▼
Generar número aleatorio (1-100)
   │
   ▼
Mostrar mensaje inicial
   │
   ▼
Solicitar número al usuario
   │
   ▼
¿Es igual al número secreto?
   │
 ┌─┴───────────────┐
 │                 │
No                Sí
 │                 │
 ▼                 ▼
¿Es menor?      Mostrar resultado
 │                 │
 ▼                 ▼
Mostrar          Mostrar intentos
"MAYOR"            │
 │                 ▼
 ▼               Fin
¿Es mayor?
 │
 ▼
Mostrar
"MENOR"
 │
 └───────────────► Repetir
```

---

# ▶️ Cómo ejecutar

1. Abrir el proyecto en **IntelliJ IDEA**.
2. Abrir el archivo:

```text
src/main/java/com/ejemplo/Main.java
```

3. Ejecutar la clase **Main**.

4. Escribir números entre **1 y 100** hasta adivinar el número generado.

---

# ✅ Requisitos

- Java 21
- IntelliJ IDEA Community o Ultimate

No se requieren dependencias adicionales.

---

# 🚀 Posibles mejoras

El proyecto puede ampliarse incorporando nuevas funcionalidades como:

- 🔹 Selección de dificultad (**Fácil**, **Medio** y **Difícil**).
- 🔹 Número máximo de intentos.
- 🔹 Validación de entradas incorrectas.
- 🔹 Opción para jugar nuevamente.
- 🔹 Historial de partidas.
- 🔹 Cronómetro para medir el tiempo de cada partida.
- 🔹 Sistema de puntuación basado en la cantidad de intentos.
- 🔹 Ranking de mejores jugadores.
- 🔹 Guardar resultados en archivos de texto.
- 🔹 Almacenamiento de partidas en una base de datos **MySQL** mediante **JDBC**.
- 🔹 Estadísticas de partidas ganadas y promedio de intentos.

---

# 📚 Conceptos de Java utilizados

Este proyecto permite practicar conceptos fundamentales del lenguaje Java:

- Variables
- Tipos de datos
- Operadores relacionales
- Condicionales (`if` - `else`)
- Ciclo `while`
- Clase `Random`
- Clase `Scanner`
- Entrada de datos por consola
- Generación de números aleatorios
- Contadores
- Buenas prácticas básicas de programación

---

# 👨‍💻 Autor

Proyecto educativo desarrollado en **Java 21** para practicar:

- Programación orientada a objetos (nivel básico).
- Entrada y salida por consola.
- Estructuras de control.
- Generación de números aleatorios.
- Lógica de programacion .
- :. . / .
