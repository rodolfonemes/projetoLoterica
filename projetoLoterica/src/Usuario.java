
public class Usuario {

    //Atributos
    private String nome;
    private String usuario;
    private String senha;
    private boolean trocaSenha;
    private String rg;
    private String ctts;
    
    

    public Usuario() {
        this.nome = "";
        this.usuario = "";
        this.senha = "";
        this.trocaSenha = false;
        this.rg = "";
        this.ctts = "";

    }

    public Usuario(String nome, String usuario, String senha, boolean trocaSenha, String rg, String ctts) {
        this.nome = "";
        this.usuario = "";
        this.senha = "";
        this.trocaSenha = false;
        this.rg = "";
        this.ctts = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isTrocaSenha() {
        return trocaSenha;
    }

    public void setTrocaSenha(boolean trocaSenha) {
        this.trocaSenha = trocaSenha;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCtts() {
        return ctts;
    }

    public void setCtts(String ctts) {
        this.ctts = ctts;
    }
}
