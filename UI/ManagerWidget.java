package UI;

import Data.Manager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

public class ManagerWidget extends Widget{
    private Manager manager;

    public ManagerWidget(Shell old_shell) {
        super(old_shell);
    }

    @Override
    public void backToMain() {

    }

    @Override
    public void checkEvents() {

    }

    @Override
    public void update() {
        shell.setLayout(new RowLayout(SWT.VERTICAL));
        Button button1=new Button(shell, SWT.NONE);
        button1.setText("Run match");
        button1.setLayoutData(new RowData(275,60));

        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("Transfer");
        button2.setLayoutData(new RowData(275,60));

        Button button3=new Button(shell,SWT.NONE);
        button3.setText("my team");
        button3.setLayoutData(new RowData(275,60));

        Button button4 = new Button(shell,SWT.NONE);
        button4.setText("Back to main menu");
        button4.setLayoutData(new RowData(275,60));

        button1.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {

            }
        });

        button2.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                TransferWindow widget=new TransferWindow(shell);

            }
        });

        button3.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                TeamWindow window =new TeamWindow(shell);
            }
        });

        button4.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                MainWindow widget =new MainWindow(shell);
                widget.Run();
            }
        });


    }

    protected void OnTeam()
    {

    }

    protected void OnTransfer()
    {

    }

    protected void OnMatch()
    {

    }

    protected void OnSwap()
    {

    }

    protected void OnSell()
    {

    }

    protected void OnBuy()
    {

    }

    protected void back()
    {

    }

    protected void OnTeamDone()
    {

    }

    protected void OnTransferDone()
    {

    }




}
