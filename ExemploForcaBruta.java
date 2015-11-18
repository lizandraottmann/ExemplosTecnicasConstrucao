package com.algoritmos;
import java.util.ArrayList;
import java.util.List;

public class ForcaBruta implements Algoritmo{
	private char []texto;
	private char []padrao;
	private DadosIndividuais dados;
	
	public ForcaBruta() {
		this.dados = new DadosIndividuais(" Forca Bruta ");
	}
	public ForcaBruta texto( String texto ) {
		this.texto = texto.toCharArray ();
		return this;
	}
	public ForcaBruta padrao( String padrao ) {
		this.padrao = padrao.toCharArray();
		return this;
	}
	public DadosIndividuais executa () {
		this.dados comecaBusca ();
		this.dados.ocorrencias(busca());
		this.dados.terminaBusca();
		return dados ;
	}
	private List < Integer > busca() {
		List < Integer > integers = new ArrayList < Integer >();
		int n = texto.length ;
		int m = padrao.length ;
		
		for ( int i = 0; i < n - m + 1; i ++) {
			int j = 0;
		while ( j < m && texto [i + j ] == padrao[ j ]) {
			j ++;
		}
		if ( j == m ) {
			integers.add ( i );
			}
		}
		return integers;
	}
}