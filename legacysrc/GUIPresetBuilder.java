import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUIPresetBuilder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfInf_AA;
	private JTextField tfInf_AT;
	private JTextField tfInf_ammo;
	private JTextField tfInf_LAT;
	private JTextField tfInf_exp;
	private JTextField tfInf_spotter;
	private JTextField tfInf_sniper;
	private JTextField tfInf_GL;
	private JTextField tfInf_rifleman;
	private JTextField tfInf_marksman;
	private JTextField tfInf_TL;
	private JTextField tfInf_SL;
	private JTextField tfInf_Default;
	private JTextField tfFactionName;
	private JTextField tfInf_HMG;
	private JTextField tfInf_medic;
	private JTextField tfInf_engineer;
	private JTextField tfInf_crew;
	private JTextField tfInf_crew_heli;
	private JTextField tfInf_pilot;
	private JTextField tfInf_pilot_heli;
	private JTextField tfInf_survivor;
	private JTextField tfInf_unarmed;
	private JTextField tfInf_diver_TL;
	private JTextField tfInf_diver_rifleman;
	private JTextField tfInf_diver_exp;
	private JTextField tfVeh_IFV;
	private JTextField tfVeh_MRAP_GMG;
	private JTextField tfVeh_MRAP_HMG;
	private JTextField tfVeh_MRAP_unarmed;
	private JTextField tfVeh_car_armed;
	private JTextField tfVeh_car_unarmed;
	private JTextField tfVeh_Default;
	private JTextField tfVeh_stat_GMG_high;
	private JTextField tfVeh_stat_HMG_high;
	private JTextField tfVeh_SPAA;
	private JTextField tfVeh_SPA;
	private JTextField tfVeh_MRLS;
	private JTextField tfVeh_MBT;
	private JTextField tfVeh_APC;
	private JTextField tfVeh_heli_light;
	private JTextField tfVeh_stat_mortar_heavy;
	private JTextField tfVeh_stat_mortar_light;
	private JTextField tfVeh_stat_AT;
	private JTextField tfVeh_stat_AA;
	private JTextField tfVeh_stat_GMG_low;
	private JTextField tfVeh_stat_HMG_low;
	private JTextField tfVeh_heli_heavy;
	private JTextField tfVeh_heli_cargo;
	private JTextField tfVeh_heli_attack;
	private JTextField tfVeh_plane_attack;
	private JTextField tfVeh_plane_fighter;
	private JTextField tfVeh_plane_cargo;
	private JTextField tfVeh_plane_unarmed;
	private JTextField tfVeh_plane_VTOL;
	private JTextField tfVeh_boat_unarmed;
	private JTextField tfVeh_boat_armed;
	private JTextField tfVeh_personal;
	private JTextField tfVeh_truck_inf;
	private JTextField tfVeh_truck_repair;
	private JTextField tfVeh_truck_ammo;
	private JTextField tfVeh_truck_cargo;
	private JTextField tfVeh_truck_medical;
	private JTextField tfVeh_truck_fuel;
	private JTextField tfVeh_submarine;
	private JTextField tfDrone_Default;
	private JTextField tfDrone_UGV_unarmed;
	private JTextField tfDrone_UGV_armed;
	private JTextField tfDrone_plane_attack;
	private JTextField tfDrone_heli_attack;
	private JTextField tfDrone_quadcopter;
	private JTextField tfDrone_designator;
	private JTextField tfDrone_stat_HMG_low;
	private JTextField tfDrone_stat_GMG_low;
	private JTextField tfDrone_stat_AA;
	private JTextField tfDrone_plane_unarmed;
	private JTextField tfInf_LMG;
	private JTextField tfInf_officer;
	private JTextField tfInf_recon_TL;
	private JTextField tfInf_recon_rifleman;
	private JTextField tfInf_recon_exp;
	private JTextField tfInf_recon_JTAC;
	private JTextField tfInf_recon_LAT;
	private JTextField tfInf_recon_marksman;
	private JTextField tfInf_recon_medic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPresetBuilder frame = new GUIPresetBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIPresetBuilder() {
		setResizable(false);
		setTitle("Vindicta Preset Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("AA");
		label.setBounds(10, 397, 79, 14);
		contentPane.add(label);
		
		tfInf_AA = new JTextField();
		tfInf_AA.setColumns(10);
		tfInf_AA.setBounds(99, 397, 86, 18);
		contentPane.add(tfInf_AA);
		
		tfInf_AT = new JTextField();
		tfInf_AT.setColumns(10);
		tfInf_AT.setBounds(99, 366, 86, 18);
		contentPane.add(tfInf_AT);
		
		JLabel label_1 = new JLabel("AT");
		label_1.setBounds(10, 369, 79, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("LAT");
		label_2.setBounds(10, 341, 79, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Ammo Bearer");
		label_3.setBounds(10, 313, 79, 14);
		contentPane.add(label_3);
		
		tfInf_ammo = new JTextField();
		tfInf_ammo.setColumns(10);
		tfInf_ammo.setBounds(99, 310, 86, 18);
		contentPane.add(tfInf_ammo);
		
		tfInf_LAT = new JTextField();
		tfInf_LAT.setColumns(10);
		tfInf_LAT.setBounds(99, 338, 86, 18);
		contentPane.add(tfInf_LAT);
		
		tfInf_exp = new JTextField();
		tfInf_exp.setColumns(10);
		tfInf_exp.setBounds(99, 282, 86, 18);
		contentPane.add(tfInf_exp);
		
		JLabel label_4 = new JLabel("Sapper");
		label_4.setBounds(10, 285, 79, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Spotter");
		label_5.setBounds(10, 257, 79, 14);
		contentPane.add(label_5);
		
		tfInf_spotter = new JTextField();
		tfInf_spotter.setColumns(10);
		tfInf_spotter.setBounds(99, 254, 86, 18);
		contentPane.add(tfInf_spotter);
		
		tfInf_sniper = new JTextField();
		tfInf_sniper.setColumns(10);
		tfInf_sniper.setBounds(99, 226, 86, 18);
		contentPane.add(tfInf_sniper);
		
		JLabel label_6 = new JLabel("Sniper");
		label_6.setBounds(10, 229, 79, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Marksman");
		label_7.setBounds(10, 201, 79, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Rifleman");
		label_8.setBounds(10, 173, 79, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Grenadier");
		label_9.setBounds(10, 145, 79, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Officer");
		label_10.setBounds(10, 117, 79, 14);
		contentPane.add(label_10);
		
		tfInf_officer = new JTextField();
		tfInf_officer.setColumns(10);
		tfInf_officer.setBounds(99, 114, 86, 18);
		contentPane.add(tfInf_officer);
		
		tfInf_GL = new JTextField();
		tfInf_GL.setColumns(10);
		tfInf_GL.setBounds(99, 142, 86, 18);
		contentPane.add(tfInf_GL);
		
		tfInf_rifleman = new JTextField();
		tfInf_rifleman.setColumns(10);
		tfInf_rifleman.setBounds(99, 170, 86, 18);
		contentPane.add(tfInf_rifleman);
		
		tfInf_marksman = new JTextField();
		tfInf_marksman.setColumns(10);
		tfInf_marksman.setBounds(99, 198, 86, 18);
		contentPane.add(tfInf_marksman);
		
		tfInf_TL = new JTextField();
		tfInf_TL.setColumns(10);
		tfInf_TL.setBounds(99, 86, 86, 18);
		contentPane.add(tfInf_TL);
		
		tfInf_SL = new JTextField();
		tfInf_SL.setColumns(10);
		tfInf_SL.setBounds(99, 58, 86, 18);
		contentPane.add(tfInf_SL);
		
		tfInf_Default = new JTextField();
		tfInf_Default.setColumns(10);
		tfInf_Default.setBounds(99, 30, 86, 18);
		contentPane.add(tfInf_Default);
		
		tfFactionName = new JTextField();
		tfFactionName.setColumns(10);
		tfFactionName.setBounds(99, 560, 271, 18);
		contentPane.add(tfFactionName);
		
		JLabel label_11 = new JLabel("Faction Name");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(10, 563, 79, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Soldiers");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(10, 11, 175, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Standard Soldier");
		label_13.setBounds(10, 33, 79, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Squad Leader");
		label_14.setBounds(10, 61, 79, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Team Leader");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setBounds(10, 89, 79, 14);
		contentPane.add(label_15);
		
		JLabel lblMachinegunner = new JLabel("LMG");
		lblMachinegunner.setBounds(10, 427, 79, 14);
		contentPane.add(lblMachinegunner);
		
		tfInf_LMG = new JTextField();
		tfInf_LMG.setColumns(10);
		tfInf_LMG.setBounds(99, 424, 86, 18);
		contentPane.add(tfInf_LMG);
		
		JLabel lblHeavyMachinegunner = new JLabel("HMG");
		lblHeavyMachinegunner.setBounds(10, 455, 79, 14);
		contentPane.add(lblHeavyMachinegunner);
		
		tfInf_HMG = new JTextField();
		tfInf_HMG.setColumns(10);
		tfInf_HMG.setBounds(99, 452, 86, 18);
		contentPane.add(tfInf_HMG);
		
		JLabel lblMedic = new JLabel("Medic");
		lblMedic.setBounds(10, 483, 79, 14);
		contentPane.add(lblMedic);
		
		tfInf_medic = new JTextField();
		tfInf_medic.setColumns(10);
		tfInf_medic.setBounds(99, 480, 86, 18);
		contentPane.add(tfInf_medic);
		
		JLabel lblEngineer = new JLabel("Engineer");
		lblEngineer.setBounds(10, 511, 79, 14);
		contentPane.add(lblEngineer);
		
		tfInf_engineer = new JTextField();
		tfInf_engineer.setColumns(10);
		tfInf_engineer.setBounds(99, 508, 86, 18);
		contentPane.add(tfInf_engineer);
		
		JLabel lblCrew = new JLabel("Crew");
		lblCrew.setBounds(195, 33, 79, 14);
		contentPane.add(lblCrew);
		
		tfInf_crew = new JTextField();
		tfInf_crew.setColumns(10);
		tfInf_crew.setBounds(284, 30, 86, 18);
		contentPane.add(tfInf_crew);
		
		JLabel lblCrewheli = new JLabel("Crew(Heli)");
		lblCrewheli.setBounds(195, 61, 79, 14);
		contentPane.add(lblCrewheli);
		
		tfInf_crew_heli = new JTextField();
		tfInf_crew_heli.setColumns(10);
		tfInf_crew_heli.setBounds(284, 58, 86, 18);
		contentPane.add(tfInf_crew_heli);
		
		JLabel lblPilot = new JLabel("Pilot");
		lblPilot.setBounds(195, 89, 79, 14);
		contentPane.add(lblPilot);
		
		tfInf_pilot = new JTextField();
		tfInf_pilot.setColumns(10);
		tfInf_pilot.setBounds(284, 86, 86, 18);
		contentPane.add(tfInf_pilot);
		
		JLabel lblPilotheli = new JLabel("Pilot(Heli)");
		lblPilotheli.setBounds(195, 117, 79, 14);
		contentPane.add(lblPilotheli);
		
		tfInf_pilot_heli = new JTextField();
		tfInf_pilot_heli.setColumns(10);
		tfInf_pilot_heli.setBounds(284, 114, 86, 18);
		contentPane.add(tfInf_pilot_heli);
		
		JLabel lblSurvivor = new JLabel("Survivor");
		lblSurvivor.setBounds(195, 145, 79, 14);
		contentPane.add(lblSurvivor);
		
		tfInf_survivor = new JTextField();
		tfInf_survivor.setColumns(10);
		tfInf_survivor.setBounds(284, 142, 86, 18);
		contentPane.add(tfInf_survivor);
		
		JLabel lblUnarmed = new JLabel("Unarmed");
		lblUnarmed.setBounds(195, 173, 79, 14);
		contentPane.add(lblUnarmed);
		
		tfInf_unarmed = new JTextField();
		tfInf_unarmed.setColumns(10);
		tfInf_unarmed.setBounds(284, 170, 86, 18);
		contentPane.add(tfInf_unarmed);
		
		JLabel lblRecon = new JLabel("Recon");
		lblRecon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecon.setBounds(195, 201, 175, 14);
		contentPane.add(lblRecon);
		
		JLabel lblTeamLeader = new JLabel("Team Leader");
		lblTeamLeader.setBounds(195, 229, 79, 14);
		contentPane.add(lblTeamLeader);
		
		tfInf_recon_TL = new JTextField();
		tfInf_recon_TL.setColumns(10);
		tfInf_recon_TL.setBounds(284, 226, 86, 18);
		contentPane.add(tfInf_recon_TL);
		
		JLabel lblRifleman = new JLabel("Rifleman");
		lblRifleman.setBounds(195, 257, 79, 14);
		contentPane.add(lblRifleman);
		
		tfInf_recon_rifleman = new JTextField();
		tfInf_recon_rifleman.setColumns(10);
		tfInf_recon_rifleman.setBounds(284, 254, 86, 18);
		contentPane.add(tfInf_recon_rifleman);
		
		JLabel lblMedic_1 = new JLabel("Medic");
		lblMedic_1.setBounds(195, 285, 79, 14);
		contentPane.add(lblMedic_1);
		
		JLabel lblSappr = new JLabel("Sapper");
		lblSappr.setBounds(195, 312, 79, 14);
		contentPane.add(lblSappr);
		
		tfInf_recon_exp = new JTextField();
		tfInf_recon_exp.setColumns(10);
		tfInf_recon_exp.setBounds(284, 309, 86, 18);
		contentPane.add(tfInf_recon_exp);
		
		JLabel lblLat = new JLabel("LAT");
		lblLat.setBounds(195, 340, 79, 14);
		contentPane.add(lblLat);
		
		tfInf_recon_LAT = new JTextField();
		tfInf_recon_LAT.setColumns(10);
		tfInf_recon_LAT.setBounds(284, 337, 86, 18);
		contentPane.add(tfInf_recon_LAT);
		
		JLabel lblMarksman = new JLabel("Marksman");
		lblMarksman.setBounds(195, 368, 79, 14);
		contentPane.add(lblMarksman);
		
		JLabel lblJtac = new JLabel("JTAC");
		lblJtac.setBounds(195, 396, 79, 14);
		contentPane.add(lblJtac);
		
		tfInf_recon_JTAC = new JTextField();
		tfInf_recon_JTAC.setColumns(10);
		tfInf_recon_JTAC.setBounds(284, 393, 86, 18);
		contentPane.add(tfInf_recon_JTAC);
		
		JLabel lblDivers = new JLabel("Divers");
		lblDivers.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDivers.setBounds(195, 425, 175, 14);
		contentPane.add(lblDivers);
		
		JLabel lblTeamLeader_1 = new JLabel("Team Leader");
		lblTeamLeader_1.setBounds(195, 453, 79, 14);
		contentPane.add(lblTeamLeader_1);
		
		tfInf_diver_TL = new JTextField();
		tfInf_diver_TL.setColumns(10);
		tfInf_diver_TL.setBounds(284, 450, 86, 18);
		contentPane.add(tfInf_diver_TL);
		
		JLabel lblRifleman_1 = new JLabel("Rifleman");
		lblRifleman_1.setBounds(195, 480, 79, 14);
		contentPane.add(lblRifleman_1);
		
		tfInf_diver_rifleman = new JTextField();
		tfInf_diver_rifleman.setColumns(10);
		tfInf_diver_rifleman.setBounds(284, 477, 86, 18);
		contentPane.add(tfInf_diver_rifleman);
		
		JLabel lblSapper = new JLabel("Sapper");
		lblSapper.setBounds(195, 508, 79, 14);
		contentPane.add(lblSapper);
		
		tfInf_diver_exp = new JTextField();
		tfInf_diver_exp.setColumns(10);
		tfInf_diver_exp.setBounds(284, 505, 86, 18);
		contentPane.add(tfInf_diver_exp);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(380, 0, 2, 584);
		contentPane.add(separator);
		
		JLabel lblVehicles = new JLabel("Vehicles");
		lblVehicles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVehicles.setBounds(392, 11, 175, 14);
		contentPane.add(lblVehicles);
		
		tfVeh_IFV = new JTextField();
		tfVeh_IFV.setColumns(10);
		tfVeh_IFV.setBounds(481, 197, 86, 18);
		contentPane.add(tfVeh_IFV);
		
		JLabel lblIfv = new JLabel("IFV");
		lblIfv.setBounds(392, 200, 79, 14);
		contentPane.add(lblIfv);
		
		tfVeh_MRAP_GMG = new JTextField();
		tfVeh_MRAP_GMG.setColumns(10);
		tfVeh_MRAP_GMG.setBounds(481, 169, 86, 18);
		contentPane.add(tfVeh_MRAP_GMG);
		
		JLabel lblMrapgmg = new JLabel("MRAP(GMG)");
		lblMrapgmg.setBounds(392, 172, 79, 14);
		contentPane.add(lblMrapgmg);
		
		tfVeh_MRAP_HMG = new JTextField();
		tfVeh_MRAP_HMG.setColumns(10);
		tfVeh_MRAP_HMG.setBounds(481, 141, 86, 18);
		contentPane.add(tfVeh_MRAP_HMG);
		
		JLabel lblMraphmg = new JLabel("MRAP(HMG)");
		lblMraphmg.setBounds(392, 144, 79, 14);
		contentPane.add(lblMraphmg);
		
		tfVeh_MRAP_unarmed = new JTextField();
		tfVeh_MRAP_unarmed.setColumns(10);
		tfVeh_MRAP_unarmed.setBounds(481, 113, 86, 18);
		contentPane.add(tfVeh_MRAP_unarmed);
		
		JLabel lblMrap = new JLabel("MRAP");
		lblMrap.setBounds(392, 116, 79, 14);
		contentPane.add(lblMrap);
		
		tfVeh_car_armed = new JTextField();
		tfVeh_car_armed.setColumns(10);
		tfVeh_car_armed.setBounds(481, 86, 86, 18);
		contentPane.add(tfVeh_car_armed);
		
		JLabel lblCarunarmed = new JLabel("Car(Armed)");
		lblCarunarmed.setBounds(392, 89, 79, 14);
		contentPane.add(lblCarunarmed);
		
		tfVeh_car_unarmed = new JTextField();
		tfVeh_car_unarmed.setColumns(10);
		tfVeh_car_unarmed.setBounds(481, 58, 86, 18);
		contentPane.add(tfVeh_car_unarmed);
		
		JLabel lblCar = new JLabel("Car");
		lblCar.setBounds(392, 61, 79, 14);
		contentPane.add(lblCar);
		
		tfVeh_Default = new JTextField();
		tfVeh_Default.setColumns(10);
		tfVeh_Default.setBounds(481, 30, 86, 18);
		contentPane.add(tfVeh_Default);
		
		JLabel lblDefaultVehicle = new JLabel("Default Vehicle");
		lblDefaultVehicle.setBounds(392, 33, 79, 14);
		contentPane.add(lblDefaultVehicle);
		
		tfVeh_stat_GMG_high = new JTextField();
		tfVeh_stat_GMG_high.setColumns(10);
		tfVeh_stat_GMG_high.setBounds(481, 393, 86, 18);
		contentPane.add(tfVeh_stat_GMG_high);
		
		JLabel lblStaticGlhigh = new JLabel("Static GL(High)");
		lblStaticGlhigh.setBounds(392, 396, 79, 14);
		contentPane.add(lblStaticGlhigh);
		
		tfVeh_stat_HMG_high = new JTextField();
		tfVeh_stat_HMG_high.setColumns(10);
		tfVeh_stat_HMG_high.setBounds(481, 365, 86, 18);
		contentPane.add(tfVeh_stat_HMG_high);
		
		JLabel lblStatichmghigh = new JLabel("Static MG(High)");
		lblStatichmghigh.setBounds(392, 368, 79, 14);
		contentPane.add(lblStatichmghigh);
		
		tfVeh_SPAA = new JTextField();
		tfVeh_SPAA.setColumns(10);
		tfVeh_SPAA.setBounds(481, 337, 86, 18);
		contentPane.add(tfVeh_SPAA);
		
		JLabel lblSpaa = new JLabel("SPAA");
		lblSpaa.setBounds(392, 340, 79, 14);
		contentPane.add(lblSpaa);
		
		tfVeh_SPA = new JTextField();
		tfVeh_SPA.setColumns(10);
		tfVeh_SPA.setBounds(481, 309, 86, 18);
		contentPane.add(tfVeh_SPA);
		
		JLabel lblSpa = new JLabel("SPG");
		lblSpa.setBounds(392, 312, 79, 14);
		contentPane.add(lblSpa);
		
		tfVeh_MRLS = new JTextField();
		tfVeh_MRLS.setColumns(10);
		tfVeh_MRLS.setBounds(481, 282, 86, 18);
		contentPane.add(tfVeh_MRLS);
		
		JLabel lblMrls = new JLabel("MRLS");
		lblMrls.setBounds(392, 285, 79, 14);
		contentPane.add(lblMrls);
		
		tfVeh_MBT = new JTextField();
		tfVeh_MBT.setColumns(10);
		tfVeh_MBT.setBounds(481, 254, 86, 18);
		contentPane.add(tfVeh_MBT);
		
		JLabel lblMbt = new JLabel("MBT");
		lblMbt.setBounds(392, 257, 79, 14);
		contentPane.add(lblMbt);
		
		tfVeh_APC = new JTextField();
		tfVeh_APC.setColumns(10);
		tfVeh_APC.setBounds(481, 226, 86, 18);
		contentPane.add(tfVeh_APC);
		
		JLabel lblApc = new JLabel("APC");
		lblApc.setBounds(392, 229, 79, 14);
		contentPane.add(lblApc);
		
		tfVeh_heli_light = new JTextField();
		tfVeh_heli_light.setColumns(10);
		tfVeh_heli_light.setBounds(690, 113, 86, 18);
		contentPane.add(tfVeh_heli_light);
		
		JLabel lblLightHeli = new JLabel("Heli (Light)");
		lblLightHeli.setBounds(601, 116, 79, 14);
		contentPane.add(lblLightHeli);
		
		tfVeh_stat_mortar_heavy = new JTextField();
		tfVeh_stat_mortar_heavy.setColumns(10);
		tfVeh_stat_mortar_heavy.setBounds(690, 85, 86, 18);
		contentPane.add(tfVeh_stat_mortar_heavy);
		
		JLabel lblMortarheavy = new JLabel("Mortar (Heavy)");
		lblMortarheavy.setBounds(601, 88, 79, 14);
		contentPane.add(lblMortarheavy);
		
		tfVeh_stat_mortar_light = new JTextField();
		tfVeh_stat_mortar_light.setColumns(10);
		tfVeh_stat_mortar_light.setBounds(690, 57, 86, 18);
		contentPane.add(tfVeh_stat_mortar_light);
		
		JLabel lblMortarlight = new JLabel("Mortar (Light)");
		lblMortarlight.setBounds(601, 60, 79, 14);
		contentPane.add(lblMortarlight);
		
		tfVeh_stat_AT = new JTextField();
		tfVeh_stat_AT.setColumns(10);
		tfVeh_stat_AT.setBounds(690, 29, 86, 18);
		contentPane.add(tfVeh_stat_AT);
		
		JLabel lblStaticAt = new JLabel("Static AT");
		lblStaticAt.setBounds(601, 32, 79, 14);
		contentPane.add(lblStaticAt);
		
		tfVeh_stat_AA = new JTextField();
		tfVeh_stat_AA.setColumns(10);
		tfVeh_stat_AA.setBounds(481, 477, 86, 18);
		contentPane.add(tfVeh_stat_AA);
		
		JLabel lblStaticAa = new JLabel("Static AA");
		lblStaticAa.setBounds(392, 480, 79, 14);
		contentPane.add(lblStaticAa);
		
		tfVeh_stat_GMG_low = new JTextField();
		tfVeh_stat_GMG_low.setColumns(10);
		tfVeh_stat_GMG_low.setBounds(481, 449, 86, 18);
		contentPane.add(tfVeh_stat_GMG_low);
		
		JLabel lblStaticGllow = new JLabel("Static GL(Low)");
		lblStaticGllow.setBounds(392, 452, 79, 14);
		contentPane.add(lblStaticGllow);
		
		tfVeh_stat_HMG_low = new JTextField();
		tfVeh_stat_HMG_low.setColumns(10);
		tfVeh_stat_HMG_low.setBounds(481, 421, 86, 18);
		contentPane.add(tfVeh_stat_HMG_low);
		
		JLabel lblStaticMglow = new JLabel("Static MG(Low)");
		lblStaticMglow.setBounds(392, 424, 79, 14);
		contentPane.add(lblStaticMglow);
		
		tfVeh_heli_heavy = new JTextField();
		tfVeh_heli_heavy.setColumns(10);
		tfVeh_heli_heavy.setBounds(690, 142, 86, 18);
		contentPane.add(tfVeh_heli_heavy);
		
		JLabel lblHeavyHeli = new JLabel("Heli (Heavy)");
		lblHeavyHeli.setBounds(601, 145, 79, 14);
		contentPane.add(lblHeavyHeli);
		
		tfVeh_heli_cargo = new JTextField();
		tfVeh_heli_cargo.setColumns(10);
		tfVeh_heli_cargo.setBounds(690, 169, 86, 18);
		contentPane.add(tfVeh_heli_cargo);
		
		JLabel lblHelicargo = new JLabel("Heli (Cargo)");
		lblHelicargo.setBounds(601, 172, 79, 14);
		contentPane.add(lblHelicargo);
		
		JLabel lblHeliattack = new JLabel("Heli (Attack)");
		lblHeliattack.setBounds(601, 200, 79, 14);
		contentPane.add(lblHeliattack);
		
		tfVeh_heli_attack = new JTextField();
		tfVeh_heli_attack.setColumns(10);
		tfVeh_heli_attack.setBounds(690, 197, 86, 18);
		contentPane.add(tfVeh_heli_attack);
		
		JLabel lblPlaneattack = new JLabel("Plane (Attack)");
		lblPlaneattack.setBounds(601, 227, 79, 14);
		contentPane.add(lblPlaneattack);
		
		tfVeh_plane_attack = new JTextField();
		tfVeh_plane_attack.setColumns(10);
		tfVeh_plane_attack.setBounds(690, 224, 86, 18);
		contentPane.add(tfVeh_plane_attack);
		
		JLabel lblPlanefighter = new JLabel("Plane (Fighter)");
		lblPlanefighter.setBounds(601, 255, 79, 14);
		contentPane.add(lblPlanefighter);
		
		tfVeh_plane_fighter = new JTextField();
		tfVeh_plane_fighter.setColumns(10);
		tfVeh_plane_fighter.setBounds(690, 252, 86, 18);
		contentPane.add(tfVeh_plane_fighter);
		
		JLabel lblPlanecargo = new JLabel("Plane (Cargo)");
		lblPlanecargo.setBounds(601, 283, 79, 14);
		contentPane.add(lblPlanecargo);
		
		tfVeh_plane_cargo = new JTextField();
		tfVeh_plane_cargo.setColumns(10);
		tfVeh_plane_cargo.setBounds(690, 280, 86, 18);
		contentPane.add(tfVeh_plane_cargo);
		
		JLabel lblPlaneunarmed = new JLabel("Plane (Unarmed)");
		lblPlaneunarmed.setBounds(601, 310, 86, 14);
		contentPane.add(lblPlaneunarmed);
		
		tfVeh_plane_unarmed = new JTextField();
		tfVeh_plane_unarmed.setColumns(10);
		tfVeh_plane_unarmed.setBounds(690, 307, 86, 18);
		contentPane.add(tfVeh_plane_unarmed);
		
		JLabel lblPlanevtol = new JLabel("Plane (VTOL)");
		lblPlanevtol.setBounds(601, 338, 79, 14);
		contentPane.add(lblPlanevtol);
		
		tfVeh_plane_VTOL = new JTextField();
		tfVeh_plane_VTOL.setColumns(10);
		tfVeh_plane_VTOL.setBounds(690, 335, 86, 18);
		contentPane.add(tfVeh_plane_VTOL);
		
		JLabel lblBoatunarmed = new JLabel("Boat (Unarmed)");
		lblBoatunarmed.setBounds(601, 366, 79, 14);
		contentPane.add(lblBoatunarmed);
		
		tfVeh_boat_unarmed = new JTextField();
		tfVeh_boat_unarmed.setColumns(10);
		tfVeh_boat_unarmed.setBounds(690, 363, 86, 18);
		contentPane.add(tfVeh_boat_unarmed);
		
		JLabel lblBoatarmed = new JLabel("Boat (Armed)");
		lblBoatarmed.setBounds(601, 394, 79, 14);
		contentPane.add(lblBoatarmed);
		
		tfVeh_boat_armed = new JTextField();
		tfVeh_boat_armed.setColumns(10);
		tfVeh_boat_armed.setBounds(690, 391, 86, 18);
		contentPane.add(tfVeh_boat_armed);
		
		JLabel lblPersonalVic = new JLabel("Personal Vehicle");
		lblPersonalVic.setBounds(601, 423, 79, 14);
		contentPane.add(lblPersonalVic);
		
		tfVeh_personal = new JTextField();
		tfVeh_personal.setColumns(10);
		tfVeh_personal.setBounds(690, 420, 86, 18);
		contentPane.add(tfVeh_personal);
		
		JLabel lblTruckinfantry = new JLabel("Truck (Infantry)");
		lblTruckinfantry.setBounds(601, 451, 79, 14);
		contentPane.add(lblTruckinfantry);
		
		tfVeh_truck_inf = new JTextField();
		tfVeh_truck_inf.setColumns(10);
		tfVeh_truck_inf.setBounds(690, 448, 86, 18);
		contentPane.add(tfVeh_truck_inf);
		
		JLabel lblTruckcargo = new JLabel("Truck (Cargo)");
		lblTruckcargo.setBounds(601, 479, 79, 14);
		contentPane.add(lblTruckcargo);
		
		JLabel lblTruckammo = new JLabel("Truck (Ammo)");
		lblTruckammo.setBounds(601, 506, 79, 14);
		contentPane.add(lblTruckammo);
		
		JLabel lblTruckrepair = new JLabel("Truck (Repair)");
		lblTruckrepair.setBounds(799, 33, 79, 14);
		contentPane.add(lblTruckrepair);
		
		tfVeh_truck_repair = new JTextField();
		tfVeh_truck_repair.setColumns(10);
		tfVeh_truck_repair.setBounds(888, 30, 86, 18);
		contentPane.add(tfVeh_truck_repair);
		
		tfVeh_truck_ammo = new JTextField();
		tfVeh_truck_ammo.setColumns(10);
		tfVeh_truck_ammo.setBounds(690, 503, 86, 18);
		contentPane.add(tfVeh_truck_ammo);
		
		tfVeh_truck_cargo = new JTextField();
		tfVeh_truck_cargo.setColumns(10);
		tfVeh_truck_cargo.setBounds(690, 476, 86, 18);
		contentPane.add(tfVeh_truck_cargo);
		
		JLabel lblTruckmedical = new JLabel("Truck (Medical)");
		lblTruckmedical.setBounds(799, 61, 79, 14);
		contentPane.add(lblTruckmedical);
		
		tfVeh_truck_medical = new JTextField();
		tfVeh_truck_medical.setColumns(10);
		tfVeh_truck_medical.setBounds(888, 58, 86, 18);
		contentPane.add(tfVeh_truck_medical);
		
		tfVeh_truck_fuel = new JTextField();
		tfVeh_truck_fuel.setColumns(10);
		tfVeh_truck_fuel.setBounds(888, 86, 86, 18);
		contentPane.add(tfVeh_truck_fuel);
		
		JLabel lblTruckfuel = new JLabel("Truck (Fuel)");
		lblTruckfuel.setBounds(799, 89, 79, 14);
		contentPane.add(lblTruckfuel);
		
		JLabel lblSubmarine = new JLabel("Submarine");
		lblSubmarine.setBounds(799, 116, 79, 14);
		contentPane.add(lblSubmarine);
		
		tfVeh_submarine = new JTextField();
		tfVeh_submarine.setColumns(10);
		tfVeh_submarine.setBounds(888, 113, 86, 18);
		contentPane.add(tfVeh_submarine);
		
		tfDrone_Default = new JTextField();
		tfDrone_Default.setColumns(10);
		tfDrone_Default.setBounds(888, 169, 86, 18);
		contentPane.add(tfDrone_Default);
		
		JLabel lblDefaultDrone = new JLabel("Default Drone");
		lblDefaultDrone.setBounds(799, 172, 79, 14);
		contentPane.add(lblDefaultDrone);
		
		JLabel lblUgvunarmed = new JLabel("UGV (Unarmed)");
		lblUgvunarmed.setBounds(799, 200, 79, 14);
		contentPane.add(lblUgvunarmed);
		
		tfDrone_UGV_unarmed = new JTextField();
		tfDrone_UGV_unarmed.setColumns(10);
		tfDrone_UGV_unarmed.setBounds(888, 197, 86, 18);
		contentPane.add(tfDrone_UGV_unarmed);
		
		tfDrone_UGV_armed = new JTextField();
		tfDrone_UGV_armed.setColumns(10);
		tfDrone_UGV_armed.setBounds(888, 224, 86, 18);
		contentPane.add(tfDrone_UGV_armed);
		
		JLabel lblUgvarmed = new JLabel("UGV (Armed)");
		lblUgvarmed.setBounds(799, 227, 79, 14);
		contentPane.add(lblUgvarmed);
		
		JLabel lblPlaneattack_1 = new JLabel("UAV (Armed)");
		lblPlaneattack_1.setBounds(799, 255, 79, 14);
		contentPane.add(lblPlaneattack_1);
		
		tfDrone_plane_attack = new JTextField();
		tfDrone_plane_attack.setColumns(10);
		tfDrone_plane_attack.setBounds(888, 252, 86, 18);
		contentPane.add(tfDrone_plane_attack);
		
		tfDrone_heli_attack = new JTextField();
		tfDrone_heli_attack.setColumns(10);
		tfDrone_heli_attack.setBounds(888, 307, 86, 18);
		contentPane.add(tfDrone_heli_attack);
		
		JLabel lblHeliattack_1 = new JLabel("Heli (Attack)");
		lblHeliattack_1.setBounds(799, 310, 79, 14);
		contentPane.add(lblHeliattack_1);
		
		JLabel lblQuadcopter = new JLabel("Quadcopter");
		lblQuadcopter.setBounds(799, 338, 79, 14);
		contentPane.add(lblQuadcopter);
		
		tfDrone_quadcopter = new JTextField();
		tfDrone_quadcopter.setColumns(10);
		tfDrone_quadcopter.setBounds(888, 335, 86, 18);
		contentPane.add(tfDrone_quadcopter);
		
		tfDrone_designator = new JTextField();
		tfDrone_designator.setColumns(10);
		tfDrone_designator.setBounds(888, 364, 86, 18);
		contentPane.add(tfDrone_designator);
		
		JLabel lblDesignator = new JLabel("Designator");
		lblDesignator.setBounds(799, 367, 79, 14);
		contentPane.add(lblDesignator);
		
		JLabel lblStaticMg = new JLabel("Static MG");
		lblStaticMg.setBounds(799, 394, 79, 14);
		contentPane.add(lblStaticMg);
		
		tfDrone_stat_HMG_low = new JTextField();
		tfDrone_stat_HMG_low.setColumns(10);
		tfDrone_stat_HMG_low.setBounds(888, 391, 86, 18);
		contentPane.add(tfDrone_stat_HMG_low);
		
		tfDrone_stat_GMG_low = new JTextField();
		tfDrone_stat_GMG_low.setColumns(10);
		tfDrone_stat_GMG_low.setBounds(888, 419, 86, 18);
		contentPane.add(tfDrone_stat_GMG_low);
		
		JLabel lblStaticGl = new JLabel("Static GL");
		lblStaticGl.setBounds(799, 422, 79, 14);
		contentPane.add(lblStaticGl);
		
		JLabel lblStaticAa_1 = new JLabel("Static AA");
		lblStaticAa_1.setBounds(799, 451, 79, 14);
		contentPane.add(lblStaticAa_1);
		
		tfDrone_stat_AA = new JTextField();
		tfDrone_stat_AA.setColumns(10);
		tfDrone_stat_AA.setBounds(888, 448, 86, 18);
		contentPane.add(tfDrone_stat_AA);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"This Preset Builder works by entering the classnames copied stright from the 3den Editor into the fitting Classname and then clicking thr 'Generate' Button.");
			}
		});
		btnHelp.setBounds(392, 502, 175, 20);
		contentPane.add(btnHelp);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Generate();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGenerate.setBounds(392, 559, 582, 20);
		contentPane.add(btnGenerate);
		
		JLabel lblDrones = new JLabel("Drones");
		lblDrones.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDrones.setBounds(799, 145, 175, 14);
		contentPane.add(lblDrones);
		
		JLabel lblUavunarmed = new JLabel("UAV (Unarmed)");
		lblUavunarmed.setBounds(799, 283, 79, 14);
		contentPane.add(lblUavunarmed);
		
		tfDrone_plane_unarmed = new JTextField();
		tfDrone_plane_unarmed.setColumns(10);
		tfDrone_plane_unarmed.setBounds(888, 280, 86, 18);
		contentPane.add(tfDrone_plane_unarmed);
		
		tfInf_recon_marksman = new JTextField();
		tfInf_recon_marksman.setColumns(10);
		tfInf_recon_marksman.setBounds(284, 366, 86, 18);
		contentPane.add(tfInf_recon_marksman);
		
		tfInf_recon_medic = new JTextField();
		tfInf_recon_medic.setColumns(10);
		tfInf_recon_medic.setBounds(284, 282, 86, 18);
		contentPane.add(tfInf_recon_medic);
	}
	public void Generate() throws IOException {
		// TODO Auto-generated method stub
		String Text;
		Text = 	  "/*"																				+"\r\n"
				+ tfFactionName.getText()+" template for Arma III Vindicta"							+"\r\n"
				+ "*/"																				+"\r\n"
				+ ""																				+"\r\n"
				+ "_array = [];"																	+"\r\n"
				+ ""																				+"\r\n"
				+ "_array set [T_Size-1, nil];"														+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Infantry ===="															+"\r\n"
				+ "_inf = [];"																		+"\r\n"
				+ "_inf resize T_INF_SIZE;"															+"\r\n"
				//Units start here			
				+ "_inf set [T_INF_DEFAULT, ["+tfInf_Default.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_SL, ["+tfInf_SL.getText()+"]];"									+"\r\n"
				+ "_inf set [T_INF_TL, ["+tfInf_TL.getText()+"]];"									+"\r\n"
				+ "_inf set [T_INF_officer, ["+tfInf_officer.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_GL, ["+tfInf_GL.getText()+"]];"									+"\r\n"
				+ "_inf set [T_INF_rifleman, ["+tfInf_rifleman.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_marksman, ["+tfInf_marksman.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_sniper, ["+tfInf_spotter.getText()+"]];"							+"\r\n"
				+ "_inf set [T_INF_spotter, ["+tfInf_spotter.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_exp, ["+tfInf_exp.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_ammo, ["+tfInf_ammo.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_LAT, ["+tfInf_LAT.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_AT, ["+tfInf_AT.getText()+"]];"									+"\r\n"
				+ "_inf set [T_INF_AA, ["+tfInf_AA.getText()+"]];"									+"\r\n"
				+ "_inf set [T_INF_LMG, ["+tfInf_LMG.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_HMG, ["+tfInf_HMG.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_medic, ["+tfInf_medic.getText()+"]];"							+"\r\n"
				+ "_inf set [T_INF_engineer, ["+tfInf_engineer.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_crew, ["+tfInf_crew.getText()+"]];"								+"\r\n"
				+ "_inf set [T_INF_crew_heli, ["+tfInf_crew_heli.getText()+"]];"					+"\r\n"
				+ "_inf set [T_INF_pilot, ["+tfInf_pilot.getText()+"]];"							+"\r\n"
				+ "_inf set [T_INF_pilot_heli, ["+tfInf_pilot_heli.getText()+"]];"					+"\r\n"
				+ "_inf set [T_INF_survivor, ["+tfInf_survivor.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_unarmed, ["+tfInf_unarmed.getText()+"]];"						+"\r\n"
				+ ""																				+"\r\n"
				+ "//Recon"																			+"\r\n"
				+ "_inf set [T_INF_recon_TL, ["+tfInf_recon_TL.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_recon_rifleman, ["+tfInf_recon_rifleman.getText()+"]];"			+"\r\n"
				+ "_inf set [T_INF_recon_medic, ["+tfInf_recon_medic.getText()+"]];"				+"\r\n"
				+ "_inf set [T_INF_recon_exp, ["+tfInf_recon_exp.getText()+"]];"					+"\r\n"
				+ "_inf set [T_INF_recon_LAT, ["+tfInf_recon_LAT.getText()+"]];"					+"\r\n"
				+ "_inf set [T_INF_recon_marksman, ["+tfInf_recon_marksman.getText()+"]];"			+"\r\n"
				+ "_inf set [T_INF_recon_JTAC, ["+tfInf_recon_JTAC.getText()+"]];"					+"\r\n"
				+ ""																				+"\r\n"
				+ "//Divers"																		+"\r\n"
				+ "_inf set [T_INF_diver_TL, ["+tfInf_diver_TL.getText()+"]];"						+"\r\n"
				+ "_inf set [T_INF_diver_rifleman, ["+tfInf_diver_rifleman.getText()+"]];"			+"\r\n"
				+ "_inf set [T_INF_diver_exp, ["+tfInf_diver_exp.getText()+"]];"					+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Vehicles ===="															+"\r\n"
				+ "_veh = +(tDefault select T_VEH);"												+"\r\n"
				+ "_veh set [T_VEH_SITE-1, nil];"													+"\r\n"
				//Vehicles start here																
				+ "_veh set [T_VEH_DEFAULT, ["+tfVeh_Default.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_car_unarmed, ["+tfVeh_car_unarmed.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_car_armed, ["+tfVeh_car_unarmed.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_MRAP_unarmed, ["+tfVeh_MRAP_unarmed.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_MRAP_HMG, ["+tfVeh_MRAP_HMG.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_MRAP_GMG, ["+tfVeh_MRAP_GMG.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_IFV, ["+tfVeh_IFV.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_APC, ["+tfVeh_APC.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_MBT, ["+tfVeh_MBT.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_MRLS, ["+tfVeh_MRLS.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_SPA, ["+tfVeh_SPA.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_SPAA, ["+tfVeh_SPAA.getText()+"]];"								+"\r\n"
				+ "_veh set [T_VEH_stat_HMG_high, ["+tfVeh_stat_HMG_high.getText()+"]];"			+"\r\n"
				+ "_veh set [T_VEH_stat_GNG_high, ["+tfVeh_stat_GMG_high.getText()+"]];"			+"\r\n"
				+ "_veh set [T_VEH_stat_HMG_low, ["+tfVeh_stat_HMG_low.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_stat_GMG_low, ["+tfVeh_stat_GMG_low.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_stat_AA, ["+tfVeh_stat_AA.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_stat_AT, ["+tfVeh_stat_AT.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_start_mortar_light, ["+tfVeh_stat_mortar_light.getText()+"]];"	+"\r\n"
				+ "_veh set [T_VEH_stat_mortar_heavy, ["+tfVeh_stat_mortar_heavy.getText()+"]];"	+"\r\n"
				+ "_veh set [T_VEH_heli_light, ["+tfVeh_heli_light.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_heli_heavy, ["+tfVeh_heli_heavy.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_heli_cargo, ["+tfVeh_heli_cargo.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_heli_attack, ["+tfVeh_heli_attack.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_plane_attack, ["+tfVeh_plane_attack.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_plane_fighter, ["+tfVeh_plane_fighter.getText()+"]];"			+"\r\n"
				+ "_veh set [T_VEH_plane_cargo, ["+tfVeh_plane_cargo.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_plane_unarmed, ["+tfVeh_plane_unarmed.getText()+"]];"			+"\r\n"
				+ "_veh set [T_VEH_plane_vtol, ["+tfVeh_plane_VTOL.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_boat_unarmed, ["+tfVeh_boat_unarmed.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_boat_armed, ["+tfVeh_boat_armed.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_personal, ["+tfVeh_personal.getText()+"]];"						+"\r\n"
				+ "_veh set [T_VEH_truck_inf, ["+tfVeh_truck_inf.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_truck_cargo, ["+tfVeh_truck_cargo.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_truck_ammo, ["+tfVeh_truck_ammo.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_truck_repair, ["+tfVeh_truck_repair.getText()+"]];"				+"\r\n"
				+ "_veh set [T_VEH_truck_medical, ["+tfVeh_truck_medical.getText()+"]];"			+"\r\n"
				+ "_veh set [T_VEH_truck_fuel, ["+tfVeh_truck_fuel.getText()+"]];"					+"\r\n"
				+ "_veh set [T_VEH_submarine, ["+tfVeh_submarine.getText()+"+]];"					+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Drones ===="																+"\r\n"
				+ "_drone = +(tDefault select T_DRONE);"											+"\r\n"
				+ "_drone set [T_DRONE_SIZE-1, nil];"												+"\r\n"
				+ "_veh set [T_DRONE_DEFAULT , ["+tfDrone_Default.getText()+"]];"					+"\r\n"
				+ ""																				+"\r\n"
				+ "_drone set [T_DRONE_UGV_unarmed, ["+tfDrone_UGV_unarmed.getText()+"]];"			+"\r\n"
				+ "_drone set [T_DRONE_UGV_armed, ["+tfDrone_UGV_armed.getText()+"]];"				+"\r\n"
				+ "_drone set [T_DRONE_plane_attack, ["+tfDrone_plane_attack.getText()+"]];"		+"\r\n"
				+ "_drone set [T_DRONE_plane_unarmed, ["+tfDrone_plane_unarmed.getText()+"]];"		+"\r\n"
				+ "_drone set [T_DRONE_heli_attack, ["+tfDrone_heli_attack.getText()+"]];"			+"\r\n"
				+ "_drone set [T_DRONE_quadcopter, ["+tfDrone_quadcopter.getText()+"]];"			+"\r\n"
				+ "_drone set [T_DRONE_designator, ["+tfDrone_designator.getText()+"]];"			+"\r\n"
				+ "_drone set [T_DRONE_stat_HMG_low, ["+tfDrone_stat_HMG_low.getText()+"]];"		+"\r\n"
				+ "_drone set [T_DRONE_stat_GMG_low, ["+tfDrone_stat_GMG_low.getText()+"]];"		+"\r\n"
				+ "_drone set [T_DRONE_stat_AA, ["+tfDrone_stat_AA.getText()+"]];"					+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Cargo ===="																+"\r\n"
				+ "_cargo = +(tDefault select T_CARGO);"											+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Groups ===="																+"\r\n"
				+ "_group = +(tDefault select T_GROUP);"											+"\r\n"
				+ ""																				+"\r\n"
				+ "//==== Set Arrays ===="															+"\r\n"
				+ "_array set [T_Inf, _inf];"														+"\r\n"
				+ "_array set [T_Veh, _veh];"														+"\r\n"
				+ "_array set [T_DRONE, _drone];"													+"\r\n"
				+ "_array set [T_CARGO, _cargo];"													+"\r\n"
				+ "_array set [T_GROUP, _group];"													+"\r\n"
				+ "_array set [T_NAME,\""+tfFactionName.getText()+"\"];"							+"\r\n"
				+ ""																				+"\r\n"
				+ ""																				+"\r\n"
				+ "//End Template"																	+"\r\n"
				+ "_array"																			+"\r\n"
				+ "//Created using Vindicta Preset Builder Alpha version 05 made by Pi123263";																			
		FileWriter Schreib;
		JFileChooser filechooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "word","csv");
		filechooser.setFileFilter(filter);
		
		if(filechooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION) {
			//datei speichern
			try {
				//speichern(filechooser.getSelectedFile());
				//Schreib = new FileWriter(tfFactionName.getText()+".sqf");
				Schreib = new FileWriter(filechooser.getSelectedFile()+".sqf");
				Schreib.write(Text);
				Schreib.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Fehler: " +e1.getMessage());
			}
		}
	}
}
