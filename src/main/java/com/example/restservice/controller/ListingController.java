package com.example.restservice.controller;

import com.example.restservice.domain.Greeting;
import com.example.restservice.domain.Listing;
import com.example.restservice.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ListingController {

	@Autowired
	private ListingRepository repository;

	@RequestMapping(value = "/listings", method = RequestMethod.GET)
	public List<Listing> getAllListings() {
		return repository.findAll();
	}

	@RequestMapping(value = "/listings/propertytype/{property_type}", method = RequestMethod.GET)
	public List<Listing> getAllListingsByPropertyType(@PathVariable("property_type") String property_type) {
		return repository.findByPropertyType(property_type.substring(0,1).toUpperCase() + property_type.substring(1));
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hi")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
