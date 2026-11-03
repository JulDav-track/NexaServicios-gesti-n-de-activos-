## 4.1 Script SQL (DDL)

*[Instrucción para el equipo: el script completo, imagen exacta del Modelo Relacional de 3.2. También se incluye en la raíz del repositorio. Esta nota se elimina al diligenciar la sección.]*



### Tabla Rol

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
|:---|:---|:---|:---:|:---:|:---|
| ID_Rol | Identificador único del rol | INT | 11 | Sí | PK |
| Nombre_Rol | asignación de rol | Enum (Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente.) | - | Sí | Valores Fijos |
| Descripcion | Sobre lo que trata el rol asignado | Varchar | 100 | Sí | - |
