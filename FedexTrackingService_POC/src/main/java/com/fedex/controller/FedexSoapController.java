package com.fedex.controller;

/**
 * @author Praveen
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fedex.TrackWebServiceClient;
import com.fedex.WriteEventLogResponse1;
import com.fedex.ws.track.v12.WriteEventLog;

@Endpoint
public class FedexSoapController {

	@Autowired	
	private TrackWebServiceClient client;
    private static final String NAMESPACE_URI = "http://fedex.com/ws/track/v12";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "writeEventLog")
    @ResponsePayload
    public WriteEventLogResponse1 getTrackingInfo(@RequestPayload WriteEventLog trackRequest){
       return client.trackWebServiceClient(trackRequest);
    }
}
