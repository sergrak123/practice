package com.ssischaefer.ssi_shaefer.repository;

import com.ssischaefer.ssi_shaefer.entity.LocationEntity;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepo extends CrudRepository<LocationEntity,String> {
}
