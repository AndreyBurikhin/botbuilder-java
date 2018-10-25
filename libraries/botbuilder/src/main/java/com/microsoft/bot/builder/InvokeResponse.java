package com.microsoft.bot.builder;

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

/** 
 Tuple class containing an HTTP Status Code and a JSON Serializable
 object. The HTTP Status code is, in the invoke activity scenario, what will
 be set in the resulting POST. The Body of the resulting POST will be
 the JSON Serialized content from the Body property.
*/
public class InvokeResponse
{
	/** Gets or sets the HTTP status code for the response.
	 <value>The HTTP status code.</value>
	 
	 The POST that is generated in response to the incoming Invoke Activity
	 will have the HTTP Status code specificied by this field.
	 
	*/
	private int Status;
	public final int getStatus()
	{
		return Status;
	}
	public final void setStatus(int value)
	{
		Status = value;
	}

	/** Gets or sets the body content for the response.
	 <value>The body content.</value>
	 
	 The POST that is generated in response to the incoming Invoke Activity
	 will have a body generated by JSON serializing the object in this field.
	 
	*/
	private Object Body;
	public final Object getBody()
	{
		return Body;
	}
	public final void setBody(Object value)
	{
		Body = value;
	}
}