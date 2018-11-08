package com.openbanking.api.ng.payload.directdebit;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class DirectDebitSetupOutput {
    private OperationStatus responseCode;
    private String message;
    private String transactionReferenceId;

}
