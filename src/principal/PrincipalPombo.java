package principal;

import java.util.ArrayList;

import entidade.Administrador;
import entidade.Pruu;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Pruu> pruusFeed = new ArrayList();
		
		Usuario admin = new Administrador("AdminDagoberto","admin@Dagoberto","105.602.829-74");
		
		Usuario userOgro = new Usuario("Ogrão", "@leoOgro", "097.819.249-42");
		Pruu pruuOgro1 = new Pruu("Olá rede social, muito bom ser o primeiro por aqui. Espero q essa rede dê certo, vou convidar minha amiga Rachel.", userOgro);
		Pruu pruuOgro2 = new Pruu("Acabei de convidar ela, só aguardar ela se cadastrar!!!!!", userOgro);
		pruusFeed.add(pruuOgro1);
		pruusFeed.add(pruuOgro2);
		ArrayList<Pruu> pruusOgro = new ArrayList();
		userOgro.setPruus(pruusOgro);
		pruusOgro.add(pruuOgro1);
		pruusOgro.add(pruuOgro2);
		
		Usuario userRachel = new Usuario("Rachel", "@R4chel", "099.549.211-31");
		Pruu pruuRachel1 = new Pruu("Olá @leoOgro, consegui criar minha conta, agr somos dois por aqui.", userRachel);
		Pruu pruuRachel2 = new Pruu("@leoOgro vamos convidar nossos amigos, pra encher isso aqui!", userRachel);
		pruusFeed.add(pruuRachel1);
		pruusFeed.add(pruuRachel2);
		ArrayList<Pruu> pruusRachel = new ArrayList();
		userRachel.setPruus(pruusRachel);
		pruusRachel.add(pruuRachel1);
		pruusRachel.add(pruuRachel2);
		
		userRachel.darLike(pruuOgro2);
		userRachel.darLike(pruuOgro2);
		
		userOgro.darLike(pruuRachel2);
		
		((Administrador) admin).bloquearPruu(pruuOgro1);
		
		
		System.out.println("====== CONSULTA FEED - TODOS OS PRUUS ======");
		for (int i = 0; i < pruusFeed.size(); i++) {
			System.out.println(pruusFeed.get(i));
			}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("====== CONSULTA PRUUS @leoOgro ======");
		
		for (int i = 0; i < pruusOgro.size(); i++) {
			System.out.println(pruusOgro.get(i));
			}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("====== CONSULTA PRUUS @R4chel ======");
		
		for (int i = 0; i < pruusRachel.size(); i++) {
			System.out.println(pruusRachel.get(i));

	}
	}
}
