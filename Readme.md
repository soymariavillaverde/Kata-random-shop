# Kata Random Shop (es)

Bienvenida a Random Shop! Nuestro anterior programador, Mariano, ha dejado la empresa para montar su propia startup de venta de motos usando blockchain. Por suerte, hemos podido contrataros para continuar trabajando en nuestro sistema de venta.

## Descripción

#### Qué vendemos:
En Random Shop apostamos por el caos como seña de identidad. Cuando alguien viene a nuestra tienda queremos que se sienta completamente perdida, y que no sepa qué es lo que va a comprar (ni cuánto va a pagar por ello). A día de hoy, nuestro stock se compone de:
- Mascotas
- Productos gourmet
- Cartas Magic
- Calzado (outlet). 

#### Cuánto cuestan las cosas:
- Cartas Magic: The Gathering. Estas cartas tienen un precio variable, dependiendo de su <b>color</b>: 
    - Azul 5 euros
    - Rojo 3.5 euros 
    - Verde 4.40 euros
    - Negro 6.80 euros
    - Marrón 2.0 euros 
    - La Black Lotus es una carta de coleccionista que vale 40.000 euros.

- Mascotas: su precio depende del número de <b>patas y del color</b>. 
    - Los animales terrestres tienen un precio de 4.2 euros por cada pata. 
    - Los peces tienen un precio dependiendo del color: 
        - 10 céntimos los peces azules
        - 100 euros los peces dorados
        - El resto de peces tienen un precio base.

- Productos gourmet: estos productos dependen de su <b>"edad"</b>.
    - Los vinos tienen un precio igual a 20 euros por año
    - Los quesos apestosos tienen un precio de 10 euros por año.

## Qué nos piden?
#### Modificación de cartas Magic. 
La antigüedad de las cartas Magic puede influir en su precio. 
- Las cartas azules y rojas cuestan la mitad cuando tienen más de 10 años.
- Las cartas negras y verdes cuestan un 20% más cuando tienen más de 20 años.

#### Arañas mascota. 
Queremos añadir este nuevo producto a nuestra tienda. El precio de una araña mascota se calcula de la siguiente manera:
- 1.20 euro por cada pata
- +2 euros si son de color rojo
- +3 euros si son de color dorado
- Las arañas apestosas (stinky) están a mitad de precio

## Cómo empezar
- Añade los tests unitarios para los casos que falten por testear ANTES de COMENZAR CON LOS NUEVOS REQUISITOS
- Ejecuta todos los tests cada vez que hagas un cambio en el código

## Análisis
Fíjate en la función <i>ShoppingCart::calculatePrice</i>
- Qué problemas tiene este código?
- Es fácil o difícil crear un nuevo producto? Por qué?

