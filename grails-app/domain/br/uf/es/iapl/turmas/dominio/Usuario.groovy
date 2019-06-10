package br.uf.es.iapl.turmas.dominio

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes = 'email')
@ToString(includes = 'email', includeNames = true, includePackage = false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String email
    String password
    String nome
    Integer idade
    String cpf
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    Set<Papel> getAuthorities() {
        (UsuarioPapel.findAllByUsuario(this) as List<UsuarioPapel>)*.papel as Set<Papel>
    }

    static constraints = {
        password nullable: false, blank: false, password: true
        email nullable: false, blank: false, unique: true
        nome nullable: false, blank: false
        idade nullable: false, min: 0
        cpf nullable: true
    }

    static mapping = {
        password column: '`password`'
    }
}
