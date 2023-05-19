package controller;

import docarmo.listaEncadeadaInt.Lista;

public class TabelaController {
	
	Lista [] Tabela;

	public TabelaController() {
		Tabela = new Lista[5];
		for(int i = 0; i < 5; i++) {
			Tabela[i] = new Lista();
		}
	}
	
	public void chametodos() {
		GeraTab();
		Mostra();
	}
	
	private void GeraTab() {
		int [] vt = {12,647,158,136,467,156,600,551,263,414,882,945,914,953,629,884,795,194,513,591,847,66,337,979,
		768,53,114,803,90,339,550,574,977,216,99,617,88,142,148,227,939,585,338,206,569,708,844};
		
		int tam = vt.length;
		for(int i = 0; i < tam; i++) {
			int pos = HashCode(vt[i]);
			if(Tabela[pos].isEmpty()) {
				Tabela[pos].addFirst(vt[i]);
			}else {
				try {
					Tabela[pos].addLast(vt[i]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
		}
	}
	
	private int HashCode(int valor) {
		int pos = valor % 5;
		return pos;
	}
	
	private void Mostra() {
		
		for(int i = 0; i < 5; i++) {
			int tam = Tabela[i].size();
			System.out.println("fila com indice: " + i + " ");
			for(int ctd = 0; ctd < tam; ctd++) {
				try {
					System.out.print(Tabela[i].get(ctd) + " ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n");
		}
	}

}
