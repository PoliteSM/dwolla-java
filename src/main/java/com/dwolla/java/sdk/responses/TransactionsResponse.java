package com.dwolla.java.sdk.responses;

import com.dwolla.java.sdk.models.TransactionWithFees;

import java.util.Arrays;

public class TransactionsResponse extends Response {

    public TransactionWithFees[] Response;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Arrays.hashCode(Response);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransactionsResponse other = (TransactionsResponse) obj;
        if (!Arrays.equals(Response, other.Response))
            return false;
        return true;
    }

}
