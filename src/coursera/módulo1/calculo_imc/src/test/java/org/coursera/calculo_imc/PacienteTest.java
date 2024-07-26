package org.coursera.calculo_imc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PacienteTest {

    @Test
    public void testDiagnosticoBaixoPesoMuitoGrave() {
        Paciente paciente = new Paciente(40, 1.75);
        assertEquals("Baixo peso muito grave", paciente.diagnostico());// IMC = 13,06 (Baixo peso muito grave)
    }

    @Test
    public void testDiagnosticoBaixoPesoGrave() {
        Paciente paciente = new Paciente(49, 1.75); // IMC = 16.00 (Baixo peso grave)
        assertEquals("Baixo peso grave", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoBaixoPeso() {
        Paciente paciente = new Paciente(56, 1.75); // IMC = 16.98 (Baixo peso)
        assertEquals("Baixo peso", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoPesoNormal() {
        Paciente paciente = new Paciente(68, 1.75); // IMC = 22.2 (Peso normal)
        assertEquals("Peso normal", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoSobrepeso() {
        Paciente paciente = new Paciente(80, 1.75); // IMC = 26.12 (Sobrepeso)
        assertEquals("Sobrepeso", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoObesidadeGrauI() {
        Paciente paciente = new Paciente(95, 1.75); // IMC = 31.02 (Obesidade grau I)
        assertEquals("Obesidade grau I", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoObesidadeGrauII() {
        Paciente paciente = new Paciente(110, 1.75);// IMC = 35.92 (Obesidade grau II)
        assertEquals("Obesidade grau II", paciente.diagnostico());
    }

    @Test
    public void testDiagnosticoObesidadeGrauIII() {
        Paciente paciente = new Paciente(130, 1.75);//> // IMC = 42.45 (Obesidade grau III)
        assertEquals("Obesidade grau III (obesidade mórbida)", paciente.diagnostico());
    }
}


