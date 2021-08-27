package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class ICONVDaoRafi {

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

	SimpleJdbcCall getAllStatesJdbcCall10;
	SimpleJdbcCall getAllStatesJdbcCall11;
	SimpleJdbcCall getAllStatesJdbcCall12;
	SimpleJdbcCall getAllStatesJdbcCall13;
	SimpleJdbcCall getAllStatesJdbcCall14;

	SimpleJdbcCall getAllStatesJdbcCall15;
	SimpleJdbcCall getAllStatesJdbcCall16;
	SimpleJdbcCall getAllStatesJdbcCall17;
	SimpleJdbcCall getAllStatesJdbcCall18;
	SimpleJdbcCall getAllStatesJdbcCall19;

	SimpleJdbcCall getAllStatesJdbcCall20;
	SimpleJdbcCall getAllStatesJdbcCall21;
	SimpleJdbcCall getAllStatesJdbcCall22;
	SimpleJdbcCall getAllStatesJdbcCall23;
	SimpleJdbcCall getAllStatesJdbcCall24;

	SimpleJdbcCall getAllStatesJdbcCall25;
	SimpleJdbcCall getAllStatesJdbcCall26;
	SimpleJdbcCall getAllStatesJdbcCall27;
	SimpleJdbcCall getAllStatesJdbcCall28;
	SimpleJdbcCall getAllStatesJdbcCall29;

	SimpleJdbcCall getAllStatesJdbcCall30;
	SimpleJdbcCall getAllStatesJdbcCall31;
	SimpleJdbcCall getAllStatesJdbcCall32;
	SimpleJdbcCall getAllStatesJdbcCall33;
	SimpleJdbcCall getAllStatesJdbcCall34;

	SimpleJdbcCall getAllStatesJdbcCall35;
	SimpleJdbcCall getAllStatesJdbcCall36;
	SimpleJdbcCall getAllStatesJdbcCall37;
	SimpleJdbcCall getAllStatesJdbcCall38;
	SimpleJdbcCall getAllStatesJdbcCall39;

	SimpleJdbcCall getAllStatesJdbcCall40;
	SimpleJdbcCall getAllStatesJdbcCall41;
	SimpleJdbcCall getAllStatesJdbcCall42;
	SimpleJdbcCall getAllStatesJdbcCall43;
	SimpleJdbcCall getAllStatesJdbcCall44;

	SimpleJdbcCall getAllStatesJdbcCall45;
	SimpleJdbcCall getAllStatesJdbcCall46;
	SimpleJdbcCall getAllStatesJdbcCall47;
	SimpleJdbcCall getAllStatesJdbcCall48;
	SimpleJdbcCall getAllStatesJdbcCall49;

	SimpleJdbcCall getAllStatesJdbcCall50;
	SimpleJdbcCall getAllStatesJdbcCall51;
	SimpleJdbcCall getAllStatesJdbcCall52;
	SimpleJdbcCall getAllStatesJdbcCall53;
	SimpleJdbcCall getAllStatesJdbcCall54;
	SimpleJdbcCall getAllStatesJdbcCall55;
	

//	pacakge name start
	SimpleJdbcCall getAllStatesJdbcCall100;
//	pacakge name end

	public ICONVDaoRafi(DataSource dataSource) {

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

		this.getAllStatesJdbcCall10 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall11 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall12 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall13 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall14 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall15 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall16 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall17 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall18 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall19 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall20 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall21 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall22 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall23 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall24 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall25 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall26 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall27 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall28 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall29 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall30 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall31 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall32 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall33 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall34 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall35 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall36 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall37 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall38 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall39 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall40 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall41 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall42 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall43 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall44 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall45 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall46 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall47 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall48 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall49 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall50 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall51 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall52 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall53 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall54 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall55 = new SimpleJdbcCall(dataSource);
//		pacakge name start
		this.getAllStatesJdbcCall100 = new SimpleJdbcCall(dataSource);
//		pacakge name end

	}

//	ic misc bill type list starts 

	public ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE() {

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//	    System.out.println("npnp");
//		System.out.println(result);
//		
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_MISC_BILL_TYPE.add(new IC_MISC_BILL_TYPE(jsonData.getString("MSC_BILL_TYPE_CODE"),
					jsonData.getString("MSC_BILL_TYPE_NAME"), jsonData.getString("GROSS_FLAG"),
					jsonData.getString("STATUS"), jsonData.getString("MSC_BILL_TYPE_ID")));
		}

//	    System.out.println("npnp");
//	    System.out.println(listIC_FUEL_TYPE);
		return listIC_MISC_BILL_TYPE;
	}

