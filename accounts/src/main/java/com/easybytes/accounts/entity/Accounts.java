package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Accounts extends BaseEntity {
    @Id
    @Column(name = "account_number")
    private long accountNumber;

    private long customerId;
    private String accountType;
    private String branchAddress;
}
