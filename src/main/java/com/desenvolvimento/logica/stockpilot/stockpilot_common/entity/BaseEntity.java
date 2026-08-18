package com.desenvolvimento.logica.stockpilot.stockpilot_common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "co_id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "st_active", nullable = false)
    private Boolean active;

    @Column(name = "dt_created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "co_created_by", nullable = false)
    private UUID createdBy;

    @Column(name = "dt_updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "co_updated_by", nullable = false)
    private UUID updatedBy;

    @PrePersist
    public void prePersist() {
        this.active = true;
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
