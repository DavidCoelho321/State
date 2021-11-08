import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    Atleta Atleta;

    @BeforeEach
    public void setUp() {
        atleta = new Atleta();
    }


    @Test
    public void naoDevecularRegistradoAtletaRegistrado() {
        atleta.setEstado(AtletaEstadoRegistrado.getInstance());
        assertEquals("Registro não realizada", atleta.registrado());
    }

    @Test
    public void devePremiarAtletaRegistrado() {
        atleta.setEstado(AtletaEstadoRegistrado.getInstance());
        assertEquals("Premiasão realizada", atleta.premiar());
    }

    @Test
    public void devePremiarAtletaRegistrado() {
        atleta.setEstado(AtletaEstadoRegistrado.getInstance());
        assertEquals("Suspensão realizada", atleta.suspenso());
    }

    @Test
    public void devePremiarAtletaRegistrado() {
        atleta.setEstado(AtletaEstadoRegistrado.getInstance());
        assertEquals("Banimento realizado", atleta.banido());
    }

    @Test
    public void devePremiarAtletaRegistrado() {
        atleta.setEstado(AtletaEstadoRegistrado.getInstance());
        assertEquals("Não Lesionado", atleta.lesionado());
    }


    @Test
    public void deveRegistrarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertEquals("Registro realizada", atleta.Registrado());
    }

    @Test
    public void naoDevePremiarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertEquals("Premiasão não realizada", atleta.premiar());
    }

    @Test
    public void naoDeveSuspensoAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertEquals("Suspensão não realizada", atleta.suspenso());
    }

    @Test
    public void deveBanidoAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertEquals("Banimento realizado", atleta.banido());
    }

    @Test
    public void deveLesionadoAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertEquals("Não Lesionado", atleta.lesionado());
    }



    @Test
    public void naoDevecularRegistradoAtletaPremiado() {
        atleta.setEstado(AlunoEstadoPremiado.getInstance());
        assertEquals("Registro não realizada", atleta.Registrado());
    }

    @Test
    public void naoDevePremiarAtletaPremiado() {
        atleta.setEstado(AlunoEstadoPremiado.getInstance());
        assertEquals("Premiasão não realizada", atleta.premiar());
    }

    @Test
    public void naoDeveSuspensoAtletaPremiado() {
        atleta.setEstado(AlunoEstadoPremiado.getInstance());
        assertEquals("Suspensão não realizada", atleta.suspenso());
    }

    @Test
    public void naoDeveBanidoAtletaPremiado() {
        atleta.setEstado(AlunoEstadoPremiado.getInstance());
        assertEquals("Banimento não realizado", atleta.banido());
    }

    @Test
    public void naoDeveLesionadoAtletaPremiadoo() {
        atleta.setEstado(AlunoEstadoPremiado.getInstance());
        assertEquals("Não Lesionado", atleta.lesionado());
    }



    @Test
    public void naoDeveRegistradoAtletaBanido() {
        atleta.setEstado(AlunoEstadoBanido.getInstance());
        assertEquals("Registro não realizada", atleta.Registrado());
    }

    @Test
    public void naoDevePremiarAtletaBanido() {
        atleta.setEstado(AlunoEstadoBanido.getInstance());
        assertEquals("Premiasão não realizada", atleta.premiar());
    }

    @Test
    public void naoDeveSuspensoAtletaBanido() {
        atleta.setEstado(AlunoEstadoBanido.getInstance());
        assertEquals("Suspensão não realizada", atleta.suspenso());
    }

    @Test
    public void naoDeveBanidoAtletaBanido() {
        atleta.setEstado(AlunoEstadoBanido.getInstance());
        assertEquals("Banimento não realizado", atleta.banido());
    }

    @Test
    public void naoDeveLesionadoAtletaBanido() {
        atleta.setEstado(AlunoEstadoBanido.getInstance());
        assertEquals("Não Lesionado", atleta.lesionado());
    }



    @Test
    public void naoDeveRegistradoAtletaLesionado() {
        atleta.setEstado(AlunoEstadoLesionado.getInstance());
        assertEquals("Registro não realizada", atleta.registrado());
    }

    @Test
    public void naoDevePremiarAtletaLesionado() {
        atleta.setEstado(AlunoEstadoLesionado.getInstance());
        assertEquals("Premiasão não realizada", atleta.premiar());
    }

    @Test
    public void naoDeveSuspensoAtletaLesionado() {
        atleta.setEstado(AlunoEstadoLesionado.getInstance());
        assertEquals("Suspensão não realizada", atleta.suspenso());
    }

    @Test
    public void deveBanidoAtletaLesionado() {
        atleta.setEstado(AlunoEstadoLesionado.getInstance());
        assertEquals("Banimento realizado", atleta.banido());
    }

    @Test
    public void naoDeveLesionadoAtletaLesionado() {
        atleta.setEstado(AlunoEstadoLesionado.getInstance());
        assertEquals("Não Lesionado", atleta.lesionado());
    }


}