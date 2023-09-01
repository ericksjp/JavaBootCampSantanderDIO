public class television {

    private boolean ligada;
    private int canal;
    private int volume;

    public television() {
        ligada = false;
        canal = 1;
        volume = 50;
    }

    public television(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.mudarCanal(canal);
        if (volume < 0)
            volume = 0;
        else if (volume > 100)
            volume = 100;
        else 
            this.volume = volume;
    }
    

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void mudarCanal(int num){
        if (num < 1)
            canal = 1;
        else if (num > 999)
            canal = 999;
        else 
            canal = num;
    }

    public void aumentarVolume (int num){
        if (num + volume > 100)
            volume = 100;
        else 
            volume += num;
    }

    public void diminuirVolume (int num){
        if (num > volume)
            volume = 0;
        else 
            volume -= num;
    }

    public void turnInOff(){
        if (ligada == false){
            ligada = true;
        } else {
            ligada = false;
        }
    }
}
