package br.com;

import br.com.logica.LogicaPrevisao;
import br.com.objs.GuardaChuva;
import br.com.objs.PrevisaoTempo;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        LogicaPrevisao logicaPrevisao = new LogicaPrevisao();
        ArrayList<PrevisaoTempo> previsoesTempo = new ArrayList<>();


        Integer comando = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - ver previsao do tempo \n 2 - Comprar Guarda-Chuva ou Capa"));

        if(comando == 1){
            previsoesTempo =  logicaPrevisao.pegaPrevisoes();
            String todasPrevisoes = "";
            //comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Previsão do tempo = "+todasPrevisoes+" \n1 - Comprar Guarda-Chuva \n 2 - Comprar Capa"));

            for (PrevisaoTempo previsaoTempo:previsoesTempo) {
                String previsao = "";
                previsao = previsaoTempo.getDia() + "\nMáxima: " + previsaoTempo.getMaxima()+" | Minima: "+ previsaoTempo.getMinima() + " | Média: "+ previsaoTempo.getTemperaturaMedia() + "\nTempo: " + previsaoTempo.getEstado()+"\n ----------\n";
                todasPrevisoes = todasPrevisoes + previsao;
            }
            JOptionPane.showMessageDialog(null,todasPrevisoes);
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja comprar? \n 1 - Não \n 2 - Sim"));
        }if(comando == 2){
            JOptionPane.showInputDialog(null, "O que deseja comprar? \n 1 - Capa \n 2 - Guarda Chuva");
        }

    }
}
