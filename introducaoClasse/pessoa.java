package introducaoClasse;

public class pessoa{ // Uma classe tem atributos ( caracteristicas) e os métodos (ações)
  private double peso;
  private double altura;
  private int idade;
  public String nome;  // get tem objetivo de retomar um valor que foi dado, o set ele atribui e recebe como argumento informação

public void setPeso(double peso){
    this.peso = peso;
}

public double getPeso(){
    return this.peso; 
}

public void setAltura(double altura){
      this.altura = altura;
}

public double getAltura(){
    return this.altura;
}

public void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return this.idade;
}

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
} 