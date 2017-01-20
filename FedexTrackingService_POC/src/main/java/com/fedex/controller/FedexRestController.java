package com.fedex.controller;

/**
 * @author Praveen
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.TrackWebServiceClient;
import com.fedex.track.stub.TrackReply;
import com.fedex.ws.track.v12.WriteEventLog;
import com.fedex.ws.track.v12.WriteEventLogResponse;
import com.fedex.ws.track.v12.WriteEventLogResponse1;
import com.fedex.ws.track.v12.WriteEventLogResponse2;

@RestController
@RequestMapping("/track")
public class FedexRestController {

@Autowired	
private TrackWebServiceClient client;
/*
@RequestMapping({"trackingId"})	
 public TrackReply trackingService(@PathVariable("trackingId") String trackingId){
	return client.trackWebServiceClient(trackingId);
 }*/


@Lazy(false)
@RequestMapping(method = {
		RequestMethod.POST }, value = "GetTrackingInfo" ,produces={"application/json","application/xml"})
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<WriteEventLogResponse1> getTrackingInfo(
		 @RequestBody WriteEventLog trackRequest) {
	return new ResponseEntity<WriteEventLogResponse1>(
			client.trackWebServiceClient(trackRequest), HttpStatus.OK);
}
}
