package br.com.logica;

import br.com.objs.CapaChuva;
import br.com.objs.GuardaChuva;

import java.util.ArrayList;
import java.util.List;

public class Vender {

    Integer estoqueCapaP = 10, estoqueCapaG = 10, estoqueGcP = 10, estoqueGcG = 10;

    public ArrayList<CapaChuva> pegaEstoqueCapas (Integer capaPVendida, Integer capaGVendida, Integer promocao){

        Double desconto = (promocao == 1) ? 0.75 : 1.0;

        ArrayList <CapaChuva> capas = new ArrayList<>();

        CapaChuva capaChuva = new CapaChuva();
        capaChuva.setTipoMaterial("Transparente");
        capaChuva.setPreco(15.0 * desconto);
        capaChuva.setTamanho("P");
        capaChuva.setEstoque(estoqueCapaP - capaPVendida);
        capas.add(capaChuva);

        capaChuva = new CapaChuva();
        capaChuva.setTipoMaterial("Fosco");
        capaChuva.setPreco(20.0 * desconto);
        capaChuva.setTamanho("G");
        capaChuva.setEstoque(estoqueCapaG - capaGVendida);
        capas.add(capaChuva);

        return capas;

    }

    public ArrayList<GuardaChuva> pegaEstoqueGc (Integer GcPVendido, Integer GcGVendido, Integer promocao) {

        Double desconto = (promocao == 1) ? 0.75 : 1.0;

        ArrayList<GuardaChuva> guardaChuvas = new ArrayList<>();

        GuardaChuva guardaChuva = new GuardaChuva();
        guardaChuva.setCor("Preto");
        guardaChuva.setTamanho("G");
        guardaChuva.setPreco(30.0* desconto);
        guardaChuva.setEstoque(estoqueGcG - GcGVendido);
        guardaChuvas.add(guardaChuva);

        guardaChuva = new GuardaChuva();
        guardaChuva.setCor("Branco");
        guardaChuva.setPreco(25.0* desconto);
        guardaChuva.setTamanho("P");
        guardaChuva.setEstoque(estoqueGcP - GcPVendido);
        guardaChuvas.add(guardaChuva);

        return guardaChuvas;
    }

    public GuardaChuva vendeGuardaChuva (String tamanho, Integer promocao){

        Double desconto = (promocao == 1) ? 0.75 : 1.0;

        GuardaChuva guardaChuva = new GuardaChuva();

        if (tamanho.equals("P")){
            guardaChuva.setCor("Branco");
            guardaChuva.setPreco(25.0* desconto);
            guardaChuva.setTamanho("P");

        }
        else {
            guardaChuva.setCor("Preto");
            guardaChuva.setTamanho("G");
            guardaChuva.setPreco(30.0* desconto);
        }

        return guardaChuva;


    }
    public CapaChuva vendeCapaChuva (String tamanho, Integer promocao){

        Double desconto = (promocao == 1) ? 0.75 : 1.0;

        CapaChuva capaChuva = new CapaChuva();

        if (tamanho.equals("P")){
            capaChuva.setTipoMaterial("Transparente");
            capaChuva.setPreco(15.0* desconto);
            capaChuva.setTamanho("P");

        }
        else {
            capaChuva.setTipoMaterial("Fosca");
            capaChuva.setTamanho("G");
            capaChuva.setPreco(20.0* desconto);
        }

        return capaChuva;


    }

    }

