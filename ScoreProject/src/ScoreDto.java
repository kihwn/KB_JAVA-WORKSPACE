public class ScoreDto {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int total;

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getKor() {
        return kor;
    }

    public void calculator(){
        this.total = this.kor+this.eng+this.mat;
    }

    public void output(){
        System.out.printf("%s %d\n", this.name, this.total);
    }

    public String getName(){
        return name;
    }


    public void setName(String name) {
    }

    public void setKor(int kor) {
    }

    public void setMat(int mat) {

    }
}
