package br.com.zup.edu.recargadecelular.repository;

import br.com.zup.edu.recargadecelular.model.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
}
