package com.example.tp2.Ui;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tp2.Modelo.Libro;

public class DetalleViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroMutable;
    public DetalleViewModel(@NonNull Application application) {
        super(application);

    }
    public LiveData<Libro> getLibroMutable(){
        if(libroMutable==null){
           libroMutable= new MutableLiveData<>();
        }
        return libroMutable;
    }

   public void mostrarLibro(Intent intent){
        Libro libro=intent.getSerializableExtra("libro",Libro.class);
        libroMutable.setValue(libro);
   }

}
