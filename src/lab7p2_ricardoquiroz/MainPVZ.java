/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_ricardoquiroz;

/**
 *
 * @author rjqer
 */
public class MainPVZ extends javax.swing.JFrame {

    /**
     * Creates new form MainPVZ
     */
    public MainPVZ() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JP_test = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_arboltest = new javax.swing.JTree();
        JL_plantatest = new javax.swing.JLabel();
        JL_zombietest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_test = new javax.swing.JTextArea();
        JB_testear = new javax.swing.JButton();
        JP_plantas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RB_bajo = new javax.swing.JRadioButton();
        RB_medio = new javax.swing.JRadioButton();
        RB_alto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        RB_explosiva = new javax.swing.JRadioButton();
        RB_disparo = new javax.swing.JRadioButton();
        RB_defensa = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        TF_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JS_ataque = new javax.swing.JSpinner();
        JB_crearplanta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JS_magexplosion = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        JS_altura = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        TF_nombrepro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JS_peso = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        TF_color = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JS_dureza = new javax.swing.JSpinner();
        JS_vida = new javax.swing.JSpinner();
        JP_zombies = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TF_nombrez = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JS_edad = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        JS_enojo = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        JS_ataquez = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        JS_tamano = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        TF_nombreper = new javax.swing.JTextField();
        JB_agregarp = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        JS_vidaz = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        JS_aexp = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        RB_clasico = new javax.swing.JRadioButton();
        RB_cargado = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        TF_colorbandera = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TF_direcimagen = new javax.swing.JTextField();
        JB_crearzombie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("PLANTAS VS ZOMBIES");

        jScrollPane1.setViewportView(JT_arboltest);

        JL_plantatest.setText("----------------------");

        JL_zombietest.setText("----------------------");

        TA_test.setColumns(20);
        TA_test.setRows(5);
        jScrollPane2.setViewportView(TA_test);

        JB_testear.setText("Testear");

