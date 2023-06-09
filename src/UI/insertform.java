
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zinei
 */
public class insertform extends javax.swing.JFrame {
GamesList listt = new GamesList();
        FileWriter myWriter;


    /**
     * Creates new form nayaform
     */
    public insertform() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        rating = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        allgames = new javax.swing.JButton();
        AtoZ = new javax.swing.JButton();
        YEARWISE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        LATESTB1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchname = new javax.swing.JTextField();
        searchyear = new javax.swing.JTextField();
        nsearchb = new javax.swing.JButton();
        ysearchb = new javax.swing.JButton();
        savedatabase = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        deletename = new javax.swing.JTextField();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });

        genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreActionPerformed(evt);
            }
        });

        rating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ratingKeyTyped(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 255, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        allgames.setBackground(new java.awt.Color(255, 255, 0));
        allgames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allgames.setForeground(new java.awt.Color(0, 153, 153));
        allgames.setText("VIEW ALL GAMES");
        allgames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allgamesActionPerformed(evt);
            }
        });

        AtoZ.setBackground(new java.awt.Color(255, 255, 0));
        AtoZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AtoZ.setForeground(new java.awt.Color(0, 153, 153));
        AtoZ.setText("ALPHABETICALLY SORTED GAMES");
        AtoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtoZActionPerformed(evt);
            }
        });

        YEARWISE.setBackground(new java.awt.Color(255, 255, 0));
        YEARWISE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YEARWISE.setForeground(new java.awt.Color(0, 153, 153));
        YEARWISE.setText("YEAR WISE SORTED GAMES");
        YEARWISE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YEARWISEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel1.setText("YEAR");

        jLabel2.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel2.setText("GENRE");

        jLabel3.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel3.setText("RATING");

        jLabel4.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel4.setText("NAME");

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("HOME");

        LATESTB1.setBackground(new java.awt.Color(255, 255, 0));
        LATESTB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LATESTB1.setForeground(new java.awt.Color(0, 153, 153));
        LATESTB1.setText("LATEST GAMES");
        LATESTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LATESTB1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("DELETE");

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("INSERT HERE");

        jLabel7.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel7.setText("NAME");

        jLabel8.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel8.setText("YEAR");

        searchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchnameActionPerformed(evt);
            }
        });

        searchyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchyearActionPerformed(evt);
            }
        });
        searchyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchyearKeyTyped(evt);
            }
        });

        nsearchb.setBackground(new java.awt.Color(51, 255, 255));
        nsearchb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nsearchb.setForeground(new java.awt.Color(51, 51, 51));
        nsearchb.setText("search name");
        nsearchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsearchbActionPerformed(evt);
            }
        });

        ysearchb.setBackground(new java.awt.Color(51, 255, 255));
        ysearchb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ysearchb.setForeground(new java.awt.Color(51, 51, 51));
        ysearchb.setText("search year\n");
        ysearchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ysearchbActionPerformed(evt);
            }
        });

        savedatabase.setBackground(new java.awt.Color(255, 255, 0));
        savedatabase.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        savedatabase.setText("SAVE DATABASE");
        savedatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedatabaseActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("SEARCH HERE");

        jLabel10.setFont(new java.awt.Font("Zilla Slab Light", 1, 24)); // NOI18N
        jLabel10.setText("NAME");

        deletename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenameActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(51, 255, 255));
        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(genre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(AtoZ)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchyear, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(searchname))))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nsearchb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ysearchb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(YEARWISE, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(add)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(allgames)
                .addGap(112, 112, 112)
                .addComponent(savedatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(LATESTB1)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nsearchb)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ysearchb)
                        .addComponent(jLabel8)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebutton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LATESTB1)
                    .addComponent(allgames)
                    .addComponent(savedatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YEARWISE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtoZ))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtoZActionPerformed
        // TODO add your handling code here:
        AlphabeticalOp atoz = new AlphabeticalOp();
        atoz.show();
       String alphaorder = listt.bn.LNRByName();
        atoz.AtoZOP.setText(alphaorder);
        //String str = listt.y.LNR();
        //AlphabeticalOp atoz = new AlphabeticalOp();
        //atoz.AtoZOP.setText(str);
        //result.setText(str);
       // atoz.show();

    }//GEN-LAST:event_AtoZActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
     if((name.getText().isEmpty()) ||(year.getText().isEmpty()) || (genre.getText().isEmpty()) || (rating.getText().isEmpty()) )  {
         JOptionPane.showMessageDialog(null, "Enter Complete Details");

     }
     else {
        String na = name.getText();
        String g = genre.getText();
       
        int ye = Integer.parseInt(year.getText());
        double r = Double.parseDouble(rating.getText());
     
listt.insert("The Witcher 3","Action",2016,9.7);
listt.insert("The Last of US","Action",2013,9.7);
listt.insert("Mass Effect","Action",2021,9.7);
listt.insert("God of War","Action",2018,9.6);
listt.insert("Persona 5","Action",2019,9.6);
listt.insert("The Legend of Zelda","Action",1998,9.6);
listt.insert("Metal Gear Solid","Action",1998,9.6);
listt.insert("Uncharted 4","Action",2016,9.5);
listt.insert("Grand Theft Auto V","Action",2013,9.5);
listt.insert("Mass Effect 2","Adventure",2010,9.5);
listt.insert("Half-Life","Adventure",2020,9.5);
listt.insert("Metal Gear Solid 3","Adventure",2005,9.5);
listt.insert("Star Wars","Adventure",2003,9.5);
listt.insert("Chrono Trigger","Adventure",1995,9.5);
listt.insert("Final Fantasy VII","Adventure",1997,9.5);
listt.insert("Bloodborne","Adventure",2015,9.4);
listt.insert("The Legend of Zelda","Fantasy",2017,9.4);
listt.insert("The Elder Scrolls V","Fantasy",2011,9.4);
listt.insert("Portal 2","Comedy",2011,9.4);
listt.insert("Batman: Arkham City","Crime",2011,9.4);
listt.insert("Read Dead Redemption","Crime",2010,9.4);
listt.insert("Uncharted 2","Fantasy",2009,9.4);
listt.insert("Metal Gear Solid 4","Drama",2008,9.4);
listt.insert("Grand Theft Auto: San Andreas","Action",2004,9.4);
listt.insert("Half-Life 2","Action",2004,9.4);
listt.insert("Silent Hill 2","Drama",2001,9.4);
listt.insert("Planescape: Torment","Adventure",1999,9.4);
listt.insert("Ghost of Tsushima","Adventure",2020,9.3);
listt.insert("Batman: Return to Arkham","Action",2016,9.3);
listt.insert("Persona 5","Action",2016,9.3);
listt.insert("P.T.","Horror",2014,9.3);
listt.insert("GTA Vice City","Action",2002,9.8);

listt.insert(na, g, ye, r);
     }
    }//GEN-LAST:event_addActionPerformed

    private void allgamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allgamesActionPerformed
        // TODO add your handling code here:
        ALLGAMES ag = new ALLGAMES();
        ag.show();
        String str = listt.a.toString();
           
        ag.allgamesop.setText(str);
        
   
   
      
      

    }//GEN-LAST:event_allgamesActionPerformed

    private void genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void YEARWISEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEARWISEActionPerformed
        // TODO add your handling code here:
      
        YearwiseOp ywop = new YearwiseOp();
        ywop.show();
        String yearsort = listt.by.LNRByYear();
        ywop.yearwiseop.setText(yearsort);
    }//GEN-LAST:event_YEARWISEActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
        try {
            int i = Integer.parseInt(year.getText());
        }
        catch (NumberFormatException e) {
            
             JOptionPane.showMessageDialog(null, "Enter Numbers Only");
        
        }
    }//GEN-LAST:event_yearActionPerformed

    private void LATESTB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LATESTB1ActionPerformed
        // TODO add your handling code here:
          latestgames lgop = new latestgames();
          lgop.show();
        String str = listt.lastesttoString();
        lgop.latestgameop.setText(str);
    }//GEN-LAST:event_LATESTB1ActionPerformed

    private void searchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchnameActionPerformed

    private void searchyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchyearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchyearActionPerformed

    private void nsearchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsearchbActionPerformed
        // TODO add your handling code here:
        String nm = searchname.getText();
        String str = listt.a.nameSearch(nm);
        Search sc = new Search();
        sc.show();
        sc.searchop.setText(str);
    }//GEN-LAST:event_nsearchbActionPerformed

    private void ysearchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ysearchbActionPerformed
        // TODO add your handling code here:
        String nm = searchyear.getText();
        int yr = Integer.parseInt(nm);
        String str = listt.h.searchyear(yr);
        Search sc = new Search();
        sc.show();
        sc.searchop.setText(str);
    }//GEN-LAST:event_ysearchbActionPerformed

    private void savedatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedatabaseActionPerformed
        // TODO add your handling code here:
        
       
  JFileChooser saver = new JFileChooser("./");
       // saver.setFileFilter(new Text_Filter());
       
        int returnVal = saver.showSaveDialog(this);
        File file = saver.getSelectedFile();
        BufferedWriter writer;
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
            writer = new BufferedWriter( new FileWriter( file.getName()+".txt"));
            writer.write(listt.a.toString());
            writer.close( );
            JOptionPane.showMessageDialog(this, "The Data was Saved Successfully!",
                        "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(this, "The Data could not be Saved!",
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_savedatabaseActionPerformed

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))) {
            evt.consume();
        }
                
    }//GEN-LAST:event_yearKeyTyped

    private void searchyearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchyearKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            evt.consume();
        }
                
    }//GEN-LAST:event_searchyearKeyTyped

    private void deletenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletenameActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        String del = deletename.getText();
        listt.Delete(del);
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void ratingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingKeyTyped
        // TODO add your handling code here:
          
    }//GEN-LAST:event_ratingKeyTyped

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
            java.util.logging.Logger.getLogger(insertform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtoZ;
    private javax.swing.JButton LATESTB1;
    private javax.swing.JButton YEARWISE;
    private javax.swing.JButton add;
    private javax.swing.JButton allgames;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField deletename;
    private javax.swing.JTextField genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JButton nsearchb;
    private javax.swing.JTextField rating;
    private javax.swing.JButton savedatabase;
    private javax.swing.JTextField searchname;
    private javax.swing.JTextField searchyear;
    private javax.swing.JTextField year;
    private javax.swing.JButton ysearchb;
    // End of variables declaration//GEN-END:variables
}
