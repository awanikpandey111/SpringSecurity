package com.secure.notes.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data 
//generates getters and setters
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob //for larget objects as notes will have large content
    private String content;
    
	private String ownerUsername;

    @Override
	public String toString() {
		return "Note [id=" + id + ", content=" + content + ", ownerUsername=" + ownerUsername + "]";
	}

	public Note() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}

}


