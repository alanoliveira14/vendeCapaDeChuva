package br.com.logica;
import br.com.objs.PrevisaoTempo;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class LogicaPrevisao {

    public ArrayList<PrevisaoTempo> pegaPrevisoes(){

        ArrayList<PrevisaoTempo> previsaoTempos = new ArrayList<>();


        for ( int i =0; i < 7; i++){
            PrevisaoTempo previsaoTempo = new PrevisaoTempo();
            switch (i){
                case 0:
                    previsaoTempo.setPromocao(1);
                    previsaoTempo.setMinima(18);
                    previsaoTempo.setMaxima(30);
                    previsaoTempo.setDia("Domingo");
                    previsaoTempo.setEstado("Ensolarado");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;

                case 1:
                    previsaoTempo.setPromocao(0);
                    previsaoTempo.setMinima(16);
                    previsaoTempo.setMaxima(24);
                    previsaoTempo.setDia("Segunda");
                    previsaoTempo.setEstado("Chuva");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;

                case 2:
                    previsaoTempo.setPromocao(0);
                    previsaoTempo.setMinima(16);
                    previsaoTempo.setMaxima(24);
                    previsaoTempo.setDia("Terça");
                    previsaoTempo.setEstado("Nublado");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;

                case 3:
                    previsaoTempo.setPromocao(0);
                    previsaoTempo.setMinima(16);
                    previsaoTempo.setMaxima(24);
                    previsaoTempo.setDia("Quarta");
                    previsaoTempo.setEstado("Nublado");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;

                case 4:
                    previsaoTempo.setPromocao(0);
                    previsaoTempo.setMinima(16);
                    previsaoTempo.setMaxima(24);
                    previsaoTempo.setDia("Quinta");
                    previsaoTempo.setEstado("Chuva");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;

                case 5:
                    previsaoTempo.setPromocao(1);
                    previsaoTempo.setMinima(22);
                    previsaoTempo.setMaxima(33);
                    previsaoTempo.setDia("Sexta");
                    previsaoTempo.setEstado("Ensolarado");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;
                case 6:
                    previsaoTempo.setPromocao(1);
                    previsaoTempo.setMinima(21);
                    previsaoTempo.setMaxima(32);
                    previsaoTempo.setDia("Sabado");
                    previsaoTempo.setEstado("Ensolarado");
                    previsaoTempo.setTemperaturaMedia( ((previsaoTempo.getMaxima().doubleValue()+ previsaoTempo.getMinima().doubleValue())/2));
                    break;
            }
            previsaoTempos.add(previsaoTempo);
        }

        return previsaoTempos;
    }

}
