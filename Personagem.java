package com.mycompany.lista01_poo;

public class Personagem {
    private int nivel;
    private int xp;
    private int manaAtual;
    private int manaMax;
    private int[] manaHab;
    private int[] nivelHab;
    //contado para melhorar a habilidade
    private int cont;
    
    public Personagem(int manaMax, int manaHab1, int manaHab2, int manaHab3, int manaHab4){
        this.nivel = 1;
        this.xp = 0;
        this.cont = 0;
        this.manaMax = manaMax;
        this.manaAtual = manaMax;
        this.manaHab = new int[4];
        this.nivelHab = new int[4];
        this.manaHab[0] = manaHab1;
        this.manaHab[1] = manaHab2;
        this.manaHab[2] = manaHab3;
        this.manaHab[3] = manaHab4;
    }
    private void imprimePersonagem(){
        System.out.println("___________________________________"+
                "\nNivel =" + this.nivel +
                "\nXp =" + this.xp+
                "\nManaMax =" + this.manaMax+
                "\nManaAtual =" + this.manaAtual+"\n"+
                "NivelHab0 =" + this.nivelHab[0]+
                "\nManaHab0 =" + this.manaHab[0]+
                "NivelHab0 =" + this.nivelHab[0]+
                "\nManaHab1 =" + this.manaHab[1]+
                "NivelHab1 =" + this.nivelHab[1]+
                "\nManaHab2 =" + this.manaHab[2]+
                "NivelHab2 =" + this.nivelHab[2]+
                "\nManaHab3 =" + this.manaHab[3]+
                "NivelHab3 =" + this.nivelHab[3]);
    }
    public int getNivel(){
        return nivel;
    }
    public void adicionarXP(int xpAdd){
        this.xp += xpAdd;
        this.nivel = (this.xp/100) +1;
        if(this.nivel > 25){
            this.nivel = 25;
        }
    }
    public boolean melhorarHabilidade(int h){
        boolean f = false;
        if(this.nivel > this.cont){
            switch(h){
                case 0:
                    if(this.nivelHab[0] < 4){
                        this.nivelHab[0]++;
                        this.manaHab[0] *= this.nivelHab[0];
                        f = true;
                    }else{
                        System.out.println("Nível máximo da habilidade 1 atingido");
                    }
                break;
                case 1:
                    if(this.nivelHab[1] < 4){
                        this.nivelHab[1]++;
                        this.manaHab[1] *= this.nivelHab[1];
                        f = true;
                    }else{
                        System.out.println("Nível máximo da habilidade 2 atingido");
                    }
                break;
                case 2:
                    if(this.nivelHab[2] < 4){
                        this.nivelHab[2]++;
                        this.manaHab[2] *= this.nivelHab[2];
                        f = true;
                    }else{
                        System.out.println("Nível máximo da habilidade 3 atingido");
                    }
                break;
                case 3:
                    if(this.nivel >= 6){
                        if(this.nivelHab[3] < 3){
                            this.nivelHab[3]++;
                            this.manaHab[3] *= this.nivelHab[3];
                            f = true;
                        }else{
                            System.out.println("Nível máximo da habilidade ULTIMATE (4) atingido");
                        }
                    }else{
                        System.out.println("Só é possível melhorar a habilidade ULTIMATE quando atingir o Personagem atingir o nível 6");
                    }
                break;
                default:
                break;    
            }
            
            this.cont++;
            return f;
        }else{
            return f;
        }
    }
    public boolean usarHabilidade(int h){
        if(h < 0 || h > 3){
            return false;
        }else{
            if(this.nivelHab[h] != 0){
                if(this.manaHab[h] > this.manaAtual){
                    return false;
                }else{
                    this.manaAtual -= this.manaHab[h];
                    return true;
                }
            }else{
                return false;
            }    
        }
    }
    public void consumirPocao(){
        int mana = 350;
        if(this.manaAtual + mana <= this.manaMax){
            this.manaAtual += mana;
        }else{
            this.manaAtual = this.manaMax;
        }
    }
}

