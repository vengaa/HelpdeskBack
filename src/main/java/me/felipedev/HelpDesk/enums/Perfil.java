package me.felipedev.HelpDesk.enums;

public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer código;
    private String descricao;

    Perfil(Integer código, String descricao) {
        this.código = código;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return código;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
