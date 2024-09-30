package com.eazybytes.cards.mapper;

import com.eazybytes.cards.dto.CardsDto;
import com.eazybytes.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapTOCardsDto(Cards cards, CardsDto cardsDto) {
        cardsDto.setCardNumber( cards.getCardNumber() );
        cardsDto.setCardType( cards.getCardType() );
        cardsDto.setAmountUsed( cards.getAmountUsed() );
        cardsDto.setTotalLimit( cards.getTotalLimit() );
        cardsDto.setAvailableAmount( cards.getAvailableAmount() );
        cardsDto.setMobileNumber( cards.getMobileNumber() );
        return cardsDto;
    }
    public static Cards mapTOCards(CardsDto cardsDto, Cards cards) {
        cards.setCardNumber(cardsDto.getCardNumber());
        cards.setCardType(cardsDto.getCardType());
        cards.setMobileNumber(cardsDto.getMobileNumber());
        cards.setTotalLimit(cardsDto.getTotalLimit());
        cards.setAvailableAmount(cardsDto.getAvailableAmount());
        cards.setAmountUsed(cardsDto.getAmountUsed());
        return cards;
    }
}
