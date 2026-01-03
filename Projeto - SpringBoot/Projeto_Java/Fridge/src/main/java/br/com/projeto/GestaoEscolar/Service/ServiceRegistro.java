package br.com.projeto.GestaoEscolar.Service;
import br.com.projeto.GestaoEscolar.Model.Registro;
import br.com.projeto.GestaoEscolar.Repository.RepositoryRegistro;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceRegistro {
    private final RepositoryRegistro repositoryRegistro;

    public ServiceRegistro( RepositoryRegistro repositoryRegistro ){
        this.repositoryRegistro = repositoryRegistro;
    }

    public List<Registro> getAll(){ return repositoryRegistro.findAll(); }
    public Registro save(Registro registro){ return repositoryRegistro.save( registro ); }
    public void delete( Integer id ){ repositoryRegistro.deleteById( id ); }
}
/*
    - SERVICE
     -> É a camada responsável pela aplicação de negócio, implementando a lógica e aplicação

    - Métodos - GetAll()
    -> GetAll()
     -> Retorna todos os dados, chamando o métodos findAll() do Repository

    - Métodos - GetSave()
    -> GetSave()
     -> Recebe um objeto ( comida ) e chama o métodos save() do Repository para persistir o dado

    - Métodos - GetDelete()
    -> GetDelete()
     -> Recebe o id e chama o métodos deleteById() do repository
*/