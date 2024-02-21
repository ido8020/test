package com.rubypaper.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "student")
@Entity
@Table(name="enrol0219")
@IdClass(EnrolPK.class)
public class Enrol {
	@Id
	private String sno;
	@Id
	private String cno;
	private String grade;
	private int mscore;
	private int fscore; 
	
	@ManyToOne //등록에서만 스튜던트 가져올 수 있게 설정
	@JoinColumn(name="s_sno",nullable = false) //FK넣고 null금지
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
		student.getEnrolList().add(this);
		
	}
}