package com.wargaming.api.schema.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@SuppressWarnings("PMD.MethodArgumentCouldBeFinal")
@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@JsonProperty("account_id")
	private int accountId;

	@JsonProperty("nickname")
	private String nickname;

	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	public int getAccountId(){
		return accountId;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"account_id = '" + accountId + '\'' + 
			",nickname = '" + nickname + '\'' + 
			"}";
		}
}