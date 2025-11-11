package com.musab.spring_boot;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musab.spring_boot.exception.ResourceNotFoundException;

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
         SoftwareEngineer softwareEngineer) {
      softwareEngineerRepository.save(softwareEngineer);
   }

   public SoftwareEngineer getSoftwareEngineerById(Integer id) {
      return softwareEngineerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Software engineer with id " + id + " not found"));
   }

   public void removeSoftwareEngineerById(Integer id) {
      boolean exists = softwareEngineerRepository.existsById(id);
      if (!exists) {
         throw new ResourceNotFoundException("Software engineer with id " + id + " not found");
      } else {
         softwareEngineerRepository.deleteById(id);
      }
   }
}