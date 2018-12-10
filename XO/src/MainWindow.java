import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindow extends JFrame implements ActionListener {

	// first we create everything we need

	JButton btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33, btnNewGame, btnSave;
	JPanel pnlbtns = new JPanel(), pnlnames = new JPanel(), pnlsouth = new JPanel();
	static JLabel lblname1, lblname2, lblscore1, lblscore2, lbllab, lblturn;
	int lab = 0, winner, score1 = 0, score2 = 0;
	String winnerName;
	static String name1;
	static String name2;
	Icon x = new ImageIcon("x.jpg");
	Icon o = new ImageIcon("o.jpeg");

	// in the default constructor we initialize the window
	public MainWindow() {
		super("X - O");
		setVisible(true);
		setLocation(550, 200);
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		pnlbtns.setLayout(new GridLayout(3, 3));

		// here we call some functions to initialize and add components to the frame and
		// add action listeners to the buttons
		initializeComponetns();
		addComponents();
		addActions();

	}
	// this function adds the action listeners

	private void addActions() {
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn21.addActionListener(this);
		btn22.addActionListener(this);
		btn23.addActionListener(this);
		btn31.addActionListener(this);
		btn32.addActionListener(this);
		btn33.addActionListener(this);
		btnNewGame.addActionListener(this);
		btnSave.addActionListener(this);

	}

	// this functions adds the components to the frame

	private void addComponents() {
		pnlnames.add(lblname1);
		pnlnames.add(lblscore1);
		pnlnames.add(lblname2);
		pnlnames.add(lblscore2);
		pnlnames.add(lblturn);
		pnlnames.add(lbllab);
		add(pnlnames, BorderLayout.NORTH);

		pnlbtns.add(btn11);
		pnlbtns.add(btn12);
		pnlbtns.add(btn13);
		pnlbtns.add(btn21);
		pnlbtns.add(btn22);
		pnlbtns.add(btn23);
		pnlbtns.add(btn31);
		pnlbtns.add(btn32);
		pnlbtns.add(btn33);
		add(pnlbtns, BorderLayout.CENTER);

		pnlsouth.add(btnNewGame);
		pnlsouth.add(btnSave);
		add(pnlsouth, BorderLayout.SOUTH);

	}

	// this function initialize Components

	private void initializeComponetns() {
		btn11 = new JButton();
		btn12 = new JButton();
		btn13 = new JButton();
		btn21 = new JButton();
		btn22 = new JButton();
		btn23 = new JButton();
		btn31 = new JButton();
		btn32 = new JButton();
		btn33 = new JButton();
		btnNewGame = new JButton("New Game");
		btnSave = new JButton("Save");
		lblname1 = new JLabel("name1");
		lblname2 = new JLabel("name2");
		lblscore1 = new JLabel(Integer.toString(score1));
		lblscore2 = new JLabel(Integer.toString(score2));
		lblturn = new JLabel("The turn is for");
		lbllab = new JLabel((lab % 2 == 0) ? "X" : "O");

	}

	// in the main functions we call the default constructor and call two option
	// panes to collect names inn the begging
	public static void main(String[] args) {
		new MainWindow();
		name1 = new JOptionPane().showInputDialog("enter first name");
		name2 = new JOptionPane().showInputDialog("enter second name");
		updateNames(name1, name2);
	}

	// this method changes the names
	private static void updateNames(String name1, String name2) {
		lblname1.setText(name1);
		lblname2.setText(name2);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn11) {
			btn11.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");
			lab++;
			if (lab % 2 == 1) {
				btn11.setText("X");
				btn11.setIcon(x);

			} else {
				btn11.setText("O");
				btn11.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn12) {
			btn12.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn12.setText("X");
				btn12.setIcon(x);
			} else {
				btn12.setText("O");
				btn12.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn13) {
			btn13.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn13.setText("X");
				btn13.setIcon(x);
			} else {
				btn13.setText("O");
				btn13.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn21) {
			btn21.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn21.setText("X");
				btn21.setIcon(x);
			} else {
				btn21.setText("O");
				btn21.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn22) {
			btn22.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn22.setText("X");
				btn22.setIcon(x);
			} else {
				btn22.setText("O");
				btn22.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn23) {
			btn23.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn23.setText("X");
				btn23.setIcon(x);
			} else {
				btn23.setText("O");
				btn23.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn31) {
			btn31.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn31.setText("X");
				btn31.setIcon(x);
				
			} else {
				btn31.setText("O");
				btn31.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn32) {
			btn32.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn32.setText("X");
				btn32.setIcon(x);
			} else {
				btn32.setText("O");
				btn32.setIcon(o);
			}
			chekWinner();
		}
		if (e.getSource() == btn33) {
			btn33.setEnabled(false);
			lbllab.setText((lab % 2 == 1) ? "X" : "O");

			lab++;
			if (lab % 2 == 1) {
				btn33.setText("X");
				btn33.setIcon(x);
			} else {
				btn33.setText("O");
				btn33.setIcon(o);
			}
			chekWinner();
		}

		if (e.getSource() == btnNewGame) {
			btn11.setEnabled(true);
			btn11.setText("");
			btn12.setEnabled(true);
			btn12.setText("");
			btn13.setEnabled(true);
			btn13.setText("");
			btn21.setEnabled(true);
			btn21.setText("");
			btn22.setEnabled(true);
			btn22.setText("");
			btn23.setEnabled(true);
			btn23.setText("");
			btn31.setEnabled(true);
			btn31.setText("");
			btn32.setEnabled(true);
			btn32.setText("");
			btn33.setEnabled(true);
			btn33.setText("");
			lab = 0;
			lbllab.setText((lab % 2 == 0) ? "X" : "O");

		}
		if (e.getSource() == btnSave) {
			try {
				FileWriter fw = new FileWriter("XOsaveFile.txt", true);
				Date date = new Date();
				fw.write(date.toString() + "\n");
				fw.write(lblname1.getText() + lblscore1.getText() + "-----------" + lblname2.getText()
						+ lblscore2.getText() + "\n");
				fw.close();
			} catch (IOException e1) {
			}

		}

	}

	private void chekWinner() {

		if ((btn11.getText().equals(btn12.getText()))
				&& (btn11.getText().equals(btn13.getText()) && !(btn11.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn21.getText().equals(btn22.getText()))
				&& (btn21.getText().equals(btn23.getText()) && !(btn21.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn31.getText().equals(btn32.getText()))
				&& (btn31.getText().equals(btn33.getText()) && !(btn31.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn11.getText().equals(btn21.getText()))
				&& (btn11.getText().equals(btn31.getText()) && !(btn11.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn12.getText().equals(btn22.getText()))
				&& (btn12.getText().equals(btn32.getText()) && !(btn12.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn13.getText().equals(btn23.getText()))
				&& (btn13.getText().equals(btn33.getText()) && !(btn13.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn11.getText().equals(btn22.getText()))
				&& (btn11.getText().equals(btn33.getText()) && !(btn11.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
		if ((btn31.getText().equals(btn22.getText()))
				&& (btn31.getText().equals(btn13.getText()) && !(btn31.getText().equals("")))) {
			winner = (lab % 2);
			if (winner == 1) {
				winnerName = lblname1.getText();
				score1 = score1 + 1;
				lblscore1.setText((Integer.toString(score1)));
			} else {
				winnerName = lblname2.getText();
				score2 = score2 + 1;
				lblscore2.setText((Integer.toString(score2)));
			}
			new JOptionPane().showMessageDialog(null, (winnerName + " is the winner :)"));
			setAllBtnsUneditale();

		}
	}

	// this function resets all the buttons to null 
	private void setAllBtnsUneditale() {
		btn11.setEnabled(false);
		btn11.setIcon(null);
		btn12.setEnabled(false);
		btn12.setIcon(null);
		btn13.setEnabled(false);
		btn13.setIcon(null);
		btn21.setEnabled(false);
		btn21.setIcon(null);
		btn22.setEnabled(false);
		btn22.setIcon(null);
		btn23.setEnabled(false);
		btn23.setIcon(null);
		btn31.setEnabled(false);
		btn31.setIcon(null);
		btn32.setEnabled(false);
		btn32.setIcon(null);
		btn33.setEnabled(false);
		btn33.setIcon(null);

	}
}
