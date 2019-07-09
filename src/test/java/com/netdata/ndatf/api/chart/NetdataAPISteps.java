/**
 * 
 */
package com.netdata.ndatf.api.chart;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.netdata.ndatf.datamass.impl.CPUArrayChart;
import com.netdata.ndatf.datamass.impl.CPUJsonChart;
import com.netdata.ndatf.datamass.impl.IOArrayChart;
import com.netdata.ndatf.datamass.impl.IPv4ArrayChart;
import com.netdata.ndatf.datamass.impl.RamArrayChart;
import com.netdata.ndatf.datamass.impl.RamJsonChart;
import com.netdata.ndatf.datamass.impl.SwapArrayChart;

import net.thucydides.core.annotations.Step;

/**
 * @author glauco
 * 
 *         This class contains the steps to perform requests to Netdata in a
 *         Serenity reports fashion.
 *
 */
public class NetdataAPISteps {

	private static final String defaultUri = "http://127.0.0.1:19999/api/v1/data?chart=%s&format=%s&points=%s&"
			+ "group=average&gtime=0";
	private static final String ramArrayOptions = "&options=absolute%7Cpercentage%7Cjsonwrap%7Cnonzero&after=-420&dimensions=used%7Cbuffers%7Cactive%7Cwired&_=1562368632926";
	private static final String ramJsonOptions = "&options=ms%7Cflip%7Cjsonwrap%7Cnonzero&after=-420&_=1562368633406";
	private static final String cpuArrayOptions = "&options=absolute%7Cjsonwrap%7Cnonzero";
	private static final String cpuJsonOptions = "&options=ms%7Cflip%7Cjsonwrap%7Cnonzero&after=-420&_=1562537321674";
	private static final String ioArrayOptions = "&options=absolute%7Cjsonwrap%7Cnonzero&after=-420&dimensions=in&_=1562537321676";
	private static final String ipv4ArrayOptions = "&options=absolute%7Cjsonwrap%7Cnonzero&after=-420&dimensions=received&_=1562537321679";
	private static final String swapArrayOptions = "&options=absolute%7Cpercentage%7Cjsonwrap%7Cnonzero&after=-420&dimensions=used&_=1562537321683";

	HttpUriRequest request = null;

	HttpResponse response = null;

	@Step("A request is sent to local netdata with chart '{0}', format '{1}' and points '{2}'")
	public void chartGetToNetdata(String chartName, String format, int points)
			throws ClientProtocolException, IOException {

		String uri = String.format(defaultUri, chartName, format, 100);
		
		if(chartName.equals("system.ram") && format.equals("array")){
			uri += ramArrayOptions;			
		}else if(chartName.equals("system.ram") && format.equals("json")){
			uri += ramJsonOptions;
		}else if(chartName.equals("system.io")){
			uri += ioArrayOptions;
		}else if(chartName.equals("system.cpu") && format.equals("array")){
			uri += cpuArrayOptions;
		}else if(chartName.equals("system.cpu") && format.equals("json")){
			uri += cpuJsonOptions;
		}else if(chartName.equals("system.ipv4")){
			uri += ipv4ArrayOptions;
		}else if(chartName.equals("system.swap")){
			uri += swapArrayOptions;
		}
		
		request = new HttpGet(uri);
	}

	@Step("A response is received from local netdata")
	public void aResponseIsReceivedFromNetdata() throws ClientProtocolException, IOException {
		response = HttpClientBuilder.create().build().execute(request);
	}

	@Step("The mimetype is equal to {0}")
	public void mimeTypeEqualsTo(String expectedMimeType) throws Exception {
		String currentMimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
		assertEquals(expectedMimeType, currentMimeType);
	}

	@Step("The schema should match the '{0}' with format '{1} ")
	public void schemaEqualsTo(String chartName, String format) throws Exception {
		JSONObject jsonSchema = null;

		HttpEntity entity = response.getEntity();
		String source = EntityUtils.toString(entity);
		JSONObject subject = new JSONObject(source);
		
		if(chartName.equals("system.ram") && format.equals("array")){
			jsonSchema = new JSONObject(
					new JSONTokener(RamArrayChart.class.getResourceAsStream("/schemas/ramArraySchema.json")));
		}else if(chartName.equals("system.ram") && format.equals("json")){
			jsonSchema = new JSONObject(
					new JSONTokener(RamJsonChart.class.getResourceAsStream("/schemas/ramJsonSchema.json")));
		}else if(chartName.equals("system.io")){
			jsonSchema = new JSONObject(
					new JSONTokener(IOArrayChart.class.getResourceAsStream("/schemas/ioArraySchema.json")));
		}else if(chartName.equals("system.cpu") && format.equals("array")){
			jsonSchema = new JSONObject(
					new JSONTokener(CPUArrayChart.class.getResourceAsStream("/schemas/cpuArraySchema.json")));
		}else if(chartName.equals("system.cpu") && format.equals("json")){
			jsonSchema = new JSONObject(
					new JSONTokener(CPUJsonChart.class.getResourceAsStream("/schemas/cpuJsonSchema.json")));
		}else if(chartName.equals("system.ipv4")){
			jsonSchema = new JSONObject(
					new JSONTokener(IPv4ArrayChart.class.getResourceAsStream("/schemas/ipv4ArraySchema.json")));
		}else if(chartName.equals("system.swap")){
			jsonSchema = new JSONObject(
					new JSONTokener(SwapArrayChart.class.getResourceAsStream("/schemas/swapArraySchema.json")));
		}
		
		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(subject);
	}

	@Step("The status code received should be equals to '{0}'")
	public void statusCodeEqualsTo(int expectedStatusCode) {
		assertEquals(expectedStatusCode, response.getStatusLine().getStatusCode());
	}
	
}