        javax.swing.GroupLayout JP_testLayout = new javax.swing.GroupLayout(JP_test);
        JP_test.setLayout(JP_testLayout);
        JP_testLayout.setHorizontalGroup(
            JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_testLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(JP_testLayout.createSequentialGroup()
                        .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JL_zombietest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL_plantatest, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JB_testear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_testLayout.setVerticalGroup(
            JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_testLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_testLayout.createSequentialGroup()
                        .addComponent(JL_plantatest)
                        .addGap(18, 18, 18)
                        .addComponent(JL_zombietest)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_testear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test", JP_test);

        jLabel2.setText("Rango");

        buttonGroup1.add(RB_bajo);
        RB_bajo.setSelected(true);
        RB_bajo.setText("Bajo");

        buttonGroup1.add(RB_medio);
        RB_medio.setText("Medio");

        buttonGroup1.add(RB_alto);
        RB_alto.setText("Alto");

        jLabel3.setText("Tipo");

        buttonGroup2.add(RB_explosiva);
        RB_explosiva.setSelected(true);
        RB_explosiva.setText("Explosiva");

        buttonGroup2.add(RB_disparo);
        RB_disparo.setText("Disparo");

        buttonGroup2.add(RB_defensa);
        RB_defensa.setText("Defensa");

        jLabel4.setText("Nombre");

        jLabel5.setText("Vida");

        jLabel6.setText("Ataque");

        JB_crearplanta.setText("Crear");

        jLabel7.setText("Magnitud Explosion");

        jLabel8.setText("Altura");

        jLabel9.setText("Nombre Proyectil");

        jLabel10.setText("Peso");

        jLabel11.setText("Color");

        jLabel12.setText("Dureza");

        javax.swing.GroupLayout JP_plantasLayout = new javax.swing.GroupLayout(JP_plantas);
        JP_plantas.setLayout(JP_plantasLayout);
        JP_plantasLayout.setHorizontalGroup(
            JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_plantasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_plantasLayout.createSequentialGroup()
                        .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_plantasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3))
                            .addGroup(JP_plantasLayout.createSequentialGroup()
                                .addComponent(RB_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RB_explosiva, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_plantasLayout.createSequentialGroup()
                                .addComponent(RB_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RB_defensa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_plantasLayout.createSequentialGroup()
                                .addComponent(RB_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RB_disparo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(TF_nombre)
                            .addComponent(JS_vida, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                    .addGroup(JP_plantasLayout.createSequentialGroup()
                        .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JS_altura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(JS_magexplosion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel8))
                        .addGap(84, 84, 84)
                        .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TF_nombrepro)
                            .addComponent(JS_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                .addGap(70, 70, 70)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JS_ataque)
                    .addComponent(JB_crearplanta, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(TF_color)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_dureza))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        JP_plantasLayout.setVerticalGroup(
            JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_plantasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_bajo)
                    .addComponent(RB_explosiva)
                    .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_ataque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_medio)
                    .addComponent(RB_disparo)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_alto)
                    .addComponent(RB_defensa)
                    .addComponent(JB_crearplanta)
                    .addComponent(JS_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JS_magexplosion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_nombrepro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_plantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JS_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_dureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", JP_plantas);

        jLabel13.setText("Nombre");

        jLabel14.setText("Edad");

        jLabel15.setText("Enojo");

        jLabel16.setText("Ataque");

        jLabel17.setText("Tamano");

        jLabel18.setText("Agregar Persona Comida");

        JB_agregarp.setText("+");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel19.setText("Vida");

        jLabel20.setText("Años Experiencia");

        jLabel21.setText("Tipo");

        buttonGroup3.add(RB_clasico);
        RB_clasico.setSelected(true);
        RB_clasico.setText("Clasico");

        buttonGroup3.add(RB_cargado);
        RB_cargado.setText("Cargado");

        jLabel22.setText("Color Bandera");

        jLabel23.setText("Direccion Imagen");

        JB_crearzombie.setText("Crear");

        javax.swing.GroupLayout JP_zombiesLayout = new javax.swing.GroupLayout(JP_zombies);
        JP_zombies.setLayout(JP_zombiesLayout);
        JP_zombiesLayout.setHorizontalGroup(
            JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_zombiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JS_vidaz, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JS_ataquez, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_nombrez, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RB_clasico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RB_cargado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_crearzombie, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_tamano, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_edad)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_aexp)
                    .addComponent(jLabel22)
                    .addComponent(TF_colorbandera)
                    .addComponent(jLabel23)
                    .addComponent(TF_direcimagen))
                .addGap(46, 46, 46)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_enojo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addGroup(JP_zombiesLayout.createSequentialGroup()
                        .addComponent(TF_nombreper, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JB_agregarp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        JP_zombiesLayout.setVerticalGroup(
            JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_zombiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_nombrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_enojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JS_ataquez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JS_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_nombreper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_agregarp))
                .addGap(27, 27, 27)
                .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(JP_zombiesLayout.createSequentialGroup()
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JS_vidaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_aexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_clasico)
                            .addComponent(TF_colorbandera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JP_zombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_zombiesLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TF_direcimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_zombiesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB_cargado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB_crearzombie, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Zombies", JP_zombies);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPVZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_agregarp;
    private javax.swing.JButton JB_crearplanta;
    private javax.swing.JButton JB_crearzombie;
    private javax.swing.JButton JB_testear;
    private javax.swing.JLabel JL_plantatest;
    private javax.swing.JLabel JL_zombietest;
    private javax.swing.JPanel JP_plantas;
    private javax.swing.JPanel JP_test;
    private javax.swing.JPanel JP_zombies;
    private javax.swing.JSpinner JS_aexp;
    private javax.swing.JSpinner JS_altura;
    private javax.swing.JSpinner JS_ataque;
    private javax.swing.JSpinner JS_ataquez;
    private javax.swing.JSpinner JS_dureza;
    private javax.swing.JSpinner JS_edad;
    private javax.swing.JSpinner JS_enojo;
    private javax.swing.JSpinner JS_magexplosion;
    private javax.swing.JSpinner JS_peso;
    private javax.swing.JSpinner JS_tamano;
    private javax.swing.JSpinner JS_vida;
    private javax.swing.JSpinner JS_vidaz;
    private javax.swing.JTree JT_arboltest;
    private javax.swing.JRadioButton RB_alto;
    private javax.swing.JRadioButton RB_bajo;
    private javax.swing.JRadioButton RB_cargado;
    private javax.swing.JRadioButton RB_clasico;
    private javax.swing.JRadioButton RB_defensa;
    private javax.swing.JRadioButton RB_disparo;
    private javax.swing.JRadioButton RB_explosiva;
    private javax.swing.JRadioButton RB_medio;
    private javax.swing.JTextArea TA_test;
    private javax.swing.JTextField TF_color;
    private javax.swing.JTextField TF_colorbandera;
    private javax.swing.JTextField TF_direcimagen;
    private javax.swing.JTextField TF_nombre;
    private javax.swing.JTextField TF_nombreper;
    private javax.swing.JTextField TF_nombrepro;
    private javax.swing.JTextField TF_nombrez;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
