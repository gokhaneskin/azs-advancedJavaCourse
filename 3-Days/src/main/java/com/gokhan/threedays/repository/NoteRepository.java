package com.gokhan.threedays.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gokhan.threedays.model.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

	@Query("select n from Note n where n.number > ?1")
	List<Note> findNumber(int number);
}