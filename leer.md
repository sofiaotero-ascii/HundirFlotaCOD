# **README: Hundir la Flota**

## **Descripción**
Este programa en Java simula una parte del clásico juego **Hundir la Flota** (Battleship). Utiliza un tablero representado como un array bidimensional (`char[][]`) donde se colocan diferentes tipos de barcos: **barcos simples (B)**, **portaaviones (P)**, y **submarinos (S)**, junto con celdas de agua (`a`).

El objetivo del programa es recorrer el tablero utilizando un bucle `for` y **mostrar las coordenadas exactas** de las celdas donde se encuentran los barcos.

---

## **Características**
- Representación del tablero como una matriz de caracteres.
- Identificación de los siguientes elementos en el tablero:
    - **Barco simple (B)**
    - **Portaaviones (P)** (ocupa múltiples celdas consecutivas)
    - **Submarino (S)**
- Uso de un bucle `for` anidado para recorrer filas y columnas del tablero.
- Impresión de las coordenadas donde se encuentran barcos y otros elementos.

---

## **Estructura del Código**
1. **Clase principal:** `HundirFlota`
    - Contiene el método `main`, que crea el tablero y llama a otros métodos.
2. **Tablero:** Representado como un array bidimensional (`char[][]`) predefinido con los elementos del juego.
3. **Método `imprimirLugaresDeBarcos`:**
    - Recibe el tablero como parámetro.
    - Utiliza bucles `for` anidados para recorrer filas y columnas.
    - Identifica la presencia de barcos y muestra las coordenadas correspondientes.

---

## **Funcionamiento**
1. El programa comienza creando un tablero con celdas representadas por caracteres:
    - `'a'`: Agua
    - `'B'`: Barco
    - `'P'`: Portaaviones
    - `'S'`: Submarino
2. Muestra un mensaje indicando que se imprimirán las posiciones de los barcos.
3. Llama al método `imprimirLugaresDeBarcos`, que recorre el tablero e identifica las coordenadas de los elementos especificados.
4. Por cada barco, portaaviones o submarino encontrado, imprime su posición en la consola.

---

## **Ejecución**
Al ejecutar el programa, la salida en la consola será algo similar a:

```
Hay barcos en:
Barco en (0,2)
Barco en (1,1)
Submarino en (2,1)
Barco en (2,3)
Portaaviones en (3,0)
Portaaviones en (3,1)
Portaaviones en (3,2)
Portaaviones en (3,3)
Submarino en (4,1)
```

Cada línea indica el tipo de elemento encontrado y su posición en el tablero.

---

## **Instrucciones para Ejecutar**
1. Asegúrate de tener Java instalado en tu sistema.
2. Copia el código en un archivo llamado `HundirFlota.java`.
3. Compila el archivo:
   ```bash
   javac HundirFlota.java
   ```
4. Ejecuta el programa:
   ```bash
   java HundirFlota
   ```

---

## **Cómo Personalizar el Tablero**
Puedes cambiar el contenido del tablero modificando la matriz `char[][] tablero`. Por ejemplo:
```java
char[][] tablero = {
    {'a', 'B', 'B', 'a', 'a'},
    {'a', 'a', 'a', 'P', 'P'},
    {'S', 'S', 'a', 'a', 'a'},
    {'a', 'a', 'a', 'a', 'a'},
    {'B', 'a', 'a', 'S', 'a'}
};
```

---

## **Conceptos Aprendidos**
Este programa ayuda a comprender:
- Uso de arrays bidimensionales (`char[][]`) para almacenar datos.
- Cómo recorrer matrices utilizando bucles anidados (`for`).
- Cómo verificar condiciones específicas (`if-else`) dentro de una estructura iterativa.
- Métodos en Java para dividir responsabilidades dentro del código.

---

## **Versión**
- **Versión:** 2.0
- **Autor:** Sofía Otero

--- 

