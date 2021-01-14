package UI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Widget {
    Display display;
    Shell shell;

    Widget (Shell old_shell)
    {
        display=old_shell.getDisplay();
        old_shell.close();
        shell =new Shell(display);
        shell.setSize(300,300);

        update();

        shell.open();
        while (!shell.isDisposed())
        {
            if (!display.readAndDispatch())
                display.sleep();
        }
    }
    public void checkEvents()
    {

    }

    public void update()
    {

    }

    public void backToMain()
    {

    }
}
