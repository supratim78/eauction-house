package com.cts.eauction.microservices.listing.model;

import java.time.LocalDate;
import java.util.List;

public class Listing {
	
	private String shortDescription;
	private String detailedDescription;
	private String category;
	private Integer startingPrice;
	private LocalDate bidEndDate;
	private List<BidDetails> bidDetails;
	
	public Listing() {
		
	}

	public Listing(String shortDescription, String detailedDescription,
			String category, Integer startingPrice, LocalDate bidEndDate, List<BidDetails> bidDetails) {
		super();
		this.shortDescription = shortDescription;
		this.detailedDescription = detailedDescription;
		this.category = category;
		this.startingPrice = startingPrice;
		this.bidEndDate = bidEndDate;
		this.bidDetails = bidDetails;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(Integer startingPrice) {
		this.startingPrice = startingPrice;
	}

	public LocalDate getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(LocalDate bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public List<BidDetails> getBidDetails() {
		return bidDetails;
	}

	public void setBidDetails(List<BidDetails> bidDetails) {
		this.bidDetails = bidDetails;
	}

	@Override
	public String toString() {
		return "Listing [shortDescription=" + shortDescription + ", detailedDescription=" + detailedDescription
				+ ", category=" + category + ", startingPrice=" + startingPrice + ", bidEndDate=" + bidEndDate
				+ ", bidAmounts=" + bidDetails + "]";
	}
}
