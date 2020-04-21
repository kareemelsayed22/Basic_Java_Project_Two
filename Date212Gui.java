import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Date212Gui extends JFrame {
    public Date212Gui(SortedDate212List sortedDate212List, UnsortedDate212List unsortedDate212List) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 2, 10, 10));

        JTextArea left = new JTextArea();

        left.setEditable(false);

        String data = "UNSORTED LIST\n\n";

        data += unsortedDate212List.toString();

        left.setText(data);

        add(left);

        JTextArea right = new JTextArea();

        right.setEditable(false);

        data = "SORTED LIST\n\n";

        data += sortedDate212List.toString();

        right.setText(data);

        add(right);

        setVisible(true);

        pack();

    }

}
