package dongsoo.cloud.cardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dongsoo.cloud.cardservice.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long> {

}
