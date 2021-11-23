# Calculadora

_El propósito de este proyecto es crear una calculadora avanzada_

---
## Inicio

_Las siguientes instrucciones permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas del mismo._

### Extras

- [x] Además de * para la multiplicación, permita usar x.
- [x] Permita que el usuario introduzca espacios en la operación,
  ignorándolos: "5+ 6"
- [ ] Trabaje con números de más de un dígito. Suponga que los números
  introducidos por el usuario caben en un int: "9874*238984".
- [ ] Permita que el primer número de la operación pueda ser negativo: "-
  3*6".
- [x] Permita más de un operador en la operación:
- [x] **a)** Todos los operadores tienen que ser iguales: "5+8+3+6".
- [ ] **b)** Los operadores pueden ser diferentes. Tenga en cuenta el orden de
  prioridad para resolver las operaciones: "4+6-4*9".
- [ ] **c)** Permita el uso de paréntesis en la operación: "5*(3+4)".
- [ ] Permita calcular factoriales con el operador !:
- [ ] Permita calcular exponenciales con el operador ^:
- [ ] Permita usar las constantes PI y e como sus valores matemáticos
  correspondientes:
- [ ] Trabaje con números con decimales:
- [ ] **a)** Use el punto (.) como separador de decimales: "2.3*6.1".
- [ ] **b)** Use la coma (,) como separador de decimales: "5,6*9,2"
- [ ] Si la operación introducida por el usuario no es válida, coménteselo y
  vuelva a preguntarle.
- [ ] Siga pidiéndole operaciones al usuario, no termine el programa después
  de la primera. Permítale que termine el programa si introduce la palabra exit.
  **Nota**: Este extra es necesario para los siguientes extras.
- [ ] Muéstrele al usuario lo que permite realizar la calculadora y permítele
  introducir la palabra help para volver a mostrar la ayuda.
- [ ] Permita que el usuario no introduzca el primer operando de la
  operación y en ese caso se usaría el resultado de la operación anterior:
- [ ] Uso de variables:
- [ ] **a)** Permita que el usuario introduzca la letra m para guardar el resultado
  de la operación anterior en esa variable y la pueda utilizar
  posteriormente en una operación.
- [ ] **b)** Permita que el usuario introduzca cualquier letra minúscula (excepto la
  x) para usarla como variable.
- [ ] **c)** Permita el uso de palabras como variables, compuestas solo por letras
  mayúsculas y minúsculas (excluyendo las palabras clave del programa).
- [ ] **d)** Permita al usuario que introduzca la palabra clear para eliminar todas
  las variables.
- [ ] **e)** Permita al usuario introducir la palabra var para mostrarle las variables
  disponibles y su valor.
- [ ] **f)** Cuando el usuario termine el programa, guarde las variables en un
  fichero. Cuando se arranca el programa, cargue las variables del fichero
  e indíquele al usuario cuáles son y cuál es su valor

### Pre-requisitos

_Estas son las siguientes cosas que se necesitan para poder ejecutar el proyecto:_

```
Versión 11 de Open JDK
```
```
Tener make instalado
```

### Compilación del programa

Se ejecuta el comando siguiente:

```
make jar 
```
---
## Ejecutar pruebas

_Para poder ejecutar pruebas del programa, deberá seguir las siguientes instrucciones:_

-   Para poder ejecutar el programa se debe usar el comando
```
make ejecutar
```

## Notas para los desarolladores

---

### Generar Javadoc
Se ejecuta el siguiente comando:
```
make javadoc
```

### Visualización del Javadoc
Se ejecuta el siguiente comando (es necesesario tener `firefox`):
```
firefox html/index.html
```

---
## Autores ✒️

_Estos son los autores que han contribuido en el realizamiento del proyecto:_

* **[Juan Cordero Pascual](https://github.com/Jcorderop02)**


---
## Copyright
Se permite cualquier explotación de la obra, incluyendo una
finalidad comercial, así como la creación de obras derivadas, la distribución de las cuales también está permitida sin ninguna restricción.
![Copyright.png](Copyright.png)

