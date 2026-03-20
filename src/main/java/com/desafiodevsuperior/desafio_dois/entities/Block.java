package com.desafiodevsuperior.desafio_dois.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Instant startMoment; // mudei de start para startMoment, pois estava dando problema com start

	private Instant endMoment; // mudei de end para endMoment, pois estava dando problema com end
    
    @ManyToMany(mappedBy = "blocks")
    private Set<Activity> activities = new HashSet<>();
    
   
    public Block() {
    	
    }

	public Block(Long id, Instant start, Instant end) {
		this.id = id;
		this.startMoment = start;
		this.endMoment = end;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getStart() {
		return startMoment;
	}

	public void setStart(Instant start) {
		this.startMoment = start;
	}

	public Instant getEnd() {
		return endMoment;
	}

	public void setEnd(Instant end) {
		this.endMoment = end;
	}

	public Set<Activity> getActivities() {
		return activities;
	}
	
}
