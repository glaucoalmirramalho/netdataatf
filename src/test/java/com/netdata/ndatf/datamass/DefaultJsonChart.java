/**
 * 
 */
package com.netdata.ndatf.datamass;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author glauco
 *
 */
public class DefaultJsonChart extends DefaultChart{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2705263149510685854L;
	
	@JsonProperty("result")
    private Result result;
    
	@JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

}
