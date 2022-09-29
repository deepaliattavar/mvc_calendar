import javax.swing.JOptionPane;

public class Controller
{
  private Model model;
  private View view;
  
  public Controller(Model m, View v) 
  {
    model = m;
    view = v;
    initView();
  }
  
  public void initView() 
  {
    view.geteventTypeTextfield().setText(model.geteventType());
    view.geteventNameTextfield().setText(model.geteventName());
    view.getdateTextfield().setText(model.getdate());
  }
  
  public void initController() 
  {
    view.geteventTypeSaveButton().addActionListener(e -> saveeventType());
    view.geteventNameSaveButton().addActionListener(e -> saveeventName());
    view.getdateSaveButton().addActionListener(e -> savedate());
    view.getAdd().addActionListener(e -> Add());
    view.getRemove().addActionListener(e -> Remove());
    view.getExit().addActionListener(e -> Exit());
  }

  private void saveeventType() 
  {
    model.seteventType(view.geteventTypeTextfield().getText());
    JOptionPane.showMessageDialog(null, "Event type saved : " + model.geteventType(), "Info", JOptionPane.INFORMATION_MESSAGE);
  }
  
  private void saveeventName() 
  {
    model.seteventName(view.geteventNameTextfield().getText());
    JOptionPane.showMessageDialog(null, "Event Name saved : " + model.geteventName(), "Info", JOptionPane.INFORMATION_MESSAGE);
  }

  private void savedate() 
  {
	  model.setdate(view.getdateTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Date saved : " + model.getdate(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}
  
  private void Add() 
  {
    JOptionPane.showMessageDialog(null, "Added Event : " + model.geteventName() + " on " + model.getdate(), "Info", JOptionPane.INFORMATION_MESSAGE);
  }

  private void Remove() 
  {
    JOptionPane.showMessageDialog(null, "Removed Event : " + model.geteventName() + " on " + model.getdate(), "Info", JOptionPane.INFORMATION_MESSAGE);
  }
  
  private void Exit() 
  {
    System.exit(0);
  }
}

