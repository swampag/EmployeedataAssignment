package com.example.employeedataassignment.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.employeedataassignment.Dao.EmployeeDao;
import com.example.employeedataassignment.Database.EmployeeDatabase;
import com.example.employeedataassignment.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    //private final ArrayList< Employee> _result;
    private EmployeeDatabase database;
    private LiveData<ArrayList<Employee>> getAllEmployee;

    public EmployeeRepository(Application application) {
        database = EmployeeDatabase.getInstance(application);
        getAllEmployee = database.employeeDao().getAllEmployee( );
    }

    public void insert(List<Employee> employeeList) {
        new InsertAsyncTask(database).execute((ArrayList<Employee>) employeeList);
    }


    public LiveData<ArrayList<Employee>> getAllEmployee() {
        return getAllEmployee;
    }

    static class InsertAsyncTask extends AsyncTask<ArrayList<Employee>, Void, Void> {
        private EmployeeDao employeeDao;
        private Object ArrayList;

        InsertAsyncTask(EmployeeDatabase employeeDatabase) {
            employeeDao = employeeDatabase.employeeDao();
        }


        @Override
        protected Void doInBackground(ArrayList<Employee>... arrayLists) {
           // employeeDao.insert(ArrayList[0]);
            employeeDao.insert( arrayLists[0]);
            return null;
        }
    }

}
