
package com.superpets.missionservice.repositories;

import com.superpets.missionservice.models.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
