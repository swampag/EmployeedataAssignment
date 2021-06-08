package com.example.employeedataassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeedataassignment.Database.EmployeeDatabase;
import com.example.employeedataassignment.MainActivity;
import com.example.employeedataassignment.R;

import java.util.ArrayList;

public class EmployeeAdapter< employeelist > extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private static Object employeelist;
    private static java.lang.Object ArrayList;
    private Context context;
   // private ArrayList<com.example.employeedataassignment.Adapter.Employee> employeeList;
   ArrayList<String>list =new ArrayList<String>();
    private java.lang.Object Object;

    public EmployeeAdapter(Context context, ArrayList<Object> employeeList) {
       this.context = context;
        this.employeelist = employeeList;
    }


    public EmployeeAdapter(MainActivity mainActivity, ArrayList<EmployeeDatabase.Employee> employeeList) {
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.each_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        EmployeeAdapter employee;
        employee=EmployeeAdapter.get(position);
        holder.name.setText("Name "+ ((EmployeeAdapter) employee));
        holder.deptname.setText("Deptname "+employee);

    }

    private static EmployeeAdapter get(int position) {
        return ( EmployeeAdapter ) ArrayList;

    }

    public int getAllEmployee(java.lang.Object employeeList){
        this.employeelist=(ArrayList.equals(Object));
        return 0;
    }

    @Override
    public int getItemCount()
            

    {
        return this.getAllEmployee( employeelist );
    }

    public static class EmployeeViewHolder extends RecyclerView.ViewHolder{
        public TextView name,deptname;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            deptname = itemView.findViewById(R.id.deptn);


        }
    }
}
