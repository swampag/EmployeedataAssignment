package com.example.employeedataassignment.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.employeedataassignment.Model.Employee;
import com.example.employeedataassignment.Repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeViewModel extends AndroidViewModel {

    private EmployeeRepository employeeRepository;
    private LiveData< ArrayList<Employee> > getAllEmployee;

    public EmployeeViewModel(@NonNull Application application) {
        super(application);
        employeeRepository=new EmployeeRepository(getApplication());
        getAllEmployee=employeeRepository.getAllEmployee();
    }

    public void insert(List<Employee> list){
        employeeRepository.insert(list);
    }

    public LiveData<ArrayList<Employee>> getAllEmployee(){
        return getAllEmployee;
    }
}
