package com.elexyt.ugflweb.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Entity
@Table(name = "seo_client_master")
@Where(clause = "isActive =1")
@Data
public class ClientMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String clientMasterId;
    private String clientName;
    private String clientShortName;
    private String clientAddress;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] clientLogo;
    private String clientEmail;
    private String clientPhoneNo;
    private int isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;
    
    
   
   
}
