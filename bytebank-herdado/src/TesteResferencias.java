
public class TesteResferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);	
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Murillo");
		ev.setSalario(2500.00);
		
		Designer ds = new Designer();
		ds.setNome("Basti�o");
		ds.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		
//		System.out.println(g1.getBonificacao());
//		System.out.println(ev.getBonificacao());
//		System.out.println(ds.getBonificacao());
	}

}
