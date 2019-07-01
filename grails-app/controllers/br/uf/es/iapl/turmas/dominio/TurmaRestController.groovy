package br.uf.es.iapl.turmas.dominio

class TurmaRestController extends RestController<Turma> {

    TurmaService turmaService

    @Override
    EntityService<Turma> getService() {
        return new TurmaService.Adapter(service: turmaService)
    }

    @Override
    String getEntityDescription() { "Turma" }

    @Override
    Turma empty() { new Turma() }
}
