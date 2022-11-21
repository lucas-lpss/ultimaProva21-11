package corporationLoster.ControllerApi;

import corporationLoster.Entity.Cliente;
import corporationLoster.Repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;


@RestController
@RequestMapping (value = "/pedido/v1/")
public class Controller {
    @Autowired
    private RepositoryCliente repository;

    @PostMapping
    @ResponseBody
    public Cliente create (@RequestBody Cliente clinte){
        Cliente clienteSaved = repository.save(clinte);
        return clienteSaved;
    }
    @GetMapping("{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById (@PathVariable Long id){
        Optional<Cliente> clienteReturned = repository.findById(id);
        return  clienteReturned;


    }

    


}
