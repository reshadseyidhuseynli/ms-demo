package com.company.mapper;

import com.company.dto.response.CardResponse;
import com.company.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CardMapper {

    CardResponse toResponse(Card entity);

}
