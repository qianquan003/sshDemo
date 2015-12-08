package com.xi.houserent.model;

import java.sql.Timestamp;

/**
 * Area entity. @author MyEclipse Persistence Tools
 */

public class Area implements java.io.Serializable
{

	// Fields

	private Integer ceaId;
	private String ceaName;
	private Integer ceaCityId;
	private Timestamp ceaCreateTime;
	private Integer ceaPerId;
	private Double cerRatio;
	private String cerAddress;
	private String ceaClcode;
	private Integer ceaUserId;
	private Integer ceaRomCodeIndex;
	private String ceaRomCodeCity;
	private Integer ceaOrderField;
	// Constructors

	/** default constructor */
	public Area()
	{
	}

	/** full constructor */
	public Area(String ceaName, Integer ceaCityId, Timestamp ceaCreateTime, Integer ceaPerId, Double cerRatio, String cerAddress, String ceaClcode, Integer ceaRomCodeIndex, String ceaRomCodeCity)
	{
		this.ceaName = ceaName;
		this.ceaCityId = ceaCityId;
		this.ceaCreateTime = ceaCreateTime;
		this.ceaPerId = ceaPerId;
		this.cerRatio = cerRatio;
		this.cerAddress = cerAddress;
		this.ceaClcode = ceaClcode;
		this.ceaRomCodeIndex = ceaRomCodeIndex;
		this.ceaRomCodeCity = ceaRomCodeCity;
	}

	// Property accessors

	public Integer getCeaId()
	{
		return this.ceaId;
	}

	public Integer getCeaUserId() {
		return ceaUserId;
	}

	public void setCeaUserId(Integer ceaUserId) {
		this.ceaUserId = ceaUserId;
	}

	public void setCeaId(Integer ceaId)
	{
		this.ceaId = ceaId;
	}

	public String getCeaName()
	{
		return this.ceaName;
	}

	public void setCeaName(String ceaName)
	{
		this.ceaName = ceaName;
	}

	public Integer getCeaCityId()
	{
		return this.ceaCityId;
	}

	public void setCeaCityId(Integer ceaCityId)
	{
		this.ceaCityId = ceaCityId;
	}

	public Timestamp getCeaCreateTime()
	{
		return this.ceaCreateTime;
	}

	public void setCeaCreateTime(Timestamp ceaCreateTime)
	{
		this.ceaCreateTime = ceaCreateTime;
	}

	public Integer getCeaPerId()
	{
		return this.ceaPerId;
	}

	public void setCeaPerId(Integer ceaPerId)
	{
		this.ceaPerId = ceaPerId;
	}

	public Double getCerRatio()
	{
		return this.cerRatio;
	}

	public void setCerRatio(Double cerRatio)
	{
		this.cerRatio = cerRatio;
	}

	public String getCerAddress()
	{
		return this.cerAddress;
	}

	public void setCerAddress(String cerAddress)
	{
		this.cerAddress = cerAddress;
	}

	public String getCeaClcode()
	{
		return this.ceaClcode;
	}

	public void setCeaClcode(String ceaClcode)
	{
		this.ceaClcode = ceaClcode;
	}

	public Integer getCeaRomCodeIndex()
	{
		return ceaRomCodeIndex;
	}

	public void setCeaRomCodeIndex(Integer ceaRomCodeIndex)
	{
		this.ceaRomCodeIndex = ceaRomCodeIndex;
	}

	public String getCeaRomCodeCity()
	{
		return ceaRomCodeCity;
	}

	public void setCeaRomCodeCity(String ceaRomCodeCity)
	{
		this.ceaRomCodeCity = ceaRomCodeCity;
	}

	public Integer getCeaOrderField() {
		return ceaOrderField;
	}

	public void setCeaOrderField(Integer ceaOrderField) {
		this.ceaOrderField = ceaOrderField;
	}
	
}