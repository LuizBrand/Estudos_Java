package NivelIntermedario.AulasPosDes05.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //AdicionarEquipamentos
    public void addEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    //Mostrando equipamentos
    public void mostrarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Tem -> " + equipamentos.toString();
    }
}
