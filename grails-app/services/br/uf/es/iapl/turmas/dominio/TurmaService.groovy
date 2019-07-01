package br.uf.es.iapl.turmas.dominio

import grails.gorm.services.Service

@Service(Turma)
interface TurmaService {

    Turma get(Serializable id)

    List<Turma> list(Map args)

    Long count()

    void delete(Serializable id)

    Turma save(Turma turma)

    static class Adapter implements EntityService<Turma> {
        @Delegate
        TurmaService service
    }
}
