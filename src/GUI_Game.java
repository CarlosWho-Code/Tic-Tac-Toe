/*
██████╗  █████╗ ███╗   ██╗██████╗  ██████╗ ███╗   ███╗ █████╗  ██████╗ ██████╗███████╗███████╗███████╗         ██████╗ ██████╗ ██████╗ ███████╗
██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔═══██╗████╗ ████║██╔══██╗██╔════╝██╔════╝██╔════╝██╔════╝██╔════╝        ██╔════╝██╔═══██╗██╔══██╗██╔════╝
██████╔╝███████║██╔██╗ ██║██║  ██║██║   ██║██╔████╔██║███████║██║     ██║     █████╗  ███████╗███████╗        ██║     ██║   ██║██║  ██║█████╗  
██╔══██╗██╔══██║██║╚██╗██║██║  ██║██║   ██║██║╚██╔╝██║██╔══██║██║     ██║     ██╔══╝  ╚════██║╚════██║        ██║     ██║   ██║██║  ██║██╔══╝  
██║  ██║██║  ██║██║ ╚████║██████╔╝╚██████╔╝██║ ╚═╝ ██║██║  ██║╚██████╗╚██████╗███████╗███████║███████║███████╗╚██████╗╚██████╔╝██████╔╝███████╗
╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═════╝╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝
*/


