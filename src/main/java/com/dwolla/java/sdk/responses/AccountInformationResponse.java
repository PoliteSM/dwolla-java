package com.dwolla.java.sdk.responses;

import com.dwolla.java.sdk.models.AccountInformation;

public class AccountInformationResponse extends Response {

    public AccountInformation Response;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((Response == null) ? 0 : Response.hashCode());
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
        AccountInformationResponse other = (AccountInformationResponse) obj;
        if (Response == null) {
            if (other.Response != null)
                return false;
        } else if (!Response.equals(other.Response))
            return false;
        return true;
    }

}
