package com.elexyt.ugflweb.service;

import com.elexyt.ugflweb.entity.JobApplication;
import com.elexyt.ugflweb.repository.JobApplicationRepository;
import com.elexyt.ugflweb.dto.JobApplicationDTO;
import com.elexyt.ugflweb.mapper.JobApplicationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link com.elexyt.ugflweb.entity.JobApplication}.
 */
@Service
@Transactional
public class JobApplicationService {

    private static final Logger LOG = LoggerFactory.getLogger(JobApplicationService.class);

    private final JobApplicationRepository jobApplicationRepository;

    private final JobApplicationMapper jobApplicationMapper;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository, JobApplicationMapper jobApplicationMapper) {
        this.jobApplicationRepository = jobApplicationRepository;
        this.jobApplicationMapper = jobApplicationMapper;
    }

    /**
     * Save a jobApplication.
     *
     * @param jobApplicationDTO the entity to save.
     * @return the persisted entity.
     */
    public JobApplicationDTO save(JobApplicationDTO jobApplicationDTO) {
        LOG.debug("Request to save JobApplication : {}", jobApplicationDTO);
        JobApplication jobApplication = jobApplicationMapper.toEntity(jobApplicationDTO);
        jobApplication.setIsActive(1);
        jobApplication = jobApplicationRepository.save(jobApplication);
        return jobApplicationMapper.toDto(jobApplication);
    }

    /**
     * Update a jobApplication.
     *
     * @param jobApplicationDTO the entity to save.
     * @return the persisted entity.
     */
    public JobApplicationDTO update(JobApplicationDTO jobApplicationDTO) {
        LOG.debug("Request to update JobApplication : {}", jobApplicationDTO);
        JobApplication jobApplication = jobApplicationMapper.toEntity(jobApplicationDTO);
        jobApplication = jobApplicationRepository.save(jobApplication);
        return jobApplicationMapper.toDto(jobApplication);
    }

    /**
     * Partially update a jobApplication.
     *
     * @param jobApplicationDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<JobApplicationDTO> partialUpdate(JobApplicationDTO jobApplicationDTO) {
        LOG.debug("Request to partially update JobApplication : {}", jobApplicationDTO);

        return jobApplicationRepository
            .findById(jobApplicationDTO.getJobApplicationId())
            .map(existingJobApplication -> {
                jobApplicationMapper.partialUpdate(existingJobApplication, jobApplicationDTO);

                return existingJobApplication;
            })
            .map(jobApplicationRepository::save)
            .map(jobApplicationMapper::toDto);
    }

    /**
     * Get all the jobApplications.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<JobApplicationDTO> findAll() {
        LOG.debug("Request to get all JobApplications");
        return jobApplicationRepository
            .findAll()
            .stream()
            .map(jobApplicationMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one jobApplication by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<JobApplicationDTO> findOne(String id) {
        LOG.debug("Request to get JobApplication : {}", id);
        return jobApplicationRepository.findById(id).map(jobApplicationMapper::toDto);
    }

    /**
     * Delete the jobApplication by id.
     *
     * @param id the id of the entity.
     */
    public void delete(String id) {
        LOG.debug("Request to delete JobApplication : {}", id);
        jobApplicationRepository.deleteById(id);
    }
}
