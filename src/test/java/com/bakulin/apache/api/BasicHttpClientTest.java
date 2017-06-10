package com.bakulin.apache.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class BasicHttpClientTest extends TestCase {
	
	@Test
	public void testGet() throws ClientProtocolException, IOException {
		BasicHttpClient.get("http://jsonplaceholder.typicode.com/posts/42");	
	}
	
	@Test
	public void testPost() throws ClientProtocolException, IOException {
		BasicHttpClient.post("http://jsonplaceholder.typicode.com/posts/42", "");	
	}
	
	@Test
	public void testPut() throws ClientProtocolException, IOException {
		BasicHttpClient.put("http://jsonplaceholder.typicode.com/posts/42", "");	
	}
	
	@Test
	public void testPatch() throws ClientProtocolException, IOException {
		BasicHttpClient.patch("http://jsonplaceholder.typicode.com/posts/42", "");	
	}
	
	@Test
	public void testDelete() throws ClientProtocolException, IOException {
		BasicHttpClient.delete("http://jsonplaceholder.typicode.com/posts/42");	
	}

}
