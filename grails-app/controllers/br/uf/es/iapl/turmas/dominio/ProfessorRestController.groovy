package br.uf.es.iapl.turmas.dominio

class ProfessorRestController extends RestController<Professor> {

    ProfessorService professorService

    @Override
    EntityService<Professor> getService() {
        return new ProfessorService.Adapter(service: professorService)
    }

    @Override
    String getEntityDescription() { "Professor" }

    @Override
    Professor empty() { new Professor() }
}
