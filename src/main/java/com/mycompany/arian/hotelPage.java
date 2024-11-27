/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arian;

/**
 *
 * @author ASUS X441U
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.logging.*;

/**
 *
 * @author ASUS X441U
 */
public class hotelPage extends JFrame implements ActionListener {
    
    //Components Declaration
    private JLabel lblSearch, lblHotelID, lblHotelLocation, lblHotelLocExt, lblHotelName, lblparkRating, lblHotelRate, lblRating;;
    private JTextField jtfSearch;
    private JLayeredPane layer;
    private JPanel framePanel, framePanelthailand, framePanelfrance, framePaneljapan, framePanelitaly, framePanelsouthkorea;
    private Font font = new Font("Garet", Font.BOLD, 25),
            hotelFont = new Font("Garet", Font.BOLD, 15),
            fontHotelName = new Font("Arial", Font.BOLD, 20);
    private JButton btnSearch, btnImgthailandMandarin, btnImgthailandSiam, btnImgthailandPeninsula, btnImgfranceRitz, btnImgfranceLemeurice, btnImgfranceShangrila, btnImgjapanCarlton, 
            btnImgjapanHoshinoya, btnImgjapanAman, btnImgitalyRussie, btnImgitalyEden, btnImgitalyRegis, btnImgsouthkoreaFS, btnImgsouthkoreaShilla, btnImgsouthkoreaSigniel;
    private URL imgthailandMandarin, imgthailandSiam, imgthailandPeninsula, imgfranceRitz, imgfranceLemeurice, imgfranceShangrila, imgjapanCarlton, imgjapanHoshinoya, imgjapanAman, 
            imgitalyRussie, imgitalyEden, imgitalyRegis, imgsouthkoreaFS, imgsouthkoreaShilla, imgsouthkoreaSigniel, imgmandarinRating, imgsiamRating, imgpeninsulaRating, imgritzRating, 
            imglemeuriceRating, imgshangrilaRating, imgcarltonRating, imghoshinoyaRating, imgamanRating, imgrussieRating,  imgedenRating, imgregisrating, imgFSRating, imgshillaRating, imgsignielRating = null; 
    private ImageIcon imgIconRating, imgnewiconRating, imgIconthailandMandarin, imgnewiconMandarin, imgIconthailandSiam, imgnewiconSiam, imgIconthailandPeninsula, imgnewiconPeninsula, imgIconthailandRitz,
            imgnewiconRitz, imgIconfranceLemeurice, imgnewiconLemeurice, imgIconfranceShangrila,  imgnewiconShangrila, imgIconjapanCarlton, imgnewiconCarlton, imgIconjapanHoshinoya, imgnewiconHoshinoya,
            imgIconjapanAman, imgnewiconAman, imgIconitalyRussie, imgnewiconRussie, imgIconitalyEden, imgnewiconEden, imgIconitalyRegis, imgnewiconRegis, imgIconsouthkoreaFS, imgnewiconFS,
            imgIconsouthkoreaShilla, imgnewiconShilla, imgIconsouthkoreaSigniel, imgnewiconSigniel;
    
     
    
