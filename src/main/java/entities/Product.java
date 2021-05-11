package entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Getter//gerra dos getters
@Setter//gera os setter
@EqualsAndHashCode//gera hashcode and equals

@ToString//gera toString*/
@Data
/*All together now: A shortcut for @ToString, @EqualsAndHashCode,
 *  @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!
 */
@NoArgsConstructor //construtor sem argumentos
@AllArgsConstructor//construtor com dodos os argumentos
@Builder//outra maneira de usar construtor
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;

}
