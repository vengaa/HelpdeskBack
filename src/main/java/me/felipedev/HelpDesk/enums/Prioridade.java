package me.felipedev.HelpDesk.enums;

public enum Prioridade {

    BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

    private Integer código;
    private String descricao;

    Prioridade(Integer código, String descricao) {
        this.código = código;
        this.descricao = descricao;
    }

    public Integer getCódigo() {
        return código;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridade toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Prioridade x : Prioridade.values()) {
            if (cod.equals(x.getCódigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
