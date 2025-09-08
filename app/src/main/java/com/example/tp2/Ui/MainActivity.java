package com.example.tp2.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp2.Modelo.Libro;
import com.example.tp2.R;
import com.example.tp2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        mainViewModel= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        setContentView(binding.getRoot());
         mainViewModel.getLibroMutable().observe(this, new Observer<Libro>() {
             @Override
             public void onChanged(Libro libro) {
                 Intent intent=new Intent(MainActivity.this,DetalleActivity.class);
                 intent.putExtra("libro",libro);
                 startActivity(intent);
             }
         });
         mainViewModel.getMensajeMutable().observe(this, new Observer<String>() {
             @Override
             public void onChanged(String s) {
                 binding.tvMensaje.setText(s);
             }
         });

        binding.btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=binding.etNombre.getText().toString();
                mainViewModel.buscarLibro(nombre);
            }
        });




    }
}