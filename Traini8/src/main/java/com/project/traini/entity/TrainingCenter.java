package com.project.traini.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "training_centers")
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center Name must not be blank")
    @Size(max = 40, message = "Center Name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center Code must not be blank")
    @Size(min = 12, max = 12, message = "Center Code must be exactly 12 characters")
    private String centerCode;

    @Embedded
    @Valid
    @NotNull(message = "Address is required")
    private Address address;

    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private long createdOn = System.currentTimeMillis();

    @Email(message = "Invalid email format")
    @NotBlank(message = "Contact Email is required")
    private String contactEmail;

    @NotBlank(message = "Contact Phone must not be blank")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
    private String contactPhone;


    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }

    public String getCenterCode() { return centerCode; }
    public void setCenterCode(String centerCode) { this.centerCode = centerCode; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }
}
