package UI;

import Data.Judge;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import java.awt.*;

public class JudgeWidget extends Widget{

    Judge judge;
    JudgeWidget(Shell old_shell) {
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
        Label label = new Label(shell,SWT.NONE);
        label.setText("Match time");

        Canvas canvas = new Canvas(shell,SWT.NO_REDRAW_RESIZE);
        canvas.setLayoutData(new RowData(200,80));
        canvas.addPaintListener(new PaintListener() {
            @Override
            public void paintControl(PaintEvent paintEvent) {
                Rectangle clientArea = canvas.getClientArea();
                paintEvent.gc.setBackground(display.getSystemColor(SWT.COLOR_RED));

                paintEvent.gc.fillRectangle(10,10,40,40);
                paintEvent.gc.drawRectangle(10,10,100,40);
            }
        });


        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("call doctors");
        button2.setLayoutData(new RowData(275,60));

        Button button4 = new Button(shell,SWT.NONE);
        button4.setText("Back to main menu");
        button4.setLayoutData(new RowData(275,60));


        button2.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {


            }
        });

        button4.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                MainWindow widget =new MainWindow(shell);
                widget.Run();
            }
        });
    }

    protected void OnMatchDone()
    {

    }

    protected void OnStartMatch()
    {

    }

    protected void back()
    {

    }

    protected void OnDone()
    {

    }

    protected void OnTimeEnd()
    {

    }

    protected void Onlnjury()
    {

    }

    protected void OnViolation()
    {

    }
}
