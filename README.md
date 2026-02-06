# Maratón Git 2026-1

## Integrantes
- Rafael Moreno
- Cristian Gonzalez

---

## Retos completados

### Reto 1: La Bienvenida

### Objetivo
Crear un mensaje de bienvenida usando Java, almacenando los estudiantes en una lista y utilizando programación funcional con `stream()`, `map()` y `lambda`.

### Ejecución
Desde la carpeta `Laboratorio1/reto1`:

bash
javac Estudiante.java Reto1.java
java Reto1

**Evidencia:**
¡Hola, bienvenidos! Nosotros somos la pareja conformada por Rafael Moreno, estudiante de 6° semestre, 21 años y Crisian Gonzales, estudiante de 7° semestre, 22 años. Nuestros correos institucionales son rafael.moreno-v@mail.escuelaing.edu.co y critian.gonzalez-r@mail.escuelaing.edu.co.

### Reto 2: Commit colaborativo

## Objetivo
Simular trabajo colaborativo en paralelo mediante el uso de ramas, subramas (carriles), expresiones lambda en Java y resolución de conflictos de merge.

## Ejecución

desde la carpeta 'Laboratorio1/reto2':

javac CarreraParalela.java
java CarreraParalela



## Evidencia:

d432488 (HEAD -> feature/reto2_carril_uno_GonzalezCristian_2026-1, origin/feature/reto2_carril_uno_GonzalezCristian_2026-1) Merge remote-tracking branch 'origin/feature/reto_2_MorenoRafael_2026-1' into feature/reto2_carril_uno_GonzalezCristian_2026-1
7d40530 Fix:se arreglo resultados
04fd376 (origin/feature/reto_2_MorenoRafael_2026-1) Merge branch 'feature/reto2_carril_dos_MorenoRafael_2026-1' into feature/reto_2_MorenoRafael_2026-1
aa061ad (origin/feature/reto2_carril_dos_MorenoRafael_2026-1) feat: carril 2 completa tercer choque y gran meta
4dbf29d feat: agrega ternario par/impar para cantidad

Resultado Al Correr Codigo:
ResultadosDoble{lista1=Resultados{max=9, min=2, cantidad=4, maxEsMultiploDe2=NO, maxEsDivisorDe2=NO, cantidadParImpar=PAR}, lista2=Resultados{max=8, min=1, cantidad=3, maxEsMultiploDe2=SI, maxEsDivisorDe2=NO, cantidadParImpar=IMPAR}}

## Descripción:
Se creó una rama feature del reto desde la cual nosotros generamos subramas (carriles) para implementar funcionalidades despues, los cambios fueron integrados mediante merges sucesivos, resolviendo conflictos generados intencionalmente.

### Reto 3: El eco misterioso (Resolución de conflictos)

### Objetivo
Implementar dos soluciones independientes usando `StringBuilder` y `StringBuffer`, generar un conflicto al crear un método con el mismo nombre y resolverlo correctamente mediante un merge.

---

### Desarrollo

Se partió desde la rama base:

feature/reto3  

Cada integrante trabajó en su subrama:

- feature/reto3_builder_MorenoRafael_2025-2  
  Implementa un método que repite un mensaje tres veces usando `StringBuilder`.

- feature/reto3_buffer_GonzalezCristian_2025-2  
  Implementa un método que invierte un mensaje usando `StringBuffer`.

Posteriormente, ambos crearon un método con el mismo nombre que combinaba las dos transformaciones (repetir tres veces y luego invertir), lo cual provocó un conflicto al fusionar las ramas.

---

### Conflicto presentado

Al realizar el merge de las subramas hacia `feature/reto3`, Git detectó conflicto porque ambos estudiantes habían creado un método con el mismo nombre pero con implementaciones diferentes.

---

### Resolución del conflicto

Se abrió el archivo en conflicto, se analizaron ambas implementaciones y se creó una versión final que:

1. Repite el mensaje 3 veces usando `stream()`.
2. Concatena usando `StringBuilder`.
3. Invierte el resultado con `StringBuffer`.
4. Invoca el método usando una expresión lambda.

---

