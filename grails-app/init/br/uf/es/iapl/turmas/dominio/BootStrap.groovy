package br.uf.es.iapl.turmas.dominio

class BootStrap {

    def init = { servletContext ->
    }
    def destroy = {
    }

    def cadastraAdminSeNecessario() {
        if (Usuario.findByEmail('augusto.borgesm@gmail.com')) {
            new Professor(email: 'augusto.borgesm@gmail.com', senha: 'admin', )
        }
    }
}
