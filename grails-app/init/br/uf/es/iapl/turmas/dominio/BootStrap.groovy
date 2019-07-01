package br.uf.es.iapl.turmas.dominio

class BootStrap {

    def init = { servletContext ->
        cadastraAdminSeNecessario()
    }
    def destroy = {
    }

    def cadastraAdminSeNecessario() {
        if (Usuario.findByEmail('jpocabral@gmail.com')) {
            Professor.withNewSession {
                new Professor(
                    email: 'jpocabral@gmail.com',
                    senha: 'admin',
                    dataNascimento: new Date(),
                    cpf: '',
                ).save(flush: true)
            }
        }
    }
}
