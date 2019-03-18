package vacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vacation.beans.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

}
