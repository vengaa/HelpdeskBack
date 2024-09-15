package me.felipedev.HelpDesk.enums;

public enum Status {

    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer código;
    private String descricao;

    Status(Integer código, String descricao) {
        this.código = código;
        this.descricao = descricao;
    }

    public Integer getCódigo() {
        return código;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Status x : Status.values()) {
            if (cod.equals(x.getCódigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
