package br.uf.es.iapl.turmas.dominio

class Professor extends Usuario {

    String especialidade

    static constraints = {
        especialidade nullable: false
    }

}
