package br.uf.es.iapl.turmas.dominio

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import grails.web.Action
import org.grails.datastore.gorm.GormEntity

@Transactional
abstract class RestController<T> {

    abstract EntityService<T> getService()

    abstract String getEntityDescription()

    abstract T empty()

    @Action
    def index() {
        render(service.list(params) as JSON)
    }

    @Action
    def show() {
        def id = params.id
        def o = service.get(id)

        if (o == null) {
            render(
                [status: 404, contentType: 'application/json'],
                [message: "Não encontrado $entityDescription com identificador $id"] as JSON,
            )
            return
        }

        render(o as JSON)
    }

    @Action
    def create() {
        GormEntity o = empty()
        bindData(o, request)

        if (!o.validate()) {
            render([status: 402, contentType: 'application/json'], o.errors as JSON)
            return
        }

        render(o.save() as JSON)
    }

    @Action
    def delete() {
        def id = params.id
        def o = service.get(id)

        if (o == null) {
            render(
                [status: 404, contentType: 'application/json'],
                [message: "Não encontrado $entityDescription com identificador $id"] as JSON,
            )
            return
        }

        o.delete()
        render(o as JSON)
    }

    @Action
    def update() {
        def id = params.id
        GormEntity o = service.get(id)

        if (o == null) {
            render(
                [status: 404, contentType: 'application/json'],
                [message: "Não encontrado $entityDescription com identificador $id"] as JSON,
            )
            return
        }

        bindData(o, request)

        if (!o.validate()) {
            render([status: 402, contentType: 'application/json'], o.errors as JSON)
            return
        }

        render(o.save(failOnError: true) as JSON)
    }

}
