import java.awt.event.*;
import java.text.*;
import java.util.*;

import javax.swing.*;

public class BagelShop extends JFrame implements ActionListener {

	private double white = 1.25;
	private double wholewheat = 1.50;
	private double regularCoffee = 1.25;
	private double cappuccino = 2.00;
	private double cafeAuLait = 1.75;
	private double creamCheese = 0.50;
	private double butter = 0.25;
	private double blueberryJam = 0.75;
	private double rasberryJam = 0.75;
	private double peachJelly = 0.75;

	DecimalFormat df = new DecimalFormat("$0.00");
	Date date = new Date();

	private JPanel panelBagel;
	private JRadioButton radNoBagel;
	private JLabel lblBagelQty;
	private JRadioButton radWhite;
	private JTextField whiteQty;
	private JRadioButton radWholeWheat;
	private JTextField wholewheatQty;

	private JPanel panelCoffee;
	private JRadioButton radNoCoffee;
	private JLabel lblCoffeeQty;
	private JRadioButton radRegCoffee;
	private JTextField regcoffeeQty;
	private JRadioButton radCappuccino;
	private JTextField cappuccinoQty;
	private JRadioButton radCafeAuLait;
	private JTextField cafeaulaitQty;

	private JPanel panelToppings;
	private JCheckBox chkCreamCheese;
	private JCheckBox chkButter;
	private JCheckBox chkBlueberryJam;
	private JCheckBox chkRasberryJam;
	private JCheckBox chkPeachJelly;

	private JPanel panelPrice;
	private JLabel lblSubtotal;
	private JLabel lblSubtotalAmount;
	private JLabel lblTax;
	private JLabel lblTaxAmount;
	private JLabel lblTotal;
	private JLabel lblTotalAmount;

	private JPanel buttons;
	private JButton calculate;
	private JButton reset;
	private JButton exit;

	public BagelShop() {
		panelBagel = new JPanel();
		radNoBagel = new JRadioButton("None");
		radNoBagel.setSelected(true);
		lblBagelQty = new JLabel("Qty");
		radWhite = new JRadioButton("White");
		whiteQty = new JTextField();
		radWholeWheat = new JRadioButton("Whole Wheat");
		wholewheatQty = new JTextField();

		panelCoffee = new JPanel();
		radNoCoffee = new JRadioButton("None");
		radNoCoffee.setSelected(true);
		lblCoffeeQty = new JLabel("Qty");
		radRegCoffee = new JRadioButton("Regular Coffee");
		regcoffeeQty = new JTextField();
		radCappuccino = new JRadioButton("Cappuccino");
		cappuccinoQty = new JTextField();
		radCafeAuLait = new JRadioButton("Cafe Au Lait");
		cafeaulaitQty = new JTextField();

		panelToppings = new JPanel();
		chkCreamCheese = new JCheckBox("Cream Cheese");
		chkCreamCheese.setEnabled(false);
		chkButter = new JCheckBox("Butter");
		chkButter.setEnabled(false);
		chkBlueberryJam = new JCheckBox("Blueberry Jam");
		chkBlueberryJam.setEnabled(false);
		chkRasberryJam = new JCheckBox("Rasberry Jam");
		chkRasberryJam.setEnabled(false);
		chkPeachJelly = new JCheckBox("Peach Jelly");
		chkPeachJelly.setEnabled(false);

		panelPrice = new JPanel();
		lblSubtotal = new JLabel("Subtotal: ");
		lblSubtotalAmount = new JLabel("0.00");
		lblTax = new JLabel("Tax: ");
		lblTaxAmount = new JLabel("0.00");
		lblTotal = new JLabel("Total: ");
		lblTotalAmount = new JLabel("0.00");

		buttons = new JPanel();
		calculate = new JButton("Calculate");
		reset = new JButton("Reset");
		exit = new JButton("Exit");

		radNoBagel.addActionListener(this);
		radWhite.addActionListener(this);
		whiteQty.addActionListener(this);
		radWholeWheat.addActionListener(this);
		wholewheatQty.addActionListener(this);

		radNoCoffee.addActionListener(this);
		radRegCoffee.addActionListener(this);
		regcoffeeQty.addActionListener(this);
		radCappuccino.addActionListener(this);
		cappuccinoQty.addActionListener(this);
		radCafeAuLait.addActionListener(this);
		cafeaulaitQty.addActionListener(this);

		chkCreamCheese.addActionListener(this);
		chkButter.addActionListener(this);
		chkBlueberryJam.addActionListener(this);
		chkRasberryJam.addActionListener(this);
		chkPeachJelly.addActionListener(this);

		calculate.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (radNoBagel == e.getSource()) {
			radWhite.setSelected(false);
			whiteQty.setEnabled(false);
			whiteQty.setText("");
			radWholeWheat.setSelected(false);
			wholewheatQty.setEnabled(false);
			wholewheatQty.setText("");

			chkCreamCheese.setEnabled(false);
			chkButter.setEnabled(false);
			chkBlueberryJam.setEnabled(false);
			chkRasberryJam.setEnabled(false);
			chkPeachJelly.setEnabled(false);
		}

		if (radWhite == e.getSource()) {
			radNoBagel.setSelected(false);
			whiteQty.setEnabled(true);
			whiteQty.setText("1");
			radWholeWheat.setSelected(false);
			wholewheatQty.setEnabled(false);
			wholewheatQty.setText("");

			chkCreamCheese.setEnabled(true);
			chkButter.setEnabled(true);
			chkBlueberryJam.setEnabled(true);
			chkRasberryJam.setEnabled(true);
			chkPeachJelly.setEnabled(true);

			chkCreamCheese.setSelected(false);
			chkButter.setSelected(false);
			chkBlueberryJam.setSelected(false);
			chkRasberryJam.setSelected(false);
			chkPeachJelly.setSelected(false);
		}

		if (radWholeWheat == e.getSource()) {
			radNoBagel.setSelected(false);
			radWhite.setSelected(false);
			whiteQty.setEnabled(false);
			whiteQty.setText("");
			radWholeWheat.setSelected(true);
			wholewheatQty.setEnabled(true);
			wholewheatQty.setText("1");

			chkCreamCheese.setEnabled(true);
			chkButter.setEnabled(true);
			chkBlueberryJam.setEnabled(true);
			chkRasberryJam.setEnabled(true);
			chkPeachJelly.setEnabled(true);

			chkCreamCheese.setSelected(false);
			chkButter.setSelected(false);
			chkBlueberryJam.setSelected(false);
			chkRasberryJam.setSelected(false);
			chkPeachJelly.setSelected(false);
		}

		if (radNoCoffee == e.getSource()) {
			radRegCoffee.setSelected(false);
			regcoffeeQty.setEnabled(false);
			regcoffeeQty.setText("");
			radCappuccino.setSelected(false);
			cappuccinoQty.setEnabled(false);
			cappuccinoQty.setText("");
			radCafeAuLait.setSelected(false);
			cafeaulaitQty.setEnabled(false);
			cafeaulaitQty.setText("");
		}

		if (radRegCoffee == e.getSource()) {
			radNoCoffee.setSelected(false);
			regcoffeeQty.setEnabled(true);
			regcoffeeQty.setText("1");
			radCappuccino.setSelected(false);
			cappuccinoQty.setEnabled(false);
			cappuccinoQty.setText("");
			radCafeAuLait.setSelected(false);
			cafeaulaitQty.setEnabled(false);
			cafeaulaitQty.setText("");
		}

		if (radCappuccino == e.getSource()) {
			radNoCoffee.setSelected(false);
			radRegCoffee.setSelected(false);
			regcoffeeQty.setEnabled(false);
			regcoffeeQty.setText("");
			cappuccinoQty.setEnabled(true);
			cappuccinoQty.setText("1");
			radCafeAuLait.setSelected(false);
			cafeaulaitQty.setEnabled(false);
			cafeaulaitQty.setText("");
		}

		if (radCafeAuLait == e.getSource()) {
			radNoCoffee.setSelected(false);
			radRegCoffee.setSelected(false);
			regcoffeeQty.setEnabled(false);
			regcoffeeQty.setText("");
			radCappuccino.setSelected(false);
			cappuccinoQty.setEnabled(false);
			cappuccinoQty.setText("");
			cafeaulaitQty.setEnabled(true);
			cafeaulaitQty.setText("1");
		}

		if (calculate == e.getSource()) {
			calculate();
		}

		if (reset == e.getSource()) {
			this.dispose();
			BagelShop bs = new BagelShop();
		}

		if (exit == e.getSource()) {
			System.exit(0);
		}
	}

