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

Desde la carpeta `Laboratorio1/reto4`:

```bash
javac Reto4.java
java Reto4

===== SALIDA TESORO =====
Clave: DIAMANTE | Valor: 10
Clave: ESMERALDA | Valor: 6
Clave: ORO | Valor: 12
Clave: PLATA | Valor: 8
Clave: RUBÍ | Valor: 4

### Reto 5: Historial y revertir cambios
**Evidencia:**
Captura de imagen

**Descripción:**
Explicación del uso del historial de commits y del procedimiento para revertir cambios en el repositorio.

---

### Reto 6: Etiquetas y versiones
**Evidencia:**
Captura de imagen

**Descripción:**
Descripción del uso de etiquetas (tags) en Git para marcar versiones importantes del proyecto.

---

## Preguntas teóricas
- **Pregunta 1:**
  Respuesta...
