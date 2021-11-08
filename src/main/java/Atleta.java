public class Atleta {

    private String nome;
    private AtletaEstado estado;

    public Atleta() {
        this.estado = (AtletaEstado) AtletaEstadoRegistrado.getInstance();
    }

    public void setEstado(AtletaEstado estado) {
        this.estado = estado;
    }

    public String registrar() {
        return estado.registrar(this);
    }

    public String premiar() {
        return estado.premiar(this);
    }

    public String suspenso() {
        return estado.suspenso(this);
    }

    public String banir() {
        return estado.banir(this);
    }

    public String lesionado() {
        return estado.lesionado(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AtletaEstado getEstado() {
        return estado;
    }
}

