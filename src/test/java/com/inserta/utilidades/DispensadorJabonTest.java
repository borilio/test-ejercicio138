package com.inserta.utilidades;

import org.junit.Test;

import static org.junit.Assert.*;

public class DispensadorJabonTest {

    /**
     * La prueba unitaria dará correcto si se cumplen las 3 condiciones.
     * <ul>
     *     <li>La marca no es null</li>
     *     <li>Está apagado</li>
     *     <li>El depósito está vacío</li>
     * </ul>
     */
    @Test
    public void creacionPorDefecto(){
        DispensadorJabon jabonera = new DispensadorJabon();
        assertNotNull("La marca es null", jabonera.getMarca());
        assertTrue("La jabonera no está apagada", jabonera.isApagado());
        assertTrue("La jabonera no está vacía", jabonera.estaVacio());
    }

    /**
     * Hacer una prueba unitaria para comprobar el dispensador se apaga automáticamente al llegar al 0% de batería
     */


    /**
     * Hacer una prueba unitaria para comprobar el dispensador se apaga automáticamente al encenderlo muchas veces
     */


    /**
     * Hacer una prueba unitaria para comprobar el dispensador se apaga automáticamente si se queda sin batería
     * al dispensar muchas veces.
     */





}