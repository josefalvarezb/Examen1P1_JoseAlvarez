/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_josealvarez;

import java.util.Scanner;
import java.util.Random;

public class Examen1P1_JoseAlvarez {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri Fuerza");
        System.out.println("3. Salir");
        int opcion = leer.nextInt();
        
        
        while(opcion > 0 && opcion <=2){
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese maestria");
                    System.out.println("1. Principiante (0% de hit extra)");
                    System.out.println("2. Intermedio (5% de hit extra)");
                    System.out.println("3. Experto (15% de hit extra)");
                    int opcionDificultad = leer.nextInt();
                    
                    switch(opcionDificultad){
                        case 1: 
                            
                            Random aleatorio = new Random();
                            int aleatorioZombie = aleatorio.nextInt(16)+15;
                            
                            System.out.println("El zombie se encuentra a: " + aleatorioZombie + " metros!");
                            
                            int contadorbalas = 25;
                            System.out.println("El jugador cuenta con: " + contadorbalas + " balas!");
                            
                            
                            int aleatorioHit = aleatorio.nextInt(101);
                            int aleatorioDañoZombie = 0;
                            int distanciaZombie = aleatorio.nextInt(3)+3;
                            int distanciaZombiejugador = 0;
                            int vidaZombie = 25;
                            
                            
                            if(aleatorioHit <= 65){
                                contadorbalas--;
                                aleatorioDañoZombie = aleatorio.nextInt(7)+1;
                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + aleatorioDañoZombie + "!");
                                
                                vidaZombie = vidaZombie - aleatorioDañoZombie;
                                System.out.println("Vida restante del zombie: " + vidaZombie);
                                
                                System.out.println("El zombie se encuentra a: " + aleatorioZombie + " metros");
                            }
                            else{
                                aleatorioZombie = aleatorioZombie - distanciaZombie;
                                System.out.println("Ha fallado! El zombie se encuentra a: " + aleatorioZombie + " metros");
                            }
                            
                            
                            System.out.println("Listo para la siguiente ronda? [S/N]");
                            char caracter = leer.next().charAt(0);  
                            
                            
                            while(caracter == 's' || caracter == 'S' && aleatorioZombie > 0 && vidaZombie > 0 && aleatorioDañoZombie > 0){
                                
                                
                                
                                 aleatorioHit = aleatorio.nextInt(101);
                                 aleatorioDañoZombie = aleatorio.nextInt(7)+1;
                                 
                                 
                                 
                                System.out.println("El jugador cuenta con: "+ contadorbalas + " balas!");
                                
                                
                                if(aleatorioHit <= 65){
                                    contadorbalas--;
                                    vidaZombie = vidaZombie - aleatorioDañoZombie;
                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + aleatorioDañoZombie + "!");
                                System.out.println("Vida restante del zombie: " + vidaZombie);
                                System.out.println("El zombie se encuentra a: " + aleatorioZombie + " metros");
                                }
                                else{
                                    //distanciaZombiejugador = distanciaZombiejugador - distanciaZombie;
                                    if(distanciaZombiejugador - distanciaZombie <= 0){
                                     distanciaZombiejugador = 0;
                                    } else{
                                        distanciaZombiejugador= distanciaZombiejugador - distanciaZombie;
                                        System.out.println("Ha fallado! El zombie se encuentra a: " + distanciaZombiejugador + " metros");
                                        }
                                }
                            }
                                
                                if(vidaZombie <= 0){
                                    System.out.println("You win has logrado vencer el zombie");
                                }
                                else if(aleatorioZombie <= 0){
                                    System.out.println("GAME OVER, la distancia se redujo a cero");
                                }
                                else if (contadorbalas <= 0) {
                                    System.out.println("Perdio se quedo sin balas");
                                }
                                break;
                                
                                
                case 2:  
                            int aleatorioZombie2 = aleatorio.nextInt(16)+15;
                            
                            System.out.println("El zombie se encuentra a: " + aleatorioZombie2 + " metros!");
                            
