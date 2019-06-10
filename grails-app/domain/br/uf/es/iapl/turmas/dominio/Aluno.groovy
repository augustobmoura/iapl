package br.uf.es.iapl.turmas.dominio

class Aluno extends Usuario {

    String curso

    static constraints = {
        curso nullable: true
    }

}
