package org.coursera.calculo_imc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PacienteTest {

    @Test
    public void testCalcularIMC() {
        Paciente paciente1 = new Paciente(70, 1.75);
        Paciente paciente2 = new Paciente(85, 1.80);
        Paciente paciente3 = new Paciente(95, 1.60);

        assertEquals(22.86, paciente1.calcularIMC(), 0.01);
        assertEquals(26.23, paciente2.calcularIMC(), 0.01);
        assertEquals(37.11, paciente3.calcularIMC(), 0.01);
    }

    @Test
    public void testDiagnostico() {
        Paciente paciente1 = new Paciente(70, 1.75);
        Paciente paciente2 = new Paciente(85, 1.80);
        Paciente paciente3 = new Paciente(95, 1.60);

        assertEquals("Peso normal", paciente1.diagnostico());
        assertEquals("Sobrepeso", paciente2.diagnostico());
        assertEquals("Obesidade grau II", paciente3.diagnostico());
    }
}
