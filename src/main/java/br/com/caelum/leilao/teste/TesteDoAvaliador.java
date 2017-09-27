/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.dominio.servico.Avaliador;
//import org.junit.Assert;
//import org.junit.Test;
import sun.applet.Main;

/**
 *
 * @author eliezer
 */
public class TesteDoAvaliador {
    
    public static void main(String[] args){
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
        System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        //Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        
        System.out.println(menorEsperado == leiloeiro.getMenorLance());
        //Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
    
}
