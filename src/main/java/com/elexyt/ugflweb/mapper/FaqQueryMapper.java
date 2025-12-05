package com.elexyt.ugflweb.mapper;


import com.elexyt.ugflweb.dto.FaqQueryDTO;
import com.elexyt.ugflweb.entity.FaqQuery;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link FaqQuery} and its DTO {@link FaqQueryDTO}.
 */
@Mapper(componentModel = "spring")
public interface FaqQueryMapper extends EntityMapper<FaqQueryDTO, FaqQuery> {}