### Evidencia (historial)
PS C:\Users\RafaelMoreno\Downloads\DOSW_Lab1_GonzalezMoreno> git log --oneline --graph --decorate --all
:...skipping...
* 1b5dde3 (HEAD -> feature/reto3, origin/feature/reto3) Reto#3 culminado
*   cbb6f46 Merge remote-tracking branch 'origin/feature/reto3_buffer_GonzalezCristian_2025-2' into feature/reto3
|\
| | * 7990f06 feat: agrega ternarios multiplo/divisor de 2 para max
| * | 72243d1 fix: resuelve conflicto primer choque reto 2
| * |   0cd4ec6 Merge remote-tracking branch 'origin/feature/reto2_carril_uno_GonzalezCristian_2026-1' into feature/reto_2_MorenoRafael_2026-1
| |\ \
| * | | df4a54a feat: agrego lo de  Resultados y obtenerResultados
* | | | 7d40530 Fix:se arreglo resultados
|/| |
:...skipping...
* 1b5dde3 (HEAD -> feature/reto3, origin/feature/reto3) Reto#3 culminado
*   cbb6f46 Merge remote-tracking branch 'origin/feature/reto3_buffer_GonzalezCristian_2025-2' into feature/reto3
|\
| * e42fce1 (origin/feature/reto3_buffer_GonzalezCristian_2025-2) feat(reto3): realizamos ecoBufferReverse
* | b950e1a (origin/feature/reto3_builder_MorenoRafael_2025-2, feature/reto3_builder_MorenoRafael_2025-2) feat: Mensaje con StringBuilder
|/
* 7fd5d7c (origin/feature/reto_2_MorenoRafael_2026-1, origin/feature/reto_2_GonzalezCristian_2026-1, origin/feature/reto2_carril_uno_GonzalezCristian_2026-1, origin/develop, feature/reto_2_MorenoRafael_2026-1, develop) Reto#2 culminado
* 8365861 docs: evidencia Reto 2
*   d432488 Merge remote-tracking branch 'origin/feature/reto_2_MorenoRafael_2026-1' into feature/reto2_carril_uno_GonzalezCristian_2026-1
|\
| *   04fd376 Merge branch 'feature/reto2_carril_dos_MorenoRafael_2026-1' into feature/reto_2_MorenoRafael_2026-1
| |\
| | * aa061ad (origin/feature/reto2_carril_dos_MorenoRafael_2026-1, feature/reto2_carril_dos_MorenoRafael_2026-1) feat: carril 2

### Reto 4: El tesoro de las llaves duplicadas

### Objetivo
Implementar el uso de HashMap y Hashtable para almacenar pares clave-valor, manejar llaves duplicadas, provocar un conflicto de merge y resolverlo dejando una versión final que combine ambas estructuras usando programación funcional.

---

### Desarrollo

Se creó la rama base:

feature/reto4

Cada integrante trabajó desde una subrama:

- Estudiante A:
  Implementó un método que recibe una lista de pares (String, Integer) y los almacena en un HashMap, ignorando claves duplicadas y conservando el primer valor encontrado.

- Estudiante B:
  Implementó el mismo método pero usando Hashtable, garantizando sincronización.

Posteriormente, ambos crearon un método con el mismo nombre que recibe ambos mapas y los combina en uno solo, priorizando los valores provenientes del Hashtable, lo que generó un conflicto durante el merge.

Luego:

- Estudiante A añadió una función que convierte todas las claves a mayúsculas antes de imprimir.
- Estudiante B añadió una función que ordena las claves de forma ascendente antes de imprimir.

Finalmente, en la rama feature se dejó una única función mejorada que:

- Combina HashMap y Hashtable.
- Prioriza valores del Hashtable.
- Convierte claves a mayúsculas.
- Ordena alfabéticamente.
- Imprime usando streams, lambdas y Collectors.toMap().

---

### Evidencia de ejecución
javac Reto4.java
java Reto4

===== SALIDA TESORO =====
Clave: DIAMANTE | Valor: 10
Clave: ESMERALDA | Valor: 6
Clave: ORO | Valor: 12
Clave: PLATA | Valor: 8
Clave: RUBÍ | Valor: 4

### Reto 5: Batalla de Conjuntos

### Objetivo
Aplicar el uso de HashSet y TreeSet, eliminar elementos según condiciones, provocar un conflicto de merge y resolverlo, dejando una versión final que una ambas colecciones ordenadas sin duplicados utilizando programación funcional.

---

### Desarrollo

Se creó la rama base:

feature/reto5

Cada integrante trabajó desde su subrama:

- Estudiante A:
  Implementó un método que genera un HashSet con números aleatorios y elimina los múltiplos de 3.

- Estudiante B:
  Implementó un método que genera un TreeSet con números aleatorios en orden ascendente y elimina los múltiplos de 5.

Posteriormente, ambos crearon un método con el mismo nombre que unía ambas colecciones en una sola estructura ordenada, lo que generó un conflicto durante el merge.

