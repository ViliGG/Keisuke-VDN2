package gui;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @desc Frame that displays the menu.
 * @author vilip
 * @date 5.1.2021
 */
public class MenuFrame extends JFrame {

	/**
	 * @desc Randomly generated serial version UID
	 */
	private static final long serialVersionUID = 5469304007304180616L;
	
	/**
	 * @desc Declaring menu buttons.
	 */
	JButton new_button, open_button, option_button, help_button, exit_button;
	
	/**
	 * @desc Menu dimensions.
	 */
	private Dimension frame_size;
	
	/**
	 * @desc Preparing and adding components to frame.
	 * @env new_button, open_button, option_button, help_button, exit_button.
	 */
	public MenuFrame() {
		this.setTitle("Keisuke - Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(400, 400);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                resize_components();
            }
        });
		
		new_button = new JButton("New");
		open_button = new JButton("Open");
		option_button = new JButton("Options");
		help_button = new JButton("Help");
		exit_button = new JButton("Exit");
		
		new_button.setFocusable(false);
		open_button.setFocusable(false);
		option_button.setFocusable(false);
		help_button.setFocusable(false);
		exit_button.setFocusable(false);
		
		exit_button.addActionListener(e -> exit());
		
		this.getContentPane().add(new_button);
		this.getContentPane().add(open_button);
		this.getContentPane().add(option_button);
		this.getContentPane().add(help_button);
		this.getContentPane().add(exit_button);
		
		this.setVisible(true);
	}
	
	/**
	 * @desc Resizing buttons on frame resize.
	 * @evn frame_size.
	 * @env new_button, open_button, option_button, help_button, exit_button.
	 */
	private void resize_components() {
		frame_size = new Dimension(this.getContentPane().getSize());
		int button_width = (int) (frame_size.getWidth() * 0.4);
		int button_height = (int) (frame_size.getHeight() * 0.12);
		int left_offset = (int) (frame_size.getWidth() * 0.3);
		int top_offest = (int) (frame_size.getHeight() * 0.175);
		int top_margin = (int) (frame_size.getHeight() * 0.01);
		new_button.setBounds(left_offset, top_offest + 0 * (button_height + top_margin),
				button_width, button_height);
		open_button.setBounds(left_offset, top_offest + 1 * (button_height + top_margin),
				button_width, button_height);
		option_button.setBounds(left_offset, top_offest + 2 * (button_height + top_margin),
				button_width, button_height);
		help_button.setBounds(left_offset, top_offest + 3 * (button_height + top_margin),
				button_width, button_height);
		exit_button.setBounds(left_offset, top_offest + 4 * (button_height + top_margin),
				button_width, button_height);
	}
	
	private void exit() {
		this.dispose();
		System.exit(0);
	}
	
}