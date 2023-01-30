#Prueba Java
##Arquitectura


El desarrollo se realizó utilizando arquitectura con el patrón MVC, teniendo en cuenta que este modelo tiene la ventaja de tener una fácil organización ya que cuenta con tres componentes, es un patrón que se adapta de manera fácil a diferentes frameworks, es escalable, se decidió utilizar este tipo de arquitectura debido a que el problema a resolver se puede manejar fácilmente con este patrón, cabe resaltar que a nivel organizacional una arquitectura hexagonal es la mejor opción sin embargo para que el ejercicio fuera fácilmente interpretado de realizó con mvc.


Estructura del proyecto

Paquete Controller: En este paquete se encuentra la clase del controlador utilizada para mantener la comunicación entre la capa de datos y la lógica de negocio.

Paquete Model: En este paquete se encuentran dos paquetes más, Entity en el cual se encuentran las clases de las entidades utilizadas en el desarrollo, Prices (Contiene información principal solicitada por el cliente según el requerimiento) y la entidad Brand (Contiene información de la marca relacionada al producto, se decidió la creación de esta tabla para manejar una normalización correspondiente como buena práctica). Por otro lado encontramos el paquete Repository en el cual se encuentra la interfaz que permite la persistencia de datos con JPA.

Paquete Service: En este paquete se encuentra la clase del servicio, el cual contiene toda la lógica de negocio solicitada, manteniendo los principios SOLID, para buenas prácticas como se puede evidenciar, cuenta con diferentes métodos que permiten que cada uno tenga una sola responsabilidad lo cual hace al aplicativo más escalable.

Paquete Dto: En este paquete se encuentra la clase Request Params, que es utilizada para definir los atributos que serán utilizados como parámetros para la petición GET que se requiere, este patrón permite crear un objeto para que puedan ser recuperados por el servidor.

Paquete Wrapper: En este paquete se define la estructura de la respuesta esperada por el cliente, con los campos específicos que fueron solicitados en la clase Response.

##Tecnología utilizada

Framework Springboot para construcción de lógica de negocio
JPA para persistencia de datos
H2 para almacenamiento de datos
Maven para gestión de dependencias
Junit para creación de test unitarios
Git para control de versiones
