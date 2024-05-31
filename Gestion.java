import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private List<Estudiante> estudiantes;

    public Gestion() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiante(String numeroEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroEstudiante().equals(numeroEstudiante)) {
                return estudiante;
            }
        }
        return null;
    }
}