public class AtletaPremiado implements AtletaEstado {
    private AtletaPremiado() {};
    private static AtletaPremiado instance = new AtletaPremiado();
    public static AtletaPremiado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Premiado";
    }

    public String registrar(Atleta atleta) {
        return "Registro não realizado";
    }

    public String premiar(Atleta atleta) {
        return "Formatura não realizada";
    }

    public String suspenso(Atleta atleta) {
        return "Suspensão não realizada";
    }

    public String banir(Atleta atleta) {
        return "Banimento não realizado";
    }
    public String lesionado(Atleta atleta) {
        return "Não Lesionado ";
    }


}
