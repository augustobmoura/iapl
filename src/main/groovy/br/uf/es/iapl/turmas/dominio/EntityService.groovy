package br.uf.es.iapl.turmas.dominio

interface EntityService<T> {
    T get(Serializable id)

    List<T> list(Map args)

    Long count()

    void delete(Serializable id)

    T save(T aluno)
}
