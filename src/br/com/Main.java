package br.com;

import br.com.logica.LogicaPrevisao;
import br.com.logica.Vender;
import br.com.objs.CapaChuva;
import br.com.objs.GuardaChuva;
import br.com.objs.PrevisaoTempo;

import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        LogicaPrevisao logicaPrevisao = new LogicaPrevisao();
        ArrayList<PrevisaoTempo> previsoesTempo = new ArrayList<>();

        Integer capasPVendidas = 0;
        Integer capasGVendidas = 0;
        Integer guardaChuvasPVendidos = 0;
        Integer guardaChuvasGVendidos = 0;
        Integer diaSemana = pegaIndexDiaPromocao(LocalDateTime.now().getDayOfWeek());

        boolean repete = true;
        while (repete){
            Integer comando = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - ver previsao do tempo \n 2 - Comprar Guarda-Chuva ou Capa"));


            previsoesTempo =  logicaPrevisao.pegaPrevisoes();
            if(comando == 1){
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
                Vender vender = new Vender();

                 ArrayList<CapaChuva> capaChuvas = vender.pegaEstoqueCapas(capasPVendidas, capasGVendidas, previsoesTempo.get(diaSemana).getPromocao());
                 ArrayList<GuardaChuva> guardaChuvas = vender.pegaEstoqueGc(guardaChuvasPVendidos, guardaChuvasGVendidos, previsoesTempo.get(diaSemana).getPromocao());
                 JOptionPane.showMessageDialog(null, "Estoque: \nCapa P = " + capaChuvas.get(0).getEstoque() + " unidades R$ "+capaChuvas.get(0).getPreco()+"\nCapa G " + capaChuvas.get(1).getEstoque() + " unidades R$ "+capaChuvas.get(1).getPreco()+"\nGuarda-Chuva P " + guardaChuvas.get(1).getEstoque() + " unidades R$ "+guardaChuvas.get(1).getPreco()+"\nGuarda-Chuva G " + guardaChuvas.get(0).getEstoque() + " unidades R$" + guardaChuvas.get(0).getPreco());

                comando = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja comprar? \n 1 - Capa \n 2 - Guarda Chuva"));
                if(comando == 1){
                    comando = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja comprar? \n 1 - Capa P \n 2 - Capa G"));
                    if(comando == 1 && capaChuvas.get(0).getEstoque() > 0){

                        JOptionPane.showMessageDialog(null, "Você comprou uma capa de tamanho: " + capaChuvas.get(0).getTamanho() + " de material: " + capaChuvas.get(0).getTipoMaterial() + " por: R$ " + capaChuvas.get(0).getPreco() + "\n  ESTOQUE RESTANTE: " + (capaChuvas.get(0).getEstoque() -1) + " capas");

                        capasPVendidas +=1;
                    }else if(comando == 2 && capaChuvas.get(1).getEstoque() > 0){
                        JOptionPane.showMessageDialog(null, "Você comprou uma capa de tamanho: " + capaChuvas.get(1).getTamanho() + " de material: " + capaChuvas.get(1).getTipoMaterial() + " por: R$ " + capaChuvas.get(1).getPreco() + "\n  ESTOQUE RESTANTE: " + (capaChuvas.get(1).getEstoque() -1) + " capas");

                        capasGVendidas += 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Não há estoque!");
                    }
                    comando = 0;
                }else if (comando == 2){

                    comando = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja comprar? \n 1 - Guarda Chuva P \n 2 - Guarda Chuva G"));
                    if(comando == 1 && guardaChuvas.get(1).getEstoque() > 0){
                        JOptionPane.showMessageDialog(null, "Você comprou um guarda-chuva de tamanho: " + guardaChuvas.get(1).getTamanho() + " de cor: " + guardaChuvas.get(1).getCor() + " por: R$ " + guardaChuvas.get(1).getPreco() + "\n  ESTOQUE RESTANTE: " + (guardaChuvas.get(1).getEstoque() -1) + " guarda-chuvas");
                        guardaChuvasPVendidos += 1;
                    }  else if(comando == 2 && guardaChuvas.get(0).getEstoque() > 0){
                        JOptionPane.showMessageDialog(null, "Você comprou um guarda-chuva de tamanho: " + guardaChuvas.get(0).getTamanho() + " de cor: " + guardaChuvas.get(0).getCor() + " por: R$ " + guardaChuvas.get(0).getPreco() + "\n  ESTOQUE RESTANTE: " + (guardaChuvas.get(0).getEstoque() -1) + " guarda-chuvas");
                        guardaChuvasGVendidos += 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Não há estoque!");
                    }
                }


            }
            comando = 0;
        }


    }


    public static Integer pegaIndexDiaPromocao(DayOfWeek diaDaSemana){
        switch (diaDaSemana){
            case SUNDAY:
                return 1;
            case MONDAY:
                return 2;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 4;
            case THURSDAY:
                return 5;
            case FRIDAY:
                return 6;
            case SATURDAY:
                return 0;
        }
        return 0;
    }

}
