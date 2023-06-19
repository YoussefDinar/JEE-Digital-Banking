package org.sid.ebankingbackend.entities;

import lombok.Data;

import java.util.List;


@Data
public class AccountHistory {
    private String accountId;
    private double balance;
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<AccountOperation> accountOperationDTOS;
}
