package br.uf.es.iapl.turmas.dominio

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        get "/api/alunos/"(controller: 'alunoRest', action: 'index')
        post "/api/alunos/"(controller: 'alunoRest', action: 'create')
        get "/api/alunos/$id"(controller: 'alunoRest', action: 'show')
        delete "/api/alunos/$id"(controller: 'alunoRest', action: 'delete')
        put "/api/alunos/$id"(controller: 'alunoRest', action: 'update')

        get "/api/professores/"(controller: 'professorRest', action: 'index')
        post "/api/professores/"(controller: 'professorRest', action: 'create')
        get "/api/professores/$id"(controller: 'professorRest', action: 'show')
        delete "/api/professores/$id"(controller: 'professorRest', action: 'delete')
        put "/api/professores/$id"(controller: 'professorRest', action: 'update')

        get "/api/turmas/"(controller: 'turmaRest', action: 'index')
        post "/api/turmas/"(controller: 'turmaRest', action: 'create')
        get "/api/turmas/$id"(controller: 'turmaRest', action: 'show')
        delete "/api/turmas/$id"(controller: 'turmaRest', action: 'delete')
        put "/api/turmas/$id"(controller: 'turmaRest', action: 'update')

        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
