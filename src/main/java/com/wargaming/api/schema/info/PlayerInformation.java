package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal" , "PMD.ShortVariable", "PMD.LongVariable","PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class PlayerInformation{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("status")
	private String status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PlayerInformation{" + 
			"data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}