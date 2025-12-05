package com.elexyt.ugflweb.mapper;


import com.elexyt.ugflweb.dto.JobApplicationDTO;
import com.elexyt.ugflweb.entity.JobApplication;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link JobApplication} and its DTO {@link JobApplicationDTO}.
 */
@Mapper(componentModel = "spring")
public interface JobApplicationMapper extends EntityMapper<JobApplicationDTO, JobApplication> {}
