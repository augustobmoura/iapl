import grails.util.Environment

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'br.uf.es.iapl.turmas.dominio.Usuario'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'br.uf.es.iapl.turmas.dominio.UsuarioPapel'
grails.plugin.springsecurity.authority.className = 'br.uf.es.iapl.turmas.dominio.Papel'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
    [pattern: '/', access: ['permitAll']],
    [pattern: '/aluno', access: ['permitAll']],
    [pattern: '/aluno/**', access: ['permitAll']],
    [pattern: '/professor/create', access: ['permitAll']],
    [pattern: '/professor/save', access: ['permitAll']],
    [pattern: '/error', access: ['permitAll']],
    [pattern: '/index', access: ['permitAll']],
    [pattern: '/index.gsp', access: ['permitAll']],
    [pattern: '/shutdown', access: ['permitAll']],
    [pattern: '/assets/**', access: ['permitAll']],
    [pattern: '/**/js/**', access: ['permitAll']],
    [pattern: '/**/css/**', access: ['permitAll']],
    [pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
    [pattern: '/assets/**', filters: 'none'],
    [pattern: '/**/js/**', filters: 'none'],
    [pattern: '/**/css/**', filters: 'none'],
    [pattern: '/**/images/**', filters: 'none'],
    [pattern: '/**/favicon.ico', filters: 'none'],
    [pattern: '/**', filters: 'JOINED_FILTERS']
]

// desabilita segurança
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
    [pattern: '/**', access: ['permitAll']]
]
grails.plugin.springsecurity.filterChain.chainMap = [
    [pattern: '/**', filters: 'none']
]
