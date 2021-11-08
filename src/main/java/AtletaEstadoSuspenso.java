public class AtletaEstadoSuspenso {
    private AtletaEstadoSuspenso() {};
    private static AtletaEstadoSuspenso instance = new AtletaEstadoSuspenso();
    public static AtletaEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Registrado ";
    }

    public String registrar(Atleta atleta) {
        return "Registro não realizad";
    }

    public String premiar(Atleta atleta) {
        return "Premiação realizada";
    }

    public String suspenso(Atleta atleta) {
        return "Atleta suspenso ";
    }

    public String banir(Atleta atleta) {
        atleta.setEstado((AtletaEstado) AtletaEstadoBanido.getInstance());
        return "Atleta banido";
    }

    public String lesionado(Atleta atleta) {
        atleta.setEstado((AtletaEstado) AtletaEstadoLesionado.getInstance());
        return "Atleta Lesionado";
    }
}
