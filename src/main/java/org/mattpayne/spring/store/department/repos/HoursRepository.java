package org.mattpayne.spring.store.department.repos;

import org.mattpayne.spring.store.department.domain.HoursReport;
import org.mattpayne.spring.store.department.model.HoursReportDTO;
import org.mattpayne.spring.store.department.model.WorkInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoursRepository {
    List<WorkInfo> getHoursReport(); // TODO: Add a since parameter

}
