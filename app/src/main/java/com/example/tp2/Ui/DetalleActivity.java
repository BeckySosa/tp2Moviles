package com.example.tp2.Ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp2.R;
import com.example.tp2.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    ActivityDetalleBinding binding;

    DetalleViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(DetalleViewModel.class);

        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        viewModel.getLibroMutable().observe(this, libro -> {
            binding.tvTitulo.setText(libro.getTitulo());
            binding.tvAutor.setText(libro.getAutor());
            binding.tvAnio.setText(libro.getAnio()+"");
            binding.tvDescripcion.setText(libro.getDescripcion());
            binding.ivImagen.setImageResource(libro.getImagen());
        });

        viewModel.mostrarLibro(getIntent());

    }
    }
