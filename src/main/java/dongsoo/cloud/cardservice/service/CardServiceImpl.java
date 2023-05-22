package dongsoo.cloud.cardservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import dongsoo.cloud.cardservice.dto.CardDTO;
import dongsoo.cloud.cardservice.entity.Card;
import dongsoo.cloud.cardservice.repository.CardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private final CardRepository cardRepository;
    private final ModelMapper modelMapper;

    @Override
    public CardDTO createCard(CardDTO cardDTO) {
        Card card = mapToEntity(cardDTO);
        Card savedCard = cardRepository.save(card);
        return mapToDTO(savedCard);
    }

    private CardDTO mapToDTO(Card card){
        return modelMapper.map(card, CardDTO.class);
    }

    private Card mapToEntity(CardDTO cardDTO){
        return modelMapper.map(cardDTO, Card.class);
    }
}
