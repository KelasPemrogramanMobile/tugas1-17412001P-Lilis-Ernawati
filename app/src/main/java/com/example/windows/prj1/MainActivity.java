package com.example.windows.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNPM) EditText edNPM;
    @BindView(R.id.edNilaiTugas) EditText edNilaiTugas;
    @BindView(R.id.edNilaiQuiz) EditText edNilaiQuiz;
    @BindView(R.id.edNilaiUTS) EditText edNilaiUTS;
    @BindView(R.id.edNilaiUAS) EditText edNilaiUAS;

    @BindView(R.id.txtNama) EditText txtNama;
    @BindView(R.id.edNPM) EditText txtNPM;
    @BindView(R.id.edNilaiTugas) EditText txtNilaiTugas;
    @BindView(R.id.edNilaiQuiz) EditText txtNilaiQuiz;
    @BindView(R.id.edNilaiUTS) EditText txtNilaiUTS;
    @BindView(R.id.edNilaiUAS) EditText txtNilaiUAS;

    @OnClick(R.id.btnklik)
    void tampil(){

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
