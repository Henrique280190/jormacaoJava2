
public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Henrique");
		g1.setCPF("4025375890");
		g1.setSalario(10000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Menino Editor");
		ev.setSalario(1000.00);
		
		Designer ds = new Designer();
		ds.setNome("Basti�o Designer");
		ds.setSalario(3000.00);		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getBonificacao());
		System.out.println();
		
		System.out.println(ev.getNome());
		System.out.println(ev.getBonificacao());
		System.out.println();
		
		System.out.println(ds.getNome());
		System.out.println(ds.getBonificacao());
		System.out.println();
		
	}

}
