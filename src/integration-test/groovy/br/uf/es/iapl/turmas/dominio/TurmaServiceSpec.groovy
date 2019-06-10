package br.uf.es.iapl.turmas.dominio

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TurmaServiceSpec extends Specification {

    TurmaService turmaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Turma(...).save(flush: true, failOnError: true)
        //new Turma(...).save(flush: true, failOnError: true)
        //Turma turma = new Turma(...).save(flush: true, failOnError: true)
        //new Turma(...).save(flush: true, failOnError: true)
        //new Turma(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //turma.id
    }

    void "test get"() {
        setupData()

        expect:
        turmaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Turma> turmaList = turmaService.list(max: 2, offset: 2)

        then:
        turmaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        turmaService.count() == 5
    }

    void "test delete"() {
        Long turmaId = setupData()

        expect:
        turmaService.count() == 5

        when:
        turmaService.delete(turmaId)
        sessionFactory.currentSession.flush()

        then:
        turmaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Turma turma = new Turma()
        turmaService.save(turma)

        then:
        turma.id != null
    }
}
