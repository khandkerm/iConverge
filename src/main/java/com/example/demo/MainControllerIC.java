package com.example.demo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import oracle.jdbc.OracleTypes;

@Controller
public class MainControllerIC {
	@Resource
	ICDao icDao;
	@Resource
	IConvDao i;
	@Resource
	ICONVDaoRafi iconvDaoRafi;
	@Resource
	IConvergeDaoSurovi convergeDaoSurovi;

	public static String dynamicMenu = "";
	public static String yearCode = "";
	public static String zoneCode = "";
	public static String circleCode = "";
	public static String zoneName = "";
	public static String circleName = "";
public final static String officeCode="000000";
	
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;
	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall6;
	SimpleJdbcCall getAllStatesJdbcCall7;
	SimpleJdbcCall getAllStatesJdbcCall8;
	SimpleJdbcCall getAllStatesJdbcCall9;
	
	
	
	
	

	
	public MainControllerIC(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall7 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall8 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall9 = new SimpleJdbcCall(dataSource);
		
	}


	@GetMapping("/")
	public String Login(Model model) {
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);

		return "login";
	}

	@GetMapping("/logout")
	public String LogOut(Model model) {
		dynamicMenu = "";
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);

		return "login";
	}

	@PostMapping("/")
	public String loginUser(Model model, LoginModel user) {
		LoginModel user1 = icDao.getLogin(user.getP_User_Id(), user.getP_Password());

//		System.out.println(user);
		if (user1 != null) {
			if (user1.getP_User_Id().equals(user.getP_User_Id())
					&& user1.getP_Password().equals(user.getP_Password())) {
				dynamicMenu = icDao.getDynamicMenu();
				return "redirect:/Home";
			} else {
				return "redirect:/";
			}

		} else {

			LoginModel login = new LoginModel();
			model.addAttribute("login", login);

			String msg = "User Id Password Missmatch! Login Failed";
			model.addAttribute("msg", msg);
			return "login";
		}

	}

	@GetMapping("/Home")
	public String Home(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "Home";
	}

	@GetMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST(Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		String flag = "0";

		IC_YEAR_MST ic_YEAR_MST = new IC_YEAR_MST();

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@GetMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_single(@PathVariable("id") int id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		String flag = "1";

		IC_YEAR_MST ic_YEAR_MST = icDao.singleIC_YEAR_MST(id);

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@PostMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST_save(IC_YEAR_MST ic_YEAR_MST) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String out = icDao.insertIC_YEAR_MST(ic_YEAR_MST);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}

	}

	@PostMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_edit(@PathVariable("id") String id, Model model, IC_YEAR_MST ic_YEAR_MST) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		ic_YEAR_MST.setYR_ID(id);

		String out = icDao.editIC_YEAR_MST(ic_YEAR_MST);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_delete/{id}")
	public String IC_YEAR_MST_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String out = icDao.deleteIC_YEAR_MST(id);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_YEAR_MST";
	}

	@GetMapping("/IC_YR_TARGET")
	public String IC_YR_TARGET(Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YR_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET/{id}")
	public String IC_BPDB_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		yearCode = id;
		String flag = "0";

		IC_BPDB_TARGET ic_bpdb_target = new IC_BPDB_TARGET();

		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(yearCode);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_BPDB_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET_S/{id}")
	public String IC_BPDB_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_BPDB_TARGET ic_bpdb_target = icDao.singleIC_BPDB_TARGET(id);

		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(yearCode);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_BPDB_TARGET";
	}

	@PostMapping("/IC_BPDB_TARGET")
	public String IC_BPDB_TARGET_save(IC_BPDB_TARGET ic_BPDB_TARGET) {

		String out = icDao.insertIC_BPDB_TARGET(ic_BPDB_TARGET);
		String ss = "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET/{id}")
	public String IC_BPDB_TARGET_edit(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {

		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);

		String out = icDao.updateIC_BPDB_TARGET(ic_BPDB_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET_delete/{id}")
	public String IC_BPDB_TARGET_delete(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {
		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);
		String out = icDao.deleteIC_BPDB_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_BPDB_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_ZONE_TARGET/{id}")
	public String IC_ZONE_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		String flag = "0";

		IC_ZONE_TARGET ic_bpdb_target = new IC_ZONE_TARGET();

		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(yearCode);
		model.addAttribute("IC_ZONE_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@GetMapping("/IC_ZONE_TARGET_S/{id}")
	public String IC_ZONE_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_ZONE_TARGET ic_ZONE_target = icDao.singleIC_ZONE_TARGET(id);
		zoneName = ic_ZONE_target.ZONE_NAME;
		yearCode = ic_ZONE_target.YEAR_CODE;
		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(yearCode);

		model.addAttribute("IC_ZONE_TARGET", ic_ZONE_target);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@PostMapping("/IC_ZONE_TARGET")
	public String IC_ZONE_TARGET_save(IC_ZONE_TARGET ic_ZONE_TARGET) {

		String out = icDao.insertIC_ZONE_TARGET(ic_ZONE_TARGET);
		String ss = "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_ZONE_TARGET/{id}")
	public String IC_ZONE_TARGET_edit(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {

		ic_ZONE_TARGET.setZONE_TARGET_ID(id);

		String out = icDao.updateIC_ZONE_TARGET(ic_ZONE_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_ZONE_TARGET_delete/{id}")
	public String IC_ZONE_TARGET_delete(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {
		ic_ZONE_TARGET.setZONE_TARGET_ID(id);
		String out = icDao.deleteIC_ZONE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_ZONE_TARGET_clear/{id}")
	public String IC_IC_ZONE_TARGET_clear(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_CIRCLE_TARGET/{id}")
	public String IC_CIRCLE_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		zoneCode = id;
		String flag = "0";

		IC_CIRCLE_TARGET ic_bpdb_target = new IC_CIRCLE_TARGET();

		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(yearCode, zoneCode);

		model.addAttribute("IC_CIRCLE_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(zoneCode);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@GetMapping("/IC_CIRCLE_TARGET_S/{id}")
	public String IC_CIRCLE_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_CIRCLE_TARGET ic_CIRCLE_target = icDao.singleIC_CIRCLE_TARGET(id);
		circleName = ic_CIRCLE_target.CIRCLE_NAME;
		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(yearCode, zoneCode);

		model.addAttribute("IC_CIRCLE_TARGET", ic_CIRCLE_target);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(zoneCode);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@PostMapping("/IC_CIRCLE_TARGET")
	public String IC_CIRCLE_TARGET_save(IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		String out = icDao.insertIC_CIRCLE_TARGET(ic_CIRCLE_TARGET);
		String ss = "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET/{id}")
	public String IC_CIRCLE_TARGET_edit(@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		ic_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);

		String out = icDao.updateIC_CIRCLE_TARGET(ic_CIRCLE_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET_delete/{id}")
	public String IC_CIRCLE_TARGET_delete(@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {
		ic_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);
		String out = icDao.deleteIC_CIRCLE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_CIRCLE_TARGET_clear/{id}")
	public String IC_IC_CIRCLE_TARGET_clear(@PathVariable("id") int id, Model model,
			IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_LOC_TARGET/{id}")
	public String IC_LOC_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		circleCode = id;
		String flag = "0";

		IC_LOC_TARGET ic_bpdb_target = new IC_LOC_TARGET();

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(yearCode, circleCode);

		model.addAttribute("IC_LOC_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		model.addAttribute("circleCode", circleCode);
		model.addAttribute("circleName", circleName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> ic_LOCATION_MASTERs = icDao.listIC_LOCATION_MASTER(circleCode);
		model.addAttribute("ic_LOCATION_MASTERs", ic_LOCATION_MASTERs);
		return "IC_LOC_TARGET";
	}

	@GetMapping("/IC_LOC_TARGET_S/{id}")
	public String IC_LOC_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_LOC_TARGET ic_LOC_target = icDao.singleIC_LOC_TARGET(id);

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(yearCode, circleCode);
		model.addAttribute("IC_LOC_TARGET", ic_LOC_target);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		model.addAttribute("circleCode", circleCode);
		model.addAttribute("circleName", circleName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> ic_LOCATION_MASTERs = icDao.listIC_LOCATION_MASTER(circleCode);
		model.addAttribute("ic_LOCATION_MASTERs", ic_LOCATION_MASTERs);
		return "IC_LOC_TARGET";
	}

	@PostMapping("/IC_LOC_TARGET")
	public String IC_LOC_TARGET_save(IC_LOC_TARGET ic_LOC_TARGET) {

		String out = icDao.insertIC_LOC_TARGET(ic_LOC_TARGET);
		String ss = "redirect:/IC_LOC_TARGET/" +circleCode;
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_LOC_TARGET/{id}")
	public String IC_LOC_TARGET_edit(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {

		ic_LOC_TARGET.setLOC_TARGET_ID(id);

		String out = icDao.updateIC_LOC_TARGET(ic_LOC_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + circleCode;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_LOC_TARGET_delete/{id}")
	public String IC_LOC_TARGET_delete(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {
		ic_LOC_TARGET.setLOC_TARGET_ID(id);
		String out = icDao.deleteIC_LOC_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + circleCode;
		} else {
			return null;
		}
	}

	@PostMapping("/IC_LOC_TARGET_clear/{id}")
	public String IC_IC_LOC_TARGET_clear(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_LOC_TARGET/" + circleCode;
	}

	//////////////////////// Start Revenue Report

	@GetMapping("/IC_REV_TOP_SHEET")
	public String IC_REV_TOP_SHEET(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_TOP_SHEET";
	}

	@GetMapping("/IC_REV_PER_ZONE")
	public String IC_REV_PER_ZONE(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_PER_ZONE";
	}

	@GetMapping("/IC_REV_PER_CIRCLE")
	public String IC_REV_PER_CIRCLE(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_PER_CIRCLE";
	}

	@GetMapping("/IC_REV_PER_DIV")
	public String IC_REV_PER_DIV(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_PER_DIV";
	}

	@GetMapping("/IC_REV_CAT_ACC_REC")
	public String IC_REV_CAT_ACC_REC(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_CAT_ACC_REC";
	}

	@GetMapping("/END_SHEET")
	public String END_SHEET(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "END_SHEET";
	}

	/////////////////////// End Revenue Report

	////////////////////// Start khondokar
	@GetMapping("/IC_USAGE_CATEGORY_CODE")
	public String usage_cat_code(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		// insert into IC_USAGE_CAT_CODE table
		UsageCatCode usageCatCode = new UsageCatCode();
		model.addAttribute("usageCatCode", usageCatCode);

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		ArrayList<ShowUsage> usageData = i.showUsage();
		model.addAttribute("usageData", usageData);

		String x = "This";
		model.addAttribute("x", x);

		model.addAttribute("dataHtml", dynamicMenu);

		return "usage";
	}

	@PostMapping("/IC_USAGE_CATEGORY_CODE")
	public String inset_cat_code(Model model, UsageCatCode usageCatCode) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		int result = i.insert_usage_cat_code(usageCatCode);

		System.out.println(result);
		System.out.println(usageCatCode);

		if (result == 0)
			return "IC_USAGE_CATEGORY_CODE";
		else
			return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/usageDelete/{id}")
	public String delete_location1(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		int result = i.deleteUsage(id);
		if (result == 0)
			return "/IC_USAGE_CATEGORY_CODE";
		else
			return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/usageEdit/{id}")
	public String usage_cat_code_edit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		UsageCatCode usageCatCode = new UsageCatCode();
		model.addAttribute("usageCatCode", usageCatCode);

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		ArrayList<ShowUsage> usageData = i.showUsage();
		model.addAttribute("usageData", usageData);

		ArrayList<EditUsage> usageDataEdit = i.editUsage(id);
		model.addAttribute("usageDataEdit", usageDataEdit);

		String usageCtName = usageDataEdit.get(0).getUsageCatName();
		model.addAttribute("usageCtName", usageCtName);

		String catCode = usageDataEdit.get(0).getUsageCatCode();
		model.addAttribute("catCode", catCode);

		String usageTy = usageDataEdit.get(0).getUsageTypeCode();
		model.addAttribute("usageTy", usageTy);

		String name = usageDataEdit.get(0).getAreaName();
		model.addAttribute("name", name);

		String userType = usageDataEdit.get(0).getUsageType();
		model.addAttribute("userType", userType);

		System.out.println("This is the isage type" + usageDataEdit);

		String lineType = usageDataEdit.get(0).getLineTypeName();
		model.addAttribute("lineType", lineType);

		String lineId = usageDataEdit.get(0).getUsageLineCode();
		model.addAttribute("lineId", lineId);

		String typeId = usageDataEdit.get(0).getUsageTypeCode();
		model.addAttribute("typeId", typeId);

		model.addAttribute("dataHtml", dynamicMenu);

		return "usageedit";
	}

	@PostMapping("/usageEdit/{id}")
	public String usage_cat_code_update(@PathVariable("id") int id, Model model, UsageCatCode usageCatCode) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		int check = i.update_usage_cat_code(usageCatCode, id);

		System.out.println(check);

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/IC_LOCATION_MASTER_STATUS")
	public String location(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<LocationShow> locationShow = i.locationShow();
		model.addAttribute("locationShow", locationShow);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);

		return "location";
	}

	@PostMapping("/IC_LOCATION_MASTER_STATUS")
	public String locationPost(Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		i.insert_location_master(locationInsert);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/locationDelete/{id}")
	public String delete_location(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		int result = i.deleteLocation(id);
		System.out.println(result);
		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationEdit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<LocationShow> locationShow = i.locationShow();
		model.addAttribute("locationShow", locationShow);

		ArrayList<LocationInsert> locationEdit = i.locationEdit(id);
		model.addAttribute("locationEdit", locationEdit);

		String locName = locationEdit.get(0).getLocationName();
		model.addAttribute("locName", locName);

		String locCode = locationEdit.get(0).getLocationCode();
		model.addAttribute("locCode", locCode);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);

		return "locationEdit";
	}

	@PostMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationUpdate(@PathVariable("id") int id, Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.location_update(locationInsert, id);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_GEN_AREA")
	public String area(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<Area> areas = i.areaShow();
		model.addAttribute("areas", areas);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);

		return "area";
	}

	@PostMapping("/IC_GEN_AREA")
	public String area_post(Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.insert_area(locationInsert);
		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_GEN_AREA_DELETE/{id}")
	public String delete_area(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.deleteArea(id);
		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_GEN_AREA_EDIT/{id}")
	public String areaEdit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<Area> areas = i.areaShow();
		model.addAttribute("areas", areas);

		ArrayList<LocationInsert> editList = i.areaEdit(id);
		model.addAttribute("editList", editList);

		String arCode = editList.get(0).getLocationCode();
		model.addAttribute("arCode", arCode);
		String arName = editList.get(0).getLocationName();
		model.addAttribute("arName", arName);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);
		return "areaEdit";
	}

	@PostMapping("/IC_GEN_AREA_EDIT/{id}")
	public String areaPost(@PathVariable("id") int id, Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.areaUpdate(locationInsert, id);

		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_POWER_PLANT")
	public String power_plant(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<PowerPlantList> powerPlantList = i.powerPlantShow();
		model.addAttribute("powerPlantList", powerPlantList);

		ArrayList<GenArea> genArea = i.genAreaLists();
		model.addAttribute("genArea", genArea);

		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
		model.addAttribute("pPOwnerList", pPOwnerList);

		ArrayList<GridList> gridList = i.gridLists();
		model.addAttribute("gridList", gridList);

		PowerPlantInsert powerPlantInsert = new PowerPlantInsert();
		model.addAttribute("powerPlantInsert", powerPlantInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "powerplant";
	}

	@PostMapping("/IC_POWER_PLANT")
	public String power_plant_insert(Model model, PowerPlantInsert powerPlantInsert) {
		i.insert_power_plant(powerPlantInsert);

		return "redirect:/IC_POWER_PLANT";
	}

	String gridCode;
	String genACode;
	String OwnerCode;

	@GetMapping("/IC_POWER_PLANT_EDIT/{id}")
	public String power_plant_edits(@PathVariable("id") String id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<PowerPlantList> powerPlantList = i.powerPlantShow();
		model.addAttribute("powerPlantList", powerPlantList);

		ArrayList<GenArea> genArea = i.genAreaLists();
		model.addAttribute("genArea", genArea);

		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
		model.addAttribute("pPOwnerList", pPOwnerList);

		ArrayList<GridList> gridList = i.gridLists();
		model.addAttribute("gridList", gridList);

		ArrayList<PowerPlantList> powerPlantListEdit = i.powerPlantEdits(id);
		model.addAttribute("powerPlantListEdit", powerPlantListEdit);
		if (powerPlantListEdit.size() == 0) {
			System.out.println("error occurred!");
		}
		String pp_code = powerPlantListEdit.get(0).getPpCode();
		model.addAttribute("pp_code", pp_code);

		String pp_name = powerPlantListEdit.get(0).getPpName();
		model.addAttribute("pp_name", pp_name);

		double on_of_unit = powerPlantListEdit.get(0).getNoOfUnit();
		model.addAttribute("on_of_unit", on_of_unit);

		double install_capacity = powerPlantListEdit.get(0).getInstalledCapacity();
		model.addAttribute("install_capacity", install_capacity);

		double max_capacity = powerPlantListEdit.get(0).getMaxCapacity();
		model.addAttribute("max_capacity", max_capacity);

		String short_name = powerPlantListEdit.get(0).getShortName();
		model.addAttribute("short_name", short_name);

		String gen_area = powerPlantListEdit.get(0).getGenAreaName();
		model.addAttribute("gen_area", gen_area);

		String gen_area_code = powerPlantListEdit.get(0).getGenAreaCode();
		model.addAttribute("gen_area_code", gen_area_code);

		genACode = gen_area_code;

		String owner_name = powerPlantListEdit.get(0).getOwnerName();
		model.addAttribute("owner_name", owner_name);

		String owner_code = powerPlantListEdit.get(0).getOwnerCode();
		model.addAttribute("owner_code", owner_code);

		OwnerCode = owner_code;

		String grid_name = powerPlantListEdit.get(0).getGridDesc();
		model.addAttribute("grid_name", grid_name);

		String grid_code = powerPlantListEdit.get(0).getGridCode();
		model.addAttribute("grid_code", grid_code);

		gridCode = grid_code;

		PowerPlantInsert powerPlantInsert = new PowerPlantInsert();
		model.addAttribute("powerPlantInsert", powerPlantInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "powerplantedit";
	}

	@PostMapping("/IC_POWER_PLANT_EDIT/{id}")
	public String power_plant_update(@PathVariable("id") String id, Model model, PowerPlantInsert powerPlantInsert) {
		i.update_power_plant(powerPlantInsert, id, genACode, OwnerCode, gridCode);
		System.out.println("This is the update" + powerPlantInsert);

		return "redirect:/IC_POWER_PLANT";
	}

	@GetMapping("/powerPointDelete/{id}")
	public String delete_power_point(@PathVariable("id") String id, Model model) {
		i.deletePowerPoint(id);

		return "redirect:/IC_POWER_PLANT";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST")
	public String demandPhaseMst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<DemandPhaseList> demandPhaseList = i.demandPhaseLists();
		model.addAttribute("demandPhaseList", demandPhaseList);

		DemandPhaseInsert demandPhaseInsert = new DemandPhaseInsert();
		model.addAttribute("demandPhaseInsert", demandPhaseInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "demandphase";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST")
	public String demandPhaseMstInsert(Model model, DemandPhaseInsert demandPhaseInsert) {
		i.demandPhaseInsert(demandPhaseInsert);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST_EDIT/{id}")
	public String demandPhaseMstEdit(Model model, @PathVariable("id") String id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<DemandPhaseList> demandPhaseList = i.demandPhaseLists();
		model.addAttribute("demandPhaseList", demandPhaseList);

		ArrayList<DemandPhaseList> demandPhaseEditList = i.demandPhaseEdit(id);
		model.addAttribute("demandPhaseEditList", demandPhaseEditList);

		String dpCode = demandPhaseEditList.get(0).getDpCode();
		model.addAttribute("dpCode", dpCode);

		String dpDescr = demandPhaseEditList.get(0).getDemandPhase();
		model.addAttribute("dpDescr", dpDescr);

		int srNumber = demandPhaseEditList.get(0).getSrlNo();
		model.addAttribute("srNumber", srNumber);

		DemandPhaseInsert demandPhaseInsert = new DemandPhaseInsert();
		model.addAttribute("demandPhaseInsert", demandPhaseInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "demandphaseedit";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST_EDIT/{id}")
	public String demandPhaseMstUpdate(Model model, @PathVariable("id") String id,
			DemandPhaseInsert demandPhaseInsert) {
		i.demandPhaseUpdate(demandPhaseInsert);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST_DELETE/{id}")
	public String delete_demandPhase(@PathVariable("id") String id, Model model) {
		i.deleteDemandPhase(id);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST")
	public String activityList(Model model) {
		ArrayList<ActivityList> activityList = i.activityListShow();
		model.addAttribute("activityList", activityList);

		ActivityInsert activityInsert = new ActivityInsert();
		model.addAttribute("activityInsert", activityInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "activitylist";
	}

	@PostMapping("/IC_ACTIVITY_MST")
	public String activityListInsert(Model model, ActivityInsert activityInsert) {
		i.insert_activity(activityInsert);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST_EDIT/{id}")
	public String activityList(@PathVariable("id") int id, Model model) {
		ArrayList<ActivityList> activityList = i.activityListShow();
		model.addAttribute("activityList", activityList);

		ArrayList<ActivityInsert> activityIns = i.activityedit(id);
		model.addAttribute("activityIns", activityIns);

		String acCode = activityIns.get(0).getActivityCode();
		model.addAttribute("acCode", acCode);

		String acName = activityIns.get(0).getActivityName();
		model.addAttribute("acName", acName);

		ActivityInsert activityInsert = new ActivityInsert();
		model.addAttribute("activityInsert", activityInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "activitylistedit";
	}

	@PostMapping("/IC_ACTIVITY_MST_EDIT/{id}")
	public String activityListUpdate(@PathVariable("id") int id, Model model, ActivityInsert activityInsert) {
		i.updateActivity(activityInsert, id);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST_DELETE/{id}")
	public String activity_delete(Model model, @PathVariable("id") int id) {
		i.deleteActivity(id);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_PP_MOD")
	public String perionList(Model model) {
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlist";
	}

	@GetMapping("/IC_PP_MOD/{id}")
	public String modtList(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		ArrayList<PpModList> ppModList = i.ppModListListShow(id);
		model.addAttribute("ppModList", ppModList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(id);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertPpMod insertPpMod = new InsertPpMod();
		model.addAttribute("insertPpMod", insertPpMod);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmode";
	}

	@PostMapping("/IC_PP_MOD/{id}")
	public String modPost(@PathVariable("id") String id, InsertPpMod insertPpMod) {
		i.insertPpMod(insertPpMod);
		return "redirect:/IC_PP_MOD/" + id;
	}

	String paymentData;

	@GetMapping("/IC_IPP_PAYMENT/{id}")
	public String icPpPaymentList(@PathVariable("id") String id, Model model) {
		paymentData = id;
		model.addAttribute("id", id);
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(id);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(id);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppayment";
	}

	@PostMapping("/IC_IPP_PAYMENT/{id}")
	public String icPpPaymentInsert(@PathVariable("id") String id, Model model, InsertIppPayment insertIppPayment) {
		i.insertPppPayment(insertIppPayment);
		return "redirect:/IC_IPP_PAYMENT/" + id;
	}

	@GetMapping("/IC_IPP_PAYMENT_DELETE/{id}")
	public String ic_ipp_payment_delete(Model model, @PathVariable("id") int id) {
		i.deleteIcPpPayment(id);

		return "redirect:/IC_IPP_PAYMENT/" + id;
	}

	@GetMapping("/IC_IPP_PAYMENT_EDIT/{id}")
	public String icPpPaymentEdit(@PathVariable("id") int id, Model model) {
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(paymentData);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<IcPpPaymentEdit> icPpPaymentEdit = i.icPaymentEdit(id);
		model.addAttribute("icPpPaymentEdit", icPpPaymentEdit);

		String billCycle = icPpPaymentEdit.get(0).getBillCycleCode();
		model.addAttribute("billCycle", billCycle);

		String powerPlantName = icPpPaymentEdit.get(0).getPpName();
		model.addAttribute("powerPlantName", powerPlantName);

		String e = icPpPaymentEdit.get(0).getEnrgPuchansed();
		model.addAttribute("e", e);

		int p = icPpPaymentEdit.get(0).getPayAmount();
		model.addAttribute("p", p);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppaymentedit";
	}

	@PostMapping("/IC_IPP_PAYMENT_EDIT/{id}")
	public String icPpPaymentUpdate(@PathVariable("id") int id, Model model, IcPpPaymentEdit icPpPaymentEdit) {
		i.updatePayment(icPpPaymentEdit, id);

		return "redirect:/IC_IPP_PAYMENT/" + paymentData;
	}

	///////////////////// End khondokar
	/////////////////// Start rafi
	@GetMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_MISC_BILL_TYPE ic_misc_bill_type = new IC_MISC_BILL_TYPE();

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();
		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type_save(IC_MISC_BILL_TYPE ic_misc_bill_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.insertICMiscBillType(ic_misc_bill_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@GetMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "1";

		IC_MISC_BILL_TYPE ic_misc_bill_type = iconvDaoRafi.singleIC_MISC_BILL_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_edit(@PathVariable("id") String id, Model model,
			IC_MISC_BILL_TYPE ic_misc_bill_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		ic_misc_bill_type.setMSC_BILL_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICMiscBillType(ic_misc_bill_type);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE_delete/{id}")
	public String IC_MISC_BILL_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.deleteICMiscBillType(id);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

//	CLEAR CLEAR IC_MISC_BILL_TYPE START
	@PostMapping("/IC_MISC_BILL_TYPE_clear/{id}")
	public String IC_MISC_BILL_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_MISC_BILL_TYPE";
	}
//	CLEAR IC_MISC_BILL_TYPE END

	@GetMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "0";

		IC_FUEL_TYPE ic_fuel_type = new IC_FUEL_TYPE();

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();
		model.addAttribute("ic_fuel_type", ic_fuel_type);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type_save(IC_FUEL_TYPE ic_fuel_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.insertICFuelType(ic_fuel_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_FUEL_TYPE";
	}

	@GetMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_FUEL_TYPE ic_fuel_type = iconvDaoRafi.singleIC_FUEL_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_fuel_type", ic_fuel_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_edit(@PathVariable("id") String id, Model model, IC_FUEL_TYPE ic_fuel_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_fuel_type.setFUEL_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICFuelType(ic_fuel_type);

		return "redirect:/IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE_delete/{id}")
	public String IC_FUEL_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICFuelType(id);

		return "redirect:/IC_FUEL_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_FUEL_TYPE_clear/{id}")
	public String IC_FUEL_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_FUEL_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER_TYPE ic_pp_owner_type = new IC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type_save(IC_PP_OWNER_TYPE ic_pp_owner_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICPPOwnerType(ic_pp_owner_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@GetMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER_TYPE ic_pp_owner_type = iconvDaoRafi.singleIC_PP_OWNER_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_edit(@PathVariable("id") String id, Model model, IC_PP_OWNER_TYPE ic_pp_owner_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_pp_owner_type.setOWNER_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwnerType(ic_pp_owner_type);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE_delete/{id}")
	public String IC_PP_OWNER_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICPPOwnerType(id);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_PP_OWNER_TYPE_clear/{id}")
	public String IC_PP_OWNER_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_PP_OWNER_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER")
	public String ic_pp_owner(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER ic_pp_owner = new IC_PP_OWNER();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER")
	public String ic_pp_owner_save(IC_PP_OWNER ic_pp_owner) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICPPOwner(ic_pp_owner);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER";
	}

	@GetMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER ic_pp_owner = iconvDaoRafi.singleIC_PP_OWNER(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";

	}

	@PostMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner_edit(@PathVariable("id") String id, Model model, IC_PP_OWNER ic_pp_owner) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_pp_owner.setPP_OWNER_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwner(ic_pp_owner);

		return "redirect:/IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER_delete/{id}")
	public String IC_PP_OWNER(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICPPOwner(id);

		return "redirect:/IC_PP_OWNER";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_PP_OWNER_clear/{id}")
	public String IC_PP_OWNER_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_PP_OWNER";
	}
//	CLEAR IC_PP_OWNER END

	@GetMapping("/IC_LINE_TYPE")
	public String ic_line_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_LINE_TYPE ic_line_type = new IC_LINE_TYPE();

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();
		model.addAttribute("ic_line_type", ic_line_type);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE")
	public String ic_line_type_save(IC_LINE_TYPE ic_line_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICLineType(ic_line_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_LINE_TYPE";
	}

	@GetMapping("/IC_LINE_TYPE/{id}")
	public String ic_line_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_LINE_TYPE ic_line_type = iconvDaoRafi.singleIC_LINE_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_line_type", ic_line_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE/{id}")
	public String ic_pp_owner_edit(@PathVariable("id") String id, Model model, IC_LINE_TYPE ic_line_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_line_type.setLINE_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICLineType(ic_line_type);

		return "redirect:/IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE_delete/{id}")
	public String IC_LINE_TYPE(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICLineType(id);

		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_LINE_TYPE_clear/{id}")
	public String IC_LINE_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER END

//	IC_PERIOD_MST table list start

	@GetMapping("/IC_LOC_MOD")
	public String ic_period_mst(Model model) {

		String flag = "0";

		IC_PERIOD_MST ic_period_mst = new IC_PERIOD_MST();

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		model.addAttribute("ic_period_mst", ic_period_mst);
		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_PERIOD_MST";
	}

//	IC_PERIOD_MST table list end

//	IC_LOCATION_MASTER  table  list start

	@GetMapping("/IC_LOCATION_MASTER")
	public String ic_location_master(Model model) {

		String flag = "0";

		IC_LOCATION_MASTER ic_location_master = new IC_LOCATION_MASTER();

		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		model.addAttribute("ic_location_master", ic_location_master);
		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOCATION_MASTER";
	}

//	IC_LOCATION_MASTER  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod(@PathVariable("b") int i, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_LOC_MOD ic_loc_mod = new IC_LOC_MOD();

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

//		

		System.out.println("fhh");
		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		m.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD.html";

	}
//	IC_LOC_MOD table list end 

//	IC_LOC_MOD table insert start
	@PostMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod_save(@PathVariable("b") String i, IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setLOC_MOD_ID(i);

		iconvDaoRafi.insertICLocMod(ic_loc_mod);

		System.out.println("vdf");
		System.out.println(ic_loc_mod);

		return "redirect:/IC_LOC_MOD/" + i;

	}
//	IC_LOC_MOD table insert end 

//	IC_LOC_MOD table single start 
	@GetMapping("/IC_LOC_MOD/{b}/{c}")
	public String ic_loc_mod_single(@PathVariable("b") int i, @PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

		IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("listIC_LOC_MOD", listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("id", i);
		m.addAttribute("s", b);
		m.addAttribute("i", j);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD";

	}
//	IC_LOC_MOD table single end

//	IC_LOC_MOD table update start
	@PostMapping("/IC_LOC_MOD/{b}/{id}")
	public String ic_loc_mod_edit(@PathVariable("b") String i, @PathVariable("id") String id, Model model,
			IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setBILL_CYCLE_CODE(i);
		ic_loc_mod.setLOC_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICLocMod(ic_loc_mod);

		return "redirect:/IC_LOC_MOD/" + i;
	}

//	IC_LOC_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_LOC_MOD_delete/{b}/{id}")
	public String ic_loc_mod_delete(@PathVariable("b") String i, @PathVariable("id") int id) {

		iconvDaoRafi.deleteICLocMod(id);

		return "redirect:/IC_LOC_MOD/" + i;
	}
//	IC_LOC_MOD table delete end

//	CLEAR IC_LOC_MOD  START
	@PostMapping("/IC_LOC_MOD_clear/{id}")
	public String IC_LOC_MOD_clear(@PathVariable("id") int id) {

		return "redirect:/IC_LOC_MOD/" + id;
	}
//	CLEAR IC_LOC_MOD  END

//	IC_SECT_WISE_MOD  table  list start

	@GetMapping("/IC_SECTOR_MST")
	public String ic_sector_mst_mod(Model model) {

		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_SECTOR_MST";
	}

//	IC_SECT_WISE_MOD  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_SECT_WISE_MOD ic_sect_wise_mod = new IC_SECT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);

		m.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD.html";

	}
//	IC_SECT_WISE_MOD table list end 

//	IC_SECT_WISE_MOD table insert start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod_save(@PathVariable("b") String i, @PathVariable("l") String p,
			IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setSECT_MOD_ID(i);

		iconvDaoRafi.insertICSectWiseMod(ic_sect_wise_mod);

//		System.out.println("vdf");
//		System.out.println(ic_sect_wise_mod);
//		
		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;

	}

//	IC_SECT_WISE_MOD table insert end 

//	IC_SECT_WISE_MOD table single start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_single(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_SECT_WISE_MOD ic_sect_wise_mod = iconvDaoRafi.singleIC_SECT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD";

	}
//	IC_SECT_WISE_MOD table single end

//	IC_SECT_WISE_MOD table update start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setBILL_CYCLE_CODE(i);
		ic_sect_wise_mod.setLOCATION_CODE(p);
		ic_sect_wise_mod.setSECT_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICSectWiseMod(ic_sect_wise_mod);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}

//	IC_SECT_WISE_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_SECT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_sect_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICSectWiseMod(id);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}
//	IC_SECT_WISE_MOD table delete end

//	CLEAR IC_SECT_WISE_MOD  START
	@PostMapping("/IC_SECT_WISE_MOD_clear/{b}/{l}")
	public String IC_SECT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_SECT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_SECT_WISE_MOD  END

//	IC_MISC_MOD table list start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}")

	public String ic_misc_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);

		m.addAttribute("flag", flag);

		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD.html";

	}
//	IC_MISC_MOD table list end 

//	IC_MISC_MOD table insert start
	@PostMapping("/IC_MISC_MOD/{b}/{l}")
	public String ic_misc_mod_save(@PathVariable("b") String i, @PathVariable("l") String p, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setMSC_MOD_ID(i);

		iconvDaoRafi.insertICMiscMod(ic_misc_mod);

		System.out.println("cmf");
		System.out.println(ic_misc_mod);
//		
		return "redirect:/IC_MISC_MOD/" + i + "/" + p;

	}

//	IC_MISC_MOD table insert end 

//	IC_MISC_MOD table single start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_single(@PathVariable("b") String i, @PathVariable("l") String p, @PathVariable("c") int j,
			Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDao.singleIC_LOC_MOD(j);

		IC_MISC_MOD ic_misc_mod = iconvDaoRafi.singleIC_MISC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDao.a(i);

		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDao.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD";

	}
//	IC_MISC_MOD table single end

//	IC_MISC_MOD table update start
	@PostMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setBILL_CYCLE_CODE(i);
		ic_misc_mod.setLOCATION_CODE(p);
		ic_misc_mod.setMSC_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICMiscMod(ic_misc_mod);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}

//	IC_MISC_MOD table update end

//	IC_MISC_MOD table delete start
	@PostMapping("/IC_MISC_MOD_delete/{b}/{l}/{c}")
	public String ic_misc_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICMiscMod(id);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}
//	IC_MISC_MOD table delete end

//	CLEAR IC_MISC_MOD  START
	@PostMapping("/IC_MISC_MOD_clear/{b}/{l}")
	public String IC_MISC_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_MISC_MOD/" + id + "/" + p;
	}
//	CLEAR IC_MISC_MOD  END

//	IC_USAGE_CAT_CODE  table  list start

	@GetMapping("/IC_USAGE_CAT_CODE")
	public String ic_usage_cad_code(Model model) {

		String flag = "0";

		IC_USAGE_CAT_CODE ic_usage_cad_code = new IC_USAGE_CAT_CODE();

		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
		model.addAttribute("ic_usage_cad_code", ic_usage_cad_code);
		model.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_USAGE_CAT_CODE";
	}

//	IC_USAGE_CAT_CODE  list table end

//	IC_CAT_WISE_MOD table list start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}")

	public String ic_cat_wise_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";
		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

		IC_CAT_WISE_MOD ic_cat_wise_mod = new IC_CAT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_CAT_WISE_MOD> b = iconvDaoRafi.w(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);

		m.addAttribute("flag", flag);

		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);
		return "IC_CAT_WISE_MOD.html";

	}
//	IC_CAT_WISE_MOD table list end 

//	IC_CAT_WISE_MOD table insert start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}")
	public String ic_cat_wise_mod_save(@PathVariable("b") String i, @PathVariable("l") String p,
			IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setCAT_MOD_ID(i);

		iconvDaoRafi.insertICCatWiseMod(ic_cat_wise_mod);

		System.out.println("hp");
		System.out.println(ic_cat_wise_mod);
//		
		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;

	}

//	IC_CAT_WISE_MOD table insert end 

//	IC_CAT_WISE_MOD table single start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_single(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_CAT_WISE_MOD ic_cat_wise_mod = iconvDaoRafi.singleIC_CAT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_CAT_WISE_MOD> r = iconvDaoRafi.w(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_CAT_WISE_MOD";

	}
//	IC_CAT_WISE_MOD table single end

//	IC_CAT_WISE_MOD table update start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setBILL_CYCLE_CODE(i);
		ic_cat_wise_mod.setLOCATION_CODE(p);
		ic_cat_wise_mod.setCAT_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICCatWiseMod(ic_cat_wise_mod);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}

//	IC_CAT_WISE_MOD table update end

//	IC_CAT_WISE_MOD table delete start
	@PostMapping("/IC_CAT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_cat_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICCatWiseMod(id);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}
//	IC_CAT_WISE_MOD table delete end

//	CLEAR IC_CAT_WISE_MOD  START
	@PostMapping("/IC_CAT_WISE_MOD_clear/{b}/{l}")
	public String IC_CAT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_CAT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_CAT_WISE_MOD  END

	/////////////////////// end rafi
	////////////////////// start surovi
	@GetMapping("/ic_sector_mst")
	public String ic_sector_mst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst")
	public String misc_bill_type_save(IC_SECTOR_MST ic_sector_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.insertIcSectorMst(ic_sector_mst);

//		System.out.println(misc_bill_type);
		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_SECTOR_MST ic_sector_mst = convergeDaoSurovi.singleIC_SECTOR_MST(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_sector_mst", ic_sector_mst);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_edit(@PathVariable("id") String id, Model model, IC_SECTOR_MST ic_sector_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_sector_mst.setSECT_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editIcSectorMst(ic_sector_mst);

		return "redirect:/ic_sector_mst";
	}

//	
	@PostMapping("/ic_sector_mst_delete/{id}")
	public String ic_sector_mst_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.deleteIcSectorMst(id);

		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/IC_USAGE_AREA")
	public String ic_usage_area(Model model) {

		String flag = "0";

		IC_USAGE_AREA ic_usage_area = new IC_USAGE_AREA();

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("ic_usage_area", ic_usage_area);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA")
	public String ic_fuel_type_save(IC_USAGE_AREA ic_usage_area) {

		convergeDaoSurovi.insertICUsageArea(ic_usage_area);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_USAGE_AREA";
	}

	@GetMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USAGE_AREA ic_usage_area = convergeDaoSurovi.singleIC_USAGE_AREA(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_usage_area", ic_usage_area);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_edit(@PathVariable("id") String id, Model model, IC_USAGE_AREA ic_usage_area) {

		ic_usage_area.setAREA_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editICUsageArea(ic_usage_area);

		return "redirect:/IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA_delete/{id}")
	public String IC_USAGE_AREA_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUsageArea(id);

		return "redirect:/IC_USAGE_AREA";
	}

//	CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_USAGE_AREA_clear/{id}")
	public String IC_USAGE_AREA_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USAGE_AREA";
	}
	// IC_FORWARD_HEADER_MST Start

	@GetMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst(Model model) {

		String flag = "0";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = new IC_FORWARD_HEADER_MST();

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();
		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst_save(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		convergeDaoSurovi.insertICForwardHeaderMst(ic_forward_header_mst);

//			System.out.println(misc_bill_type);
		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@GetMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = convergeDaoSurovi.singleIC_FORWARD_HEADER_MST(id);

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();

//			ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
//			model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_edit(@PathVariable("id") String id, Model model,
			IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		ic_forward_header_mst.setFRD_HDR_ID(id);

//			System.out.println("Controller:");
//			System.out.println(pkg_mst);
		convergeDaoSurovi.editICForwardHeaderMst(ic_forward_header_mst);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST_delete/{id}")
	public String IC_FORWARD_HEADER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICForwardHeaderMst(id);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

//		CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_FORWARD_HEADER_MST_clear/{id}")
	public String IC_FORWARD_HEADER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	// IC USER MST starts

	@GetMapping("/IC_USER_MST")
	public String ic_user_mst(Model model) {

		String flag = "0";

		IC_USER_MST ic_user_mst = new IC_USER_MST();

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST")
	public String ic_user_mst_save(IC_USER_MST ic_user_mst) {

		convergeDaoSurovi.insertICUserMst(ic_user_mst);

		return "redirect:/IC_USER_MST";
	}

	@GetMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USER_MST ic_user_mst = convergeDaoSurovi.singleIC_USER_MST(id);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();

		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_edit(@PathVariable("id") String id, Model model, IC_USER_MST ic_user_mst) {

		ic_user_mst.setUSER_ID(id);

		convergeDaoSurovi.editICUserMst(ic_user_mst);

		return "redirect:/IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST_delete/{id}")
	public String IC_USER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserMst(id);

		return "redirect:/IC_USER_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_MST_clear/{id}")
	public String IC_USER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_MST";
	}

	// IC_USER_TYPE_MST starts

	@GetMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst(Model model) {

		String flag = "0";

		IC_USER_TYPE_MST ic_user_type_mst = new IC_USER_TYPE_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst_save(IC_USER_TYPE_MST ic_user_type_mst) {

		convergeDaoSurovi.insertICUserTypeMst(ic_user_type_mst);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@GetMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user_type_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USER_TYPE_MST ic_user_type_mst = convergeDaoSurovi.singleIC_USER_TYPE_MST(id);

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();

		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user__type_mst_edit(@PathVariable("id") String id, Model model,
			IC_USER_TYPE_MST ic_user_type_mst) {

		ic_user_type_mst.setUSER_TYPE_ID(id);

		convergeDaoSurovi.editICUserTypeMst(ic_user_type_mst);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST_delete/{id}")
	public String IC_USER_TYPE_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserTypeMst(id);

		return "redirect:/IC_USER_TYPE_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_TYPE_MST_clear/{id}")
	public String IC_USER_TYPE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_TYPE_MST";
	}
	///////////////////// end surovi

	/////////////////////// start reports

	@GetMapping("/IC_ES_IND")
	public String IC_ES_IND(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_IND";
	}

	@GetMapping("/IC_ES_FORWARDING")
	public String IC_ES_FORWARDING(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_FORWARDING";
	}

	@GetMapping("/IC_ES_YR_MON_GEN_SALES_LOSS")
	public String IC_ES_YR_MON_GEN_SALES_LOSS(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_YR_MON_GEN_SALES_LOSS";
	}

	@GetMapping("/IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS")
	public String IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS";
	}

	@GetMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON";
	}

	@GetMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_FY")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_FY(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_FY";
	}

	@GetMapping("/IC_ES_PP_GEN")
	public String IC_ES_PP_GEN(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_PP_GEN";
	}

	@GetMapping("/IC_ES_COM_OPR_STAT_REB")
	public String IC_ES_COM_OPR_STAT_REB(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_COM_OPR_STAT_REB";
	}

	@GetMapping("/IC_ES_SECT_ACC_REC_SUM")
	public String IC_ES_SECT_ACC_REC_SUM(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_SECT_ACC_REC_SUM";
	}

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_DPDC")
	public String IC_ES_STAT_BILL_COLL_REC_DPDC(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STAT_BILL_COLL_REC_DPDC";
	}

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_DESCO")
	public String IC_ES_STAT_BILL_COLL_REC_DESCO(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STAT_BILL_COLL_REC_DESCO";
	}

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_WZPDCL")
	public String IC_ES_STAT_BILL_COLL_REC_WZPDCL(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STAT_BILL_COLL_REC_WZPDCL";
	}

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_NESCO")
	public String IC_ES_STAT_BILL_COLL_REC_NESCO(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STAT_BILL_COLL_REC_NESCO";
	}

	@GetMapping("/IC_ES_CAT_ACC_REC")
	public String IC_ES_CAT_ACC_REC(Model model) {
		ReportModel reportModel=new ReportModel();
		ArrayList<Month_Dropdown>billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_ACC_REC";
	}
	@PostMapping("/IC_ES_CAT_ACC_REC")
	public String IC_ES_CAT_ACC_REC_one(ReportModel rm,Model model) {
		ReportModel reportModel=new ReportModel();
		ArrayList<Month_Dropdown>billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_CAT_ACC_REC_ONE> acc_REC_ONEs=icDao.listIC_ES_CAT_ACC_REC(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_TWO> acc_REC_TWOs=icDao.listIC_ES_CAT_ACC_REC2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_ACC_REC";
	}

	@GetMapping("/IC_ES_MON_PER_MAG_COURT")
	public String IC_ES_MON_PER_MAG_COURT(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_MON_PER_MAG_COURT";
	}

	@GetMapping("/IC_ES_CAT_NUM_OF_CONS")
	public String IC_ES_CAT_NUM_OF_CONS(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_NUM_OF_CONS";
	}

	@GetMapping("/IC_ES_CAT_BILL_ISSUE")
	public String IC_ES_CAT_BILL_ISSUE(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_BILL_ISSUE";
	}

	@GetMapping("/IC_ES_CAT_SALE_ENERGY")
	public String IC_ES_CAT_SALE_ENERGY(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_SALE_ENERGY";
	}

	@GetMapping("/IC_ES_CAT_BILL_AMT")
	public String IC_ES_CAT_BILL_AMT(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_BILL_AMT";
	}

	@GetMapping("/IC_ES_CAT_REV_COLL_NET")
	public String IC_ES_CAT_REV_COLL_NET(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_REV_COLL_NET";
	}

	@GetMapping("/IC_ES_CAT_BILL_RATE")
	public String IC_ES_CAT_BILL_RATE(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_CAT_BILL_RATE";
	}

	@GetMapping("/IC_ES_ENRG_PUR_PAID_IPP")
	public String IC_ES_ENRG_PUR_PAID_IPP(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_ENRG_PUR_PAID_IPP";
	}

	@GetMapping("/IC_ES_ENRG_PUR_PAID_NEIG")
	public String IC_ES_ENRG_PUR_PAID_NEIG(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_ENRG_PUR_PAID_NEIG";
	}

	@GetMapping("/IC_ES_STATE_DISC_OF_ILLE_USER")
	public String IC_ES_STATE_DISC_OF_ILLE_USER(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STATE_DISC_OF_ILLE_USER";
	}

	@GetMapping("/IC_ES_STATE_DISC_DFLT_CONS")
	public String IC_ES_STATE_DISC_DFLT_CONS(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_ES_STATE_DISC_DFLT_CONS";
	}

	@GetMapping("/IC_EFF_TARIFF")
	public String IC_EFF_TARIFF(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_EFF_TARIFF";
	}

	////////////////////// end reports
	
	/////////////////////start graph
	
	
//	graph start 
	@GetMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list(Model model) {
		
		String hdr1="";
		String hdr2="";
		String hdr3="";
		String hdr4="";
		String hdr5="";
		String hdr6="";
		String hdr7="";
		String hdr8="";
		String hdr9="";
		String hdr10="";
		String hdr11="";
		String hdr12="";
		
		
		 String listlast_month_date = iconvDaoRafi.listlast_month_date();
		 
		 System.out.println("LAST DATE");
		System.out.println(listlast_month_date);
		
//		String string = listlast_month_date;
//		String[] parts = string.split("-");
//		String part1 = parts[0]; // 004
//		String part2 = parts[1]; // 034556
//		
//		String part = part1 + part2;
		
		String date = listlast_month_date; // 034556
		
		System.out.println(date);
		
		String a = date;
		String b = "2";
		String c = null;
		String g = null;
		String d = null;
		String e = "000000";
		String f = "1";
		
		
		
		

		Map<String, Object> result =
				getAllStatesJdbcCall.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, e, f  );
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
	    String fjfhdj=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	
   
	    Map<String, Double> graphData = new TreeMap<>();
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	hdr1 = jsonData.getString("HDR");
	    	graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("SYS_LOSS")));  
	    }
	    
//	    System.out.println(hdr1);
//	    System.out.println(graphData);
	    model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);
		
		
		
		
		Map<String, Object> result1 =
				getAllStatesJdbcCall1.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, e, f  );
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
	    String fjfhdj1=json1.get("CUR_DATA").toString();
	    JSONArray jsonArray1=new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData1 = new TreeMap<>();
	    for(int i=0;i<jsonArray1.length();i++) {
	    	JSONObject jsonData1=jsonArray1.getJSONObject(i);
	    	
	    	hdr2 = jsonData1.getString("HDR");
	    	graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("SYS_LOSS")));  
	    }
	    
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
	    model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);
		
		
		
		
		Map<String, Object> result2 =
				getAllStatesJdbcCall2.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, e, f  );
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
	    String fjfhdj2=json2.get("CUR_DATA").toString();
	    JSONArray jsonArray2=new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData2 = new TreeMap<>();
	    for(int i=0;i<jsonArray2.length();i++) {
	    	JSONObject jsonData2=jsonArray2.getJSONObject(i);
	    	
	    	hdr3 = jsonData2.getString("HDR");
	    	graphData2.put(jsonData2.getString("LINEX"), Double.valueOf(jsonData2.getString("CI_RATIO")));  
	    }
	    
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
	    model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);
		
		
		
		
		

		Map<String, Object> result3 =
				getAllStatesJdbcCall3.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, e, f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
	    String fjfhdj3=json3.get("CUR_DATA").toString();
	    JSONArray jsonArray3=new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData3 = new TreeMap<>();
	    for(int i=0;i<jsonArray3.length();i++) {
	    	JSONObject jsonData3=jsonArray3.getJSONObject(i);
	    	
	    	hdr4 = jsonData3.getString("HDR");
	    	graphData3.put(jsonData3.getString("LINEX"), Double.valueOf(jsonData3.getString("CI_RATIO")));  
	    }
	    
//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
	    model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);
		
		
		Map<String, Object> result4 =
				getAllStatesJdbcCall4.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,e,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
	    String fjfhdj4=json4.get("CUR_DATA").toString();
	    JSONArray jsonArray4=new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData4 = new TreeMap<>();
	    for(int i=0;i<jsonArray4.length();i++) {
	    	JSONObject jsonData4=jsonArray4.getJSONObject(i);
	    	
	    	hdr5 = jsonData4.getString("HDR");
	    	graphData4.put(jsonData4.getString("LINEX"), Double.valueOf(jsonData4.getString("CB_RATIO")));  
	    }
	    
//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
	    model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);
		
		
		Map<String, Object> result5 =
				getAllStatesJdbcCall5.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,e,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
	    String fjfhdj5=json5.get("CUR_DATA").toString();
	    JSONArray jsonArray5=new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData5 = new TreeMap<>();
	    for(int i=0;i<jsonArray5.length();i++) {
	    	JSONObject jsonData5=jsonArray5.getJSONObject(i);
	    	
	    	hdr6 = jsonData5.getString("HDR");
	    	graphData5.put(jsonData5.getString("LINEX"), Double.valueOf(jsonData5.getString("CB_RATIO")));  
	    }
	    
//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
	    model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);
		
		
		
		Map<String, Object> result6 =
				getAllStatesJdbcCall6.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_EQ_MONTH_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,e,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
	    String fjfhdj6=json6.get("CUR_DATA").toString();
	    JSONArray jsonArray6=new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData6 = new TreeMap<>();
	    for(int i=0;i<jsonArray6.length();i++) {
	    	JSONObject jsonData6=jsonArray6.getJSONObject(i);
	    	
	    	hdr7 = jsonData6.getString("HDR");
	    	graphData6.put(jsonData6.getString("LINEX"), Double.valueOf(jsonData6.getString("EQ_MONTH")));  
	    }
	    
//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
	    model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);
		
		
		
		Map<String, Object> result7 =
				getAllStatesJdbcCall7.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_cm")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,e,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
	    String fjfhdj7=json7.get("CUR_DATA").toString();
	    JSONArray jsonArray7=new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData7 = new TreeMap<>();
	    for(int i=0;i<jsonArray7.length();i++) {
	    	JSONObject jsonData7=jsonArray7.getJSONObject(i);
	    	
	    	hdr8 = jsonData7.getString("HDR");
	    	graphData7.put(jsonData7.getString("LINEX"), Double.valueOf(jsonData7.getString("BILLED_UNIT")));  
	    }
	    
//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
	    model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);
		
		
		Map<String, Object> result8 =
				getAllStatesJdbcCall8.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,e,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
	    String fjfhdj8=json8.get("CUR_DATA").toString();
	    JSONArray jsonArray8=new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData8 = new TreeMap<>();
	    for(int i=0;i<jsonArray8.length();i++) {
	    	JSONObject jsonData8=jsonArray8.getJSONObject(i);
	    	
	    	hdr8 = jsonData8.getString("HDR");
	    	graphData8.put(jsonData8.getString("LINEX"), Double.valueOf(jsonData8.getString("BILLED_UNIT")));  
	    }
	    
//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
	    model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);
		
//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST>listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		
		
//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R>listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 
		
//		IC_ZONE_MST drop-down start 
		ArrayList<Month_Dropdown>billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		
//		IC_ZONE_MST drop-down end 	
		
		
		
		
		IC_DASHBOARD_DIST abc=new IC_DASHBOARD_DIST();
		model.addAttribute("xyz", abc);	
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_DASHBOARD_DIST";
	}
	
//	graph end 
	
	
	@PostMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list_save(IC_DASHBOARD_DIST module_list,Model model) {
		
		
		
		String hdr1="";
		String hdr2="";
		String hdr3="";
		String hdr4="";
		String hdr5="";
		String hdr6="";
		String hdr7="";
		String hdr8="";
		String hdr9="";
		String hdr10="";
		String hdr11="";
		String hdr12="";
		
		String a=module_list.getBill();
		String b=module_list.getZone();
		String c=module_list.getCircle();
		String g=module_list.getDiv();
		
		String d=module_list.getLoc();
		String f=module_list.getReport();
		
		
	
	
		System.out.println("pera");
		System.out.println(module_list);
	

		Map<String, Object> result =
				getAllStatesJdbcCall.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d,g, officeCode, f  );
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
	    String fjfhdj=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	
   
	    Map<String, Double> graphData = new TreeMap<>();
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	hdr1 = jsonData.getString("HDR");
	    	graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("SYS_LOSS")));  
	    }
	    
//	    System.out.println(hdr1);
	    System.out.println(graphData);
	    model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);
	
		
		
		
		Map<String, Object> result1 =
				getAllStatesJdbcCall1.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode , f  );
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
	    String fjfhdj1=json1.get("CUR_DATA").toString();
	    JSONArray jsonArray1=new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData1 = new TreeMap<>();
	    for(int i=0;i<jsonArray1.length();i++) {
	    	JSONObject jsonData1=jsonArray1.getJSONObject(i);
	    	
	    	hdr2 = jsonData1.getString("HDR");
	    	graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("SYS_LOSS")));  
	    }
	    
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
	    model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);
		
		
		
		
		Map<String, Object> result2 =
				getAllStatesJdbcCall2.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, officeCode, f  );
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
	    String fjfhdj2=json2.get("CUR_DATA").toString();
	    JSONArray jsonArray2=new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData2 = new TreeMap<>();
	    for(int i=0;i<jsonArray2.length();i++) {
	    	JSONObject jsonData2=jsonArray2.getJSONObject(i);
	    	
	    	hdr3 = jsonData2.getString("HDR");
	    	graphData2.put(jsonData2.getString("LINEX"), Double.valueOf(jsonData2.getString("CI_RATIO")));  
	    }
	    
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
	    model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);
		
		
		
		
		

		Map<String, Object> result3 =
				getAllStatesJdbcCall3.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g, officeCode, f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
	    String fjfhdj3=json3.get("CUR_DATA").toString();
	    JSONArray jsonArray3=new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData3 = new TreeMap<>();
	    for(int i=0;i<jsonArray3.length();i++) {
	    	JSONObject jsonData3=jsonArray3.getJSONObject(i);
	    	
	    	hdr4 = jsonData3.getString("HDR");
	    	graphData3.put(jsonData3.getString("LINEX"), Double.valueOf(jsonData3.getString("CI_RATIO")));  
	    }
	    
