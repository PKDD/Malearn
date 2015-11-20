import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		System.setProperty("file.encoding", "US_ASCII");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(50, 50, 1200, 800));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 600, 300, 300 };
		gridBagLayout.rowHeights = new int[] { 777, 23 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0 };
		frame.getContentPane().setLayout(gridBagLayout);

		JTextArea codeInput = new JTextArea();
		codeInput.setText(
				" (=<`:9876Z4321UT.-Q+*)M'&%$H\"!~}|Bzy?=|{z]KwZY44Eq0/{mlk**\r\n hKs_dG5[m_BA{?-Y;;Vb'rR5431M}/.zHGwEDCBA@98\\6543W10/.R,+O<");
		codeInput.setColumns(20);
		codeInput.setRows(50);
		GridBagConstraints gbc_codeInput = new GridBagConstraints();
		gbc_codeInput.fill = GridBagConstraints.BOTH;
		gbc_codeInput.insets = new Insets(3, 3, 5, 5);
		gbc_codeInput.gridx = 0;
		gbc_codeInput.gridy = 0;
		frame.getContentPane().add(codeInput, gbc_codeInput);

		UserList = new JList();
		UserList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		

		JButton btnNewButton = new JButton("Read code in");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				readin(codeInput.getText());
			}

		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 2, 5, 5);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);

		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;

		textArea = new JTextPane();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridy = 0;
		gbc_textArea.gridx = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		frame.getContentPane().add(textArea, gbc_textArea);


		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(UserList);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		JButton btnHell = new JButton("HELL!");
		btnHell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// output().setText("Test");
				readin(codeInput.getText());

				compile();

			}
		});
		GridBagConstraints gbc_btnHell = new GridBagConstraints();
		gbc_btnHell.fill = GridBagConstraints.BOTH;
		gbc_btnHell.insets = new Insets(0, 0, 5, 5);
		gbc_btnHell.gridx = 1;
		gbc_btnHell.gridy = 1;
		frame.getContentPane().add(btnHell, gbc_btnHell);

		// frame.getContentPane().setFocusTraversalPolicy(new
		// FocusTraversalOnArray(new Component[]{codeInput, btnNewButton,
		// scrollPane}));
		frame.pack();
	}

	protected void compile() {
		for (c = 0; c < MCode.length; c++) {
			int command = (dec(MCode[c]) + c)%94;
			try {
				comstep(command);
				d++;
			} catch (Throwable e) {
				break;
			}
		}
	}

	private void comstep(int command) throws Throwable {
		switch (command) {
		case 4:
			jmp(MCode[d]);
			break;
		case 5:
			out();
			break;
		case 23:
			in();
			break;
		case 39:
			MCode[d] = rotr(MCode[d]);
			break;
		case 40:
			d = dec(MCode[d]);
			break;
		case 62:
			MCode[d] = crz(MCode[d], tenter(ter(a)));
			a = (char) dec(MCode[d]);
			break;
		case 68:

			break;
		case 81:
			c=MCode.length;
		default:

			break;
		}
		char xlat2[] = "5z]&gqtyfr$(we4{WP)H-Zn,[%\\3dL+Q;>U!pJS72FhOA1CB6v^=I_0/8|jsb9m<.TVac`uY*MK'X~xDl}REokN:#?G\"i@"
				.toCharArray();
		MCode[c] =tenter(ter(xlat2[dec(MCode[c]) - 33]));
	}

	private String rotr(String in) {
		String out = in.charAt(in.length() - 1) + in.substring(0, in.length() - 2);
		a = (char) dec(out);
		return null;
	}

	private void in() {
		a = JOptionPane.showInputDialog("Please input a sigle char.").charAt(0);
	}

	private void out() {
		output().setText(output().getText() + a);
	}

	private void jmp(String in) {
		c = dec(in);
	}

	@SuppressWarnings("unchecked")
	private void readin(String rawcode) {
		a=0;
		c=0;
		d=0;
		rawcode = rawcode.replaceAll("\n", "");
		rawcode = rawcode.replaceAll(" ", "");
		for (int i = 0; i < rawcode.length(); i++) {
			MCode[i] = tenter(ter(rawcode.charAt(i)));
		}
		for (int i = rawcode.length(); i < MCode.length; i++) {
			if (MCode[i] == null) {
				MCode[i] = tenter("");
				MCode[i] = crz(MCode[i - 2], MCode[i - 1]);
			}
		}
		for (int i = 0; i < UserCode.length; i++) {
			int c = dec(MCode[i]);
			int com = (c + i) % 94;
			switch (com) {
			case 4:
				UserCode[i] = "jmp [d]";
				break;
			case 5:
				UserCode[i] = "out a";
				break;
			case 23:
				UserCode[i] = "in a";
				break;
			case 39:
				UserCode[i] = "rotr [d] > mov a, [d]";
				break;
			case 40:
				UserCode[i] = "mov d, [d]";
				break;
			case 62:
				UserCode[i] = "crz [d], a > mov a, [d]";
				break;
			case 68:
				UserCode[i] = "nop";
				break;
			case 81:
				UserCode[i] = "end";
				break;

			default:
				UserCode[i] = "nop";
				break;
			}
		}
		int id = 0;
		boolean end = false;
		DefaultListModel<String> items = new DefaultListModel<>();
		for (String string : UserCode) {
			if (!end && string != "nop") {
				items.addElement(id + ": " + string);
			}
			if (string == "end") {
				end = true;
			}
			id++;
		}
		getUserList().setModel(items);

	}

	private String crz(String q, String w) {
		String out = "";
		for (int i = 0; i < q.length(); i++) {
			char e = q.charAt(i);
			char r = w.charAt(i);
			switch (e) {
			case '0':
				switch (r) {
				case '0':
					out += '1';
					break;
				case '1':
				case '2':
					out += '0';
					break;
				}
				break;
			case '1':
				switch (r) {
				case '0':
					out += '1';
					break;
				case '1':
					out += '0';
					break;
				case '2':
					out += '2';
					break;
				}
				break;
			case '2':
				switch (r) {
				case '0':
				case '1':
					out += '2';
					break;
				case '2':
					out += '1';
					break;
				}
				break;
			}
		}
		return out;
	}

	private String tenter(String ter) {
		String out = ter;
		while (out.length() < 10) {
			out = "0" + out;
		}
		if (out.length() > 10) {
			out = "0101010101";
		}
		return out;
	}

	private String ter(int c) {
		int z = c;
		int zdt = z / 3;
		Integer zmt = z % 3;
		String out = "";
		if (zdt != 0) {
			out += ter(zdt);
		}
		out += zmt.toString();
		return out;
	}

	private int dec(String t) {
		int out = 0;
		for (int i = 0; i < t.length(); i++) {
			int z = Integer.parseInt(t.substring(i, i + 1));
			out = (out * 3) + z;
		}
		return out;
	}

	char a;
	int c;
	int d;
	String[] MCode = new String[59049];
	String[] UserCode = new String[59049];
	@SuppressWarnings({ "unused", "rawtypes" })
	private HashMap componentMap;
	@SuppressWarnings("rawtypes")
	private JList UserList;
	private JTextPane textArea;

	@SuppressWarnings("rawtypes")
	protected JList getUserList() {
		return UserList;
	}

	protected JTextPane output() {
		return textArea;
	}
}
