import java.util.ArrayList;
class Livros{
    public static ArrayList<AddLivro> livros = new ArrayList<>();
    public static void novoLivro(AddLivro obj){
        livros.add(obj);
    }
    public static void copiarLivro(int indice){
        livros.add(livros.get(indice));
    }
    public static void listarLivros(){
        for(int i=0; i<livros.size();++i){
            System.out.println(i+") Nome: "+livros.get(i).getNome()+"| Autor: "+livros.get(i).getAutor()+
            "| Numero de Paginas: "+livros.get(i).getnPaginas()+"| Preco: "+livros.get(i).getPreco());
        }
    }
    public static void excluirLivros(int indice){
        livros.remove(indice);
    }
    public static void procurarLivros(String nome, String autor){
        int j = 0;
        for(int i=0; i<livros.size();++i){
            if(livros.get(i).getAutor().toLowerCase().equals(autor.toLowerCase()) &&
            livros.get(i).getNome().toLowerCase().equals(nome.toLowerCase())){
                System.out.println(i+") Nome: "+livros.get(i).getNome()+", Autor: "+livros.get(i).getAutor()+
                ", Numero de Paginas: "+livros.get(i).getnPaginas()+", Preco: "+livros.get(i).getPreco());
                ++j;
            }
        }
        if(j==0) {
            System.out.println("Livro não encontrado!");
        }
    }
    public static void inserir(int index, String nPaginas, String preco){
        livros.get(index).setnPaginas(nPaginas);
        livros.get(index).setPreco(preco);
    }
}