//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
	    model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);
		
		
		Map<String, Object> result4 =
				getAllStatesJdbcCall4.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
	    String fjfhdj4=json4.get("CUR_DATA").toString();
	    JSONArray jsonArray4=new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData4 = new TreeMap<>();
	    for(int i=0;i<jsonArray4.length();i++) {
	    	JSONObject jsonData4=jsonArray4.getJSONObject(i);
	    	
	    	hdr5 = jsonData4.getString("HDR");
	    	graphData4.put(jsonData4.getString("LINEX"), Double.valueOf(jsonData4.getString("CB_RATIO")));  
	    }
	    
//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
	    model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);
		
		
		Map<String, Object> result5 =
				getAllStatesJdbcCall5.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
	    String fjfhdj5=json5.get("CUR_DATA").toString();
	    JSONArray jsonArray5=new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData5 = new TreeMap<>();
	    for(int i=0;i<jsonArray5.length();i++) {
	    	JSONObject jsonData5=jsonArray5.getJSONObject(i);
	    	
	    	hdr6 = jsonData5.getString("HDR");
	    	graphData5.put(jsonData5.getString("LINEX"), Double.valueOf(jsonData5.getString("CB_RATIO")));  
	    }
	    
//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
	    model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);
		
		
		
		Map<String, Object> result6 =
				getAllStatesJdbcCall6.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_EQ_MONTH_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
	    String fjfhdj6=json6.get("CUR_DATA").toString();
	    JSONArray jsonArray6=new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData6 = new TreeMap<>();
	    for(int i=0;i<jsonArray6.length();i++) {
	    	JSONObject jsonData6=jsonArray6.getJSONObject(i);
	    	
	    	hdr7 = jsonData6.getString("HDR");
	    	graphData6.put(jsonData6.getString("LINEX"), Double.valueOf(jsonData6.getString("EQ_MONTH")));  
	    }
	    