//	ic misc bill type list ends 

	// ic misc bill type insert starts

	public void insertICMiscBillType(IC_MISC_BILL_TYPE ic_misc_bill_type) {

//		System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_misc_bill_type.getMSC_BILL_TYPE_CODE();
		String b = ic_misc_bill_type.getMSC_BILL_TYPE_NAME();
		String c = ic_misc_bill_type.getGROSS_FLAG();
		String d = ic_misc_bill_type.getSTATUS();

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println("TEST");
//	System.out.println(out);   

	}

	// ic misc bill type insert ends

//	ic misc bill type single starts 

	public IC_MISC_BILL_TYPE singleIC_MISC_BILL_TYPE(int id) {

		IC_MISC_BILL_TYPE singleIC_MISC_BILL_TYPE = new IC_MISC_BILL_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_MISC_BILL_TYPE = new IC_MISC_BILL_TYPE(jsonData.getString("MSC_BILL_TYPE_CODE"),
					jsonData.getString("MSC_BILL_TYPE_NAME"), jsonData.getString("GROSS_FLAG"),
					jsonData.getString("STATUS"), jsonData.getString("MSC_BILL_TYPE_ID"));
		}

//	    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_MISC_BILL_TYPE;
	}

//	ic misc bill type single ends

	// ic misc bill type update starts

	public void editICMiscBillType(IC_MISC_BILL_TYPE ic_misc_bill_type) {

//		System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_misc_bill_type.getMSC_BILL_TYPE_CODE();
		String b = ic_misc_bill_type.getMSC_BILL_TYPE_NAME();
		String c = ic_misc_bill_type.getGROSS_FLAG();
		String d = ic_misc_bill_type.getSTATUS();

		int e = Integer.valueOf(ic_misc_bill_type.getMSC_BILL_TYPE_ID());

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic misc bill type update ends

	// ic misc bill type delete starts

	public void deleteICMiscBillType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic misc bill type delete ends

//		ic fuel type list starts 

	public ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE() {

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_FUEL_TYPE.add(new IC_FUEL_TYPE(jsonData.getString("FUEL_CODE"), jsonData.getString("FUEL_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("UNIT"), jsonData.getString("FUEL_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_FUEL_TYPE;
	}

//		ic fuel type list ends 

	// ic fuel type insert starts

	public void insertICFuelType(IC_FUEL_TYPE ic_fuel_type) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_fuel_type.getFUEL_CODE();
		String b = ic_fuel_type.getFUEL_NAME();
		String c = ic_fuel_type.getSTATUS();
		String d = ic_fuel_type.getUNIT();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// ic fuel types insert ends

//		ic fuel types single starts 

	public IC_FUEL_TYPE singleIC_FUEL_TYPE(int id) {

		IC_FUEL_TYPE singleIC_FUEL_TYPE = new IC_FUEL_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_FUEL_TYPE = new IC_FUEL_TYPE(jsonData.getString("FUEL_CODE"), jsonData.getString("FUEL_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("UNIT"), jsonData.getString("FUEL_ID"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_FUEL_TYPE;
	}

//		ic fuel types single ends

	// ic fuel types type update starts

	public void editICFuelType(IC_FUEL_TYPE ic_fuel_type) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_fuel_type.getFUEL_CODE();
		String b = ic_fuel_type.getFUEL_NAME();
		String c = ic_fuel_type.getSTATUS();
		String d = ic_fuel_type.getUNIT();
		int e = Integer.valueOf(ic_fuel_type.getFUEL_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICFuelType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic fuel types delete ends

//		IC_PP_OWNER_TYPE list starts 

	public ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE() {

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PP_OWNER_TYPE
					.add(new IC_PP_OWNER_TYPE(jsonData.getString("OWNER_TYPE_ID"), jsonData.getString("OWNER_TYPE"),
							jsonData.getString("OWNER_TYPE_NAME"), jsonData.getString("SHORT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PP_OWNER_TYPE;
	}

//		IC_PP_OWNER_TYPE list ends 

	// IC_PP_OWNER_TYPE insert starts

	public void insertICPPOwnerType(IC_PP_OWNER_TYPE ic_pp_owner_type) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_pp_owner_type.getOWNER_TYPE();
		String b = ic_pp_owner_type.getOWNER_TYPE_NAME();
		String c = ic_pp_owner_type.getSHORT_NAME();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE insert ends

//		IC_PP_OWNER_TYPE single starts 

	public IC_PP_OWNER_TYPE singleIC_PP_OWNER_TYPE(int id) {

		IC_PP_OWNER_TYPE singleIC_PP_OWNER_TYPE = new IC_PP_OWNER_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_PP_OWNER_TYPE = new IC_PP_OWNER_TYPE(jsonData.getString("OWNER_TYPE_ID"),
					jsonData.getString("OWNER_TYPE"), jsonData.getString("OWNER_TYPE_NAME"),
					jsonData.getString("SHORT_NAME"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_PP_OWNER_TYPE;
	}

//		IC_PP_OWNER_TYPE single ends

	// IC_PP_OWNER_TYPE type update starts

	public void editICPPOwnerType(IC_PP_OWNER_TYPE ic_pp_owner_type) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_pp_owner_type.getOWNER_TYPE();
		String b = ic_pp_owner_type.getOWNER_TYPE_NAME();
		String c = ic_pp_owner_type.getSHORT_NAME();
		int d = Integer.valueOf(ic_pp_owner_type.getOWNER_TYPE_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE update ends

	// IC_PP_OWNER_TYPEdelete starts

	public void deleteICPPOwnerType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE delete ends

//		IC_PP_OWNER  list starts 

	public ArrayList<IC_PP_OWNER> listIC_PP_OWNER() {

		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PP_OWNER.add(new IC_PP_OWNER(jsonData.getString("OWNER_CODE"), jsonData.getString("OWNER_NAME"),
					jsonData.getString("OWNER_TYPE"), jsonData.getString("OWNER_TYPE_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("SHORT_NAME"), jsonData.getString("PP_OWNER_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PP_OWNER;
	}

//		IC_PP_OWNER list ends 

	// IC_PP_OWNER insert starts

	public void insertICPPOwner(IC_PP_OWNER ic_pp_owner) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_pp_owner.getOWNER_CODE();
		String b = ic_pp_owner.getOWNER_NAME();
		String c = ic_pp_owner.getOWNER_TYPE();
		String d = ic_pp_owner.getSTATUS();
		String e = ic_pp_owner.getSHORT_NAME();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// IC_PP_OWNER insert ends

//		IC_PP_OWNER single starts 

	public IC_PP_OWNER singleIC_PP_OWNER(int id) {

		IC_PP_OWNER singleIC_PP_OWNER = new IC_PP_OWNER();

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_PP_OWNER = new IC_PP_OWNER(jsonData.getString("OWNER_CODE"), jsonData.getString("OWNER_NAME"),
					jsonData.getString("OWNER_TYPE"), null, jsonData.getString("STATUS"),
					jsonData.getString("SHORT_NAME"), jsonData.getString("PP_OWNER_ID"));
		}

		System.out.println("ICONV");
		System.out.println(singleIC_PP_OWNER);
		return singleIC_PP_OWNER;
	}

//		IC_PP_OWNER single ends

	// IC_PP_OWNER update starts

	public void editICPPOwner(IC_PP_OWNER ic_pp_owner) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_pp_owner.getOWNER_CODE();
		String b = ic_pp_owner.getOWNER_NAME();
		String c = ic_pp_owner.getOWNER_TYPE();
		String d = ic_pp_owner.getSTATUS();
		String e = ic_pp_owner.getSHORT_NAME();

		int f = Integer.valueOf(ic_pp_owner.getPP_OWNER_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out); 

	}

	// IC_PP_OWNER update ends

	// IC_PP_OWNER delete starts

	public void deleteICPPOwner(int id) {

		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER delete ends

//		ic line type list starts 

	public ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE() {

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LINE_TYPE.add(new IC_LINE_TYPE(jsonData.getString("LINE_TYPE"), jsonData.getString("LINE_TYPE_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("LINE_TYPE_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_LINE_TYPE;
	}

//		ic line type  list ends 

	// ic line type insert starts

	public void insertICLineType(IC_LINE_TYPE ic_line_type) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_line_type.getLINE_TYPE();
		String b = ic_line_type.getLINE_TYPE_NAME();
		String c = ic_line_type.getSTATUS();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// ic line type insert ends

//		ic line type single starts 

	public IC_LINE_TYPE singleIC_LINE_TYPE(int id) {

		IC_LINE_TYPE singleIC_LINE_TYPE = new IC_LINE_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_LINE_TYPE = new IC_LINE_TYPE(jsonData.getString("LINE_TYPE"), jsonData.getString("LINE_TYPE_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("LINE_TYPE_ID"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_LINE_TYPE;
	}

//		ic line type single ends

	// ic line type update starts

	public void editICLineType(IC_LINE_TYPE ic_line_type) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_line_type.getLINE_TYPE();
		String b = ic_line_type.getLINE_TYPE_NAME();
		String c = ic_line_type.getSTATUS();

		int d = Integer.valueOf(ic_line_type.getLINE_TYPE_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out); 

	}

	// ic line type update ends

	// ic line type delete starts

	public void deleteICLineType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic line type delete ends

//		IC_PERIOD_MST list starts 

	public ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST() {

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PERIOD_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PERIOD_MST.add(new IC_PERIOD_MST(jsonData.getString("YEAR_CODE"), jsonData.getString("PERIOD_CODE"),
					jsonData.getString("PERIOD_DESC"), jsonData.getString("PR_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PERIOD_MST;
	}

//		IC_PERIOD_MST type list ends 

//		IC_LOCATION_MASTER list starts 

	public ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER() {

		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOCATION_MASTER_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LOCATION_MASTER.add(
					new IC_LOCATION_MASTER(jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_LOCATION_MASTER;
	}

//		IC_LOCATION_MASTER list ends 

//		IC_LOC_MOD list starts 

	public ArrayList<IC_LOC_MOD> a(int z) {

		ArrayList<IC_LOC_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall27.withCatalogName("DATA_PKG").withProcedureName("IC_LOC_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_LOC_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					f.getString("LOCATION_NAME"), f.getString("NET_IMPORT_KWH"), f.getString("NET_GEN_KWH"),
					f.getString("STATUS"), f.getString("SYS_LOSS"), f.getString("CI_RATIO"),
					f.getString("SYS_LOSS_WO_REB"), f.getString("CI_RATIO_WO_REB"), f.getString("BILLING_RATE"),
					f.getString("LOC_MOD_ID")));
		}

		System.out.println("GGG");
		System.out.println(b);

		return b;

	}

//		IC_LOC_MOD list ends 

	// IC_LOC_MOD insert starts

	public void insertICLocMod(IC_LOC_MOD ic_loc_mod) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_loc_mod.getBILL_CYCLE_CODE();
		String b = ic_loc_mod.getLOCATION_CODE();

		int c = Integer.valueOf(ic_loc_mod.getNET_IMPORT_KWH());
		int d = Integer.valueOf(ic_loc_mod.getNET_GEN_KWH());
		String e = ic_loc_mod.getSTATUS();
		int f = Integer.valueOf(ic_loc_mod.getSYS_LOSS());
//		int g= Integer.valueOf(ic_loc_mod.getCI_RATIO());
		String g = ic_loc_mod.getCI_RATIO();
		int h = Integer.valueOf(ic_loc_mod.getSYS_LOSS_WO_REB());
		int i = Integer.valueOf(ic_loc_mod.getCI_RATIO_WO_REB());
		int j = Integer.valueOf(ic_loc_mod.getBILLING_RATE());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("mhhh");
		System.out.println(out);

	}

	// IC_LOC_MOD insert ends

//		IC_LOC_MOD  single starts 

	public IC_LOC_MOD singleIC_LOC_MOD(int id) {

		IC_LOC_MOD singleIC_LOC_MOD = new IC_LOC_MOD();

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_LOC_MOD = new IC_LOC_MOD(jsonData.getString("BILL_CYCLE_CODE"),
					jsonData.getString("LOCATION_CODE"), null, jsonData.getString("NET_IMPORT_KWH"),
					jsonData.getString("NET_GEN_KWH"), jsonData.getString("STATUS"), jsonData.getString("SYS_LOSS"),
					jsonData.getString("CI_RATIO"), jsonData.getString("SYS_LOSS_WO_REB"),
					jsonData.getString("CI_RATIO_WO_REB"), jsonData.getString("BILLING_RATE"), null);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_LOC_MOD;
	}

//		IC_LOC_MOD  single ends 

	// IC_LOC_MOD update starts

	public void editICLocMod(IC_LOC_MOD ic_loc_mod) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_loc_mod.getBILL_CYCLE_CODE();
		String b = ic_loc_mod.getLOCATION_CODE();

		int c = Integer.valueOf(ic_loc_mod.getNET_IMPORT_KWH());
		int d = Integer.valueOf(ic_loc_mod.getNET_GEN_KWH());
		String e = ic_loc_mod.getSTATUS();
		int f = Integer.valueOf(ic_loc_mod.getSYS_LOSS());
//			int g= Integer.valueOf(ic_loc_mod.getCI_RATIO());
		String g = ic_loc_mod.getCI_RATIO();
		int h = Integer.valueOf(ic_loc_mod.getSYS_LOSS_WO_REB());
		int i = Integer.valueOf(ic_loc_mod.getCI_RATIO_WO_REB());
		int j = Integer.valueOf(ic_loc_mod.getBILLING_RATE());

		int k = Integer.valueOf(ic_loc_mod.getLOC_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j, k);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_LOC_MOD update ends

	// IC_LOC_MOD delete starts

	public void deleteICLocMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_LOC_MOD delete ends

//		IC_SECT_WISE_MOD list starts 

	public ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST() {

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECTOR_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_SECTOR_MST.add(new IC_SECTOR_MST(jsonData.getString("SECT_CODE"), jsonData.getString("SECT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_SECTOR_MST;
	}

//		IC_LOCATION_MASTER list ends 

//		IC_SECT_WISE_MOD list starts 

	public ArrayList<IC_SECT_WISE_MOD> g(String z, String o) {

		ArrayList<IC_SECT_WISE_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall33.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_SECT_WISE_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					f.getString("LOCATION_NAME"), f.getString("SECT_CODE"), f.getString("SECT_NAME"),
					f.getString("BILLED_AMT"), f.getString("COLL_AMT"), f.getString("REC_AMT"), f.getString("EQ_MONTH"),
					f.getString("SECT_MOD_ID")

			));
		}

		System.out.println("GGG");
		System.out.println(b);

		return b;

	}

//		IC_SECT_WISE_MOD list ends 

//		//IC_SECT_WISE_MOD  insert starts

	public void insertICSectWiseMod(IC_SECT_WISE_MOD ic_sect_wise_mod) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_sect_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_sect_wise_mod.getLOCATION_CODE();
		String c = ic_sect_wise_mod.getSECT_CODE();

		int d = Integer.valueOf(ic_sect_wise_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_sect_wise_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_sect_wise_mod.getREC_AMT());
		int g = Integer.valueOf(ic_sect_wise_mod.getEQ_MONTH());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall34.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f, g);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("mhhh");
		System.out.println(out);

	}

//		//IC_SECT_WISE_MOD  insert ends

//		IC_SECT_WISE_MOD  single starts 

	public IC_SECT_WISE_MOD singleIC_SECT_WISE_MOD(int id) {

		IC_SECT_WISE_MOD singleIC_SECT_WISE_MOD = new IC_SECT_WISE_MOD();

		Map<String, Object> result = getAllStatesJdbcCall35.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_SECT_WISE_MOD = new IC_SECT_WISE_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					null, f.getString("SECT_CODE"), null, f.getString("BILLED_AMT"), f.getString("COLL_AMT"),
					f.getString("REC_AMT"), f.getString("EQ_MONTH"), f.getString("SECT_MOD_ID")

			);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_SECT_WISE_MOD;
	}

//		//IC_SECT_WISE_MOD  single ends

	// IC_SECT_WISE_MOD update starts

	public void editICSectWiseMod(IC_SECT_WISE_MOD ic_sect_wise_mod) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_sect_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_sect_wise_mod.getLOCATION_CODE();
		String c = ic_sect_wise_mod.getSECT_CODE();

		int d = Integer.valueOf(ic_sect_wise_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_sect_wise_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_sect_wise_mod.getREC_AMT());
		int g = Integer.valueOf(ic_sect_wise_mod.getEQ_MONTH());

		int h = Integer.valueOf(ic_sect_wise_mod.getSECT_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall36.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f, g, h);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_SECT_WISE_MOD update ends

	// IC_SECT_WISE_MOD delete starts

	public void deleteICSectWiseMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall37.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_SECT_WISE_MOD delete ends

//		IC_MISC_MOD list starts 

	public ArrayList<IC_MISC_MOD> d(String z, String o) {

		ArrayList<IC_MISC_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall38.withCatalogName("DATA_PKG").withProcedureName("IC_MISC_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_MISC_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					f.getString("LOCATION_NAME"), f.getString("MSC_TYPE_CODE"), f.getString("MSC_BILL_TYPE_NAME"),
					f.getString("BILLED_AMT"), f.getString("COLL_AMT"), f.getString("REC_AMT"),
					f.getString("MSC_MOD_ID")

			));
		}

//			System.out.println("GGG");
//			System.out.println(b);

		return b;

	}

//		IC_MISC_MOD list ends

//		IC_CAT_WISE_MOD list starts 

	public ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE() {

		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("DATA_PKG")
				.withProcedureName("IC_USAGE_CAT_CODE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USAGE_CAT_CODE.add(
					new IC_USAGE_CAT_CODE(jsonData.getString("USAGE_CAT_CODE"), jsonData.getString("USAGE_CAT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_USAGE_CAT_CODE;
	}

//		IC_USAGE_CAT_CODE list ends 

//		IC_CAT_WISE_MOD list starts 

	public ArrayList<IC_CAT_WISE_MOD> w(String z, String o) {

		ArrayList<IC_CAT_WISE_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall40.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_CAT_WISE_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					f.getString("LOCATION_NAME"), f.getString("USAGE_CAT_CODE"), f.getString("USAGE_CAT_NAME"),
					f.getString("NEW_CONS"), f.getString("PD_CONS"), f.getString("TOT_CONS"), f.getString("TD_CONS"),
					f.getString("ACTIVE_CONS"), f.getString("BILLED_CONS"), f.getString("BILLED_UNIT"),
					f.getString("BILLED_AMT"), f.getString("COLL_AMT"), f.getString("REC_AMT"),
					f.getString("BILLING_RATE"), f.getString("EQ_MONTH"), f.getString("CAT_MOD_ID")

			));
		}

//			System.out.println("GGG");
//			System.out.println(b);

		return b;

	}

//		IC_CAT_WISE_MOD list ends

//		//IC_CAT_WISE_MOD  insert starts

	public void insertICCatWiseMod(IC_CAT_WISE_MOD ic_cat_wise_mod) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_cat_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_cat_wise_mod.getLOCATION_CODE();
		String c = ic_cat_wise_mod.getUSAGE_CAT_CODE();
		int d = Integer.valueOf(ic_cat_wise_mod.getNEW_CONS());
		int e = Integer.valueOf(ic_cat_wise_mod.getPD_CONS());
		int f = Integer.valueOf(ic_cat_wise_mod.getTOT_CONS());
		int g = Integer.valueOf(ic_cat_wise_mod.getTD_CONS());
		int h = Integer.valueOf(ic_cat_wise_mod.getACTIVE_CONS());
		int i = Integer.valueOf(ic_cat_wise_mod.getBILLED_CONS());
		int j = Integer.valueOf(ic_cat_wise_mod.getBILLED_UNIT());
		int k = Integer.valueOf(ic_cat_wise_mod.getBILLED_AMT());
		int l = Integer.valueOf(ic_cat_wise_mod.getCOLL_AMT());
		int m = Integer.valueOf(ic_cat_wise_mod.getREC_AMT());
		int n = Integer.valueOf(ic_cat_wise_mod.getBILLING_RATE());
		int o = Integer.valueOf(ic_cat_wise_mod.getEQ_MONTH());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall45.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("humm");
		System.out.println(out);

	}

//		//IC_CAT_WISE_MOD  insert ends

//		IC_CAT_WISE_MOD  single starts 

//		
	public IC_CAT_WISE_MOD singleIC_CAT_WISE_MOD(int id) {

		IC_CAT_WISE_MOD singleIC_CAT_WISE_MOD = new IC_CAT_WISE_MOD();

		Map<String, Object> result = getAllStatesJdbcCall46.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_CAT_WISE_MOD = new IC_CAT_WISE_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"),
					null, f.getString("USAGE_CAT_CODE"), null, f.getString("NEW_CONS"), f.getString("PD_CONS"),
					f.getString("TOT_CONS"), f.getString("TD_CONS"), f.getString("ACTIVE_CONS"),
					f.getString("BILLED_CONS"), f.getString("BILLED_UNIT"), f.getString("BILLED_AMT"),
					f.getString("COLL_AMT"), f.getString("REC_AMT"), f.getString("BILLING_RATE"),
					f.getString("EQ_MONTH"), f.getString("CAT_MOD_ID")

			);
		}
//		    			

//	    System.out.println(singleIC_CAT_WISE_MOD);
		return singleIC_CAT_WISE_MOD;
	}

//		//IC_CAT_WISE_MOD  single ends

	// IC_CAT_WISE_MOD update starts

	public void editICCatWiseMod(IC_CAT_WISE_MOD ic_cat_wise_mod) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_cat_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_cat_wise_mod.getLOCATION_CODE();
		String c = ic_cat_wise_mod.getUSAGE_CAT_CODE();
		int d = Integer.valueOf(ic_cat_wise_mod.getNEW_CONS());
		int e = Integer.valueOf(ic_cat_wise_mod.getPD_CONS());
		int f = Integer.valueOf(ic_cat_wise_mod.getTOT_CONS());
		int g = Integer.valueOf(ic_cat_wise_mod.getTD_CONS());
		int h = Integer.valueOf(ic_cat_wise_mod.getACTIVE_CONS());
		int i = Integer.valueOf(ic_cat_wise_mod.getBILLED_CONS());
		int j = Integer.valueOf(ic_cat_wise_mod.getBILLED_UNIT());
		int k = Integer.valueOf(ic_cat_wise_mod.getBILLED_AMT());
		int l = Integer.valueOf(ic_cat_wise_mod.getCOLL_AMT());
		int m = Integer.valueOf(ic_cat_wise_mod.getREC_AMT());
		int n = Integer.valueOf(ic_cat_wise_mod.getBILLING_RATE());
		int o = Integer.valueOf(ic_cat_wise_mod.getEQ_MONTH());

		int p = Integer.valueOf(ic_cat_wise_mod.getCAT_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall47.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_CAT_WISE_MOD update ends

	// IC_CAT_WISE_MOD delete starts

	public void deleteICCatWiseMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall48.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_CAT_WISE_MOD delete ends

//		//IC_MISC_MOD  insert starts

	public void insertICMiscMod(IC_MISC_MOD ic_misc_mod) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_misc_mod.getBILL_CYCLE_CODE();
		String b = ic_misc_mod.getLOCATION_CODE();
		String c = ic_misc_mod.getMSC_TYPE_CODE();

		int d = Integer.valueOf(ic_misc_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_misc_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_misc_mod.getREC_AMT());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("mhhh");  
		System.out.println(out);

	}

//		//IC_MISC_MOD  insert ends

//		IC_MISC_MOD  single starts 

	public IC_MISC_MOD singleIC_MISC_MOD(int id) {

		IC_MISC_MOD singleIC_MISC_MOD = new IC_MISC_MOD();

		Map<String, Object> result = getAllStatesJdbcCall40.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_MISC_MOD = new IC_MISC_MOD(f.getString("BILL_CYCLE_CODE"), f.getString("LOCATION_CODE"), null,
					f.getString("MSC_TYPE_CODE"), null, f.getString("BILLED_AMT"), f.getString("COLL_AMT"),
					f.getString("REC_AMT"), f.getString("MSC_MOD_ID")

			);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_MISC_MOD;
	}

//		//IC_MISC_MOD  single ends

	// IC_MISC_MOD update starts

	public void editICMiscMod(IC_MISC_MOD ic_misc_mod) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_misc_mod.getBILL_CYCLE_CODE();
		String b = ic_misc_mod.getLOCATION_CODE();
		String c = ic_misc_mod.getMSC_TYPE_CODE();

		int d = Integer.valueOf(ic_misc_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_misc_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_misc_mod.getREC_AMT());

		int g = Integer.valueOf(ic_misc_mod.getMSC_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall41.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f, g);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_MISC_MOD update ends

	// IC_MISC_MOD delete starts

	public void deleteICMiscMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall42.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_MISC_MOD delete ends
	
	//nav bar list start		
	
//	IC_REPORT_LEVEL_MST list starts 
	
	public ArrayList<IC_REPORT_LEVEL_MST>a(String officeCode){
		
		ArrayList<IC_REPORT_LEVEL_MST>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall49.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_reporting_level")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_REPORT_LEVEL_MST(
						f.getString("REPORT_LEVEL_CODE"),
						f.getString("REPORT_LEVEL_DESC")
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
		
	
		
		return b;
		
	}
	
//	IC_REPORT_LEVEL_MST list end 
	
	
//	IC_ZONE_MST list starts 
	
	public ArrayList<IC_ZONE_MST_R>r(String officeCode){
		
		ArrayList<IC_ZONE_MST_R>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall50.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_Zone")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ZONE_MST_R(
						f.getString("ZONE_CODE"),
						f.getString("ZONE_NAME")
						
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
		
	
		
		return b;
		
	}
	
//	IC_ZONE_MST list end 
	
	
//	IC_CIRCLE_MST list starts 
	
	//nav bar dropdown list start	
	
	public ArrayList<IC_CIRCLE_MST_R>getCircleList(String officeCode, String id){
		
		ArrayList<IC_CIRCLE_MST_R>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall51.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_circle")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(id,officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_CIRCLE_MST_R(
						f.getString("CIRCLE_CODE"),
						f.getString("CIRCLE_NAME")
						
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
//		
	
		
		return b;
		
	}
	
//	IC_CIRCLE_MST list end 
	
	
	
	
//	Division list starts 
	
	public ArrayList<IC_DIST_DIV_MST>getdivList(String officeCode, String id){
		
		ArrayList<IC_DIST_DIV_MST>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall52.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_div")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(id,officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_DIST_DIV_MST(
						f.getString("DIV_CODE"),
						f.getString("DIV_NAME")
						
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
//		
	
		
		return b;
		
	}
	
//	Division list end 
	
	
//	Location list starts 
	
	public ArrayList<IC_LOCATION_MASTER>getlocList(String officeCode, String id,String div){
		
		ArrayList<IC_LOCATION_MASTER>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall53.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_location")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(id,div,officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_LOCATION_MASTER(
						f.getString("LOCATION_CODE"),
						f.getString("LOCATION_NAME")
						
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
		
	
		
		return b;
		
	}
	
//	Location  list end 
	
	
//	Month list starts 
	
public ArrayList<Month_Dropdown>m(String officeCode){
		
		ArrayList<Month_Dropdown>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall54.withCatalogName("pkg_dist_Dash_board")
								.withProcedureName("dpd_bill_cycle")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new Month_Dropdown(
						f.getString("BILL_CYCLE_CODE"),
						f.getString("BILL_CYCLE_DESC")
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
		
	
		
		return b;
		
	}
	
//	Month  list end 
	
	
	
	//nav bar dropdown list end	
	
	//nav bar  list end	



//last_month_date list start


public  String  listlast_month_date(){


String g=null;

Map<String, Object> c = getAllStatesJdbcCall55.withCatalogName("DATA_PKG")
		.withProcedureName("last_month_date")
		.declareParameters(
				new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
		.execute();

JSONObject j = new JSONObject(c);
//System.out.println(j);

String d = j.get("CUR_DATA").toString();
JSONArray e = new JSONArray(d);

for(int i=0; i<e.length(); i++) {
	
	JSONObject f = e.getJSONObject(i);
	
	
//				 g=f.getString("LAST_DATE").substring(0,7);
				
				 g=f.getString("LAST_DATE");
				
				
			
}

//System.out.println(d);



return g;
}

//last_month_date list end


}
