package Entities;

public class Torneo {

    int id;
    int id_tipo;
    int id_campeon;
    String fecha_inicio;
    String fecha_fin;
    String nombre_torneo;

    public Torneo(){}

    public Torneo(int id, int id_tipo, int id_campeon, String fecha_inicio, String fecha_fin, String nombre_torneo) {
        this.id = id;
        this.id_tipo = id_tipo;
        this.id_campeon = id_campeon;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.nombre_torneo = nombre_torneo;
    }


}
