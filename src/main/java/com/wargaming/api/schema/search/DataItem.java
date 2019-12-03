package com.wargaming.api.schema.search;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class Data item.
 */
@SuppressWarnings("PMD.MethodArgumentCouldBeFinal")
@Generated("com.robohorse.robopojogenerator")
public class DataItem {

    @JsonProperty("account_id")
    private int accountId;

    @JsonProperty("nickname")
    private String nickname;

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return
                "DataItem{" +
                        "account_id = '" + accountId + '\'' +
                        ",nickname = '" + nickname + '\'' +
                        "}";
    }
}