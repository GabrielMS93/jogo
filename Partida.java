import java.util.Random;

public class Partida {
    public Times timeA;
    public Times timeB;
    public int golA;
    public int golB;

    public Partida(Times timeA, Times timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Times getTimeA() {
        return timeA;
    }

    public void setTimeA(Times timeA) {
        this.timeA = timeA;
    }

    public Times getTimeB() {
        return timeB;
    }

    public void setTimeB(Times timeB) {
        this.timeB = timeB;
    }

    public int getGolA() {
        return golA;
    }

    public void setGolA(int golA) {
        this.golA = golA;
    }

    public int getGolB() {
        return golB;
    }

    public void setGolB(int golB) {
        this.golB = golB;
    }
    public void jogar(){
        Random r = new Random();

        golA = r.nextInt(5);
        golB = r.nextInt(5);
        if(golA>golB){
            timeA.setVitorias(timeA.getVitorias()+1);
            timeA.setPontos(timeA.getPontos()+3);
            timeB.setDerrotas(timeB.getDerrotas()+1);
            System.out.println("Vencedor : "+timeA.getNome());
            System.out.println(timeA.getNome()+" "+golA+" X "+golB+" "+timeB.getNome());

        } else if (golB>golA) {
            timeB.setVitorias(timeB.getVitorias()+1);
            timeB.setPontos(timeB.getPontos()+3);
            timeA.setDerrotas(timeA.getDerrotas()+1);
            System.out.println("Vencedor : "+timeB.getNome());
            System.out.println(timeA.getNome()+" "+golA+" X "+golB+" "+timeB.getNome());

        }else {
            timeA.setEmpates(timeA.getEmpates()+1);
            timeA.setPontos(timeA.getPontos()+1);

            timeB.setEmpates(timeB.getEmpates()+1);
            timeB.setPontos(timeB.getPontos()+1);
            System.out.println("Empate");
            System.out.println(timeA.getNome()+" "+golA+" X "+golB+" "+timeB.getNome());
        }

    }

}