//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
	    model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);
		
		
		
		Map<String, Object> result7 =
				getAllStatesJdbcCall7.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_cm")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
	    String fjfhdj7=json7.get("CUR_DATA").toString();
	    JSONArray jsonArray7=new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData7 = new TreeMap<>();
	    for(int i=0;i<jsonArray7.length();i++) {
	    	JSONObject jsonData7=jsonArray7.getJSONObject(i);
	    	
	    	hdr8 = jsonData7.getString("HDR");
	    	graphData7.put(jsonData7.getString("LINEX"), Double.valueOf(jsonData7.getString("BILLED_UNIT")));  
	    }
	    
//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
	    model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);
		
		
		Map<String, Object> result8 =
				getAllStatesJdbcCall8.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(a, b, c , d, g,officeCode,f  );
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
	    String fjfhdj8=json8.get("CUR_DATA").toString();
	    JSONArray jsonArray8=new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	
   
	    Map<String, Double> graphData8 = new TreeMap<>();
	    for(int i=0;i<jsonArray8.length();i++) {
	    	JSONObject jsonData8=jsonArray8.getJSONObject(i);
	    	
	    	hdr8 = jsonData8.getString("HDR");
	    	graphData8.put(jsonData8.getString("LINEX"), Double.valueOf(jsonData8.getString("BILLED_UNIT")));  
	    }
	    
//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
	    model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);
		
		
		
		
//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST>listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		
		
//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R>listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 
		
//		IC_ZONE_MST drop-down start 
		ArrayList<Month_Dropdown>billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		
//		IC_ZONE_MST drop-down end 	
		
		
//		circle drop-down start 
		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDaoRafi.getCircleList(MainControllerIC.officeCode, module_list.getZone());
		model.addAttribute("circleList",circleList );
//		circle drop-down end 
		
//		div drop-down start
		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDaoRafi.getdivList(MainControllerIC.officeCode,module_list.getCircle());
		model.addAttribute("divList",divList);
//		div drop-down end
		
//		loc drop-down start	
		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDaoRafi.getlocList(MainControllerIC.officeCode,module_list.getCircle(),module_list.getDiv());
		model.addAttribute("locList", locList);
//		loc drop-down end
		
		model.addAttribute("xyz",module_list);
		
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		
		return "IC_DASHBOARD_DIST";
	
	}
	
	
	/////////////////////end graph
}
