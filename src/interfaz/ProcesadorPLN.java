package interfaz;

import java.util.HashMap;

public class ProcesadorPLN {
    
    private HashMap <String , String> diccionarioPLN ;
    
    public ProcesadorPLN() {
        diccionarioPLN = new HashMap<>();
        cargarDiccionario();

    }
    private void cargarDiccionario(){
        diccionarioPLN.put("peli", "pelicula");
        diccionarioPLN.put("cinta", "pelicula");
        diccionarioPLN.put("filme", "pelicula");
        diccionarioPLN.put("Largometraje", "pelicula");
      
    }
public String procesadorTexto (String entrada){
    String textoLimpio = entrada.toLowerCase().replaceAll("[,.]", "");
    String[] palabras = textoLimpio.split("");
    StringBuilder textoTraducido = new StringBuilder();

    for(String palabra : palabras ){
        if (diccionarioPLN.containsKey(palabra)) {
            textoTraducido.append(diccionarioPLN.get(palabra)).append(" ");
        } else {
            textoTraducido.append(palabra);
        }
    }
    return textoTraducido.toString().trim();
}
}