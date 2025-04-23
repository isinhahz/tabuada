package br.dev.isabelle.tabuada.gui;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.isabelle.tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JLabel labelMinimoMultiplicador;
	private JLabel labelMaximoMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(270, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mín.multiplicador: ");
		labelMinimoMultiplicador.setBounds(20, 55, 150, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 55, 50, 30);
		
		labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máx.multiplicador: ");
		labelMaximoMultiplicador.setBounds(20, 95, 150, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 95, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 155, 105, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(135, 155, 100, 30);
		
		// 	Criar um objeto scroll
		
		listTabuada = new JList();
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 205, 210, 435);
		
		//obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);
		
		
		//Adicionar ouvintes de evento aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);
				
				String minimoMultiplicador = textMinMultiplicador.getText();
				double minDouble = Double.valueOf(minimoMultiplicador);
				tabuada.setMinimoMultiplicador(minDouble);
				
				String maximoMultiplicador = textMaxMultiplicador.getText();
				double maxDouble = Double.valueOf(maximoMultiplicador);
				tabuada.setMaximoMultiplicador(maxDouble);
				
				String[] tabuadaResultado = tabuada.mostrarTabuada();
				
				listTabuada.setListData(tabuadaResultado);
				

				
			}
		});
		
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textMultiplicando.setText(null);
				textMinMultiplicador.setText(null);
				textMaxMultiplicador.setText(null);
				
				listTabuada.setListData(new String[0]);
				
				textMultiplicando.requestFocus();
				
			}
		});
		
		
		//Essa linha deve ser a última linha do método
		tela.setVisible(true);
		
		
		
	}
}
