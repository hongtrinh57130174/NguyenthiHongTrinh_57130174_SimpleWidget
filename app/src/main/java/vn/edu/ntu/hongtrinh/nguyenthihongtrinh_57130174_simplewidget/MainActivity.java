package vn.edu.ntu.hongtrinh.nguyenthihongtrinh_57130174_simplewidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNS, edtSTK;
    RadioGroup rdgGioiTinh;
    CheckBox cbxemphiem, cbnghenhac, cbcafe, cbonha, cbnauan;
    Button btnXN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTen = findViewById(R.id.edtTen);
        edtNS = findViewById(R.id.edtNS);
        edtSTK = findViewById(R.id.edtSTK);
        rdgGioiTinh=findViewById(R.id.rdggioitinh);
        cbxemphiem=findViewById(R.id.cbxemphim);
        cbnghenhac=findViewById(R.id.cbnghenhac);
        cbcafe=findViewById(R.id.cbcafe);
        cbonha=findViewById(R.id.cbonha);
        cbnauan=findViewById(R.id.cbnauan);
        btnXN=findViewById(R.id.btnXN);
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ketqua = "";
                ketqua+="Tên bạn"+ edtTen.getText()+toString()+";";
                ketqua+="\n Ngày sinh "+ edtNS.getText().toString()+";";
                switch (rdgGioiTinh.getCheckedRadioButtonId()){
                    case R.id.rdtNam:ketqua+="\n Giới tính: nam";break;
                    case R.id.rdtNu:ketqua+="\n Giới tính: nữ";break;
                }
                ketqua+="\n Sở thích";
                if (cbxemphiem.isChecked()){
                    ketqua= ketqua+ cbxemphiem.getText().toString()+";";
                }
                if (cbnghenhac.isChecked()){
                    ketqua=ketqua+ cbnghenhac.getText().toString()+";";
                }
                if (cbcafe.isChecked()){
                    ketqua=ketqua + cbcafe.getText().toString()+";";
                }
                if (cbonha.isChecked()){
                    ketqua+=ketqua + cbonha.getText().toString()+";";
                }
                if (cbnauan.isChecked()){
                    ketqua=ketqua + cbnauan.getText().toString()+";";
                }
                ketqua+=btnXN.getText()+";";
                Toast.makeText(getApplicationContext(),ketqua,Toast.LENGTH_LONG).show();
            }
        });


    }

}
