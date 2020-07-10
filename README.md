# Practica-de-laboratorio-07-Gestion-de-archivos-de-texto-en-Java

## Programacion Orientada a Objetos

## Titulo de la Practica: 

Desarrollo de una aplicación que permita manipular archivos de texto para realizar minería de datos.


## Objetivos:

* Desarrollar aplicaciones con capacidad de persistir datos en archivos.

* Implementar control de excepciones en el desarrollo de aplicaciones.

**Version de las Herramientas**

* IDE Apache NetBeans 11.3

* Java = JDK 14

### Actividades a Desarrollar

### 1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 07: Gestión de Archivos de texto en Java”.

A continuación, se presentará el repositorio para la encriptación de esta práctica, y el link de enlace:

![Github](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/repositorio.png)

### 2. Desarrollar una aplicación que permita encriptar y desencriptar documentos de texto usando dos aplicaciones cliente.

Para la primera parte de esta tarea, encriptar el texto, se procedió a crear dos paquetes: controlador y vista y cada uno con una clase:

![paquetes](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/paquetes.png)

Ahora procedemos con el pseudocodigo de la clase ControladorTexto. Esta clase es la encargada de realizar la encriptación del texto que el usuario escriba en la interfaz gráfica.

![ControladorTexto](https://github.com/adolfojara10/Practica-de-laboratorio-07-Gestion-de-archivos-de-texto-en-Java/blob/master/src/ec/ups/edu/controlador/ControladorTexto.java)

Ahora procedemos con el pseudocodigo de la clase VentanaPrincipal. Esta clase es la encargada de mostrar la ventana donde se va a escoger una carpeta o un archivo .txt para realizar su posterior encriptación.

![VentanaPrincipal](https://github.com/adolfojara10/Practica-de-laboratorio-07-Gestion-de-archivos-de-texto-en-Java/blob/master/src/ec/ups/edu/vista/VentanaPrincipal.java)

### 3.	Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin.

A continuación, el link de enlace de los commits de la primera parte del proyecto:

![Commits](https://github.com/adolfojara10/Practica-de-laboratorio-07-Gestion-de-archivos-de-texto-en-Java/commits/master)

### 4.	Generar el informe de la práctica con el desarrollo de cada uno de los puntos descritos anteriormente.

En la primera parte, lo primero que aparece es la ventana creada:

![ventana](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/1.png)

Procedemos a presionar el botón con los 3 puntos:

![jfilechooser](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/2.png)

En esta ventana podemos seleccionar tanto una carpeta como un archivo a abrir:

![carpeta](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/3.png)

Una vez escogida la carpeta o el archivo de ruta, y se escribe en el cuadro de texto de ruta. Ahora procedemos a escribir en el área designada para escribir, y creamos el archivo:

![creararchivo](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/4.png)

Como no se selecciono un archivo txt, nos aparece una ventana emergente para escribir el nombre, donde no es necesario escribir.txt ya que el programa lo hace. Aplastamos el botón de OK y ahora procedemos a abrir el archivo en nuestra carpeta de pruebas:

![evidencia](https://github.com/adolfojara10/Images-practicas/blob/master/Imagenes%20practica%2007/5.png)

### 5.	Implementar el README del repositorio del proyecto con la misma información del informe de la práctica (incluidas las imágenes y versiones de las herramientas).

### 6.	Subir al AVAC el informe del proyecto en formato .pdf. El informe debe contar con conclusiones apropiadas y la firma de cada estudiante.

## RESULTADO(S) OBTENIDO(S):

•	Para la primera parte de esta práctica, se logró crear un método propio de encriptación, el cual es el abecedario al revés y para los números, son caracteres especiales.
•	Se logro un correcto manejo y uso de la clase FileWriter y buferedWriter ya que estas fueron implementadas para la encriptación del texto escrito por un usuario.
•	Autoaprendizaje del “jFileChooser” para escoger archivos mucho más rápido y cómodo para el usuario, para no tener que escribir la ruta. 

## CONCLUSIONES:

En conclusión, esta practica primero ha sido de mucha ayuda para comprender mas a fondo sobre como escribir en archivos de texto, y como editarlos. Pero lo mas importante, es que primero leímos lo que un usuario quería escribir y lo encriptamos para que nadie pudiera leerlo. Otro punto a resaltar es que aprendimos a utilizar un herramienta muy útil para escoger en donde queremos crear o editar un texto: jFileChooser. Para lo que tuvimos que investigar entre mi compañero y mi persona y lo cual fue muy eficaz.  

## RECOMENDACIONES:

Tenemos solamente una recomendación, es que en la descripción de la practica realizada, no decía nunca crearse dos repositorios ni dos proyectos, por lo que perdimos un poco de tiempo figurando como hacer esa parte.

## *Firma John Farez:

![Firma](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica05/firma%202.png)

## *Firma Adolfo Jara:

![Firma2](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica05/firma%20electronica.jpg)





