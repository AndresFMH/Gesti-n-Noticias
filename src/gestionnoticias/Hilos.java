/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnoticias;

import java.util.ArrayList;

public class Hilos extends Thread {
    private final Noticias noticias;

    public Hilos(Noticias noticias) {
        this.noticias = noticias;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Espera 5 segundos antes de continuar
                Thread.sleep(5000);

                // Lógica para obtener la próxima noticia
                RegistroNoticia nuevaNoticia = noticias.obtenerProximaNoticia();

                // Actualiza la interfaz de usuario en la clase Noticias
                noticias.actualizarInterfaz(nuevaNoticia);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
   

