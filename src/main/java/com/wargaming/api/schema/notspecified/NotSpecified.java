package com.wargaming.api.schema.notspecified;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@SuppressWarnings("PMD.MethodArgumentCouldBeFinal")
@Generated("com.robohorse.robopojogenerator")
public class NotSpecified{

	@JsonProperty("error")
	private Error error;

	@JsonProperty("status")
	private String status;

	public void setError(Error error){
		this.error = error;
	}

	public Error getError(){
		return error;
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
			"NotSpecified{" + 
			"error = '" + error + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}