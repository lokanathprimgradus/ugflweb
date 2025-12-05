package com.elexyt.ugflweb.mapper;


import com.elexyt.ugflweb.dto.LoanApplicationDTO;
import com.elexyt.ugflweb.entity.LoanApplication;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link LoanApplication} and its DTO {@link LoanApplicationDTO}.
 */
@Mapper(componentModel = "spring")
public interface LoanApplicationMapper extends EntityMapper<LoanApplicationDTO, LoanApplication> {}
