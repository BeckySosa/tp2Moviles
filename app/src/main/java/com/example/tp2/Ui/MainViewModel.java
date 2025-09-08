package com.example.tp2.Ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp2.Modelo.Libro;
import com.example.tp2.Modelo.Repositorio;

public class MainViewModel extends AndroidViewModel {

    private MutableLiveData<String> mensajeMutable;
    private MutableLiveData<Libro> libroMutable;
    private Repositorio repositorio;

    public MainViewModel(@NonNull Application application) {
        super(application);
        repositorio=new Repositorio();
    }

    public LiveData<String> getMensajeMutable() {
        if (mensajeMutable == null) {
            mensajeMutable=new MutableLiveData<>();
        }
        return mensajeMutable;
    }

    public LiveData<Libro> getLibroMutable() {
        if (libroMutable == null) {
            libroMutable=new MutableLiveData<>();
        }
        return libroMutable;
    }
    public void buscarLibro(String nombre){
      Libro libro= repositorio.buscarLibro(nombre);
        if (libro == null) {
            mensajeMutable.setValue("No se encontro un libro con ese nombre");
        }else{
            libroMutable.setValue(libro);
        }
    }


}
