
package com.portfolio.mnnd.Repository;

import com.portfolio.mnnd.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mdieg
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
