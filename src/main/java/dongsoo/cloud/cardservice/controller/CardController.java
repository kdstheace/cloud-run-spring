package dongsoo.cloud.cardservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dongsoo.cloud.cardservice.dto.CardDTO;
import dongsoo.cloud.cardservice.service.CardService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping
    public ResponseEntity<CardDTO> createCard(@RequestBody CardDTO cardDTO){
        return new ResponseEntity<>(cardService.createCard(cardDTO), HttpStatus.CREATED);
    }
}
