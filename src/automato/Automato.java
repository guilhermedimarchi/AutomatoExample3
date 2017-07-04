/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Automato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      String entrada="";
      boolean valido = false;
      int op = Integer.parseInt(JOptionPane.showInputDialog("Exercicio(1-5): "));
      if(op!=5)
          entrada = JOptionPane.showInputDialog("Entrada: ");
      switch(op)
      {
          case 1:
              valido = ex1a(entrada);
              break;
          case 2:
              valido = ex1b(entrada);
              break;
          case 3:
              valido = ex1c(entrada);
              break;
          case 4:
              valido = ex1d(entrada);
              break;
          default:
              ex2();
              break;
      }
        

     if(valido)
        System.out.println("Palavra valida");
     else
        System.out.println("Palavra invalida");

    }
    
    
    public static boolean  verificaAlfabeto(String entrada)
    {
        for(char c : entrada.toCharArray())
        {
            if(c!='1' && c!='0')
                return false;
        }
        
        return true;
    }
    
    public static boolean  ex1a(String entrada)
    {
      int estado =0;
      boolean valido=false;
      
        if(verificaAlfabeto(entrada))
        {
            for(char c : entrada.toCharArray())
            {
                  switch(estado)
                  {
                      case 0:
                          if(c=='0')
                              estado = 0;
                          else
                              estado = 1;
                          break;
                      case 1:
                          if(c=='0')
                              estado = 1;
                          else
                              estado = 2;
                          break;
                      case 2:
                          if(c=='0')
                              estado = 2;
                          else
                              estado = 3;
                          break;
                      case 3:
                          if(c=='0')
                              estado = 3;
                          else
                              estado = 3;
                          break;
                  }
            }
          if(estado==3) valido = true;
        }
  
        return valido;
    }
    
    public static boolean  ex1b(String entrada)
    {
      int estado =0;
      boolean valido=false;
      
        if(verificaAlfabeto(entrada))
        {
            for(char c : entrada.toCharArray())
            {
                  switch(estado)
                  {
                      case 0:
                          if(c=='0')
                              estado = 1;
                          else
                              estado = 2;
                          break;
                      case 1:
                          if(c=='0')
                              estado = 0;
                          else
                              estado = 0;
                          break;
                      case 2:
                          if(c=='0')
                              estado = 0;
                          else
                              estado = 0;
                          break;
                     
                  }
            }
          if(estado==2) valido = true;
        }
  
        return valido;
    }
            
    public static boolean  ex1c(String entrada)
    {
      int estado =0;
      boolean valido=false;
      
        if(verificaAlfabeto(entrada))
        {
            for(char c : entrada.toCharArray())
            {
                  switch(estado)
                  {
                      case 0:
                          if(c=='0')
                              estado = 2;
                          else
                              estado = 1;
                          break;
                      case 1:
                          if(c=='0')
                              estado = 2;
                          else
                              estado = 1;
                          break;
                      case 2:
                          if(c=='0')
                              estado = 2;
                          else
                              estado = 3;
                          break;
                      case 3:
                          if(c=='0')
                              estado = 4;
                          else
                              estado = 1;
                          break;
                      case 4:
                          if(c=='0')
                              estado = 2;
                          else
                              estado = 5;
                          break;
                       case 5:
                          if(c=='0')
                              estado = 5;
                          else
                              estado = 5;
                          break;
                  }
            }
          if(estado==5) valido = true;
        }
  
        return valido;
    }
    
    public static boolean  ex1d(String entrada)
    {
      int estado =0;
      boolean valido=false;
      
        if(verificaAlfabeto(entrada))
        {
            for(char c : entrada.toCharArray())
            {
                  switch(estado)
                  {
                      case 0:
                          if(c=='0')
                              estado = 1;
                          else
                              estado = 5;
                          break;
                      case 1:
                          if(c=='0')
                              estado = 3;
                          else
                              estado = 2;
                          break;
                      case 2:
                          if(c=='0')
                              estado = 6;
                          else
                              estado = -1;
                          break;
                      case 3:
                          if(c=='0')
                              estado = 3;
                          else
                              estado = 6;
                          break;
                      case 4:
                          if(c=='0')
                              estado = 6;
                          else
                              estado = -1;
                          break;
                       case 5:
                          if(c=='0')
                              estado = 4;
                          else
                              estado = -1;
                          break;
                          
                       case 6:
                          if(c=='0')
                              estado = 6;
                          else
                              estado = -1;
                          break;
                       
                  }
            }
          if(estado==6) valido = true;
        }
  
        return valido;
    }
    
    
    
    public static void ex2()
    {
        int op=0;
        int op1=0;
        int temperatura=0;
        int volume=0;
        while(true)
        {
            
            switch(op)
            {
                
                
                case 0:
                    op = Integer.parseInt(JOptionPane.showInputDialog("1-Controle de ar condicionado\n2-Controle de som\n"));
                    break;
                
                case 1:
                    op1=0;
                    while(op1!=3)
                    {
                        System.out.println("Temperatura: " + temperatura);
                         op1 = Integer.parseInt(JOptionPane.showInputDialog("Controle de ar condicionado\n1-aumentar temperatura\n2-diminuir temperatura\n3-Voltar"));

                         if(op1==1)
                             temperatura++;
                         else if(op1==2)
                             temperatura--;
                         else
                             op=0;
                    }    
                    break;
                    
                case 2:
                    op1=0;
                    while(op1!=3)
                    {
                        System.out.println("Volume: " + volume);
                        op1 = Integer.parseInt(JOptionPane.showInputDialog("Controle do som\n1-aumentar volume\n2-diminuir volume\n3-Voltar"));
                        if(op1==1)
                            volume++;
                        else if(op1==2)
                            volume--;
                        else
                            op=0;
                    }   
                    break;
                    
                    
                
                
            }
            
            
            
        }
        
        
    }
    
    
    
    
    
    
}
