package becas;

public class Beca {
    Helpers utils = new Helpers();
    String msg;
    public Beca() {
    }

    public Beca(Helpers utils) {
        this.utils = utils;
    }

    public String recomendacionBeca(String studentCode){
        if (Helpers.applicaBeca(studentCode)){
            msg = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        }else{
            if(utils.getNota(studentCode)>=90){
                msg = "SI APLICA A BECA";
            }else{
                msg = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
            }
        }
        return msg;
    }
}
