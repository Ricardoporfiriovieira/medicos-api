package med.vol.api.Medicos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import med.vol.api.Medicos.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico>findAllByActiveTrue(Pageable paginacao);
}
