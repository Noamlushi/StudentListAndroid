package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class StudentDetails extends AppCompatActivity {

    String name_user;
    String id_user;
    String phone_user;
    String address_user;
    Boolean cb_user;
    Integer pos_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        TextView name=findViewById(R.id.student_details_name);
        TextView id=findViewById(R.id.student_details__id);
        TextView phone=findViewById(R.id.student_details_phone);
        TextView address=findViewById(R.id.student_details_address);
        CheckBox cb=findViewById(R.id.student_details_cb);


        name_user=intent.getStringExtra("name");
        id_user=intent.getStringExtra("id");
        phone_user=intent.getStringExtra("phone");
        address_user=intent.getStringExtra("address");
        cb_user =intent.getBooleanExtra("cb",false);
        pos_user=intent.getIntExtra("pos",0);

        name.setText("name: "+name_user);
        id.setText("id: "+id_user);
        phone.setText("phone: "+phone_user);
        address.setText("address: "+address_user);
        cb.setChecked(cb_user);

    }

    public void editBtn(View view){
        Intent intent = new Intent(this,EditStudent.class);
        intent.putExtra("name",name_user);
        intent.putExtra("id",id_user);
        intent.putExtra("phone",phone_user);
        intent.putExtra("address",address_user);
        intent.putExtra("cb",cb_user);
        intent.putExtra("pos",pos_user);

        startActivity(intent);
        finish();
    }

}