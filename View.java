import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View 
{
  // View uses Swing framework to display UI to user
  private JFrame frame;
  private JLabel eventTypeLabel;
  private JLabel eventNameLabel;
  private JLabel dateLabel;
  private JTextField eventTypeTextfield;
  private JTextField eventNameTextfield;
  private JTextField dateTextfield;
  private JButton eventTypeSaveButton;
  private JButton eventNameSaveButton;
  private JButton dateSaveButton;
  private JButton Add;
  private JButton Remove;
  private JButton Exit;
  
  public View(String title) 
  {
    frame = new JFrame(title);
    frame.getContentPane().setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 400);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.getContentPane().setBackground(Color.pink);
    
    eventTypeLabel = new JLabel("Event type:");
    eventNameLabel = new JLabel("Event name :");
    dateLabel = new JLabel("Date :");
    eventTypeTextfield = new JTextField();
    eventNameTextfield = new JTextField();
    dateTextfield = new JTextField();
    eventTypeSaveButton = new JButton("Save Event Type");
    eventNameSaveButton = new JButton("Save Event Name");
    dateSaveButton = new JButton("Save Date");
    Add = new JButton("Add Event");
    Remove = new JButton("Remove Event");
    Exit = new JButton("Exit");
    
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
    
    layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(eventTypeLabel)
    .addComponent(eventNameLabel).addComponent(dateLabel))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(eventTypeTextfield)
    .addComponent(eventNameTextfield).addComponent(dateTextfield))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(eventTypeSaveButton)
    .addComponent(eventNameSaveButton).addComponent(dateSaveButton))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Add)
    .addComponent(Remove).addComponent(Exit)));
    
    layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(eventTypeLabel)
    .addComponent(eventTypeTextfield).addComponent(eventTypeSaveButton).addComponent(Add))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(eventNameLabel)
    .addComponent(eventNameTextfield).addComponent(eventNameSaveButton).addComponent(Remove))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(dateLabel)
    .addComponent(dateTextfield).addComponent(dateSaveButton).addComponent(Exit)));

    layout.linkSize(SwingConstants.HORIZONTAL, Add, Remove, Exit);
    frame.getContentPane().setLayout(layout);
  }
  
  public JFrame getFrame() 
  {
    return frame;
  }
  
  public void setFrame(JFrame frame) 
  {
    this.frame = frame;
  }
 
  public JLabel geteventTypeLabel() 
  {
    return eventTypeLabel;
  }
  
  public void seteventTypeLabel(JLabel eventTypeLabel) 
  {
    this.eventTypeLabel = eventTypeLabel;
  }
  
  public JLabel geteventNameLabel()
  {
    return eventNameLabel;
  }
 
  public void seteventNameLabel(JLabel eventNameLabel) 
  {
    this.eventNameLabel = eventNameLabel;
  }
  
  public JLabel getdateLabel() 
  {
	  return dateLabel;
	}
  
  public void setdateLabel(JLabel dateLabel) 
  {
	  this.dateLabel = dateLabel;
	}
  
  public JTextField geteventTypeTextfield() 
  {
    return eventTypeTextfield;
  }
  
  public void seteventTypeTextfield(JTextField eventTypeTextfield) 
  {
    this.eventTypeTextfield = eventTypeTextfield;
  }
 
  public JTextField geteventNameTextfield()
  {
    return eventNameTextfield;
  }
 
  public void seteventNameTextfield(JTextField eventNameTextfield) 
  {
    this.eventNameTextfield = eventNameTextfield;
  }
 
  public JTextField getdateTextfield() 
  {
	  return dateTextfield;
  }

  public void setdateTextfield(JTextField dateTextfield) 
  {
	  this.dateTextfield = dateTextfield;
  }

  public JButton geteventTypeSaveButton() 
  {
    return eventTypeSaveButton;
  }
  
  public void seteventTypeSaveButton(JButton eventTypeSaveButton) 
  {
    this.eventTypeSaveButton = eventTypeSaveButton;
  }
  
  public JButton geteventNameSaveButton()
  {
    return eventNameSaveButton;
  }
  
  public void seteventNameSaveButton(JButton eventNameSaveButton)
  {
    this.eventNameSaveButton = eventNameSaveButton;
  }
  
  public JButton getdateSaveButton() 
  {
	  return dateSaveButton;
  }
  
  public void setdateSaveButton(JButton dateSaveButton)
  {
	  this.dateSaveButton = dateSaveButton;
  }
  
  public JButton getAdd() 
  {
    return Add;
  }
  
  public void setAdd(JButton Add) 
  {
    this.Add = Add;
  }
  
  public JButton getRemove() 
  {
    return Remove;
  }

  public void setRemove(JButton Remove) 
  {
    this.Remove = Remove;
  }

  public JButton getExit() 
  {
    return Exit;
  }
  
  public void setExit(JButton Exit) 
  {
    this.Exit = Exit;
  }
}