package UI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class TeamWindow extends Widget {
    TeamWindow(Shell old_shell) {
        super(old_shell);
    }

    @Override
    public void update() {
        shell.setLayout(new RowLayout(SWT.VERTICAL));
        Composite composite0 = new Composite(shell,SWT.NONE);
        RowLayout layout=new RowLayout(SWT.VERTICAL);
        layout.marginLeft=200;
        composite0.setLayout(layout);
        Label label1 =new Label(composite0,SWT.NONE);
        label1.setText("money:xxx");

        Button button1=new Button(shell, SWT.NONE);
        button1.setText("player1");
        button1.setLayoutData(new RowData(275,30));

        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("player2");
        button2.setLayoutData(new RowData(275,30));

        Button button3=new Button(shell,SWT.NONE);
        button3.setText("player3");
        button3.setLayoutData(new RowData(275,30));

        Button button4 = new Button(shell,SWT.NONE);
        button4.setText("player4");
        button4.setLayoutData(new RowData(275,30));

        Composite composite = new Composite(shell,SWT.NONE);
        composite.setLayout(new RowLayout(SWT.HORIZONTAL));

        Button button5=new Button(composite, SWT.NONE);
        button5.setText("Sell player");

        Button button6=new Button(composite, SWT.NONE);
        button6.setText("Swap player");


        Button button7 = new Button(composite,SWT.NONE);
        button7.setText("back");


        button7.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                ManagerWidget widget =new ManagerWidget(shell);
            }
        });
    }
}
