package br.com.projeto.GestaoEscolar.Controller;
import br.com.projeto.GestaoEscolar.Model.Registro;
import br.com.projeto.GestaoEscolar.Service.ServiceRegistro;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping( "/registro" )
public class ControllerRegistro {

    private final ServiceRegistro serviceRegistro;

    public ControllerRegistro(ServiceRegistro serviceRegistro){
        this.serviceRegistro = serviceRegistro;
    }

    @GetMapping
    public List<Registro> getAll(){ return serviceRegistro.getAll(); }

    @PostMapping
    public Registro create(@RequestBody Registro registro){ return serviceRegistro.save(registro); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){ serviceRegistro.delete( id ); }
}