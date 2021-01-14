import UI.MainWindow;
import UI.Widget;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RoleLoader {
    public Widget createManager()
    {
        return null;
    }

    public Widget createJudge()
    {
        return null;
    }
    public Widget createViewer()
    {
        return null;
    }

    public static void main(String[] args)
    {
        Display display= new Display();
        Shell shell = new Shell(display);
        MainWindow window = new MainWindow(shell);
        window.Run();
    }
}