import javax.swing.ImageIcon;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GUI_Game extends javax.swing.JFrame {

    //-------------------------------------[Variables Globales]-----------------------------------//
    
    // ~[Matriz Interna: Consola]~
    int boardGame[][] = new int[3][3];
    
    int row1 = 0;
    int row2 = 0;
    int row3 = 0;
    
    int column1 = 0;
    int column2 = 0;
    int column3 = 0;
    
    int diagonal1 = 0;
    int diagonal2 = 0;
    
    // ~[Contador: Partidas Ganadas]~
    int total_playerWins = 0;
    int total_cpuWins = 0;
    
    // ~[Token: Turno]~
    boolean playerTurn = true;
    
    // ~[Animacion: Inicio]~
    int timerCounter;
    Timer timer;
    TimerTask startAnimation;
    
    // ~[Animacion: Turno de CPU]~
    int timerCounter2;
    Timer timer2;
    TimerTask cpuAnimation;
    
    // ~[Decision: Turno de CPU]~
    int cpu_Row;
    int cpu_Column;
    Random randomNumber_1 = new Random();
    Random randomNumber_2 = new Random();
    
    // ~[Imagen: Animacion Inicio]~
    ImageIcon Shuffle1 = new ImageIcon(getClass().getResource("/Images/Shuffle(1).gif"));
    ImageIcon Shuffle2 = new ImageIcon(getClass().getResource("/Images/Shuffle(2).gif"));
    
    // ~[Imagen: Jugador]~
    ImageIcon player_X = new ImageIcon(getClass().getResource("/Images/X_Player.png"));
    ImageIcon player_X_Win = new ImageIcon(getClass().getResource("/Images/Player_Win.png"));
    
    // ~[Imagen: CPU]~
    ImageIcon cpu_O = new ImageIcon(getClass().getResource("/Images/O_Cpu.png"));
    ImageIcon cpu_O_Win = new ImageIcon(getClass().getResource("/Images/Cpu_Win.png"));
    
    // ~[Imagen: Turno deJugador / Turno de CPU]~
    ImageIcon playerTurn_Tag = new ImageIcon(getClass().getResource("/Images/Player_Turn.png"));
    ImageIcon cpuTurn_Tag = new ImageIcon(getClass().getResource("/Images/CPU_Turn.png"));
    ImageIcon nullTurn_Tag = new ImageIcon(getClass().getResource("/Images/Null_Turn.png"));
    //--------------------------------------------------------------------------------------------//
    
    

    public GUI_Game() {
        initComponents();
        
        Button_1.setEnabled(false);
        Button_2.setEnabled(false);
        Button_3.setEnabled(false);
        Button_4.setEnabled(false);
        Button_5.setEnabled(false);
        Button_6.setEnabled(false);
        Button_7.setEnabled(false);
        Button_8.setEnabled(false);
        Button_9.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_3 = new javax.swing.JButton();
        Button_1 = new javax.swing.JButton();
        Button_2 = new javax.swing.JButton();
        Button_4 = new javax.swing.JButton();
        Button_5 = new javax.swing.JButton();
        Button_6 = new javax.swing.JButton();
        Button_7 = new javax.swing.JButton();
        Button_8 = new javax.swing.JButton();
        Button_9 = new javax.swing.JButton();
        Player_Score = new javax.swing.JLabel();
        CPU_Score = new javax.swing.JLabel();
        Turn_Box = new javax.swing.JLabel();
        Start_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        getContentPane().setLayout(null);

        Button_3.setBorderPainted(false);
        Button_3.setContentAreaFilled(false);
        Button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_3);
        Button_3.setBounds(490, 112, 141, 125);

        Button_1.setBorderPainted(false);
        Button_1.setContentAreaFilled(false);
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_1);
        Button_1.setBounds(123, 112, 141, 125);

        Button_2.setBorderPainted(false);
        Button_2.setContentAreaFilled(false);
        Button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_2);
        Button_2.setBounds(307, 112, 141, 125);

        Button_4.setBorderPainted(false);
        Button_4.setContentAreaFilled(false);
        Button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_4);
        Button_4.setBounds(123, 277, 141, 125);

        Button_5.setBorderPainted(false);
        Button_5.setContentAreaFilled(false);
        Button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_5);
        Button_5.setBounds(307, 277, 141, 125);

        Button_6.setBorderPainted(false);
        Button_6.setContentAreaFilled(false);
        Button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_6);
        Button_6.setBounds(490, 277, 141, 125);

        Button_7.setBorderPainted(false);
        Button_7.setContentAreaFilled(false);
        Button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_7ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_7);
        Button_7.setBounds(123, 445, 141, 125);

        Button_8.setBorderPainted(false);
        Button_8.setContentAreaFilled(false);
        Button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_8ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_8);
        Button_8.setBounds(307, 445, 141, 125);

        Button_9.setBorderPainted(false);
        Button_9.setContentAreaFilled(false);
        Button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_9ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_9);
        Button_9.setBounds(490, 445, 141, 125);

        Player_Score.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Player_Score.setForeground(new java.awt.Color(255, 153, 51));
        Player_Score.setText("0");
        getContentPane().add(Player_Score);
        Player_Score.setBounds(850, 163, 60, 30);

        CPU_Score.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        CPU_Score.setForeground(new java.awt.Color(255, 153, 51));
        CPU_Score.setText("0");
        getContentPane().add(CPU_Score);
        CPU_Score.setBounds(850, 218, 60, 30);

        Turn_Box.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turn_Box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Null_Turn.png"))); // NOI18N
        getContentPane().add(Turn_Box);
        Turn_Box.setBounds(740, 400, 180, 110);

        Start_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_Start(Default).png"))); // NOI18N
        Start_Button.setBorderPainted(false);
        Start_Button.setContentAreaFilled(false);
        Start_Button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_Start(Selected).png"))); // NOI18N
        Start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Start_Button);
        Start_Button.setBounds(738, 550, 181, 80);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GUI_tic_tac_toe.gif"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 950, 680);

        setSize(new java.awt.Dimension(966, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*-----------------------------/
    /       [ Boton Start ]        /
    /-----------------------------*/    
    private void Start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_ButtonActionPerformed
        Turn_Box.setIcon(nullTurn_Tag);
        resetMatrix();
        resetIA_Counters();
        startAnimation();
        enable_BoardButtons();
    }//GEN-LAST:event_Start_ButtonActionPerformed

    /*-----------------------------/
    /        [ Boton #1 ]          /
    /-----------------------------*/    
    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed
        if(boardGame[0][0] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[0][0] = 1;
            Button_1.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }
    }//GEN-LAST:event_Button_1ActionPerformed

    /*-----------------------------/
    /        [ Boton #2 ]          /
    /-----------------------------*/     
    private void Button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_2ActionPerformed
        if(boardGame[0][1] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[0][1] = 1;
            Button_2.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_2ActionPerformed

    /*-----------------------------/
    /        [ Boton #3 ]          /
    /-----------------------------*/     
    private void Button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_3ActionPerformed
        if(boardGame[0][2] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[0][2] = 1;
            Button_3.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_3ActionPerformed

    /*-----------------------------/
    /        [ Boton #4 ]          /
    /-----------------------------*/     
    private void Button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_4ActionPerformed
        if(boardGame[1][0] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[1][0] = 1;
            Button_4.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_4ActionPerformed

    /*-----------------------------/
    /        [ Boton #5 ]          /
    /-----------------------------*/     
    private void Button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_5ActionPerformed
        if(boardGame[1][1] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[1][1] = 1;
            Button_5.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }         
    }//GEN-LAST:event_Button_5ActionPerformed

    /*-----------------------------/
    /        [ Boton #6 ]          /
    /-----------------------------*/     
    private void Button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_6ActionPerformed
        if(boardGame[1][2] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[1][2] = 1;
            Button_6.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_6ActionPerformed

    /*-----------------------------/
    /        [ Boton #7 ]          /
    /-----------------------------*/     
    private void Button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_7ActionPerformed
        if(boardGame[2][0] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[2][0] = 1;
            Button_7.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_7ActionPerformed

    /*-----------------------------/
    /        [ Boton #8 ]          /
    /-----------------------------*/     
    private void Button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_8ActionPerformed
        if(boardGame[2][1] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[2][1] = 1;
            Button_8.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_8ActionPerformed

    /*-----------------------------/
    /        [ Boton #9 ]          /
    /-----------------------------*/    
    private void Button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_9ActionPerformed
        if(boardGame[2][2] == 0 && playerTurn == true){
            playerTurn = false;
            boardGame[2][2] = 1;
            Button_9.setIcon(player_X);
            if(player_WinnerChecker()){
                scoreCounter();
            }
            else{
                if(fullMatrix_Checker()){
                    disable_BoardButtons();
                }
                else{
                    nextTurn();
                    cpu_Animation();
                }
            }
        }        
    }//GEN-LAST:event_Button_9ActionPerformed

    /*===============================================================o
    | [#1]                                                           |
    | Método para desactivar los botones del tablero de juego.       |
    o===============================================================*/
    public void disable_BoardButtons(){
        Button_1.setEnabled(false);
        Button_2.setEnabled(false);
        Button_3.setEnabled(false);
        Button_4.setEnabled(false);
        Button_5.setEnabled(false);
        Button_6.setEnabled(false);
        Button_7.setEnabled(false);
        Button_8.setEnabled(false);
        Button_9.setEnabled(false);        
    }
    
    /*===============================================================o
    | [#2]                                                           |
    | Método para activar los botones del tablero de juego.          |
    o===============================================================*/
    public void enable_BoardButtons(){
        Button_1.setEnabled(true);
        Button_2.setEnabled(true);
        Button_3.setEnabled(true);
        Button_4.setEnabled(true);
        Button_5.setEnabled(true);
        Button_6.setEnabled(true);
        Button_7.setEnabled(true);
        Button_8.setEnabled(true);
        Button_9.setEnabled(true);        
    }
    
    /*===============================================================o
    | [#3]                                                           |
    | Método para limpiar la matriz interna del juego.               |
    o===============================================================*/  
    public void resetMatrix(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardGame[i][j] = 0;
            }
        }
    }
    
    /*===============================================================o
    | [#4]                                                           |
    | Método booleano para consultar si la matriz interna está       |
    | llena ó si aun tiene espacios disponibles:                     |
    | (true = matriz llena), (false = tien espacios disponibles)     |
    o===============================================================*/
    public boolean fullMatrix_Checker(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(boardGame[i][j] == 0){
                    return false;
                }
            }
        }
        Turn_Box.setIcon(nullTurn_Tag);
        return true;
    }
    
    /*===============================================================o
    | [#5]                                                           |
    | Método para limpiar los valores de las variables que ayudarán  |
    | al proceso de decision del CPU en cada jugada.                 |
    o===============================================================*/
    public void resetIA_Counters(){
        row1 = 0;
        row2 = 0;
        row3 = 0;
        
        column1 = 0;
        column2 = 0;
        column3 = 0;
        
        diagonal1 = 0;
        diagonal2 = 0;
    }
    
    /*===============================================================o
    | [#6]                                                           |
    | Método que unicamente cambia la imagen del turno actual.       |
    o===============================================================*/
    public void nextTurn(){
        if(playerTurn){
            Turn_Box.setIcon(playerTurn_Tag);
        }
        else{
            Turn_Box.setIcon(cpuTurn_Tag);
        }
    }
    
    /*===============================================================o
    | [#7]                                                           |
    | Método que consulta los vectores de la matriz interna para     |
    | determinar si el jugador ganó la partida.                      |
    | -Si 3 de los vectores que formen una fila, columna o diagonal  |
    |  son igual a "1", los botones correspondientes estableceran la |
    |  imagen del token ganador.                                     |
    o===============================================================*/   
    public boolean player_WinnerChecker(){
        // > Fila #1.
        if(boardGame[0][0] == 1 && boardGame[0][1] == 1 && boardGame[0][2] == 1){
            Button_1.setIcon(player_X_Win);
            Button_2.setIcon(player_X_Win);
            Button_3.setIcon(player_X_Win);
            
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Fila #2.
        if(boardGame[1][0] == 1 && boardGame[1][1] == 1 && boardGame[1][2] == 1){
            Button_4.setIcon(player_X_Win);
            Button_5.setIcon(player_X_Win);
            Button_6.setIcon(player_X_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Fila #3.
        if(boardGame[2][0] == 1 && boardGame[2][1] == 1 && boardGame[2][2] == 1){
            Button_7.setIcon(player_X_Win);
            Button_8.setIcon(player_X_Win);
            Button_9.setIcon(player_X_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #1.
        if(boardGame[0][0] == 1 && boardGame[1][0] == 1 && boardGame[2][0] == 1){
            Button_1.setIcon(player_X_Win);
            Button_4.setIcon(player_X_Win);
            Button_7.setIcon(player_X_Win);
            
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #2.
        if(boardGame[0][1] == 1 && boardGame[1][1] == 1 && boardGame[2][1] == 1){
            Button_2.setIcon(player_X_Win);
            Button_5.setIcon(player_X_Win);
            Button_8.setIcon(player_X_Win);
            
            Button_1.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #3.
        if(boardGame[0][2] == 1 && boardGame[1][2] == 1 && boardGame[2][2] == 1){
            Button_3.setIcon(player_X_Win);
            Button_6.setIcon(player_X_Win);
            Button_9.setIcon(player_X_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Diagonal #1.
        if(boardGame[0][0] == 1 && boardGame[1][1] == 1 && boardGame[2][2] == 1){
            Button_1.setIcon(player_X_Win);
            Button_5.setIcon(player_X_Win);
            Button_9.setIcon(player_X_Win);
            
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Diagonal #2.
        if(boardGame[0][2] == 1 && boardGame[1][1] == 1 && boardGame[2][0] == 1){
            Button_3.setIcon(player_X_Win);
            Button_5.setIcon(player_X_Win);
            Button_7.setIcon(player_X_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        return false;
    }
  
    /*===============================================================o
    | [#8]                                                           |
    | Método que consulta los vectores de la matriz interna para     |
    | determinar si la CPU ganó la partida.                          |
    | -Si 3 de los vectores que formen una fila, columna o diagonal  |
    |  son igual a "-1", los botones correspondientes estableceran   |
    |  la imagen del token ganador.                                  |
    o===============================================================*/
    public boolean cpu_WinnerChecker(){
        // > Fila #1.
        if(boardGame[0][0] == -1 && boardGame[0][1] == -1 && boardGame[0][2] == -1){
            Button_1.setIcon(cpu_O_Win);
            Button_2.setIcon(cpu_O_Win);
            Button_3.setIcon(cpu_O_Win);
            
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Fila #2.
        if(boardGame[1][0] == -1 && boardGame[1][1] == -1 && boardGame[1][2] == -1){
            Button_4.setIcon(cpu_O_Win);
            Button_5.setIcon(cpu_O_Win);
            Button_6.setIcon(cpu_O_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Fila #3.
        if(boardGame[2][0] == -1 && boardGame[2][1] == -1 && boardGame[2][2] == -1){
            Button_7.setIcon(cpu_O_Win);
            Button_8.setIcon(cpu_O_Win);
            Button_9.setIcon(cpu_O_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #1.
        if(boardGame[0][0] == -1 && boardGame[1][0] == -1 && boardGame[2][0] == -1){
            Button_1.setIcon(cpu_O_Win);
            Button_4.setIcon(cpu_O_Win);
            Button_7.setIcon(cpu_O_Win);
            
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_5.setEnabled(false);
            Button_6.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #2.
        if(boardGame[0][1] == -1 && boardGame[1][1] == -1 && boardGame[2][1] == -1){
            Button_2.setIcon(cpu_O_Win);
            Button_5.setIcon(cpu_O_Win);
            Button_8.setIcon(cpu_O_Win);
            
            Button_1.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Columna #3.
        if(boardGame[0][2] == -1 && boardGame[1][2] == -1 && boardGame[2][2] == -1){
            Button_3.setIcon(cpu_O_Win);
            Button_6.setIcon(cpu_O_Win);
            Button_9.setIcon(cpu_O_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_4.setEnabled(false);
            Button_5.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Diagonal #1.
        if(boardGame[0][0] == -1 && boardGame[1][1] == -1 && boardGame[2][2] == -1){
            Button_1.setIcon(cpu_O_Win);
            Button_5.setIcon(cpu_O_Win);
            Button_9.setIcon(cpu_O_Win);
            
            Button_2.setEnabled(false);
            Button_3.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_7.setEnabled(false);
            Button_8.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        // > Diagonal #2.
        if(boardGame[0][2] == -1 && boardGame[1][1] == -1 && boardGame[2][0] == -1){
            Button_3.setIcon(cpu_O_Win);
            Button_5.setIcon(cpu_O_Win);
            Button_7.setIcon(cpu_O_Win);
            
            Button_1.setEnabled(false);
            Button_2.setEnabled(false);
            Button_4.setEnabled(false);
            Button_6.setEnabled(false);
            Button_8.setEnabled(false);
            Button_9.setEnabled(false);
            
            Turn_Box.setIcon(nullTurn_Tag);
            return true;
        }
        return false;        
    }
    
    /*===============================================================o
    | [#9]                                                           |
    | Método que limpia cualquier imagen de los botones del tablero  |
    | -Si cualquier vector en la matriz interna es igual a "0", la   |
    |  imagen del boton correspondiente será establecida como null.  |
    o===============================================================*/
    public void set_EmptyButtons(){
        if(boardGame[0][0] == 0){
            Button_1.setIcon(null);
        }
        if(boardGame[0][1] == 0){
            Button_2.setIcon(null);
        }
        if(boardGame[0][2] == 0){
            Button_3.setIcon(null);
        }
        if(boardGame[1][0] == 0){
            Button_4.setIcon(null);
        }
        if(boardGame[1][1] == 0){
            Button_5.setIcon(null);
        }
        if(boardGame[1][2] == 0){
            Button_6.setIcon(null);
        }
        if(boardGame[2][0] == 0){
            Button_7.setIcon(null);
        }
        if(boardGame[2][1] == 0){
            Button_8.setIcon(null);
        }
        if(boardGame[2][2] == 0){
            Button_9.setIcon(null);
        }
    }
    
    /*===============================================================o
    | [#10]                                                          |
    | Método que establece la imagen de los botones del tablero a    |
    | la imagen del token del CPU.                                   |
    | -Si cualquier vector de la matriz interna es igual a "-1", el  |
    |  boton correspondiente se establecerá con el token del CPU "O".|
    o===============================================================*/
    public void set_cpuMove(){
        if(boardGame[0][0] == -1){
            Button_1.setIcon(cpu_O);
        }
        if(boardGame[0][1] == -1){
            Button_2.setIcon(cpu_O);
        }
        if(boardGame[0][2] == -1){
            Button_3.setIcon(cpu_O);
        }
        if(boardGame[1][0] == -1){
            Button_4.setIcon(cpu_O);
        }
        if(boardGame[1][1] == -1){
            Button_5.setIcon(cpu_O);
        }
        if(boardGame[1][2] == -1){
            Button_6.setIcon(cpu_O);
        }
        if(boardGame[2][0] == -1){
            Button_7.setIcon(cpu_O);
        }
        if(boardGame[2][1] == -1){
            Button_8.setIcon(cpu_O);
        }
        if(boardGame[2][2] == -1){
            Button_9.setIcon(cpu_O);
        }        
    }
    
    /*===============================================================o
    | [#11]                                                          |
    | Método que realiza el conteo de partidas ganadas por el        |
    | jugador y la CPU.                                              |
    o===============================================================*/ 
    public void scoreCounter(){
        if(player_WinnerChecker()){
            total_playerWins++;
            Player_Score.setText(String.valueOf(total_playerWins));
        }
        if(cpu_WinnerChecker()){
            total_cpuWins++;
            CPU_Score.setText(String.valueOf(total_cpuWins));
        }
    }
    
    /*===============================================================o
    | [#12]                                                          |
    | Método que utiliza los valores actuales de la matriz interna   |
    | para determinar la mejor posición en la cual el CPU debe       |
    | establecer su token.                                           |
    o===============================================================*/
    public void cpuIA(){
        if(fullMatrix_Checker()){
            disable_BoardButtons();
        }
        else{
            // > Fila #1.
            for (int i = 0; i < 3; i++) {
                if(boardGame[0][i] == 1){
                    row1++;
                    if(row1 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[0][j] == 0){
                                boardGame[0][j] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Fila #2.
            for (int i = 0; i < 3; i++) {
                if(boardGame[1][i] == 1){
                    row2++;
                    if(row2 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[1][j] == 0){
                                boardGame[1][j] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Fila #3.
            for (int i = 0; i < 3; i++) {
                if(boardGame[2][i] == 1){
                    row3++;
                    if(row3 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[2][j] == 0){
                                boardGame[2][j] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Columna #1.
            for (int i = 0; i < 3; i++) {
                if(boardGame[i][0] == 1){
                    column1++;
                    if(column1 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[j][0] == 0){
                                boardGame[j][0] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Columna #2.
            for (int i = 0; i < 3; i++) {
                if(boardGame[i][1] == 1){
                    column2++;
                    if(column2 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[j][1] == 0){
                                boardGame[j][1] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Columna #3.
            for (int i = 0; i < 3; i++) {
                if(boardGame[i][2] == 1){
                    column3++;
                    if(column3 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[j][2] == 0){
                                boardGame[j][2] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Diagonal #1.
            for (int i = 0; i < 3; i++) {
                if(boardGame[i][i] == 1){
                    diagonal1++;
                    if(diagonal1 == 2){
                        for (int j = 0; j < 3; j++) {
                            if(boardGame[j][j] == 0){
                                boardGame[j][j] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // > Diagonal #2.
            for(int i = 0, j = 2; i < 3 && j >= 0; i++, j--){
                if(boardGame[i][j] == 1){
                    diagonal2++;
                    if(diagonal2 == 2){
                        for (int k = 0, l = 2; k < 3 && l >= 0; k++, l--) {
                            if(boardGame[k][l] == 0){
                                boardGame[k][l] = -1;
                                set_cpuMove();
                                playerTurn = true;
                                resetIA_Counters();
                                return;
                            }
                        }
                    }
                }
            }
            // Si ningun condicional anterior se cumple.
            if(playerTurn == false){
                do{
                    cpu_Row = randomNumber_1.nextInt(3);
                    cpu_Column = randomNumber_2.nextInt(3);
                }while(boardGame[cpu_Row][cpu_Column] != 0);
                boardGame[cpu_Row][cpu_Column] = -1;
                set_cpuMove();
                playerTurn = true;
            }
            nextTurn();
            resetIA_Counters();
        }
    }
    
    /*===============================================================o
    | [#13]                                                          |
    | Método que activa la animacion inicial  de todos los botones   |
    | al hacer click en el boton [START] y activa los botones del    |
    | tablero.                                                       |
    o===============================================================*/  
    public void startAnimation(){
        timer = new Timer();
        
        startAnimation = new TimerTask() {
            @Override
            public void run() {
                Button_1.setIcon(Shuffle1);
                Button_2.setIcon(Shuffle2);
                Button_3.setIcon(Shuffle1);
                Button_4.setIcon(Shuffle2);
                Button_5.setIcon(Shuffle1);
                Button_6.setIcon(Shuffle2);
                Button_7.setIcon(Shuffle1);
                Button_8.setIcon(Shuffle2);
                Button_9.setIcon(Shuffle1);
                
                if(timerCounter == 1){
                    cancel();
                    set_EmptyButtons();
                    Start_Button.setEnabled(true);
                    playerTurn = true;
                    nextTurn();
                }
                timerCounter++;
            }
        };
        timer.schedule(startAnimation, 0, 1000);
        timerCounter = 0;
    }
    
    /*================================================================o
    | [#14]                                                           |
    | Método que activa la animacion de selección en el turno del CPU |
    o================================================================*/
    public void cpu_Animation(){
        timer2 = new Timer();
        
        cpuAnimation = new TimerTask() {
            @Override
            public void run() {
                if(timerCounter2 < 9){
                    set_EmptyButtons();
                    
                    do{
                        cpu_Row = randomNumber_1.nextInt(3);
                        cpu_Column = randomNumber_2.nextInt(3);
                    }while(boardGame[cpu_Row][cpu_Column] != 0);
                    boardGame[cpu_Row][cpu_Column] = -1;
                    set_cpuMove();
                    boardGame[cpu_Row][cpu_Column] = 0;
                }
                else{
                    cancel();
                    boardGame[cpu_Row][cpu_Column] = 0;
                    set_EmptyButtons();
                    
                    cpuIA();
                    if(cpu_WinnerChecker()){
                        scoreCounter();
                    }
                    else{
                        nextTurn();
                    }
                }
                timerCounter2++;
            }
        };
        timer2.schedule(cpuAnimation, 0, 100);
        timerCounter2 = 0;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(GUI_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_1;
    private javax.swing.JButton Button_2;
    private javax.swing.JButton Button_3;
    private javax.swing.JButton Button_4;
    private javax.swing.JButton Button_5;
    private javax.swing.JButton Button_6;
    private javax.swing.JButton Button_7;
    private javax.swing.JButton Button_8;
    private javax.swing.JButton Button_9;
    private javax.swing.JLabel CPU_Score;
    private javax.swing.JLabel Player_Score;
    private javax.swing.JButton Start_Button;
    private javax.swing.JLabel Turn_Box;
    // End of variables declaration//GEN-END:variables
}
