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

public class BookmakerWindow extends Widget {
    BookmakerWindow(Shell old_shell) {
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

        Composite composite00 = new Composite(shell,SWT.NONE);
        composite00.setLayout(new RowLayout(SWT.HORIZONTAL));

        Composite composite1 = new Composite(composite00,SWT.NONE);
        composite1.setLayout(new RowLayout(SWT.VERTICAL));
        Label label2 = new Label(composite1,SWT.NONE);
        label2.setText("first team");
        Label label3= new Label(composite1,SWT.NONE);
        label3.setText("first coff");

        Composite composite2 = new Composite(composite00,SWT.NONE);
        composite2.setLayout(new RowLayout(SWT.VERTICAL));
        Label label4 = new Label(composite2,SWT.NONE);
        label4.setText("MATCH INFO");

        Composite composite3 = new Composite(composite00,SWT.NONE);
        composite3.setLayout(new RowLayout(SWT.VERTICAL));
        Label label5 = new Label(composite3,SWT.NONE);
        label5.setText("second team");
        Label label6= new Label(composite3,SWT.NONE);
        label6.setText("second coff");

        Composite composite = new Composite(shell,SWT.NONE);
        composite.setLayout(new RowLayout(SWT.HORIZONTAL));

        Button button5=new Button(composite, SWT.NONE);
        button5.setText("make bet");

        Button button6=new Button(composite, SWT.NONE);
        button6.setText("check player");

        Button button7 = new Button(composite,SWT.NONE);
        button7.setText("back");


        button7.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                ViewerWidget widget =new ViewerWidget(shell);
            }
        });
    }
}
