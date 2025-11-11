package com.musab.spring_boot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service // where the bussiness logic written
public class SoftwareEngineerService {
   private final SoftwareEngineerRepository softwareEngineerRepository;

   public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
      this.softwareEngineerRepository = softwareEngineerRepository;
   }

   public List<SoftwareEngineer> getSoftwareEngineers() {
      return softwareEngineerRepository.findAll(); // get all records of software_engineer table
   }

   public void insertSoftwareEngineer(
      SoftwareEngineer softEngineer){
      softwareEngineerRepository.save(softEngineer);
   }
}