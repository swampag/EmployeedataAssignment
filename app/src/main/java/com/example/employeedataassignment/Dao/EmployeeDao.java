package com.example.employeedataassignment.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.employeedataassignment.Model.Employee;

import java.util.ArrayList;

@Dao
public interface EmployeeDao {
    //opertaions to be performed on table
  //  @Insert(onConflict = OnConflictStrategy.REPLACE)
    //void insert(ArrayList<Employee> employeeList);

   // @Query("SELECT * FROM employeetable")
   // default LiveData< ArrayList< Employee > > getAllEmployee(ArrayList< Employee > _result) {
    //    return null;
    //}

  //  @Query("DELETE FROM employeetable")
    //void deleteAll();

    @Query("SELECT * FROM employeetable")
    default ArrayList< Employee > getAll() {
        return null;
    }

    @Insert
    void insert(Employee employeetable);

   // LiveData< ArrayList< Employee>> getAllEmployee();
}
