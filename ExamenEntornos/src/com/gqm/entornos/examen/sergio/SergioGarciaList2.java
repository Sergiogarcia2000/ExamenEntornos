package com.gqm.entornos.examen.sergio;

/**
 * La siguiente interfaz describe dos métodos aplicables a un objeto de tipo java.util.List o un array de String.
 * Se pide:
 *  1.- Implementar los métodos
 *  2.- Realizar pruebas
 *  3.- Documentar las clases con Javadoc
 *  
 *  Se valorará la aplicación del estilo de código aprendido en clase.
 */
public interface SergioGarciaList2<String> {

	/**
	 * Returns the first half of the list in String array format
	 * @return half of the list
	 */
    String[] firstHalf();

    /**
     * Returns the length of the list
     * @return length
     */
    int length();
}
