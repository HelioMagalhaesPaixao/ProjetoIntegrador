package view;

import javax.swing.JOptionPane;

public class ComparacaoPrecos extends javax.swing.JFrame {

    public ComparacaoPrecos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelProduto = new javax.swing.JLabel();
        jLabelAnotado = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtAnotado = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnComparar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // ===== PAINEL TOPO =====
        jPanel1.setBackground(new java.awt.Color(118, 233, 195));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabelTitulo.setText("COMPARAÇÃO DE PREÇOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jLabelTitulo)
                    .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabelTitulo)
                    .addContainerGap(30, Short.MAX_VALUE))
        );

        // ===== PAINEL CONTEÚDO =====
        jPanel2.setBackground(new java.awt.Color(205, 255, 255));

        jLabelProduto.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabelProduto.setText("Produto");

        jLabelAnotado.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabelAnotado.setText("Preço anotado");

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabelCodigo.setText("Código");

        btnComparar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnComparar.setText("Comparar");
        btnComparar.addActionListener(evt -> comparar());

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(evt -> {
            new MenuPrincipal().setVisible(true);
            dispose();
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelProduto)
                        .addComponent(jLabelAnotado)
                        .addComponent(jLabelCodigo))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtProduto)
                        .addComponent(txtAnotado)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(btnComparar)
                    .addGap(40, 40, 40)
                    .addComponent(btnVoltar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProduto)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAnotado)
                        .addComponent(txtAnotado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnComparar)
                        .addComponent(btnVoltar))
                    .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    // </editor-fold>

    // ===== LÓGICA ORIGINAL =====
    private void comparar() {
    try {
        String produto = txtProduto.getText();
        String codigo = txtCodigo.getText();
        double anotado = Double.parseDouble(txtAnotado.getText());

        if (produto.isEmpty() || codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            return;
        }

        // ✅ SIMULAÇÃO – ETAPA 3
        double precoNotaSimulado = anotado + 2.50; // valor fictício só para simular
        double diferenca = precoNotaSimulado - anotado;

        JOptionPane.showMessageDialog(this,
                "Produto: " + produto +
                "\nCódigo: " + codigo +
                "\nPreço anotado: R$ " + anotado +
                "\nPreço da nota (simulado): R$ " + precoNotaSimulado +
                "\nDiferença: R$ " + diferenca
        );

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite um valor válido para o preço anotado");
    }
}

    // Variables declaration
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabelAnotado;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAnotado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtProduto;
}
