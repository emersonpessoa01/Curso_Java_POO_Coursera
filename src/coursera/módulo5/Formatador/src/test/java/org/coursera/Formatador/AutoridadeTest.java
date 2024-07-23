package org.coursera.Formatador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutoridadeTest {
    @Test
    public void testInformal() {
        FormatadorNome informal = new Informal();
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", informal);
        assertEquals("Pedro", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoMasculino() {
        FormatadorNome respeitoso = new Respeitoso(true);
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", respeitoso);
        assertEquals("Sr. Cabral", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoFeminino() {
        FormatadorNome respeitoso = new Respeitoso(false);
        Autoridade autoridade = new Autoridade("Maria", "Silva", respeitoso);
        assertEquals("Sra. Silva", autoridade.getTratamento());
    }

    @Test
    public void testComTitulo() {
        FormatadorNome comTitulo = new ComTitulo("Magnífico");
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", comTitulo);
        assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
    }
}
