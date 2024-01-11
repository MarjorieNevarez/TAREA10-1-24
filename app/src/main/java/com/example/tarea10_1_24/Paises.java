package com.example.tarea10_1_24;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Paises {
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Nombre = capital;
    }
    public String getUrlLogo() {
        return UrlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        UrlLogo = urlLogo;
    }
    public Paises (JSONObject a, String CountryCode) throws JSONException {
        Nombre = a.getString("Name").toString();
        UrlLogo = "http://www.geognos.com/api/en/countries/flag/" + CountryCode + ".png";
    }
    public static ArrayList<Paises> JsonObjectsBuild(JSONObject datos) throws JSONException {
        ArrayList<Paises> lstpaises = new ArrayList<>();
        Iterator<String> keys = datos.keys();
        while (keys.hasNext()) {
            String CountryCode = keys.next();
            JSONObject a = datos.getJSONObject(CountryCode);
            lstpaises.add(new Paises(a, CountryCode));
        }
        return lstpaises;
    }
    String Nombre, Capital, UrlLogo;
}