El conflicto fue resuelto dejando una versión final que:

- Une HashSet y TreeSet.
- Elimina duplicados.
- Ordena los números.
- Filtra usando stream().filter().
- Imprime resultados usando expresiones lambda.

---

### Evidencia de ejecución
javac Reto5.java
java Reto5

Número en arena: 3
Número en arena: 4
Número en arena: 5
Número en arena: 7
Número en arena: 10
Número en arena: 12
Número en arena: 18



### Reto 6: La máquina de decisiones

### Objetivo
Implementar una máquina de comandos utilizando switch-case y un Map<String, Runnable> con lambdas, provocando un conflicto de merge y resolviéndolo con una versión unificada.

---

### Desarrollo

Se creó la rama base:

feature/reto6

Cada integrante trabajó desde su subrama:

- Estudiante A:
  Implementó comandos: SALUDAR, DESPEDIR, CANTAR, DANZAR.

- Estudiante B:
  Implementó comandos: BROMEAR, GRITAR, SUSURRAR, ANALIZAR.

Posteriormente, ambos crearon métodos con el mismo nombre para ejecutar comandos, lo que generó un conflicto durante el merge.

El conflicto fue resuelto dejando un solo switch-case unificado que ejecuta acciones almacenadas en un Map<String, Runnable> mediante expresiones lambda.

---

### Evidencia de ejecución
javac Reto6.java
java Reto6

La máquina dice: ¡Saludos, viajero del tiempo y del código!
La máquina dice: Que los bits te acompañen, hasta la próxima misión.
La máquina canta: 01010101
La máquina gira y emite chispas: Girando en modo fiesta.
La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio?
La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!
La máquina susurra: Shhh? los bugs están dormidos
La máquina procesa: Analizando datos? resultado: ¡Eres increíble programando!
Comando desconocido: HACKEAR

## Preguntas teóricas
## Respuestas
1. ¿Cuál es la diferencia entre git merge y git rebase?
La diferencia principal es que git merge une dos ramas conservando el historial original y normalmente crea un commit de merge, mientras que git rebase reescribe la historia moviendo mis commits encima de otra rama para mantener un historial más lineal y limpio.

2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
Si ambas ramas modifican exactamente la misma línea, Git no puede decidir automáticamente cuál cambio conservar y se produce un conflicto. En ese caso debo resolverlo manualmente editando el archivo, elegir o combinar los cambios, hacer git add y luego confirmar el merge con un commit.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Puedo usar el siguiente comando:
git log --oneline --graph --decorate --all
Esto muestra el historial con una representación gráfica de ramas y merges.

4. Explica la diferencia entre un commit y un push.
Un commit guarda los cambios en mi repositorio local, creando un punto en el historial. Un push envía esos commits al repositorio remoto para que otros puedan verlos o trabajar sobre ellos.

5. ¿Para qué sirven git stash y git pop?
Uso git stash para guardar temporalmente cambios sin hacer commit, por ejemplo cuando necesito cambiar de rama rápidamente. Luego uso git stash pop para recuperar esos cambios y volver a aplicarlos en mi working directory.

6. ¿Qué diferencia hay entre HashMap y HashTable?
La principal diferencia es que HashMap no es sincronizado y por lo general es más rápido, mientras que Hashtable es sincronizado (thread-safe), lo que lo hace más seguro en entornos concurrentes pero un poco más lento.

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Me permite escribir código más declarativo y limpio usando streams. Además facilita transformar datos, aplicar filtros y manejar conflictos de claves con una función de merge, reduciendo código repetitivo comparado con un bucle tradicional.

8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Estoy realizando una transformación de datos, ya que map() convierte cada elemento del stream en otro valor o tipo diferente.

9. ¿Qué hace el método stream().filter() y qué retorna?
filter() evalúa cada elemento usando una condición y solo deja pasar los que la cumplen. Retorna un nuevo Stream con los elementos filtrados.

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
Primero me cambio a la rama develop, luego traigo los cambios más recientes, y después creo una nueva rama feature basada en develop:
git checkout develop
git pull origin develop
git checkout -b feature/nueva_funcionalidad

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
git branch solo crea la rama pero no me cambia a ella. En cambio, git checkout -b crea la rama y me mueve automáticamente a esa nueva rama.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
Porque así podemos trabajar de forma aislada sin afectar la rama principal. Esto permite hacer pruebas, revisiones y merges controlados, evitando errores en producción y facilitando el trabajo colaborativo.