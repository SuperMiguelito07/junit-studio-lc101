# Plan de Pruebas para la Función de Corchetes Equilibrados

## Casos de Prueba

1. **Solo Corchetes Devuelven Verdadero**
   - **Entrada:** `[]`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados 

2. **Se Permiten Corchetes Anidados**
   - **Entrada:** `"[Launch[Code]]"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados

3. **Los Corchetes Deben Seguir el Orden de Apertura y Cierre**
   - **Entrada:** `"Launch]Code["`
   - **Salida Esperada:** `false`
   - **Explicación:** La entrada tiene corchetes desordenados y no están en el orden correcto de apertura y cierre.

4. **Cadena Vacía**
   - **Entrada:** `""`
   - **Salida Esperada:** `true`
   - **Explicación:** Se considera que una cadena vacía tiene corchetes equilibrados.

5. **Caracteres que no son Corchetes**
   - **Entrada:** `"¡Launch[Code] es asombroso!"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.

6. **Corchete Único**
   - **Entrada:** `"[LaunchCode"`
   - **Salida Esperada:** `false`
   - **Explicación:** Hay un único corchete de apertura sin un corchete de cierre.

7. **Múltiples Corchetes Anidados**
   - **Entrada:** `"[Launch[Code[Is]Awesome]]"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.

8. **Corchetes con Otros Caracteres**
   - **Entrada:** `"[Laun]chC[ode]"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.

9. **Emparejamiento Incorrecto de Corchetes**
   - **Entrada:** `"[Launch[Code]]]"`
   - **Salida Esperada:** `false`
   - **Explicación:** Hay un corchete de cierre de mas sin un corchete de apertura.

10. **Corchetes Equilibrados al Principio y al Final**
   - **Entrada:** `"[Launch]Code"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.

11. **Corchetes con Otros Caracteres y Espacios**
   - **Entrada:** `"[Lau n]chC[o de]"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.

12. **Corchetes con Caracteres Especiales**
   - **Entrada:** `"[L[aun!#]chCo*&@de]"`
   - **Salida Esperada:** `true`
   - **Explicación:** Contiene corchetes y estan equilibrados.