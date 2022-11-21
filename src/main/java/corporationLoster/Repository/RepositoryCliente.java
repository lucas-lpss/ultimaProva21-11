package corporationLoster.Repository;

import corporationLoster.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCliente  extends JpaRepository <Cliente,Long> {
}
