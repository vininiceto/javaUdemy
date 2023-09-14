package entities;

public class alunos {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double medium() {
		return note1 + note2 + note3;
	}
	public double missingPoints() {
		if(medium() < 60) {
			return 60 - medium();
		}
		else {
			return 0;
		}
	}
	}

