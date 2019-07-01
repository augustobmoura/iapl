package br.uf.es.iapl.turmas.dominio

class AlunoRestController extends RestController<Aluno> {

    AlunoService alunoService

    @Override
    EntityService<Aluno> getService() {
        return new AlunoService.Adapter(service: alunoService)
    }

    @Override
    String getEntityDescription() { "Aluno" }

    @Override
    Aluno empty() { new Aluno() }

}
