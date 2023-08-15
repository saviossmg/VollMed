package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {

    //findAllBy nome do atributo e valor esperado
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
