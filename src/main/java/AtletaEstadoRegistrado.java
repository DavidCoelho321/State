public class AtletaEstadoRegistrado {
    private AtletaEstadoRegistrado() {};
    private static AtletaEstadoRegistrado instance = new AtletaEstadoRegistrado();
    public static AtletaEstadoRegistrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Registrado ";
    }

    public String registrar(Atleta atleta) {
        return "Registro não realizad";
    }

    public String premiar(Atleta atleta) {
        atleta.setEstado(AtletaPremiado.getInstance());
        return "Premiação realizada";
    }

    public String suspenso(Atleta atleta) {
        atleta.setEstado((AtletaEstado) AtletaEstadoSuspenso.getInstance());
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
