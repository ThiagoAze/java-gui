package com.unialfa;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class TelaCadastroPessoa extends JFrame {

    private JTextField campoNome;
    private JButton botao;

    public TelaCadastroPessoa(){
        setTitle("Cadastro de Pessoa");
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar essa exata janela

        var painel = new JPanel(new GridBagLayout());
        var constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,5,5,5);

        var labelNome = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(labelNome, constraints); //adicionar na tela

        campoNome = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painel.add(campoNome, constraints);

        botao = new JButton("Salvar");
        botao.addActionListener(e -> executarAcaoBotao());
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        painel.add(botao,constraints);

        add(painel);
        setLocationRelativeTo(null);
    }

    private void executarAcaoBotao(){
         showMessageDialog(this,
                campoNome.getText() + "Salvo com sucesso ;D");
    }
}
