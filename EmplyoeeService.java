package com.employee.java;
 
import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class EmplyoeeService {
 
    @Autowired
    private EmplyoeeRepository repo;
     
    public List<Emplyoee> listAll() {
        return repo.findAll();
    }
     
    public void save(Emplyoee emplyoee) {
        repo.save(emplyoee);
    }
     
    public Product get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
