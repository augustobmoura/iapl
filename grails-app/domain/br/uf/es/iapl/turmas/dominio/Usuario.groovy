package br.uf.es.iapl.turmas.dominio

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes = 'email')
@ToString(includes = 'email', includeNames = true, includePackage = false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String nome
    String email
    String senha
    Date dataNascimento
    String cpf
    boolean ativado = true
    boolean expirou
    boolean bloqueado
    boolean senhaExpirou

    Set<Papel> getAuthorities() {
        (UsuarioPapel.findAllByUsuario(this) as List<UsuarioPapel>)*.papel as Set<Papel>
    }

    static constraints = {
        senha nullable: false, blank: false, password: true
        email nullable: false, blank: false, unique: true, email: true
        nome nullable: false, blank: false
        dataNascimento nullable: false
        cpf nullable: true
    }

    static mapping = {
        tablePerHierarchy false
        senha column: '`senha`'
    }
}
