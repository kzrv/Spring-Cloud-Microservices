package com.optimagrowth.license.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Entity
@Table(name = "licence")
public class License {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String licenseId;
    @NotNull
    private String description;
    @NotNull
    private String organizationId;
    @NotNull
    private String productName;
    @NotNull
    private String licenseType;
    private String comment;

    public License withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
