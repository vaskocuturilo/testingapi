package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal" , "PMD.ShortVariable", "PMD.LongVariable","PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class JsonMember6269{

	@JsonProperty("private")
	private Object jsonMemberPrivate;

	@JsonProperty("account_id")
	private int accountId;

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("clan_id")
	private int clanId;

	@JsonProperty("last_battle_time")
	private int lastBattleTime;

	@JsonProperty("global_rating")
	private int globalRating;

	@JsonProperty("logout_at")
	private int logoutAt;

	@JsonProperty("client_language")
	private String clientLanguage;

	@JsonProperty("statistics")
	private Statistics statistics;

	public void setJsonMemberPrivate(Object jsonMemberPrivate){
		this.jsonMemberPrivate = jsonMemberPrivate;
	}

	public Object getJsonMemberPrivate(){
		return jsonMemberPrivate;
	}

	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	public int getAccountId(){
		return accountId;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setClanId(int clanId){
		this.clanId = clanId;
	}

	public int getClanId(){
		return clanId;
	}

	public void setLastBattleTime(int lastBattleTime){
		this.lastBattleTime = lastBattleTime;
	}

	public int getLastBattleTime(){
		return lastBattleTime;
	}

	public void setGlobalRating(int globalRating){
		this.globalRating = globalRating;
	}

	public int getGlobalRating(){
		return globalRating;
	}

	public void setLogoutAt(int logoutAt){
		this.logoutAt = logoutAt;
	}

	public int getLogoutAt(){
		return logoutAt;
	}

	public void setClientLanguage(String clientLanguage){
		this.clientLanguage = clientLanguage;
	}

	public String getClientLanguage(){
		return clientLanguage;
	}

	public void setStatistics(Statistics statistics){
		this.statistics = statistics;
	}

	public Statistics getStatistics(){
		return statistics;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember6269{" + 
			"private = '" + jsonMemberPrivate + '\'' + 
			",account_id = '" + accountId + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",nickname = '" + nickname + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",clan_id = '" + clanId + '\'' + 
			",last_battle_time = '" + lastBattleTime + '\'' + 
			",global_rating = '" + globalRating + '\'' + 
			",logout_at = '" + logoutAt + '\'' + 
			",client_language = '" + clientLanguage + '\'' + 
			",statistics = '" + statistics + '\'' + 
			"}";
		}
}