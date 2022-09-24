
package TechQuizApp.gui;

import TechQuizApp.DAO.PerformanceDAO;
import TechQuizApp.DAO.QuestionDAO;
import TechQuizApp.pojo.Answer;
import TechQuizApp.pojo.AnswerStore;
import TechQuizApp.pojo.Exam;
import TechQuizApp.pojo.Performance;
import TechQuizApp.pojo.Question;
import TechQuizApp.pojo.QuestionStore;
import TechQuizApp.pojo.UserProfile;
import static TechQuizApp.pojo.UserProfile.getUsername;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class TakeTestFrame extends javax.swing.JFrame {
       int hr,min,sec;

    private Exam exam;
    private QuestionStore qstore;
    private AnswerStore astore;

    private int qno, pos = 0;

    public TakeTestFrame() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("THE TECH QUIZ APP");
        lblusername1.setText("Hello " + getUsername());
        qstore = new QuestionStore();
        astore = new AnswerStore();
        qno = 1;
        lblQno.setText(lblQno.getText() + qno);
        Thread t=new Thread ();
        Clock c=new Clock();
        c.start();
         

    }

   public TakeTestFrame(Exam exam) {
        this();
        this.exam = exam;
        lblTitle.setText(exam.getLanguage().toUpperCase() + " PAPER");
        loadQuestions();
        showQuestion();

    }

    public void loadQuestions() {
         try
           {
                ArrayList<Question> questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
                for(Question obj:questionList){
                    qstore.addQuestion(obj);
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
   
    public void showQuestion() {
        Question question = qstore.getQuestion(pos);
        
        txtQuestion.setText(question.getQuestion());
        jrboption1.setText(question.getAnswer1());
        jrboption2.setText(question.getAnswer2());
        jrboption3.setText(question.getAnswer3());
        jrboption4.setText(question.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);

        if (ans == null) 
        {
            return;
        }
        
        
        String chosenAnswer = ans.getChosenAnswer();
        switch (chosenAnswer) {
            case "Answer1":
                jrboption1.setSelected(true);
                break;
                
            case "Answer2":
                jrboption3.setSelected(true);
                break;
            case "Answer3":
                jrboption2.setSelected(true);
                break;
                
            case "Answer4":
                jrboption4.setSelected(true);
                break;
        }
    }  
    
    private String getUseranswer()
    { 
        
        if(jrboption1.isSelected())
           return "Answer1";
        
        else if(jrboption2.isSelected())
           return "Answer2";
        
        else if(jrboption3.isSelected())
         return "Answer3";
        
        else if(jrboption4.isSelected())
         return "Answer4";
        
        else
            return null;
      }

        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        joption2 = new javax.swing.JPanel();
        lblusername1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndone = new javax.swing.JButton();
        jrboption1 = new javax.swing.JRadioButton();
        jrboption4 = new javax.swing.JRadioButton();
        jrboption2 = new javax.swing.JRadioButton();
        jrboption3 = new javax.swing.JRadioButton();
        lblQno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbtsettime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        joption2.setBackground(new java.awt.Color(0, 0, 0));

        lblusername1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusername1.setForeground(new java.awt.Color(255, 153, 51));

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 102, 0));
        lblTitle.setText("JAVA   PAPER");

        btnnext.setBackground(new java.awt.Color(0, 0, 0));
        btnnext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 153, 51));
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnprevious.setBackground(new java.awt.Color(0, 0, 0));
        btnprevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnprevious.setForeground(new java.awt.Color(255, 153, 51));
        btnprevious.setText("Previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 153, 51));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btndone.setBackground(new java.awt.Color(0, 0, 0));
        btndone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndone.setForeground(new java.awt.Color(255, 153, 51));
        btndone.setText("Done");
        btndone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoneActionPerformed(evt);
            }
        });

        jrboption1.setBackground(new java.awt.Color(153, 255, 102));
        buttonGroup1.add(jrboption1);
        jrboption1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jrboption1.setForeground(new java.awt.Color(255, 255, 255));

        jrboption4.setBackground(new java.awt.Color(51, 255, 0));
        buttonGroup1.add(jrboption4);
        jrboption4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jrboption4.setForeground(new java.awt.Color(255, 255, 255));

        jrboption2.setBackground(new java.awt.Color(153, 255, 51));
        buttonGroup1.add(jrboption2);
        jrboption2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jrboption2.setForeground(new java.awt.Color(255, 255, 255));

        jrboption3.setBackground(new java.awt.Color(51, 255, 51));
        buttonGroup1.add(jrboption3);
        jrboption3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jrboption3.setForeground(new java.awt.Color(255, 255, 255));

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 51));
        lblQno.setText("Question no: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/gui/GoodLuck.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        lbtsettime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbtsettime.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout joption2Layout = new javax.swing.GroupLayout(joption2);
        joption2.setLayout(joption2Layout);
        joption2Layout.setHorizontalGroup(
            joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joption2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrboption1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrboption3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrboption2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrboption4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(joption2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joption2Layout.createSequentialGroup()
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(joption2Layout.createSequentialGroup()
                        .addContainerGap(168, Short.MAX_VALUE)
                        .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joption2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(394, 394, 394))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joption2Layout.createSequentialGroup()
                                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))
                            .addGroup(joption2Layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbtsettime, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(joption2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btndone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        joption2Layout.setVerticalGroup(
            joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joption2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbtsettime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrboption1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrboption2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrboption3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrboption4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(joption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(joption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(joption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        Choosepaperframe chooseframe = new  Choosepaperframe();
        chooseframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        String chosenAnswer=getUseranswer();
        if(chosenAnswer!=null)
        {
        Question question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        
       Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
       
       
        System.out.println(newanswer);
                
        Answer answer=astore.getAnswerByQno(pos);
        
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
            {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos++;
        
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
         qno++; 
         
        if(qno>qstore.getCount())
                qno=1;
        
        lblQno.setText("Question no:"+qno);
        
        showQuestion();
       


    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
         String chosenAnswer= getUseranswer();
         
        if(chosenAnswer!=null){
            
        Question question=qstore.getQuestion(pos);
        
        String correctAnswer=question.getCorrectAnswer();
        
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        
        System.out.println(newanswer);
        
        Answer answer=astore.getAnswerByQno(qno);
        
        if(answer==null)
            astore.addAnswer(newanswer);
        
        else
        {
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
      qno--;
        if(qno<=0)
        qno=qstore.getCount();
        lblQno.setText("Question no:"+qno);
        showQuestion();

    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btndoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoneActionPerformed
       String userAnswer=getUseranswer();
        if(userAnswer!=null){
        Question question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        
                
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,userAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
        }
        int right=0,wrong=0;
        for(Question question:qstore.getAllQuestions()){
            int qno=question.getQno();
            Answer answer=astore.getAnswerByQno(qno);
            if(answer==null)
                continue;
            else
            {
                String chosenAnswer1=answer.getChosenAnswer();
                String correctAnswer=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer))
                    ++right;
                else
                    ++wrong;
                    
            }
            
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answers:"+right;
        reportCard+="\nWrong Answers:"+wrong;
        reportCard+="\nUnAttempted  :"+(qstore.getCount()-(right+wrong));
        reportCard+="\nPercentage :"+ (double)(right/qstore.getCount()*100);
        
        JOptionPane.showMessageDialog(null, reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            
           Performance performance=new Performance(UserProfile.getUsername(),exam.getExamId(),right,wrong,
                   (qstore.getCount()-(right+wrong)),((int)(right)/qstore.getCount()*100),exam.getLanguage()); 
            int x=qstore.getCount();
            System.out.println("X="+x);
            PerformanceDAO.addPerformance(performance);
            JOptionPane.showConfirmDialog(null, "Your performance has been successfully added to the database"," Performance Added!",JOptionPane.INFORMATION_MESSAGE);
            StudentOptionsFrame paperFrame=new StudentOptionsFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btndoneActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndone;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel joption2;
    private javax.swing.JRadioButton jrboption1;
    private javax.swing.JRadioButton jrboption2;
    private javax.swing.JRadioButton jrboption3;
    private javax.swing.JRadioButton jrboption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JLabel lbtsettime;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

class Clock extends Thread{
          int time=0;
          int m=1,s=60,h=0;
          public void run()
          {
          while(true)
          {
               Calendar date=Calendar.getInstance();
               date.setTime(new java.util.Date());
               date.set(Calendar.HOUR_OF_DAY, h);
               date.set(Calendar.MINUTE, m);
               date.set(Calendar.SECOND, s);
               date.set(Calendar.MILLISECOND, 0);
               java.util.Date da=date.getTime();
               SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
               String str=sdf.format(da);
               
        try{
            Thread.sleep(1000);
            s=s-1;
            if(s==0){
                m=m-1;
                s=60;
                time=time+1;
            }
            
            //time=time+1000;
             lbtsettime.setText(str);
            }
            catch(InterruptedException ex){
                System.out.println(ex);
            }
           if(time==2){
                lbtsettime.setText("00:00:00");
               JOptionPane.showMessageDialog(null, "yuor time is complete","Test submitted",JOptionPane.INFORMATION_MESSAGE);
              //doneTest();
               btnnext.setEnabled(false);
               btnprevious.setEnabled(false);
               break;
           }
       }
         }
        }  

}

