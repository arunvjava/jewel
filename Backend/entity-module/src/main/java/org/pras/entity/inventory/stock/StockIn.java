package org.pras.entity.inventory.stock;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pras.entity.ProbeClass;
import org.pras.entity.inventory.uom.UOM;
import org.pras.entity.utils.Constants;

import lombok.Data;

@Data
@Entity
@Table(name = "tx_stock_in", schema = Constants.SCHEMA_JEWEL)
public class StockIn extends Stock {

	@Column(name = "qty")
	private double qty;
	@Column(name = "cost_price")
	private double costPrice;
	@Column(name = "mrp")
	private double mrp;
	@Column(name = "discount")
	private double discount;
	@ManyToOne
	@JoinColumn(name = "uom_id")
	private UOM uom;
	@Embedded
	private ProbeClass probeClass = new ProbeClass();
}
