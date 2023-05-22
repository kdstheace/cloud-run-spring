package dongsoo.cloud.cardservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/counts")
    public long count(){
        return cardService.count();
    }
}
