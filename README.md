# Mundo Animal

Ejercicio de Programación Orientada a Objetos en Java, hecho en el Bootcamp Desarrollador Java Full Stack de Generation México. El historial de commits muestra cómo construí el proyecto paso a paso.

## Qué muestra

- **Clase abstracta y encapsulamiento:** `Animal` tiene atributos privados (nombre y edad), constructor, getters y el método abstracto `hacerSonido()`.
- **Herencia:** `Perro`, `Gato`, `Vaca` y `Caballo` heredan de `Animal` y sobrescriben `hacerSonido()`.
- **Interfaces:** cada animal implementa la interfaz `Movible` con su propia versión de `moverse()`.
- **Polimorfismo:** `Main` guarda distintos animales en un arreglo de tipo `Animal` y los recorre con un `for` para invocar sus métodos.

## Cómo ejecutarlo

Abre el proyecto en IntelliJ IDEA y ejecuta la clase `Main`, o desde la terminal:

```
javac -d out src/mx/com/animales/*.java
java -cp out mx.com.animales.Main
```

## Autora

Aída Alejandra Carvajal Aguado | [LinkedIn](https://www.linkedin.com/in/aalecarvajal) | [Portafolio](https://aalecarvajal.github.io/PortafolioAleCarvajal.io/)
