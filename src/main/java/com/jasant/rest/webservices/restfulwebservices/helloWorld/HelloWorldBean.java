package com.jasant.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String message) {
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HelloWorldBean [message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	public String getMessage() {
		return message;
	}
	
}
