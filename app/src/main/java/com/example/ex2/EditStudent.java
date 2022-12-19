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

public class EditStudent extends AppCompatActivity {
    List<Student> data;
    EditText name;
    EditText id;
    EditText phone;
    EditText address;
    CheckBox cb;
    Integer pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_studnet);

        data = Model.instance().getAllStudents();
        name=findViewById(R.id.edit_student_plaintext_name);
        id=findViewById(R.id.edit_student_plaintext_id);
        phone=findViewById(R.id.edit_student_plaintext_phone);
        address=findViewById(R.id.edit_student_plaintext_address);
        cb=findViewById(R.id.edit_student_cb);



        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        id.setText(intent.getStringExtra("id"));
        phone.setText(intent.getStringExtra("phone"));
        address.setText(intent.getStringExtra("address"));
        cb.setChecked(intent.getBooleanExtra("cb",false));
        pos=(intent.getIntExtra("pos",0));


    }

    public void saveBtn(View view){
     Student st = data.get(pos);
        st.name=name.getText().toString();
        st.id=id.getText().toString();
        st.phone=phone.getText().toString();
        st.address=address.getText().toString();
        st.cb=cb.isChecked();
        Intent intent = new Intent(this,StudentRecyclerList.class);
        startActivity(intent);
    }

    public void cancelBtn(View view){
     Intent intent = new Intent(this,StudentRecyclerList.class);
     startActivity(intent);
    }

    public void deleteBtn(View view){
    data.remove(data.get(pos));
    Intent intent = new Intent(this,StudentRecyclerList.class);
    startActivity(intent);
    }


}