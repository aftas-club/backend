package com.ouharri.aftas.model.mapper;

import com.ouharri.aftas.model.dto.Competition.CompetitionReq;
import com.ouharri.aftas.model.dto.Competition.CompetitionResp;
import com.ouharri.aftas.model.entities.Competition;
import org.mapstruct.*;
import org.springframework.data.domain.Page;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface CompetitionMapper {
    Competition toEntity(CompetitionReq competitionReq);

    CompetitionResp toResp(Competition competition);

}