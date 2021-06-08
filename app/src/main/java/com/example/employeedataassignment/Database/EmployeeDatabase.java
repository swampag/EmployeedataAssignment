package com.example.employeedataassignment.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.employeedataassignment.Dao.EmployeeDao;
import com.example.employeedataassignment.Model.Employee;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Database(entities = {Employee.class},version = 2)
public abstract class EmployeeDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "EmployeeDatabase";
    public static Object Employee;

    public abstract EmployeeDao employeeDao();

    private static volatile EmployeeDatabase INSTANCE;

    public static EmployeeDatabase getInstance(Context context) {
        if(INSTANCE == null)
        {
            synchronized (EmployeeDatabase.class){
                if (INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context,EmployeeDatabase.class,DATABASE_NAME)
                            .addCallback(callback)
                            .fallbackToDestructiveMigration()
                            .build();

                }
            }
        }
        return INSTANCE;
    }

   static Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateAsyncTask(INSTANCE);

        }
    };
    static class PopulateAsyncTask extends AsyncTask<Void,Void,Void>
    {
        private EmployeeDao employeeDao;
        PopulateAsyncTask(EmployeeDatabase employeeDatabase)
        {
            employeeDao=employeeDatabase.employeeDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            employeeDao.deleteAll();
            return null;
        }
    }

    //@Generated("jsonschema2pojo")
    public static class Employee {

        @SerializedName("TODAYS_COUNT")
        @Expose
        private Object todaysCount;
        @SerializedName("age")
        @Expose
        private String age;
        @SerializedName("created_on")
        @Expose
        private Object createdOn;
        @SerializedName("dept_id")
        @Expose
        private String deptId;
        @SerializedName("dept_name")
        @Expose
        private String deptName;
        @SerializedName("email_id")
        @Expose
        private String emailId;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("is_deleted")
        @Expose
        private Object isDeleted;
        @SerializedName("mobile")
        @Expose
        private String mobile;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("password")
        @Expose
        private Object password;
        @SerializedName("profile_img")
        @Expose
        private Object profileImg;
        @SerializedName("reporting_to_id")
        @Expose
        private Object reportingToId;
        @SerializedName("reporting_to_name")
        @Expose
        private Object reportingToName;
        @SerializedName("role_id")
        @Expose
        private Object roleId;
        @SerializedName("role_name")
        @Expose
        private Object roleName;
        @SerializedName("token")
        @Expose
        private Object token;
        @SerializedName("updated_on")
        @Expose
        private Object updatedOn;
        @SerializedName("user_id")
        @Expose
        private String userId;

        public Object getTodaysCount() {
            return todaysCount;
        }

        public void setTodaysCount(Object todaysCount) {
            this.todaysCount=todaysCount;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age=age;
        }

        public Object getCreatedOn() {
            return createdOn;
        }

        public void setCreatedOn(Object createdOn) {
            this.createdOn=createdOn;
        }

        public String getDeptId() {
            return deptId;
        }

        public void setDeptId(String deptId) {
            this.deptId=deptId;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName=deptName;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId=emailId;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender=gender;
        }

        public Object getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Object isDeleted) {
            this.isDeleted=isDeleted;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile=mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name=name;
        }

        public Object getPassword() {
            return password;
        }

        public void setPassword(Object password) {
            this.password=password;
        }

        public Object getProfileImg() {
            return profileImg;
        }

        public void setProfileImg(Object profileImg) {
            this.profileImg=profileImg;
        }

        public Object getReportingToId() {
            return reportingToId;
        }

        public void setReportingToId(Object reportingToId) {
            this.reportingToId=reportingToId;
        }

        public Object getReportingToName() {
            return reportingToName;
        }

        public void setReportingToName(Object reportingToName) {
            this.reportingToName=reportingToName;
        }

        public Object getRoleId() {
            return roleId;
        }

        public void setRoleId(Object roleId) {
            this.roleId=roleId;
        }

        public Object getRoleName() {
            return roleName;
        }

        public void setRoleName(Object roleName) {
            this.roleName=roleName;
        }

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
            this.token=token;
        }

        public Object getUpdatedOn() {
            return updatedOn;
        }

        public void setUpdatedOn(Object updatedOn) {
            this.updatedOn=updatedOn;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId=userId;
        }


        public String getDept_name() {
            return deptName;
        }
    }
}
