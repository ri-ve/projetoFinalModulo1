package Projeto;



public class Alunos extends Escola{
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	
	public Alunos ()//Construtor vazio 
	{
								
	}

	public Alunos (String nome, String tipo, String turma, int idade, int senha, int id)
	{		
       super (nome,tipo ,turma, idade,senha,id);
		
	}
	
	
public void feedbackAluno(){
		
		System.out.println("feedback do Aluno: ");
	}

public float mediaAluno() {
	media=nota1+nota2+nota3/3;
	return media;
}

public float getNota1() {
	return nota1;
}

public void setNota1(float nota1) {
	this.nota1 = nota1;
}

public float getNota2() {
	return nota2;
}

public void setNota2(float nota2) {
	this.nota2 = nota2;
}

public float getNota3() {
	return nota3;
}

public void setNota3(float nota3) {
	this.nota3 = nota3;
}

public float getMedia() {
	return media;
}

public void setMedia(float media) {
	this.media = media;
}

	
	
	
			
	}

	


