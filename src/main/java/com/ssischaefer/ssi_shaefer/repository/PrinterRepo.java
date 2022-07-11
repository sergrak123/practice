package com.ssischaefer.ssi_shaefer.repository;

import com.ssischaefer.ssi_shaefer.entity.PrinterEntity;
import org.springframework.data.repository.CrudRepository;

public interface PrinterRepo extends CrudRepository<PrinterEntity,String> {
}
