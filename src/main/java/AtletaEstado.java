public interface AtletaEstado {

    String getEstado();

    String registrar(Atleta Atleta);

    String premiar(Atleta Atleta);

    String suspenso(Atleta Atleta);

    String banir(Atleta Atleta);

    String lesionado(Atleta Atleta);

}
