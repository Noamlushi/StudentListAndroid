package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.ex2.model.Model;
import com.example.ex2.model.Student;

import java.util.List;

public class NewStudent extends AppCompatActivity {
    List<Student> data;
    EditText name;
    EditText id;
    EditText phone;
    EditText address;
    CheckBox cb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);
        data = Model.instance().getAllStudents();
        name=findViewById(R.id.new_student_plaintext_name);
        id=findViewById(R.id.new_student_plaintext_id);
        phone=findViewById(R.id.new_student_plaintext_phone);
        address=findViewById(R.id.new_student_plaintext_address);
        cb=findViewById(R.id.new_student_cb);
    }

    public void saveStudent(View view){
        String new_name=name.getText().toString();
        String new_id=id.getText().toString();
        String new_phone=phone.getText().toString();
        String new_address=address.getText().toString();
        Boolean new_ch=cb.isChecked();
        data.add(new Student(new_name,new_id,"",new_phone,new_address,new_ch));
        Intent intent = new Intent(this,StudentRecyclerList.class);
        startActivity(intent);
    }
    public void cancel(View view){
        finish();
    }


}