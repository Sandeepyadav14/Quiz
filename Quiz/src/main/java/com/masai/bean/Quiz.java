package com.masai.bean;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String question;
    private List<String> options;
    private String rightAnswer;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
