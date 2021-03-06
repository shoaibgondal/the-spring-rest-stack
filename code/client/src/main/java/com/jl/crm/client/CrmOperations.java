package com.jl.crm.client;

import org.springframework.http.MediaType;

import java.net.URI;
import java.util.*;

/**
 * represents the client side view to the RESTful service.
 *
 * @author Josh Long
 */
public interface CrmOperations {

	User currentUser();

	Customer loadUserCustomer(Long id);

	Customer createCustomer(String firstName, String lastName, Date signupDate);

	Collection<Customer> loadAllUserCustomers();

	void removeCustomer(Long id);

	URI setUserProfilePhoto(byte[] bytesOfImage, MediaType mediaType);

	Customer updateCustomer(Long id, String firstName, String lastName);

	ProfilePhoto getUserProfilePhoto();




}
