package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal" , "PMD.ShortVariable", "PMD.LongVariable","PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class Meta{

	@JsonProperty("count")
	private int count;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"count = '" + count + '\'' + 
			"}";
		}
}