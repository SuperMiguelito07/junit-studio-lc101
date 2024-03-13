# Plan de Pruebas para la Función de Corchetes Equilibrados

## Casos de Prueba

1. **Solo Corchetes Devuelven Verdadero**
   - **Entrada:** `[]`
   - **Salida Esperada:** `true`
   - **Explicación:** La entrada contiene solo corchetes y están equilibrados.

2. **Se Permiten Corchetes Anidados**
   - **Entrada:** `"[Launch[Code]]"`
   - **Salida Esperada:** `true`
   - **Explicación:** La entrada contiene corchetes anidados que están equilibrados.

3. **Los Corchetes Deben Seguir el Orden de Apertura y Cierre**
   - **Entrada:** `"Launch]Code["`
   - **Salida Esperada:** `false`
   - **Explicación:** La entrada tiene corchetes desordenados; no están en el orden correcto de apertura y cierre.

4. **Cadena Vacía**
   - **Entrada:** `""`
   - **Salida Esperada:** `true`
   - **Explicación:** Se considera que una cadena vacía tiene corchetes equilibrados.

5. **Caracteres que no son Corchetes**
   - **Entrada:** `"¡Launch[Code] es asombroso!"`
   - **Salida Esperada:** `true`
   - **Explicación:** La entrada contiene caracteres que no son corchetes, pero los corchetes están equilibrados.
