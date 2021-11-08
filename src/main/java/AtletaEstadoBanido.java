public class AtletaEstadoBanido {
    private AtletaEstadoBanido() {};
    private static AtletaEstadoBanido instance = new AtletaEstadoBanido();
    public static AtletaEstadoBanido getInstance() {
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
        return "Atleta banido";
    }

    public String lesionado(Atleta atleta) {
        return "Atleta Lesionado";
    }
}
