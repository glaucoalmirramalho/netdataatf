/**
 * 
 */
package com.netdata.ndatf.datamass;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author glauco
 *
 */
public class DefaultArrayChart extends DefaultChart{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5956808364772963501L; 
	
	@JsonProperty("result")
    private List<Double> result;
    
    @JsonProperty("result")
    public List<Double> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Double> result) {
        this.result = result;
    }


}
