
package com.superpets.missionservice;

import com.superpets.missionservice.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
