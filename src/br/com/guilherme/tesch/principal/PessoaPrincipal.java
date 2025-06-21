package br.com.guilherme.tesch.principal;

import br.com.guilherme.tesch.modelos.Pessoa;

public class PessoaPrincipal {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa("Guilherme da Silva Tesch", 21, 1.79,true);

        System.out.printf("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                É estudante: %b
                """,pessoa.getNome(),pessoa.getIdade(),pessoa.getAltura(),pessoa.isAluno());
    }
}
