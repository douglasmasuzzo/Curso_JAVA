package br.com.projeto.GestaoEscolar.Model;
import jakarta.persistence.*;
import br.com.projeto.GestaoEscolar.Model.Enums.Periodo;
import br.com.projeto.GestaoEscolar.Model.Enums.Modelo;

@Entity
@Table( name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, unique = true, nullable = false)
    private String curso;

    @Column(columnDefinition = "TINYTEXT", nullable = false)
    private String classe;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Periodo periodo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Modelo modelo;

    @Column(name = "carga_horaria", nullable = false)
    private Integer cargaHoraria;

    private Integer ano;

    public Registro(){}

    public Registro(Integer id, String curso, String classe, Periodo periodo, Modelo modelo, Integer cargaHoraria, Integer ano) {
        this.id = id;
        this.curso = curso;
        this.classe = classe;
        this.periodo = periodo;
        this.modelo = modelo;
        this.cargaHoraria = cargaHoraria;
        this.ano = ano;
    }

    public Integer getId() {
        return this.id;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getClasse() {
        return this.classe;
    }

    public Periodo getPeriodo() {
        return this.periodo;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public Integer getCargaHoraria() {
        return this.cargaHoraria;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
/*
 Arquitetura de Camadas - M.V.C ( Model / View / Controller )

  Model -> Entity e Table
  -> Define as estruturas dos dados ( objetos / entidades ) representada
  por uma tabela no banco de dados, com os seus atributos.
*/