	public void calculate() {
		try {
			double whiteQuantity = Integer.parseInt(whiteQty.getText());
			double wholewheatQuantity = Integer.parseInt(wholewheatQty
					.getText());
			double regcoffeeQuantity = Integer.parseInt(regcoffeeQty.getText());
			double cappuccinoQuantity = Integer.parseInt(cappuccinoQty
					.getText());
			double cafeaulaitQuantity = Integer.parseInt(cafeaulaitQty
					.getText());
			double subtotal = 0;
			double toppingQuantity = 0;
			double tax = 0;
			double total = 0;

			if (radWhite.isSelected()) {
				subtotal = +(whiteQuantity * white);
				toppingQuantity = whiteQuantity;
			}

			if (radWholeWheat.isSelected()) {
				subtotal = +(wholewheatQuantity * wholewheat);
				toppingQuantity = wholewheatQuantity;
			}

			if (radRegCoffee.isSelected()) {
				subtotal = +(regcoffeeQuantity * regularCoffee);
			}

			if (radCappuccino.isSelected()) {
				subtotal = +(cappuccinoQuantity * cappuccino);
			}

			if (radCafeAuLait.isSelected()) {
				subtotal = +(cafeaulaitQuantity * cafeAuLait);
			}

			if (chkCreamCheese.isSelected()) {
				subtotal = +(toppingQuantity * creamCheese);
			}

			if (chkButter.isSelected()) {
				subtotal = +(toppingQuantity * butter);
			}

			if (chkBlueberryJam.isSelected()) {
				subtotal = +(toppingQuantity * blueberryJam);
			}

			if (chkRasberryJam.isSelected()) {
				subtotal = +(toppingQuantity * rasberryJam);
			}

			if (chkPeachJelly.isSelected()) {
				subtotal = +(toppingQuantity * peachJelly);
			}

			tax = subtotal * 0.13;
			total = subtotal + tax;

			lblSubtotal.setText(String.valueOf(df.format(subtotal)));
			lblTax.setText(String.valueOf(df.format(tax)));
			lblTotal.setText(String.valueOf(df.format(total)));
			
		} catch (Exception e) {
			System.out.println("Invalid number entered.");
		}
	}
}