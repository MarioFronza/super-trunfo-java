package br.udesc.ceavi.est.project.view;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * View que define quando o usuário estiver jogando
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class MainFrame extends javax.swing.JFrame {

    private static MainFrame instancia;
    
    public MainFrame() {
        initComponents();
        btnNextRodada.setVisible(false);
        btnNext.setVisible(false);
    }
    
    public static MainFrame getInstance(){
        if(instancia == null)
            instancia = new MainFrame();
        
        return instancia;
    }
    
    public JLabel getIndiceCarta() {
        return lblAtributo;
    } 
    
    public void setIndiceCarta(float value) {
        lblAtributo.setText(Float.toString(value));
    }

    public JButton getBtnNextRodada() {
        return btnNextRodada;
    }
    
    public JLabel getLblText() {
        return lblText;
    }
    
    public JLabel getLblPanel() {
        return lblPanel;
    }

    public JPanel getPanelUser1() {
        return panelUser1;
    }

    public JPanel getPanelUser2() {
        return panelUser2;
    }
    
    public JPanel getPanelUser3() {
        return panelUser3;
    }

    public JPanel getPanelUser4() {
        return panelUser4;
    }

    public JPanel getPanelUser5() {
        return panelUser5;
    }

    public JButton getCardComputerAltura() {
        return cardComputerAltura;
    }

    public JLabel getCardComputerNome() {
        return cardComputerNome;
    }

    public JButton getCardComputerComprimento() {
        return cardComputerComprimento;
    }

    public JLabel getCardComputerSize() {
        return cardComputerSize;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public JPanel getPanel5() {
        return panel5;
    }
    
    public JButton getCardComputerPeso() {
        return cardComputerPeso;
    }

    public JButton getCardComputerAno() {
        return cardComputerAno;
    }

    public JButton getBtnCard1() {
        return btnCard1;
    }

    public JButton getBtnCard2() {
        return btnCard2;
    }

    public JButton getBtnCard3() {
        return btnCard3;
    }

    public JButton getBtnCard4() {
        return btnCard4;
    }

    public JButton getBtnCard5() {
        return btnCard5;
    }

    public JButton getBtnNext() {
        return btnNext;
    }

    public JLabel getCard1Altura() {
        return card1Altura;
    }

    public JLabel getCard1Comprimento() {
        return card1Comprimento;
    }

    public JLabel getCard1Peso() {
        return card1Peso;
    }

    public JLabel getCard1Size() {
        return card1Size;
    }

    public JLabel getCard1Viveu() {
        return card1Viveu;
    }

    public JLabel getCard2Altura() {
        return card2Altura;
    }

    public JLabel getCard2Comprimento() {
        return card2Comprimento;
    }

    public JLabel getCard2Peso() {
        return card2Peso;
    }

    public JLabel getCard2Viveu() {
        return card2Viveu;
    }

    public JLabel getCard3Altura() {
        return card3Altura;
    }

    public JLabel getCard3Comprimento() {
        return card3Comprimento;
    }

    public JLabel getCard3Peso() {
        return card3Peso;
    }

    public JLabel getCard3Viveu() {
        return card3Viveu;
    }

    public JLabel getCard4Altura() {
        return card4Altura;
    }

    public JLabel getCard4Comprimento() {
        return card4Comprimento;
    }

    public JLabel getCard4Peso() {
        return card4Peso;
    }

    public JLabel getCard4Viveu() {
        return card4Viveu;
    }

    public JLabel getCard5Altura() {
        return card5Altura;
    }

    public JLabel getCard5Comprimento() {
        return card5Comprimento;
    }

    public JLabel getCard5Peso() {
        return card5Peso;
    }

    public JLabel getCard5Viveu() {
        return card5Viveu;
    }

    public JButton getCardUserPeso() {
        return cardUserPeso;
    }

    public JLabel getCardUserNome() {
        return cardUserNome;
    }

    public JButton getCardUserAltura() {
        return cardUserAltura;
    }

    public JButton getCardUserComprimento() {
        return cardUserComprimeto;
    }

    public JButton getCardUserAno() {
        return cardUserAno;
    }

    public JLabel getNameCard1() {
        return nameCard1;
    }

    public JLabel getNameCard2() {
        return nameCard2;
    }

    public JLabel getNameCard3() {
        return nameCard3;
    }

    public JLabel getNameCard4() {
        return nameCard4;
    }

    public JLabel getNameCard5() {
        return nameCard5;
    }

    public void run() {
        new MainFrame().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBackground = new javax.swing.JPanel();
        panelInferiorUsuario = new javax.swing.JPanel();
        panelUser1 = new javax.swing.JPanel();
        nameCard1 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        card1Altura = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        card1Comprimento = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        card1Peso = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        card1Viveu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelUser2 = new javax.swing.JPanel();
        nameCard2 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        card2Altura = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        card2Comprimento = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        card2Peso = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        card2Viveu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelUser3 = new javax.swing.JPanel();
        nameCard3 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        card3Altura = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        card3Comprimento = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        card3Peso = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        card3Viveu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelUser4 = new javax.swing.JPanel();
        nameCard4 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        card4Altura = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        card4Comprimento = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        card4Peso = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        card4Viveu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelUser5 = new javax.swing.JPanel();
        nameCard5 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        card5Altura = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        card5Comprimento = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        card5Peso = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        card5Viveu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        card1Size = new javax.swing.JLabel();
        btnCard2 = new javax.swing.JButton();
        btnCard3 = new javax.swing.JButton();
        btnCard4 = new javax.swing.JButton();
        btnCard5 = new javax.swing.JButton();
        btnCard1 = new javax.swing.JButton();
        panelCartaComputador = new javax.swing.JPanel();
        cardComputerNome = new javax.swing.JLabel();
        cardComputerAltura = new javax.swing.JButton();
        cardComputerComprimento = new javax.swing.JButton();
        cardComputerPeso = new javax.swing.JButton();
        cardComputerAno = new javax.swing.JButton();
        panelSuperiorUsuario = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        cardComputerSize = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCartaUsuario = new javax.swing.JPanel();
        cardUserNome = new javax.swing.JLabel();
        cardUserAltura = new javax.swing.JButton();
        cardUserComprimeto = new javax.swing.JButton();
        cardUserPeso = new javax.swing.JButton();
        cardUserAno = new javax.swing.JButton();
        lblPanel = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblAtributo = new javax.swing.JLabel();
        lblPanel1 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        btnNextRodada = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1030, 685));
        setResizable(false);
        setSize(new java.awt.Dimension(1030, 685));

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setMaximumSize(new java.awt.Dimension(1150, 685));
        panelBackground.setPreferredSize(new java.awt.Dimension(1150, 685));

        panelInferiorUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelUser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser1.setMaximumSize(new java.awt.Dimension(185, 167));
        panelUser1.setMinimumSize(new java.awt.Dimension(185, 167));
        panelUser1.setPreferredSize(new java.awt.Dimension(185, 167));

        nameCard1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCard1.setText("Nome");
        nameCard1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel51.setText("Altura");

        card1Altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Altura.setText("0");

        jLabel53.setText("Comprimento (m)");

        card1Comprimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Comprimento.setText("0");

        jLabel55.setText("Peso");

        card1Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Peso.setText("0");

        jLabel57.setText("Viveu Há");

        card1Viveu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Viveu.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("milhões de anos");

        javax.swing.GroupLayout panelUser1Layout = new javax.swing.GroupLayout(panelUser1);
        panelUser1.setLayout(panelUser1Layout);
        panelUser1Layout.setHorizontalGroup(
            panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(card1Peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(card1Comprimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(card1Altura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(card1Viveu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(nameCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUser1Layout.setVerticalGroup(
            panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCard1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(card1Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(card1Comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(card1Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1Viveu)
                    .addGroup(panelUser1Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelUser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser2.setMaximumSize(new java.awt.Dimension(185, 167));
        panelUser2.setMinimumSize(new java.awt.Dimension(185, 167));
        panelUser2.setPreferredSize(new java.awt.Dimension(185, 167));

        nameCard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCard2.setText("Nome");
        nameCard2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel52.setText("Altura");

        card2Altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card2Altura.setText("0");

        jLabel54.setText("Comprimento (m)");

        card2Comprimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card2Comprimento.setText("0");

        jLabel56.setText("Peso");

        card2Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card2Peso.setText("0");

        jLabel58.setText("Viveu Há ");

        card2Viveu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card2Viveu.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("milhoes de anos");

        javax.swing.GroupLayout panelUser2Layout = new javax.swing.GroupLayout(panelUser2);
        panelUser2.setLayout(panelUser2Layout);
        panelUser2Layout.setHorizontalGroup(
            panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(card2Viveu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card2Comprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card2Altura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(nameCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUser2Layout.setVerticalGroup(
            panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCard2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(card2Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(card2Comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(card2Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(card2Viveu))
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelUser3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser3.setMaximumSize(new java.awt.Dimension(185, 167));
        panelUser3.setMinimumSize(new java.awt.Dimension(185, 167));
        panelUser3.setPreferredSize(new java.awt.Dimension(185, 167));

        nameCard3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameCard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCard3.setText("Nome");
        nameCard3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel59.setText("Altura");

        card3Altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card3Altura.setText("0");

        jLabel60.setText("Comprimento (m)");

        card3Comprimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card3Comprimento.setText("0");

        jLabel62.setText("Peso");

        card3Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card3Peso.setText("0");

        jLabel64.setText("Viveu Há");

        card3Viveu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card3Viveu.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("milhoes de anos");

        javax.swing.GroupLayout panelUser3Layout = new javax.swing.GroupLayout(panelUser3);
        panelUser3.setLayout(panelUser3Layout);
        panelUser3Layout.setHorizontalGroup(
            panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUser3Layout.createSequentialGroup()
                        .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card3Viveu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card3Peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card3Comprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card3Altura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUser3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(nameCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUser3Layout.setVerticalGroup(
            panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCard3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(card3Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(card3Comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(card3Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card3Viveu)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelUser4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser4.setMaximumSize(new java.awt.Dimension(185, 167));
        panelUser4.setMinimumSize(new java.awt.Dimension(185, 167));
        panelUser4.setPreferredSize(new java.awt.Dimension(185, 167));

        nameCard4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameCard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCard4.setText("Nome");
        nameCard4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel66.setText("Altura");

        card4Altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card4Altura.setText("0");

        jLabel68.setText("Comprimento (m)");

        card4Comprimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card4Comprimento.setText("0");

        jLabel70.setText("Peso");

        card4Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card4Peso.setText("0");

        jLabel72.setText("Viveu Há");

        card4Viveu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card4Viveu.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setText("milhoes de anos");

        javax.swing.GroupLayout panelUser4Layout = new javax.swing.GroupLayout(panelUser4);
        panelUser4.setLayout(panelUser4Layout);
        panelUser4Layout.setHorizontalGroup(
            panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUser4Layout.createSequentialGroup()
                        .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(card4Peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card4Comprimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card4Altura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card4Viveu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panelUser4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(nameCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUser4Layout.setVerticalGroup(
            panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCard4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(card4Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(card4Comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(card4Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card4Viveu)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelUser5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser5.setMaximumSize(new java.awt.Dimension(185, 167));
        panelUser5.setMinimumSize(new java.awt.Dimension(185, 167));
        panelUser5.setPreferredSize(new java.awt.Dimension(185, 167));

        nameCard5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameCard5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCard5.setText("Nome");
        nameCard5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel74.setText("Altura");

        card5Altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card5Altura.setText("0");

        jLabel76.setText("Comprimento (m)");

        card5Comprimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card5Comprimento.setText("0");

        jLabel78.setText("Peso");

        card5Peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card5Peso.setText("0");

        jLabel80.setText("Viveu Há");

        card5Viveu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card5Viveu.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("milhoes de anos");

        javax.swing.GroupLayout panelUser5Layout = new javax.swing.GroupLayout(panelUser5);
        panelUser5.setLayout(panelUser5Layout);
        panelUser5Layout.setHorizontalGroup(
            panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUser5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUser5Layout.createSequentialGroup()
                        .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card5Viveu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card5Peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card5Comprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card5Altura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUser5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(nameCard5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUser5Layout.setVerticalGroup(
            panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUser5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCard5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(card5Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(card5Comprimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(card5Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card5Viveu)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setMaximumSize(new java.awt.Dimension(185, 167));
        jPanel15.setMinimumSize(new java.awt.Dimension(185, 167));
        jPanel15.setPreferredSize(new java.awt.Dimension(185, 167));

        card1Size.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        card1Size.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Size.setText("0");
        card1Size.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1Size, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1Size, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCard2.setText("Selecionar");

        btnCard3.setText("Selecionar");
        btnCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard3ActionPerformed(evt);
            }
        });

        btnCard4.setText("Selecionar");

        btnCard5.setText("Selecionar");

        btnCard1.setText("Selecionar");

        javax.swing.GroupLayout panelInferiorUsuarioLayout = new javax.swing.GroupLayout(panelInferiorUsuario);
        panelInferiorUsuario.setLayout(panelInferiorUsuarioLayout);
        panelInferiorUsuarioLayout.setHorizontalGroup(
            panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelInferiorUsuarioLayout.createSequentialGroup()
                        .addComponent(panelUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInferiorUsuarioLayout.createSequentialGroup()
                        .addComponent(btnCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInferiorUsuarioLayout.setVerticalGroup(
            panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCard2)
                    .addComponent(btnCard3)
                    .addComponent(btnCard4)
                    .addComponent(btnCard5)
                    .addComponent(btnCard1))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUser3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUser4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelCartaComputador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCartaComputador.setMaximumSize(new java.awt.Dimension(185, 167));
        panelCartaComputador.setMinimumSize(new java.awt.Dimension(185, 167));
        panelCartaComputador.setPreferredSize(new java.awt.Dimension(185, 167));

        cardComputerNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardComputerNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardComputerNome.setText("-");

        cardComputerAltura.setText("-");
        cardComputerAltura.setEnabled(false);
        cardComputerAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardComputerAlturaActionPerformed(evt);
            }
        });

        cardComputerComprimento.setText("-");
        cardComputerComprimento.setEnabled(false);

        cardComputerPeso.setText("-");
        cardComputerPeso.setEnabled(false);

        cardComputerAno.setText("-");
        cardComputerAno.setEnabled(false);

        javax.swing.GroupLayout panelCartaComputadorLayout = new javax.swing.GroupLayout(panelCartaComputador);
        panelCartaComputador.setLayout(panelCartaComputadorLayout);
        panelCartaComputadorLayout.setHorizontalGroup(
            panelCartaComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCartaComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartaComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardComputerAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(cardComputerComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardComputerPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardComputerAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(cardComputerNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCartaComputadorLayout.setVerticalGroup(
            panelCartaComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaComputadorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cardComputerNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardComputerAltura)
                .addGap(4, 4, 4)
                .addComponent(cardComputerComprimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardComputerPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardComputerAno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSuperiorUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setForeground(new java.awt.Color(0, 102, 102));
        panel1.setToolTipText("");
        panel1.setMaximumSize(new java.awt.Dimension(185, 167));
        panel1.setMinimumSize(new java.awt.Dimension(185, 167));
        panel1.setPreferredSize(new java.awt.Dimension(185, 167));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setMaximumSize(new java.awt.Dimension(185, 167));
        panel2.setMinimumSize(new java.awt.Dimension(185, 167));
        panel2.setPreferredSize(new java.awt.Dimension(185, 167));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel3.setBackground(new java.awt.Color(51, 51, 51));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setMaximumSize(new java.awt.Dimension(185, 167));
        panel3.setMinimumSize(new java.awt.Dimension(185, 167));
        panel3.setPreferredSize(new java.awt.Dimension(185, 167));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel4.setBackground(new java.awt.Color(51, 51, 51));
        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel4.setMaximumSize(new java.awt.Dimension(185, 167));
        panel4.setMinimumSize(new java.awt.Dimension(185, 167));
        panel4.setPreferredSize(new java.awt.Dimension(185, 167));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel5.setBackground(new java.awt.Color(51, 51, 51));
        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel5.setMaximumSize(new java.awt.Dimension(185, 167));
        panel5.setMinimumSize(new java.awt.Dimension(185, 167));
        panel5.setPreferredSize(new java.awt.Dimension(185, 167));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel25.setMaximumSize(new java.awt.Dimension(185, 167));
        jPanel25.setMinimumSize(new java.awt.Dimension(185, 167));
        jPanel25.setPreferredSize(new java.awt.Dimension(185, 167));

        cardComputerSize.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cardComputerSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardComputerSize.setText("0");
        cardComputerSize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardComputerSize, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardComputerSize, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSuperiorUsuarioLayout = new javax.swing.GroupLayout(panelSuperiorUsuario);
        panelSuperiorUsuario.setLayout(panelSuperiorUsuarioLayout);
        panelSuperiorUsuarioLayout.setHorizontalGroup(
            panelSuperiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperiorUsuarioLayout.setVerticalGroup(
            panelSuperiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSuperiorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");

        panelCartaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCartaUsuario.setMaximumSize(new java.awt.Dimension(185, 167));
        panelCartaUsuario.setMinimumSize(new java.awt.Dimension(185, 167));
        panelCartaUsuario.setPreferredSize(new java.awt.Dimension(185, 167));

        cardUserNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardUserNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardUserNome.setText("-");

        cardUserAltura.setText("-");
        cardUserAltura.setEnabled(false);

        cardUserComprimeto.setText("-");
        cardUserComprimeto.setEnabled(false);

        cardUserPeso.setText("-");
        cardUserPeso.setEnabled(false);

        cardUserAno.setText("-");
        cardUserAno.setEnabled(false);
        cardUserAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardUserAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCartaUsuarioLayout = new javax.swing.GroupLayout(panelCartaUsuario);
        panelCartaUsuario.setLayout(panelCartaUsuarioLayout);
        panelCartaUsuarioLayout.setHorizontalGroup(
            panelCartaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCartaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardUserAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(cardUserComprimeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardUserPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardUserAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(cardUserNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCartaUsuarioLayout.setVerticalGroup(
            panelCartaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cardUserNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardUserAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardUserComprimeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardUserPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardUserAno)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        lblPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanel.setText("Escolha a carta");
        lblPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText("Próximo");
        btnNext.setEnabled(false);

        lblAtributo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAtributo.setForeground(new java.awt.Color(240, 240, 240));
        lblAtributo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtributo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnNextRodada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNextRodada.setText("Próxima rodada");
        btnNextRodada.setToolTipText("");

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSuperiorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInferiorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addComponent(panelCartaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(panelCartaComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBackgroundLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNextRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(panelSuperiorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBackgroundLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblPanel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPanel1)
                                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAtributo)
                                        .addGap(70, 70, 70))
                                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(btnNext)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNextRodada)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(panelCartaComputador, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(panelCartaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(panelInferiorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardUserAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardUserAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardUserAnoActionPerformed

    private void cardComputerAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardComputerAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardComputerAlturaActionPerformed

    private void btnCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCard3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCard1;
    private javax.swing.JButton btnCard2;
    private javax.swing.JButton btnCard3;
    private javax.swing.JButton btnCard4;
    private javax.swing.JButton btnCard5;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextRodada;
    private javax.swing.JLabel card1Altura;
    private javax.swing.JLabel card1Comprimento;
    private javax.swing.JLabel card1Peso;
    private javax.swing.JLabel card1Size;
    private javax.swing.JLabel card1Viveu;
    private javax.swing.JLabel card2Altura;
    private javax.swing.JLabel card2Comprimento;
    private javax.swing.JLabel card2Peso;
    private javax.swing.JLabel card2Viveu;
    private javax.swing.JLabel card3Altura;
    private javax.swing.JLabel card3Comprimento;
    private javax.swing.JLabel card3Peso;
    private javax.swing.JLabel card3Viveu;
    private javax.swing.JLabel card4Altura;
    private javax.swing.JLabel card4Comprimento;
    private javax.swing.JLabel card4Peso;
    private javax.swing.JLabel card4Viveu;
    private javax.swing.JLabel card5Altura;
    private javax.swing.JLabel card5Comprimento;
    private javax.swing.JLabel card5Peso;
    private javax.swing.JLabel card5Viveu;
    private javax.swing.JButton cardComputerAltura;
    private javax.swing.JButton cardComputerAno;
    private javax.swing.JButton cardComputerComprimento;
    private javax.swing.JLabel cardComputerNome;
    private javax.swing.JButton cardComputerPeso;
    private javax.swing.JLabel cardComputerSize;
    private javax.swing.JButton cardUserAltura;
    private javax.swing.JButton cardUserAno;
    private javax.swing.JButton cardUserComprimeto;
    private javax.swing.JLabel cardUserNome;
    private javax.swing.JButton cardUserPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JLabel lblAtributo;
    private javax.swing.JLabel lblPanel;
    private javax.swing.JLabel lblPanel1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel nameCard1;
    private javax.swing.JLabel nameCard2;
    private javax.swing.JLabel nameCard3;
    private javax.swing.JLabel nameCard4;
    private javax.swing.JLabel nameCard5;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCartaComputador;
    private javax.swing.JPanel panelCartaUsuario;
    private javax.swing.JPanel panelInferiorUsuario;
    private javax.swing.JPanel panelSuperiorUsuario;
    private javax.swing.JPanel panelUser1;
    private javax.swing.JPanel panelUser2;
    private javax.swing.JPanel panelUser3;
    private javax.swing.JPanel panelUser4;
    private javax.swing.JPanel panelUser5;
    // End of variables declaration//GEN-END:variables
}
