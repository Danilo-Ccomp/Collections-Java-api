    package List.Ordenação;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class OrdenaçãoPessoa {
        private List<Pessoa> listaPessoas;

        public OrdenaçãoPessoa(){
            listaPessoas = new ArrayList<>();
        }

        public void adicionarPessoa(String nome, int idade, double altura){
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            listaPessoas.add(pessoa);
        }

        public List<Pessoa> ordenarPorIdade(){
            List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }

        public List<Pessoa> ordenarPorAltura(){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
            Collections.sort(pessoasPorAltura, new ComparatorAltura());
            return pessoasPorAltura;
        }
    }
