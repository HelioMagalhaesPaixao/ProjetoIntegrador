package view;

public class ItenNota {
    public String codigo;
    public String nome;
    public double precoNota;
    public double precoAnotado;

    public ItenNota(String codigo, String nome, double precoNota, double precoAnotado) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoNota = precoNota;
        this.precoAnotado = precoAnotado;
    }
}
