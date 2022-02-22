package becasTest;
import becas.Helpers;
import becas.Beca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


public class becaTest {
    Helpers becaMock = Mockito.mock(Helpers.class);
    MockedStatic<Helpers> becaStatic = Mockito.mockStatic(Helpers.class);
    /*
    "SI APLICA A BECA"
    "NO APLICA A BECA POR PROMEDIO ACADEMICO"
    "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS"
     */
    public void verifyBecas1(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(100);
    }

    public void verifyBecas2(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(95);
    }

    public void verifyBecas3(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(94);
    }

    public void verifyBecas4(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(93);
    }

    public void verifyBecas5(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(91);
    }

    public void verifyBecas6(String ci, String expectedResult){
        Mockito.when(becaMock.getNota("51442")).thenReturn(90);
    }
}
