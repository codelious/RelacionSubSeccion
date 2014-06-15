package com.codelious.combinaciones.records;

public class RelSubSeccionRecord {

	private Integer relSubSeccionId;
	private Integer seccionPadreId;
	private Integer seccionAId;
	private String llaveA;
	private Integer seccionBId;
	private String llaveB;

	public RelSubSeccionRecord(Integer relSubSeccionId, Integer seccionPadreId,
			Integer seccionAId, String llaveA, Integer seccionBId, String llaveB) {
		super();
		this.relSubSeccionId = relSubSeccionId;
		this.seccionPadreId = seccionPadreId;
		this.seccionAId = seccionAId;
		this.llaveA = llaveA;
		this.seccionBId = seccionBId;
		this.llaveB = llaveB;
	}

	public Integer getRelSubSeccionId() {
		return relSubSeccionId;
	}

	public void setRelSubSeccionId(Integer relSubSeccionId) {
		this.relSubSeccionId = relSubSeccionId;
	}

	public Integer getSeccionPadreId() {
		return seccionPadreId;
	}

	public void setSeccionPadreId(Integer seccionPadreId) {
		this.seccionPadreId = seccionPadreId;
	}

	public Integer getSeccionAId() {
		return seccionAId;
	}

	public void setSeccionAId(Integer seccionAId) {
		this.seccionAId = seccionAId;
	}

	public String getLlaveA() {
		return llaveA;
	}

	public void setLlaveA(String llaveA) {
		this.llaveA = llaveA;
	}

	public Integer getSeccionBId() {
		return seccionBId;
	}

	public void setSeccionBId(Integer seccionBId) {
		this.seccionBId = seccionBId;
	}

	public String getLlaveB() {
		return llaveB;
	}

	public void setLlaveB(String llaveB) {
		this.llaveB = llaveB;
	}

}
