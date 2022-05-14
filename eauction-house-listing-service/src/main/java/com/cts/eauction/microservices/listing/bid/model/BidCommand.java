package com.cts.eauction.microservices.listing.bid.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "BID")
public class BidCommand {

	@Id
	private Integer id;
	@Field("productId")
	private Integer productId;
	@Field("bidAmount")
	private Integer bidAmount;
	@Field("buyerId")
	private Integer buyerId;

	public BidCommand() {

	}

	public BidCommand(Integer id, Integer productId, Integer bidAmount, Integer buyerId) {
		super();
		this.id = id;
		this.productId = productId;
		this.bidAmount = bidAmount;
		this.buyerId = buyerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Integer bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidAmount == null) ? 0 : bidAmount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((buyerId == null) ? 0 : buyerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BidCommand other = (BidCommand) obj;
		if (bidAmount == null) {
			if (other.bidAmount != null)
				return false;
		} else if (!bidAmount.equals(other.bidAmount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (buyerId == null) {
			if (other.buyerId != null)
				return false;
		} else if (!buyerId.equals(other.buyerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bid [id=" + id + ", productId=" + productId + ", bidAmount=" + bidAmount + ", sellerId=" + buyerId
				+ "]";
	}
}
