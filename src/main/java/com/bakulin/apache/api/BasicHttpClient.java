package com.bakulin.apache.api;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Implements handling HTTP requests to RESTful API.
 * @author eugene.bakulin@gmail.com | https://www.linkedin.com/in/eugene-bakulin/
 */
public class BasicHttpClient {
	
	/**
	 * Sends GET request. 
	 * @param path Path to send request.
	 * @return response.
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse get(String path) throws ClientProtocolException, IOException { 
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(path);
        System.out.println("Executing request " + httpGet.getRequestLine());
		
        HttpResponse response = httpClient.execute(httpGet);
		System.out.println("GET: " + response);
		return response;
	}
	
	/**
	 * Sends POST request.
	 * @param path
	 * @param json
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse post(String path, String json) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(path);
		StringEntity requestEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
		System.out.println("Executing request " + httpPost.getRequestLine() + " " + json);
		httpPost.setEntity(requestEntity);
		
		HttpResponse response = httpClient.execute(httpPost);
		System.out.println("POST: " + response);
		return response;
	}
	
	/**
	 * Sends PUT request.
	 * @param path
	 * @param json
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse put(String path, String json) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPut httpPut = new HttpPut(path);
		StringEntity requestEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
		System.out.println("Executing request " + httpPut.getRequestLine() + " " + json);
		httpPut.setEntity(requestEntity);
		
		HttpResponse response = httpClient.execute(httpPut);
		System.out.println("Put: " + response);
		return response;
	}
	
	/**
	 * Sends PATCH request.
	 * @param path
	 * @param json
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse patch(String path, String json) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPatch httpPatch = new HttpPatch(path);
		StringEntity requestEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
		System.out.println("Executing request " + httpPatch.getRequestLine() + " " + json);
		httpPatch.setEntity(requestEntity);
		
		HttpResponse response = httpClient.execute(httpPatch);
		System.out.println("PATCH: " + response);
		return response;
	}
	
	/**
	 * Sends DELETE request.
	 * @param path
	 * @param json
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse delete(String path) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpDelete httpDelete = new HttpDelete(path);
		System.out.println("Executing request " + httpDelete.getRequestLine());
		
		HttpResponse response = httpClient.execute(httpDelete);
		System.out.println("DELETE: " + response);
		return response;
	}
	
	

}
