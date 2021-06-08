package com.example.employeedataassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.employeedataassignment.Adapter.EmployeeAdapter;
import com.example.employeedataassignment.Database.EmployeeDatabase;
import com.example.employeedataassignment.Model.Employee;
import com.example.employeedataassignment.Network.Api;
import com.example.employeedataassignment.Repository.EmployeeRepository;
import com.example.employeedataassignment.ViewModel.EmployeeViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EmployeeViewModel employeeViewModel;
    private RecyclerView recyclerView;


    private static final String URL_DATA="http://karma.equinoxlab.com/betaDailyUpdateApi/Service1.svc/";

    private ArrayList< EmployeeDatabase.Employee > employeeList;
    private EmployeeRepository employeeRepository;
    private EmployeeAdapter employeeAdapter;
    private Object ArrayList;
    private Object Employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // recyclerView = findViewById(R.id.recyclerview);
        //  LinearLayoutManager manager = new LinearLayoutManager(this);
        RecyclerView recyclerView=( RecyclerView ) this.findViewById( R.id.recyclerview );


        // recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.setItemAnimator( new DefaultItemAnimator() );

         employeeAdapter.notifyDataSetChanged();

        employeeRepository=new EmployeeRepository( getApplication() );
        employeeList=new ArrayList<>();
        employeeAdapter=new EmployeeAdapter( this, employeeList );

        employeeViewModel=new ViewModelProvider( this ).get( EmployeeViewModel.class );

        employeeViewModel.getAllEmployee().getValue();
        Observer< ArrayList<Employee>{
            ArrayList< EmployeeDatabase.Employee>employees;
            public void onChanged(EmployeeDatabase.Employee){
                this.employeeList=employees;
                employees=employeeList;
                employeeAdapter.getAllEmployee( employeeList );
                recyclerView.setAdapter( employeeAdapter );
            }
        }

        networkRequest();

        }

    private void networkRequest() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl( URL_DATA )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        Api api=retrofit.create( Api.class );
        Call< ArrayList< EmployeeDatabase.Employee > > call=api.getAllEmployee();
        call.enqueue( new Callback< ArrayList< EmployeeDatabase.Employee > >() {
            @Override
            public void onResponse(Call< ArrayList< EmployeeDatabase.Employee > > call, Response< ArrayList< EmployeeDatabase.Employee > > response) {
                Log.d( "main", "onResponse " + response.body() );

                for (EmployeeDatabase.Employee e : employeeList) {
                    Log.d( "name", e.getName() );
                }

//                if (response.isSuccessful()) {
//                    employeeRepository.insert(response.body());
//                }
            }


            @Override
            public void onFailure(Call< ArrayList< EmployeeDatabase.Employee > > call, Throwable t) {
                Log.d( "main" + call, "onFailure " + t );
                Toast.makeText( MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT ).show();

            }


        } );

    }
}