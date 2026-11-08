### a) ¿Qué es un @Controller o @RestController en Spring Boot, y qué diferencia hay entre ambos?

`@Controller` es una anotación de Spring que permite definir una clase encargada de recibir y procesar solicitudes HTTP. Generalmente se utiliza para devolver vistas o páginas web.

`@RestController` combina las funcionalidades de `@Controller` y `@ResponseBody`, permitiendo devolver directamente datos en el cuerpo de la respuesta HTTP, como JSON o texto plano. Es especialmente utilizado para desarrollar APIs REST.

### b) ¿Qué anotación se usa para mapear una petición GET a un método, y cómo se le indica la ruta (endpoint)?

Se utiliza la anotación `@GetMapping`, que permite asociar una petición HTTP GET con un método de un controlador.

La ruta se indica dentro de la anotación, por ejemplo:

```java
@GetMapping("/api/dinosaurios")
public String obtenerDinosaurios() {
    return "Información de dinosaurios";
}
```

En este caso, el endpoint es `/api/dinosaurios`.

### c) ¿Qué puerto usaste en tu VPS y por qué tuviste que definirlo manualmente en vez de dejar el que viene por defecto?

Utilicé el puerto **8081** en mi VPS. Fue necesario definirlo manualmente para evitar conflictos con el puerto 8080, que es el puerto predeterminado de Spring Boot.

Para configurarlo ejecuté la aplicación con el siguiente comando:

```bash
nohup java -jar springbootactividad-0.0.1-SNAPSHOT.jar --server.port=8081 > aplicacion.log 2>&1 &
```

### d) Pega el enlace de tu repositorio de GitHub y el link de tu proyecto ya corriendo en el VPS.

**Repositorio de GitHub:**

https://github.com/HealedTick04/RGFact1_t4

**Proyecto desplegado en el VPS:**

http://179.197.87.188:8081/api/dinosaurios

Otros endpoints:

- http://179.197.87.188:8081/api/frase
- http://179.197.87.188:8081/api/proyecto