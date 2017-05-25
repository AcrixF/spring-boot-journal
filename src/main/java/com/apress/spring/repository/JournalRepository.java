package com.apress.spring.repository;

import com.apress.spring.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by root on 25/05/17.
 */
public interface JournalRepository extends JpaRepository<Journal, Long> {

}