    hotelPage() {
        setSize(1000, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(37, 113, 128));
        setLocationRelativeTo(null);
       
        //Initialize Layered Pane
        layer = new JLayeredPane();
        layer.setBounds(0, 0, 1000, 600);
        add(layer);
        
        //Main Frame Panel
        framePanel = new JPanel();
        framePanel.setBounds(40, 120, 900, 430);
        framePanel.setBackground(new Color(37, 113, 128));
        framePanel.setLayout(null);
        layer.add(framePanel, Integer.valueOf(0));
        
        //Search Text Field
        jtfSearch = new JTextField();
        jtfSearch.setForeground(new Color(0, 0, 0));
        jtfSearch.setBackground(new Color(180, 204, 224));
        jtfSearch.setBounds(230, 50, 450, 30);
        add(jtfSearch);
       
        //Search Label
        lblSearch = new JLabel("PLACE:");
        lblSearch.setFont(font);
        lblSearch.setForeground(new Color(0, 0, 0));
        lblSearch.setBounds(100, 40, 350, 50);
        add(lblSearch);
       
        // Search Button
        btnSearch = new JButton("SEARCH");
        btnSearch.setFont(font);
        btnSearch.setForeground(new Color(0, 0, 0));
        btnSearch.setBackground(new Color(180, 204, 224));
        btnSearch.setBounds(700, 50, 150, 30);
        add(btnSearch);
        
        //Add Action Listener for the search button 
        btnSearch.addActionListener(this);
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Show the specific panel for location
        String place = jtfSearch.getText().trim();
        if (e.getSource() == btnSearch) {
            if (place.equalsIgnoreCase("thailand")) {
                layer.removeAll();
                jtfSearch.setText(" ");

                //Panel for the location for Thailand
                framePanelthailand = new JPanel();
                framePanelthailand.setBounds(40, 120, 900, 400);
                framePanelthailand.setBackground(new Color(37, 113, 128));
                framePanelthailand.setLayout(null);
                layer.add(framePanelthailand, Integer.valueOf(0));
          
                //Labels for the information of the hotel
                //Mandarin
                lblHotelName = new JLabel("Mandarin Oriental");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(20, 300, 320, 70);
                framePanelthailand.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 48 Oriental Avenue,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(20, 320, 310, 70);
                framePanelthailand.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Bangkok 10500, Thailand");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(20, 340, 320, 70);
                framePanelthailand.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: BKK001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(20, 360, 320, 70);
                framePanelthailand.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(20, 380, 320, 70);
                framePanelthailand.add(lblHotelRate);
                
                //Image rating for Mandarin
                try {
                    imgmandarinRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgmandarinRating);
                Image imgscalemandarinRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalemandarinRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(85, 380, 200, 90);
                framePanelthailand.add(lblRating);

                //Image button for Mandarin
                try {
                    imgthailandMandarin = new URL("https://i.pinimg.com/564x/5c/b9/e7/5cb9e782c2c1c272c9ed252e7d90d1cf.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                imgIconthailandMandarin = new ImageIcon(imgthailandMandarin);
                Image imgscaleMandarin = imgIconthailandMandarin.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconMandarin = new ImageIcon(imgscaleMandarin);
                btnImgthailandMandarin = new JButton(imgnewiconMandarin);
                btnImgthailandMandarin.setBounds(20, 10, 250, 300);
                 
                btnImgthailandMandarin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(framePanelthailand, "ERROR");
                }
                  });                
                framePanelthailand.add(btnImgthailandMandarin);

                
                //Labels for the information of the hotel
                //Siam
                lblHotelName = new JLabel("The Siam");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(325, 300, 320, 70);
                framePanelthailand.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 3/2 Thanon Khao,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(325, 320, 310, 70);
                framePanelthailand.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Bangkok 10300, Thailand");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(325, 340, 320, 70);
                framePanelthailand.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: BKK001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(325, 360, 320, 70);
                framePanelthailand.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(325, 380, 320, 70);
                framePanelthailand.add(lblHotelRate);
                
                
                //Image rating for Siam
                try {
                    imgsiamRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgsiamRating);
                Image imgscalesiamRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalesiamRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(390, 380, 200, 90);
                framePanelthailand.add(lblRating);

                
                //Image button for Siam
                try {
                    imgthailandSiam = new URL("https://i.pinimg.com/564x/50/97/90/5097908389f8bba668a3f1b61275c760.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                imgIconthailandSiam = new ImageIcon(imgthailandSiam);
                Image imgscaleSiam = imgIconthailandSiam.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconSiam = new ImageIcon(imgscaleSiam);
                btnImgthailandSiam = new JButton(imgnewiconSiam);
                btnImgthailandSiam.setBounds(325, 10, 250, 300);
                 
                btnImgthailandSiam.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(framePanelthailand, "ERROR");
                }
                  });                
                framePanelthailand.add(btnImgthailandSiam);
                
                
                //Labels for the information of the hotel
                //Peninsula
                lblHotelName = new JLabel("The Peninsula");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(630, 300, 320, 70);
                framePanelthailand.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 333 Charoennakorn");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(630, 320, 310, 70);
                framePanelthailand.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Road, Bangkok 10600, Thailand ");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(630, 340, 320, 70);
                framePanelthailand.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: BKK003");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(630, 360, 320, 70);
                framePanelthailand.add(lblHotelID);
                
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(630, 380, 320, 70);
                framePanelthailand.add(lblHotelRate);
    
                //Image rating for Peninsula
                try {
                    imgpeninsulaRating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgpeninsulaRating);
                Image imgscalepeninsulaRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalepeninsulaRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(690, 380, 200, 90);
                framePanelthailand.add(lblRating);
    
                //Image button for Peninsula
                try {
                    imgthailandPeninsula = new URL("https://i.pinimg.com/564x/a6/9a/dd/a69add4f64984c533740a01fcd178c5e.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconthailandPeninsula = new ImageIcon(imgthailandPeninsula);
                Image imgscalepeninsula = imgIconthailandPeninsula.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconPeninsula = new ImageIcon(imgscalepeninsula);
                btnImgthailandPeninsula = new JButton(imgnewiconPeninsula);
                btnImgthailandPeninsula.setBounds(630, 10, 250, 300);
                
                btnImgthailandPeninsula.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgthailandPeninsula, "ERROR");
                }
                  });     
                framePanelthailand.add(btnImgthailandPeninsula);
                
               

                
                //Show the specific panel for location
                } else if 
                (place.equalsIgnoreCase("france")) {
                layer.removeAll();                
                jtfSearch.setText(" ");
                
                //Panel for the location for France
                framePanelfrance = new JPanel();
                framePanelfrance.setBounds(40, 120, 900, 450);
                framePanelfrance.setBackground(new Color(37, 113, 128));
                framePanelfrance.setLayout(null);
                layer.add(framePanelfrance, Integer.valueOf(0));
                
                
                //Labels for the information of the hotel
                //Ritz
                lblHotelName = new JLabel("The Ritz");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(20, 300, 320, 70);
                framePanelfrance.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 15 Place Vendôme,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(20, 320, 310, 70);
                framePanelfrance.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("75001 Paris, France");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(20, 340, 320, 70);
                framePanelfrance.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: PAR001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(20, 360, 320, 70);
                framePanelfrance.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(20, 380, 320, 70);
                framePanelfrance.add(lblHotelRate);
                
                
                //Image rating for Ritz
                try {
                    imgritzRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgritzRating);
                Image imgscaleritzRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleritzRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(85, 380, 200, 90);
                framePanelfrance.add(lblRating);
                
                
                //Image button for Ritz
                try {
                    imgfranceRitz = new URL("https://i.pinimg.com/564x/7f/f1/18/7ff11870d27c8df2e0ddd9415111d0eb.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                imgIconthailandRitz = new ImageIcon(imgfranceRitz);
                Image imgscaleRitz = imgIconthailandRitz.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconRitz = new ImageIcon(imgscaleRitz);
                btnImgfranceRitz = new JButton(imgnewiconRitz);
                btnImgfranceRitz.setBounds(20, 10, 250, 300);
                 
                btnImgfranceRitz.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(framePanelfrance, "ERROR");
                }
                  });                
                framePanelfrance.add(btnImgfranceRitz);
                
                
                //Labels for the information of the hotel
                //Le Meurice
                lblHotelName = new JLabel("Le Meurice");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(325, 300, 320, 70);
                framePanelfrance.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 228 Rue de Rivoli,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(325, 320, 310, 70);
                framePanelfrance.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("75001 Paris, France");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(325, 340, 320, 70);
                framePanelfrance.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: PAR002");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(325, 360, 320, 70);
                framePanelfrance.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(325, 380, 320, 70);
                framePanelfrance.add(lblHotelRate);
                
                
                //Image rating for Le Meurice
                try {
                    imglemeuriceRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imglemeuriceRating);
                Image imgscalelemeuriceRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalelemeuriceRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(390, 380, 200, 90);
                framePanelfrance.add(lblRating);

                
                //Image button for Le Meurice
                try {
                    imgfranceLemeurice = new URL("https://i.pinimg.com/564x/32/fc/5c/32fc5ca458109054786030cc9de7b9d1.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                imgIconfranceLemeurice = new ImageIcon(imgfranceLemeurice);
                Image imgscalelemeurice = imgIconfranceLemeurice.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconLemeurice = new ImageIcon(imgscalelemeurice);
                btnImgfranceLemeurice = new JButton(imgnewiconLemeurice);
                btnImgfranceLemeurice.setBounds(325, 10, 250, 300);
                 
                btnImgfranceLemeurice.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(framePanelthailand, "ERROR");
                }
                  });                
                framePanelfrance.add(btnImgfranceLemeurice);
                
                
                //Labels for the information of the hotel
                //Shangri-La
                lblHotelName = new JLabel("Shangri-La");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(630, 300, 320, 70);
                framePanelfrance.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 10 Avenue d'Iéna,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(630, 320, 310, 70);
                framePanelfrance.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("75116 Paris, France ");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(630, 340, 320, 70);
                framePanelfrance.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: PAR003");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(630, 360, 320, 70);
                framePanelfrance.add(lblHotelID);
                
                lblHotelRate = new JLabel("RATING: ");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(630, 380, 320, 70);
                framePanelfrance.add(lblHotelRate);
    
    
                //Image rating for Shangrila
                try {
                    imgshangrilaRating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgshangrilaRating);
                Image imgscaleshangrilaRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleshangrilaRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(690, 380, 200, 90);
                framePanelfrance.add(lblRating);
    
            
                //Image button for Shangrila
                try {
                    imgfranceShangrila = new URL("https://i.pinimg.com/564x/86/4f/98/864f98d4b666bc0fee5fcaf133c82146.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconfranceShangrila = new ImageIcon(imgfranceShangrila);
                Image imgscaleShangrila = imgIconfranceShangrila.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconShangrila = new ImageIcon(imgscaleShangrila);
                btnImgfranceShangrila = new JButton(imgnewiconShangrila);
                btnImgfranceShangrila.setBounds(630, 10, 250, 300);
                
                btnImgfranceShangrila.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgfranceShangrila, "ERROR");
                }
                  });     
                framePanelfrance.add(btnImgfranceShangrila);
                
                

                //Show the specific panel for location
                } else if 
                (place.equalsIgnoreCase("japan")) {
                layer.removeAll();                
                jtfSearch.setText(" ");
                
                //Panel for the location for Japan
                framePaneljapan = new JPanel();
                framePaneljapan.setBounds(40, 120, 900, 450);
                framePaneljapan.setBackground(new Color(37, 113, 128));
                framePaneljapan.setLayout(null);
                layer.add(framePaneljapan, Integer.valueOf(0));
                
                
                //Labels for the information of the hotel
                //Ritz-Carlton
                lblHotelName = new JLabel("The Ritz-Carlton");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(20, 300, 320, 70);
                framePaneljapan.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: Kamogawa Nijo-Ohashi");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(20, 320, 310, 70);
                framePaneljapan.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Hotori, Kyoto 604-0902, Japan");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(20, 340, 320, 70);
                framePaneljapan.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: KYT001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(20, 360, 320, 70);
                framePaneljapan.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(20, 380, 320, 70);
                framePaneljapan.add(lblHotelRate);
           
    
                //Image rating for Carlton
                try {
                    imgcarltonRating= new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgcarltonRating);
                Image imgscalecarltonRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalecarltonRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(85, 380, 200, 90);
                framePaneljapan.add(lblRating);

                
                //Image button for Carlton
                try {
                    imgjapanCarlton = new URL("https://i.pinimg.com/564x/ec/eb/48/eceb48e550b40855f112a6a52c3a84d5.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconjapanCarlton = new ImageIcon(imgjapanCarlton);
                Image imgscaleCarlton = imgIconjapanCarlton.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconCarlton = new ImageIcon(imgscaleCarlton);
                btnImgjapanCarlton = new JButton(imgnewiconCarlton);
                btnImgjapanCarlton.setBounds(20, 10, 250, 300);
                btnImgjapanCarlton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgjapanCarlton, "ERROR");
                }
                  }); 
                framePaneljapan.add(btnImgjapanCarlton);
                
                
                
                //Labels for the information of the hotel
                //Hoshinoya
                lblHotelName = new JLabel("Hoshinoya");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(325, 300, 320, 70);
                framePaneljapan.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 11-2 Arashiyama");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(325, 320, 310, 70);
                framePaneljapan.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Genrokuzancho, Kyoto 616-0007, Japan");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(325, 340, 320, 70);
                framePaneljapan.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: KYT002");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(325, 360, 320, 70);
                framePaneljapan.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(325, 380, 320, 70);
                framePaneljapan.add(lblHotelRate);
        
                
                //Image rating for Hoshinoya
                try {
                    imghoshinoyaRating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imghoshinoyaRating);
                Image imgscalehoshinoyaRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalehoshinoyaRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(390, 380, 200, 90);
                framePaneljapan.add(lblRating);
                
                
                //Image button for Hoshinoya
                try {
                    imgjapanHoshinoya = new URL("https://i.pinimg.com/564x/9a/a6/86/9aa68657bc61ebd569c0cb39c342d239.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconjapanHoshinoya = new ImageIcon(imgjapanHoshinoya);
                Image imgscaleHoshinoya = imgIconjapanHoshinoya.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconHoshinoya = new ImageIcon(imgscaleHoshinoya);
                btnImgjapanHoshinoya = new JButton(imgnewiconHoshinoya);
                btnImgjapanHoshinoya.setBounds(325, 10, 250, 300);
                btnImgjapanHoshinoya.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgjapanHoshinoya, "ERROR");
                }
                  }); 
                framePaneljapan.add(btnImgjapanHoshinoya);
                
                
                
                //Labels for the information of the hotel
                //Aman
                lblHotelName = new JLabel("Aman");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(630, 300, 320, 70);
                framePaneljapan.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 1 Okitayama Washimine");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(630, 320, 310, 70);
                framePaneljapan.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("cho, Kyoto 603-8458, Japan");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(630, 340, 320, 70);
                framePaneljapan.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: KYT003");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(630, 360, 320, 70);
                framePaneljapan.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(630, 380, 320, 70);
                framePaneljapan.add(lblHotelRate);
                
                       
                //Image rating for Aman
                try {
                    imgamanRating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgamanRating);
                Image imgscaleamanRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleamanRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(690, 380, 200, 90);
                framePaneljapan.add(lblRating);
                
                
                //Image button for Aman
                try {
                    imgjapanAman = new URL("https://i.pinimg.com/564x/35/30/fd/3530fd4d4dd2937dbb7168e90e102735.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconjapanAman = new ImageIcon(imgjapanAman);
                Image imgscaleAman = imgIconjapanAman.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconAman = new ImageIcon(imgscaleAman);
                btnImgjapanAman = new JButton(imgnewiconAman);
                btnImgjapanAman.setBounds(630, 10, 250, 300);
                btnImgjapanAman.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgjapanAman, "ERROR");
                }
                  }); 
                framePaneljapan.add(btnImgjapanAman);
                
                
                
               

                //Show the specific panel for location
                } else if 
                (place.equalsIgnoreCase("italy")) {
                layer.removeAll();                
                jtfSearch.setText(" ");
                
                //Panel for the location for Italy
                framePanelitaly = new JPanel();
                framePanelitaly.setBounds(40, 120, 900, 450);
                framePanelitaly.setBackground(new Color(37, 113, 128));
                framePanelitaly.setLayout(null);
                layer.add(framePanelitaly, Integer.valueOf(0));
                
                
                //Labels for the information of the hotel
                //Russie
                lblHotelName = new JLabel("Hotel de Russie");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(20, 300, 320, 70);
                framePanelitaly.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: Via del Babuino, 9,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(20, 320, 310, 70);
                framePanelitaly.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("00187 Rome, Italy");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(20, 340, 320, 70);
                framePanelitaly.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: ROM001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(20, 360, 320, 70);
                framePanelitaly.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(20, 380, 320, 70);
                framePanelitaly.add(lblHotelRate);
                
                         
                //Image rating for Russie
                try {
                    imgrussieRating= new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgrussieRating);
                Image imgscalerussieRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalerussieRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(85, 380, 200, 90);
                framePanelitaly.add(lblRating);
               
                
                //Image button for Russie
                try {
                    imgitalyRussie = new URL("https://i.pinimg.com/564x/0b/19/4e/0b194e2cde11b26b5a45e9c6f2b81b41.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconitalyRussie = new ImageIcon(imgitalyRussie);
                Image imgscaleRussie = imgIconitalyRussie.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconRussie = new ImageIcon(imgscaleRussie);
                btnImgitalyRussie = new JButton(imgnewiconRussie);
                btnImgitalyRussie.setBounds(20, 10, 250, 300);
                btnImgitalyRussie.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgitalyRussie, "ERROR");
                }
                  }); 
                framePanelitaly.add(btnImgitalyRussie);
                
                
                
                //Labels for the information of the hotel
                //Eden
                lblHotelName = new JLabel("Hotel Eden");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(325, 300, 320, 70);
                framePanelitaly.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: Via Ludovisi, 49,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(325, 320, 310, 70);
                framePanelitaly.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("00187 Rome, Italy");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(325, 340, 320, 70);
                framePanelitaly.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: ROM002");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(325, 360, 320, 70);
                framePanelitaly.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(325, 380, 320, 70);
                framePanelitaly.add(lblHotelRate);
                
               
                //Image rating for Eden
                try {
                    imgedenRating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgedenRating);
                Image imgscaleedenRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleedenRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(390, 380, 200, 90);
                framePanelitaly.add(lblRating);
                
                
                //Image button for Eden
                try {
                    imgitalyEden = new URL("https://i.pinimg.com/564x/90/7e/67/907e677810403b732d41e3085e60655c.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconitalyEden = new ImageIcon(imgitalyEden);
                Image imgscaleEden = imgIconitalyEden.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconEden = new ImageIcon(imgscaleEden);
                btnImgitalyEden = new JButton(imgnewiconEden);
                btnImgitalyEden.setBounds(325, 10, 250, 300);
                btnImgitalyEden.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgitalyEden, "ERROR");
                }
                  }); 
                framePanelitaly.add(btnImgitalyEden);
                
                
                //Labels for the information of the hotel
                //Regis
                lblHotelName = new JLabel("The St. Regis");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(630, 300, 320, 70);
                framePanelitaly.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: Via Vittorio E. Orlando, 3,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(630, 320, 310, 70);
                framePanelitaly.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("00185 Rome, Italy");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(630, 340, 320, 70);
                framePanelitaly.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: ROM003");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(630, 360, 320, 70);
                framePanelitaly.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(630, 380, 320, 70);
                framePanelitaly.add(lblHotelRate);
                
                         
                //Image rating for Regis
                try {
                    imgregisrating= new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgregisrating);
                Image imgscaleregisRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleregisRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(690, 380, 200, 90);
                framePanelitaly.add(lblRating);
                
                
                //Image button for Regis
                try {
                    imgitalyRegis = new URL("https://i.pinimg.com/564x/d3/18/c6/d318c6832fa04864bd5a508653a0a45f.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconitalyRegis = new ImageIcon(imgitalyRegis);
                Image imgscaleRegis = imgIconitalyRegis.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconRegis = new ImageIcon(imgscaleRegis);
                btnImgitalyRegis = new JButton(imgnewiconRegis);
                btnImgitalyRegis.setBounds(630, 10, 250, 300);
                btnImgitalyRegis.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgitalyRegis, "ERROR");
                }
                  }); 
                framePanelitaly.add(btnImgitalyRegis);
                
                
                

                
                //Show the specific panel for location
                } else if 
                (place.equalsIgnoreCase("south korea")) {
                layer.removeAll();                
                jtfSearch.setText(" ");
                
                //Panel for the location for South Korea
                framePanelsouthkorea = new JPanel();
                framePanelsouthkorea.setBounds(40, 120, 900, 450);
                framePanelsouthkorea.setBackground(new Color(37, 113, 128));
                framePanelsouthkorea.setLayout(null);
                layer.add(framePanelsouthkorea, Integer.valueOf(0));
                
 
                //Labels for the information of the hotel
                //Four Season
                lblHotelName = new JLabel("Four Seasons Hotel");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(20, 300, 320, 70);
                framePanelsouthkorea.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 97 Saemunan-ro,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(20, 320, 310, 70);
                framePanelsouthkorea.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Seoul 03183, South Korea");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(20, 340, 320, 70);
                framePanelsouthkorea.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: SEO001");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(20, 360, 320, 70);
                framePanelsouthkorea.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(20, 380, 320, 70);
                framePanelsouthkorea.add(lblHotelRate);

                           
                //Image rating for FS
                try {
                    imgFSRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgFSRating);
                Image imgscaleFSRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleFSRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(85, 380, 200, 90);
                framePanelsouthkorea.add(lblRating);
                
                    
                //Image button for FS
                try {
                    imgsouthkoreaFS = new URL("https://i.pinimg.com/564x/4e/f6/35/4ef635e10558669a0dc203e9f7b7e36b.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconsouthkoreaFS = new ImageIcon(imgsouthkoreaFS);
                Image imgscaleFS = imgIconsouthkoreaFS.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconFS = new ImageIcon(imgscaleFS);
                btnImgsouthkoreaFS = new JButton(imgnewiconFS);
                btnImgsouthkoreaFS.setBounds(20, 10, 250, 300);
                btnImgsouthkoreaFS.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgsouthkoreaFS, "ERROR");
                }
                  }); 
                framePanelsouthkorea.add(btnImgsouthkoreaFS);
                
                
               
                //Labels for the information of the hotel
                //Shilla
                lblHotelName = new JLabel("The Shilla");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(325, 300, 320, 70);
                framePanelsouthkorea.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 249 Dongho-ro,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(325, 320, 310, 70);
                framePanelsouthkorea.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Seoul 04605, South Korea");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(325, 340, 320, 70);
                framePanelsouthkorea.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: SEO002");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(325, 360, 320, 70);
                framePanelsouthkorea.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(325, 380, 320, 70);
                framePanelsouthkorea.add(lblHotelRate);
                
                      
                //Image rating for Shilla
                try {
                    imgshillaRating = new URL("https://i.pinimg.com/736x/a3/ba/8f/a3ba8f74180b78219801a365d688acf6.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgshillaRating);
                Image imgscaleshillaRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscaleshillaRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(390, 380, 200, 90);
                framePanelsouthkorea.add(lblRating);
                
                
                //Image button for Shilla
                try {
                    imgsouthkoreaShilla = new URL("https://i.pinimg.com/564x/96/99/5c/96995c838d0824d8fa0309bbb91be95a.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconsouthkoreaShilla = new ImageIcon(imgsouthkoreaShilla);
                Image imgscaleShilla = imgIconsouthkoreaShilla.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconShilla = new ImageIcon(imgscaleShilla);
                btnImgsouthkoreaShilla = new JButton(imgnewiconShilla);
                btnImgsouthkoreaShilla.setBounds(325, 10, 250, 300);
                btnImgsouthkoreaShilla.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgsouthkoreaShilla, "ERROR");
                }
                  }); 
                framePanelsouthkorea.add(btnImgsouthkoreaShilla);
                
                
                
                //Labels for the information of the hotel
                //Signiel
                lblHotelName = new JLabel("Signiel");
                lblHotelName.setFont(fontHotelName);
                lblHotelName.setForeground(Color.BLACK);
                lblHotelName.setBounds(630, 300, 320, 70);
                framePanelsouthkorea.add(lblHotelName);
                
                lblHotelLocation = new JLabel("LOCATION: 300 Olympic-ro,");
                lblHotelLocation.setFont(hotelFont);
                lblHotelLocation.setForeground(Color.WHITE);
                lblHotelLocation.setBounds(630, 320, 310, 70);
                framePanelsouthkorea.add(lblHotelLocation);
                
                lblHotelLocExt = new JLabel("Seoul 05551, South Korea");
                lblHotelLocExt.setFont(hotelFont);
                lblHotelLocExt.setForeground(Color.WHITE);
                lblHotelLocExt.setBounds(630, 340, 320, 70);
                framePanelsouthkorea.add(lblHotelLocExt);
                
                lblHotelID = new JLabel("HOTELID: SEO003");
                lblHotelID.setFont(hotelFont);
                lblHotelID.setForeground(Color.WHITE);
                lblHotelID.setBounds(630, 360, 320, 70);
                framePanelsouthkorea.add(lblHotelID);
               
                lblHotelRate = new JLabel("RATING:");
                lblHotelRate.setFont(hotelFont);
                lblHotelRate.setForeground(Color.WHITE);
                lblHotelRate.setBounds(630, 380, 320, 70);
                framePanelsouthkorea.add(lblHotelRate);
                
                    
                //Image rating for Signiel
                try {
                    imgsignielRating = new URL("https://i.pinimg.com/736x/83/ba/60/83ba60cbe75a12d50435de0a3bdc5343.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconRating = new ImageIcon(imgsignielRating);
                Image imgscalesignielRating = imgIconRating.getImage().getScaledInstance(200, 90, Image.SCALE_SMOOTH);
                imgnewiconRating = new ImageIcon(imgscalesignielRating);
                lblRating = new JLabel(imgnewiconRating);
                lblRating.setBounds(690, 380, 200, 90);
                framePanelsouthkorea.add(lblRating);
                
               
                //Image button for Signiel
                try {
                    imgsouthkoreaSigniel = new URL("https://i.pinimg.com/564x/31/14/10/311410d559a2c055ca2c3b983c647acf.jpg");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(hotelPage.class.getName()).log(Level.SEVERE, null, ex);
                }

                imgIconsouthkoreaSigniel = new ImageIcon(imgsouthkoreaSigniel);
                Image imgscaleSigniel = imgIconsouthkoreaSigniel.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
                imgnewiconSigniel = new ImageIcon(imgscaleSigniel);
                btnImgsouthkoreaSigniel = new JButton(imgnewiconSigniel);
                btnImgsouthkoreaSigniel.setBounds(630, 10, 250, 300);
                btnImgsouthkoreaSigniel.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(btnImgsouthkoreaSigniel, "ERROR");
                }
                  }); 
                framePanelsouthkorea.add(btnImgsouthkoreaSigniel);
                

                //Error Message
                }else {
                JOptionPane.showMessageDialog(this, "Please Enter Your Destination First", "ERROR", JOptionPane.ERROR_MESSAGE);

                layer.revalidate();
                layer.repaint();
            }
        }
    }
}