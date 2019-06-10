package br.uf.es.iapl.turmas.dominio

class Turma {

    String nome
    Professor professor
    Set<Aluno> alunos = []

    static constraints = {
        nome nullable: false, blank: false
        professor nullable: false
        alunos nullable: false
    }

}
