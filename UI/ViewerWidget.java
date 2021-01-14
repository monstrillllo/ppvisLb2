package UI;

import Data.MerchShop;
import Data.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ViewerWidget extends Widget {
    private Viewer viewer;

    public ViewerWidget(Shell old_shell) {
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
        button1.setText("Bookmaker");
        button1.setLayoutData(new RowData(275,60));

        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("Merch shop");
        button2.setLayoutData(new RowData(275,60));

        Button button3=new Button(shell,SWT.NONE);
        button3.setText("Back to main window");
        button3.setLayoutData(new RowData(275,60));

        button1.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                BookmakerWindow widget =new BookmakerWindow(shell);
            }
        });

        button2.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                MerchShopWindow widget =new MerchShopWindow(shell);
            }
        });

        button3.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                MainWindow widget =new MainWindow(shell);
                widget.Run();
            }
        });
    }

    protected void OnBookMaker()
    {

    }

    protected void OnShop()
    {

    }

    protected void back()
    {

    }

    protected void OnMatchInfo()
    {

    }

    protected void OnDoneBookie()
    {

    }

    protected void OnDoneBuy()
    {

    }

    protected void OnBuy()
    {

    }

    protected void OnMakeBet()
    {

    }

    protected void OnCheckBet()
    {

    }
}
