package com.example.employeedataassignment.Network;

import com.example.employeedataassignment.Database.EmployeeDatabase;
import com.example.employeedataassignment.Model.Employee;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("getManager")
    Call<ArrayList<EmployeeDatabase.Employee>>getAllEmployee();
}
