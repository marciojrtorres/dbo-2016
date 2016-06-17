package interfaces;
// I- interface Box (Caixa de Objetos)

/**
 * Esta interface representa uma caixa onde
 * um objeto pode ser colocado e retirado.
 * 
 * @author Márcio Torres
 */
public interface IBox {
	// especificar uma caixa de objetos
	// ela é abstrata (não tem implementação)
	// interfaces não têm atributos
	// nas interfaces os métodos não têm "corpo"
	
	/**
	 * Este método coloca um objeto na caixa.
	 * O objeto não pode ser nulo. Após colocar
	 * um objeto na caixa ela não estará mais
	 * vazia.
	 * 
	 * @param o Um objeto não nulo
	 */
	public void put(Object o);
	
	/**
	 * Recupera e retira um objeto da caixa.
	 * Após executar esse método a caixa
	 * ficará vazia. Se a caixa estiver vazia
	 * retorna null.
	 * 
	 * @return o objeto na caixa ou null se não houver.
	 */
	public Object get();

	/**
	 * Informa se a caixa está vazia
	 * 
	 * @return true se estiver vazia e false caso não.
	 */
	public boolean isEmpty();

}








