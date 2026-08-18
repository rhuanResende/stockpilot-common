package com.desenvolvimento.logica.stockpilot.stockpilot_common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "co_id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "st_active", nullable = false)
    private Boolean active = true;

    @Column(name = "dt_created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "co_created_by")
    private UUID createdBy;

    @Column(name = "dt_updated_at")
    private Instant updatedAt;

    @Column(name = "co_updated_by")
    private UUID updatedBy;

    @PrePersist
    public void prePersist() {
        this.createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = Instant.now();
    }
}