                            int contadorbalas2 = 25;
                            System.out.println("El jugador cuenta con: " + contadorbalas2 + " balas!");
                            
                            
                            int aleatorioHit2 = aleatorio.nextInt(101);
                            int aleatorioDañoZombie2 = 0;
                            int distanciaZombie2 = aleatorio.nextInt(3)+3;
                            int distanciaZombiejugado2 = 0;
                            int vidaZombie2 = 25;
                            
                            
                            if(aleatorioHit2 <= 65){
                                contadorbalas2--;
                                aleatorioDañoZombie = aleatorio.nextInt(7)+1;
                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + aleatorioDañoZombie + "!");
                                
                                vidaZombie = vidaZombie2 - aleatorioDañoZombie;
                                System.out.println("Vida restante del zombie: " + vidaZombie);
                                
                                System.out.println("El zombie se encuentra a: " + aleatorioZombie2 + " metros");
                            }
                            else{
                                aleatorioZombie = aleatorioZombie2 - distanciaZombie2;
                                System.out.println("Ha fallado! El zombie se encuentra a: " + aleatorioZombie + " metros");
                            }
                            
                            
                            System.out.println("Listo para la siguiente ronda? [S/N]");
                            char caracter2 = leer.next().charAt(0);  
                            
                            
                            while(caracter2 == 's' || caracter2 == 'S' && aleatorioZombie2 > 0 && vidaZombie2 > 0 && aleatorioDañoZombie2 > 0){
                                
                                
                                
                                 aleatorioHit = aleatorio.nextInt(101);
                                 aleatorioDañoZombie = aleatorio.nextInt(7)+1;
                                 
                                 
                                 
                                System.out.println("El jugador cuenta con: "+ contadorbalas2 + " balas!");
                                
                                
                                if(aleatorioHit <= 65){
                                    contadorbalas2--;
                                    vidaZombie = vidaZombie2 - aleatorioDañoZombie;
                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + aleatorioDañoZombie + "!");
                                System.out.println("Vida restante del zombie: " + vidaZombie);
                                System.out.println("El zombie se encuentra a: " + aleatorioZombie2 + " metros");
                                }
                                else{
                                    //distanciaZombiejugador = distanciaZombiejugador - distanciaZombie;
                                    if(distanciaZombiejugador2 - distanciaZombie2 <= 0){
                                     distanciaZombiejugador2 = 0;
                                    } else{
                                        distanciaZombiejugador2= distanciaZombiejugador - distanciaZombie2;
                                        System.out.println("Ha fallado! El zombie se encuentra a: " + distanciaZombiejugador + " metros");
                                        }
                                }
                                
                                if(vidaZombie2 <= 0){
                                    System.out.println("You win has logrado vencer el zombie");
                                }
                                else if(aleatorioZombie2 <= 0){
                                    System.out.println("GAME OVER, la distancia se redujo a cero");
                                }
                                else if (contadorbalas2 <= 0) {
                                    System.out.println("Perdio se quedo sin balas");
                                }
                            }
                    
                                
                                
                                
                
                                
                                
                                
                }// fin switch opcionDificultad
                                    
                            
                            
                                
                                
                                
                                
                                
                                
                                System.out.println("Listo para la siguiente ronda? [S/N]");
                                caracter2 = leer.next().charAt(0);
                            }
        
    
                            
                            
                    
                    

            
                case 2: 
                    
                    System.out.print("Ingrese la altura del triángulo: ");
                    int altura = leer.nextInt();

                    for (int i = 1; i <= altura; i++) {
            
                    for (int j = 1; j <= altura - i; j++) {
                     System.out.print(" ");
                    }

            
                    for (int k = 1; k <= 2 * i - 1; k++) {
                      System.out.print("*");
            }

            
            System.out.println();
        }        
                    
                    
                    
            
            
            
            
            
            
            
            
            }// fin switch grande
            
        
        
        
        
        
        
        

        
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri Fuerza");
        System.out.println("3. Salir");
        opcion = leer.nextInt();
        
        }
}
        
        
    

     
