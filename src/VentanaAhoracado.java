
import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class VentanaAhoracado extends javax.swing.JFrame {

    
    String palabraOculta;
    
    String [] listaDePalabras;
    
    
    int numeroFallos = 0;
    /**
     * Creates new form VentanaAhoracado
     */
    public VentanaAhoracado() {
        initComponents();
        
        eligePalabraParaAdivinar();
        
        
        //dibuja la imagen del ahorcado sin fallos
        dibujaImagen(0);
        ponGuiones();
    }
    
    
    
    
    
    
    
    //dibuja la imagen del ahorcado fallos
    public void dibujaImagen(int numeroFallos){
        ImageIcon miImagen = null;
        URL nombreImagen = null;
        int ancho = PanelAhorcado.getWidth();
        int alto = PanelAhorcado.getHeight();
        

        switch(numeroFallos){
    case 0: nombreImagen = getClass().getResource("/Imagenes/ahorcado_0.png");break;
    case 1: nombreImagen = getClass().getResource("/Imagenes/ahorcado_1.png");break;
    case 2: nombreImagen = getClass().getResource("/Imagenes/ahorcado_2.png");break;
    case 3: nombreImagen = getClass().getResource("/Imagenes/ahorcado_3.png");break;
    case 4: nombreImagen = getClass().getResource("/Imagenes/ahorcado_4.png");break;
    case 5: nombreImagen = getClass().getResource("/Imagenes/ahorcado_5.png");break;
    case -1: nombreImagen = getClass().getResource("/Imagenes/acertasteTodo.png");break;
    default: nombreImagen = getClass().getResource("/Imagenes/ahorcado_fin.png");break;
     
}
                
       
            miImagen = new ImageIcon (new ImageIcon(nombreImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        
            PanelAhorcado.setIcon(miImagen);
    }
    
    
    
    
    private void chequeaLetra(String letra){
        
        //convertimos la palabra en mayuscula
        letra = letra.toUpperCase();
        //creamos un string con guiones para poder conpararlo luego
        //String palabraConGuiones = Pantalla.getText();
        StringBuilder palabraConGuiones = new StringBuilder(Pantalla.getText());
        //si esta la palabra,
        
        if(palabraOculta.contains(letra)){
            
            for (int  i= 0; i < palabraOculta.length(); i++){
                if(palabraOculta.charAt(i) == letra.charAt(0)){
                 palabraConGuiones.setCharAt(2*i,letra.charAt(0));
                    
                }
                Pantalla.setText(palabraConGuiones.toString());
            }
        }
        //si no esta,dibujamos la imagen
        else{
            numeroFallos++;
            dibujaImagen(numeroFallos);
        }
        
        if (!Pantalla.getText().contains("_")){
             dibujaImagen(-1);
        }
        
    
       
    }
    
    
    
    //comprobamos que sea la misma letra que pulsamos con la de la del string 
    private void chequeaBoton(JButton miBoton){
        miBoton.setEnabled(false);
        chequeaLetra(miBoton.getText());
    }
    
    
    
    
    
    
    
    private void ponGuiones(){
        
        //crea un nuwvo string con tantos guines bajos y espacios en blanco
        //como letras tenga que adivinar
      String palabraConGuiones = "";
      
      for (int i=0; i<palabraOculta.length(); i++){
        palabraConGuiones = palabraConGuiones + "_ ";
      
        }
      Pantalla.setText((palabraConGuiones));
      
    }
    
    
    
    private void eligePalabraParaAdivinar(){
        
        
      //esto lo utilizariamos si declaramos el array al inicio y aqui 
      //declaramos las constantes
//        listaDePalabras[0] = "CETYS";
//        listaDePalabras[1] = "MERCURIO";
//        listaDePalabras[2] = "VENUS";
//        listaDePalabras[3] = "TIERRA";
//        listaDePalabras[4] = "MARTE";
//        listaDePalabras[5] = "JUPITER";
//        listaDePalabras[6] = "SATURNO";
//        listaDePalabras[7] = "URANO";
//        listaDePalabras[8] = "NEPTUNO";
//        listaDePalabras[9] = "PLUTON";
//        

//esta seria la forma mas comoda y mas legible que la otra 
 listaDePalabras = new String[] {"CETYS","MERCURIO", "VENUS", "TIERRA", "MARTE", "JUPITER", "SATURNO","URANO", "NEPTUNO", "PLUTON"};

        Random aleatorio = new Random();
        
        //elijo una posicion al azar
        int posicionElegida = aleatorio.nextInt(listaDePalabras.length);
        //guardo en la palabraocialta la que haya salido al azar
        palabraOculta = listaDePalabras[posicionElegida];
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JLabel();
        PanelAhorcado = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        ENE = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pantalla.setText("_ _ _ _ _");

        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AMousePressed(evt);
            }
        });
        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AKeyPressed(evt);
            }
        });

        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BMousePressed(evt);
            }
        });

        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CMousePressed(evt);
            }
        });

        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DMousePressed(evt);
            }
        });

        E.setText("E");
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EMousePressed(evt);
            }
        });

        F.setText("F");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FMousePressed(evt);
            }
        });

        G.setText("G");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GMousePressed(evt);
            }
        });

        H.setText("H");
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HMousePressed(evt);
            }
        });

        I.setText("I");
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IMousePressed(evt);
            }
        });

        J.setText("J");
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMousePressed(evt);
            }
        });

        K.setText("K");
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KMousePressed(evt);
            }
        });

        L.setText("L");
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LMousePressed(evt);
            }
        });

        M.setText("M");
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MMousePressed(evt);
            }
        });

        N.setText("N");
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NMousePressed(evt);
            }
        });

        ENE.setText("Ñ");
        ENE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ENEMousePressed(evt);
            }
        });

        O.setText("O");
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OMousePressed(evt);
            }
        });

        P.setText("P");
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PMousePressed(evt);
            }
        });

        Q.setText("Q");
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QMousePressed(evt);
            }
        });

        R.setText("R");
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
        });

        S.setText("S");
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SMousePressed(evt);
            }
        });

        T.setText("T");
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TMousePressed(evt);
            }
        });

        U.setText("U");
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UMousePressed(evt);
            }
        });

        V.setText("V");
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VMousePressed(evt);
            }
        });

        W.setText("W");
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WMousePressed(evt);
            }
        });

        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });

        Y.setText("Y");
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YMousePressed(evt);
            }
        });

        Z.setText("Z");
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ENE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_AMousePressed

    private void BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMousePressed
       chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_BMousePressed

    private void CMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_CMousePressed

    private void DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_DMousePressed

    private void EMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_EMousePressed

    private void FMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_FMousePressed

    private void GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_GMousePressed

    private void HMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_HMousePressed

    private void IMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_IMousePressed

    private void JMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_JMousePressed

    private void KMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_KMousePressed

    private void LMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_LMousePressed

    private void MMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_MMousePressed

    private void NMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_NMousePressed

    private void ENEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENEMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_ENEMousePressed

    private void OMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_OMousePressed

    private void PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_PMousePressed

    private void QMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_QMousePressed

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_RMousePressed

    private void SMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_SMousePressed

    private void TMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_TMousePressed

    private void UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_UMousePressed

    private void VMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_VMousePressed

    private void WMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_WMousePressed

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_XMousePressed

    private void YMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_YMousePressed

    private void ZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMousePressed
        chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_ZMousePressed

    private void AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyPressed
       chequeaBoton( (JButton)evt.getSource());
    }//GEN-LAST:event_AKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaAhoracado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhoracado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhoracado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhoracado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhoracado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton ENE;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JLabel PanelAhorcado;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    // End of variables declaration//GEN-END:variables

   
}
