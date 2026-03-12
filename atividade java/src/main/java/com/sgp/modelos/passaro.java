package com.sgp.modelo;

public class Passaro {

    public String especie;
    public int idade;
    public double tamanho;

     //Construtor
    public Passaro(String especie, String idade int tamanho) {
        this.especie = especie;
        this.idade = idade;
        this.tamanho = tamanho;
    }

    //Construtor padrão
    public Passaro() {
        this.especie = "arara";
        this.idade = (5);
        this.tamanho = (30);
    }


    public void countruirninho(){
        if (!temMateriais) {
            System.out.println(especie + " precisa coletar gravetos e folhas primeiro.");
            coletarMateriais();
        }
    }

    public void exibirInformacoes() {
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Tamanho: " + tamanho);
    }

    public String getEspecie() {
        return especie;
    }
     public int getCor() {
        return idade;
    }

    // Defina uma nova especie para o passaro
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Defina uma nova cor para o passaro
    public void setCor(int idade) {
        this.idade = idade;
    }

    //defina um novo tamanho para o passaro
     public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
    return "Passaro [especie=" + especie + ", idade=" + idade + "tamanho=" + tamanho + "]";
    }

}