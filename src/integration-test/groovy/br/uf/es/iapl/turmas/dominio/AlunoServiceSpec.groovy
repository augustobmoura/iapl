package br.uf.es.iapl.turmas.dominio

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AlunoServiceSpec extends Specification {

    AlunoService alunoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Aluno(...).save(flush: true, failOnError: true)
        //new Aluno(...).save(flush: true, failOnError: true)
        //Aluno aluno = new Aluno(...).save(flush: true, failOnError: true)
        //new Aluno(...).save(flush: true, failOnError: true)
        //new Aluno(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //aluno.id
    }

    void "test get"() {
        setupData()

        expect:
        alunoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Aluno> alunoList = alunoService.list(max: 2, offset: 2)

        then:
        alunoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        alunoService.count() == 5
    }

    void "test delete"() {
        Long alunoId = setupData()

        expect:
        alunoService.count() == 5

        when:
        alunoService.delete(alunoId)
        sessionFactory.currentSession.flush()

        then:
        alunoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Aluno aluno = new Aluno()
        alunoService.save(aluno)

        then:
        aluno.id != null
    }
}
