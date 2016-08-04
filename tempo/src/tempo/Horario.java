package tempo;

public class Horario {
  // atributos
  public final int horas, minutos, segundos;
  // final == constante (depois de atribuído)

  // construtor!
  // public NomeClasse(parâmetros)
  public Horario(int horas, int minutos, int segundos) {
    if (horas < 0 || horas > 23) {
      throw new IllegalArgumentException("hora invalida");
    }
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
    
  }

  // método
  public Horario adicionaHoras(int horas) {
    // Horario novoHorario = new Horario();
    // novoHorario.horas = (this.horas + horas) % 24;
    // novoHorario.minutos = this.minutos;
    // novoHorario.segundos = this.segundos;
    return new Horario((this.horas + horas) % 24,
                        this.minutos, this.segundos);
  }

  public Horario adicionaMinutos(int minutos) {
    int somaMinutos = this.minutos + minutos;
    int horas = somaMinutos / 60;
    int minutosSobram = somaMinutos % 60;
    // Horario novoHorario = new Horario();
    // novoHorario.horas = this.horas + horas;
    // novoHorario.minutos = minutosSobram;
    // novoHorario.segundos = this.segundos;
    return new Horario(this.horas + horas,
                       minutosSobram, this.segundos);
  }
}
