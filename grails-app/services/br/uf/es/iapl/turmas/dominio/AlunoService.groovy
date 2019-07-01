package br.uf.es.iapl.turmas.dominio

import grails.gorm.services.Service

@Service(Aluno)
interface AlunoService {

    Aluno get(Serializable id)

    List<Aluno> list(Map args)

    Long count()

    void delete(Serializable id)

    Aluno save(Aluno aluno)

    static class Adapter implements EntityService<Aluno> {
        @Delegate
        AlunoService service
    }
}
