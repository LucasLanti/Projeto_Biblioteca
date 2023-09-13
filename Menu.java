import java.util.Scanner;
public class Menu{
    public static void chamarMenu(){
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x!=9){
            System.out.println("--Menu--");
            System.out.println("1) Adicionar ");
            System.out.println("2) Remover");
            System.out.println("3) Pesquisar");
            System.out.println("4) Copiar");
            System.out.println("5) Listar");
            System.out.println("6) Inserir Dados");
            System.out.println("---------------\n9) Sair");
            System.out.print("Digite uma opcao: ");
            x = Integer.parseInt(in.nextLine());
            switch(x){
                case 1: 
                    System.out.print("Nome do livro: ");
                    String nome = in.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = in.nextLine();
                    Livros.novoLivro(new AddLivro(nome, autor));
                    break;
                case 2:
                    Livros.listarLivros();
                    System.out.print("Qual livro deseja Excluir: ");
                    int indice = Integer.parseInt(in.nextLine());
                    Livros.excluirLivros(indice);
                    break;
                case 3:
                    System.out.print("Digite o nome do Livro: ");
                    nome = in.nextLine();
                    System.out.print("Digite o nome do Autor: ");
                    autor = in.nextLine();
                    Livros.procurarLivros(nome, autor);
                    break;
                case 4:
                    Livros.listarLivros();
                    System.out.print("Qual livro deseja Copiar: ");
                    indice = Integer.parseInt(in.nextLine());
                    Livros.copiarLivro(indice);
                    break;
                case 5:
                    Livros.listarLivros();
                    break;
                case 6:
                    Livros.listarLivros();
                    System.out.print("Qual livro deseja Inserir Dados: ");
                    indice = Integer.parseInt(in.nextLine());
                    System.out.print("Digite o numero de Paginas: ");
                    String paginas = in.nextLine();
                    System.out.print("Digite o Preco: ");
                    String preco = in.nextLine();
                    Livros.inserir(indice, paginas, preco);
                    break;
                case 9:
                    break;

                default: break;
            }
        }
        in.close();
    }
}
