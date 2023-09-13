class AddLivro{
    private String nome;
    private String autor;
    private String nPaginas;
    private String preco;
    public AddLivro(String nome, String autor){this.nome=nome; this.autor=autor; preco="null"; nPaginas="null";}
    public String getNome(){return nome;}
    public String getAutor(){return autor;}
    public void setnPaginas(String nPaginas){this.nPaginas=nPaginas;}
    public void setPreco(String preco){this.preco=preco;}
    public String getnPaginas(){return nPaginas;}
    public String getPreco(){return preco;}
}