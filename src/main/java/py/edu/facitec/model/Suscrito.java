package py.edu.facitec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Suscrito {
	@Id
	@GeneratedValue
private Long codigo;
private String nombre;
private String correo;
@OneToMany(mappedBy = "suscrito")
private List<Comentario> comentarios;
public Long getCodigo() {
	return codigo;
}
public void setCodigo(Long codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
@Override
public String toString() {
	return "Suscrito [codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + "]";
}


}
