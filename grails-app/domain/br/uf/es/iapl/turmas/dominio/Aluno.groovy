package br.uf.es.iapl.turmas.dominio

import grails.rest.Resource

@Resource(uri = 'api/alunos')
class Aluno extends Usuario {

    String curso

    static constraints = {
        curso nullable: true
    }

}
