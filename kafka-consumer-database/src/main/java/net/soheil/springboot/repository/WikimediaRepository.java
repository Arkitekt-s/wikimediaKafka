package net.soheil.springboot.repository;

import net.soheil.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaData, Long> {
}
