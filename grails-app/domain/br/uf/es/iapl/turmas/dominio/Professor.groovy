package br.uf.es.iapl.turmas.dominio

import grails.rest.Resource

@Resource(uri = 'api/professores')
class Professor extends Usuario {

    String especialidade

    static constraints = {
        especialidade nullable: false
    }

}
