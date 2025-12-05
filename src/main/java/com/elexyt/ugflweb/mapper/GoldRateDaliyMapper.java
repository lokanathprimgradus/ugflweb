package com.elexyt.ugflweb.mapper;


import com.elexyt.ugflweb.dto.GoldRateDaliyDTO;
import com.elexyt.ugflweb.entity.GoldRateDaliy;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link GoldRateDaliy} and its DTO {@link GoldRateDaliyDTO}.
 */
@Mapper(componentModel = "spring")
public interface GoldRateDaliyMapper extends EntityMapper<GoldRateDaliyDTO, GoldRateDaliy> {}
