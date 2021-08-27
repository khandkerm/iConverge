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
public class IConvergeDaoSurovi {

	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;

	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall30;
	SimpleJdbcCall getAllStatesJdbcCall31;
	SimpleJdbcCall getAllStatesJdbcCall32;
	SimpleJdbcCall getAllStatesJdbcCall33;
	SimpleJdbcCall getAllStatesJdbcCall34;

	public IConvergeDaoSurovi(DataSource dataSource) {

		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall30 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall31 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall32 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall33 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall34 = new SimpleJdbcCall(dataSource);
	}

//	ic_sector_mst list starts 

	public ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST() {

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_SECTOR_MST.add(new IC_SECTOR_MST(jsonData.getString("SECT_CODE"), jsonData.getString("SECT_NAME"),
					jsonData.getString("GROSS_FLAG"), jsonData.getString("STATUS"), jsonData.getString("SECT_ID")));
		}

//	    System.out.println(listPKG_MST);
		return listIC_SECTOR_MST;
	}

//	ic_sector_mst list ends

	// ic sector mst insert starts

	public void insertIcSectorMst(IC_SECTOR_MST ic_sector_mst) {

//				System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_sector_mst.getSECT_CODE();
		String b = ic_sector_mst.getSECT_NAME();
		String c = ic_sector_mst.getGROSS_FLAG();
		String d = ic_sector_mst.getSTATUS();

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println("TEST");
//			System.out.println(out);   

	}

	// ic sector mst insert ends

//	ic sector mst single starts 

	public IC_SECTOR_MST singleIC_SECTOR_MST(int id) {

		IC_SECTOR_MST singleIC_SECTOR_MST = new IC_SECTOR_MST();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_SECTOR_MST = new IC_SECTOR_MST(jsonData.getString("SECT_CODE"), jsonData.getString("SECT_NAME"),
					jsonData.getString("GROSS_FLAG"), jsonData.getString("STATUS"), jsonData.getString("SECT_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_SECTOR_MST;
	}

//			misc bill type single ends

	// misc bill type update starts

	public void editIcSectorMst(IC_SECTOR_MST ic_sector_mst) {

//				System.out.println(ic_sector_mst);
		// System.out.println(sfmodel);
		String a = ic_sector_mst.getSECT_CODE();
		String b = ic_sector_mst.getSECT_NAME();
		String c = ic_sector_mst.getGROSS_FLAG();
		String d = ic_sector_mst.getSTATUS();

		int e = Integer.valueOf(ic_sector_mst.getSECT_ID());

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic sector mst update ends

//			
//
	// ic sector mst delete starts

	public void deleteIcSectorMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic sector mst delete ends

	public ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA() {

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_LIST")
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
			listIC_USAGE_AREA.add(new IC_USAGE_AREA(jsonData.getString("AREA_CODE"), jsonData.getString("AREA_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("AREA_ID")));
		}

//	    System.out.println("npnp");
//	    System.out.println(listIC_FUEL_TYPE);
		return listIC_USAGE_AREA;
	}

//	ic usage area list ends 

	// ic usage area insert starts

	public void insertICUsageArea(IC_USAGE_AREA ic_usage_area) {

//		System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_usage_area.getAREA_CODE();
		String b = ic_usage_area.getAREA_NAME();
		String c = ic_usage_area.getSTATUS();

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println("TEST");
//	System.out.println(out);   

	}

	// ic fuel types insert ends

//	ic fuel types single starts 

	public IC_USAGE_AREA singleIC_USAGE_AREA(int id) {

		IC_USAGE_AREA singleIC_USAGE_AREA = new IC_USAGE_AREA();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USAGE_AREA = new IC_USAGE_AREA(jsonData.getString("AREA_CODE"), jsonData.getString("AREA_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("AREA_ID"));
		}

//	    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USAGE_AREA;
	}

//	ic usage area single ends

	// ic usage area update starts

	public void editICUsageArea(IC_USAGE_AREA ic_usage_area) {

//		System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_usage_area.getAREA_CODE();
		String b = ic_usage_area.getAREA_NAME();
		String c = ic_usage_area.getSTATUS();

		int d = Integer.valueOf(ic_usage_area.getAREA_ID());

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUsageArea(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}
	// ic forward header mst starts

	public ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST() {

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_FORWARD_HEADER_MST.add(new IC_FORWARD_HEADER_MST(jsonData.getString("BILL_CYCLE_CODE"),
					jsonData.getString("NET_ENRG_GEN_FUEL_TYPE_HEADER"), jsonData.getString("FRD_HDR_ID")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_FORWARD_HEADER_MST;
	}

//			ic usage area list ends 

	// ic usage area insert starts

	public void insertICForwardHeaderMst(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

//				System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_forward_header_mst.getBILL_CYCLE_CODE();
		String b = ic_forward_header_mst.getNET_ENRG_GEN_FUEL_TYPE_HEADER();

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println("TEST");
//			System.out.println(out);   

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_FORWARD_HEADER_MST singleIC_FORWARD_HEADER_MST(int id) {

		IC_FORWARD_HEADER_MST singleIC_FORWARD_HEADER_MST = new IC_FORWARD_HEADER_MST();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_FORWARD_HEADER_MST = new IC_FORWARD_HEADER_MST(jsonData.getString("BILL_CYCLE_CODE"),
					jsonData.getString("NET_ENRG_GEN_FUEL_TYPE_HEADER"), jsonData.getString("FRD_HDR_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_FORWARD_HEADER_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICForwardHeaderMst(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

//				System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_forward_header_mst.getBILL_CYCLE_CODE();
		String b = ic_forward_header_mst.getNET_ENRG_GEN_FUEL_TYPE_HEADER();

		int c = Integer.valueOf(ic_forward_header_mst.getFRD_HDR_ID());

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICForwardHeaderMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic forward header mst ends

	// ic user mst starts

	public ArrayList<IC_USER_MST> listIC_USER_MST() {

		ArrayList<IC_USER_MST> listIC_USER_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USER_MST.add(new IC_USER_MST(jsonData.getString("USER_ID"), jsonData.getString("NAME"),
					jsonData.getString("USER_NAME"), jsonData.getString("USER_PASSWORD"), jsonData.getString("MOBILE"),
					jsonData.getString("EMAIL"), jsonData.getString("USER_TYPE"), jsonData.getString("STATUS")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_USER_MST;
	}

//			ic user mst list ends 

	// ic user mst insert starts

	public void insertICUserMst(IC_USER_MST ic_user_mst) {

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ic_user_mst.getNAME(),
						ic_user_mst.getUSER_NAME(), ic_user_mst.getUSER_PASSWORD(), ic_user_mst.getMOBILE(),
						ic_user_mst.getEMAIL(), ic_user_mst.getUSER_TYPE(), ic_user_mst.getSTATUS());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_USER_MST singleIC_USER_MST(int id) {

		IC_USER_MST singleIC_USER_MST = new IC_USER_MST();

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USER_MST = new IC_USER_MST(jsonData.getString("USER_ID"), jsonData.getString("NAME"),
					jsonData.getString("USER_NAME"), jsonData.getString("USER_PASSWORD"), jsonData.getString("MOBILE"),
					jsonData.getString("EMAIL"), jsonData.getString("USER_TYPE"), jsonData.getString("STATUS"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USER_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICUserMst(IC_USER_MST ic_user_mst) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(Integer.valueOf(ic_user_mst.getUSER_ID()), ic_user_mst.getNAME(), ic_user_mst.getUSER_NAME(),
						ic_user_mst.getUSER_PASSWORD(), ic_user_mst.getMOBILE(), ic_user_mst.getEMAIL(),
						ic_user_mst.getUSER_TYPE(), ic_user_mst.getSTATUS());

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUserMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic user type mst starts

	public ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST() {

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USER_TYPE_MST
					.add(new IC_USER_TYPE_MST(jsonData.getString("USERS_TYPE"), jsonData.getString("USER_TYPE_DESC"),
							jsonData.getString("STATUS"), jsonData.getString("USER_TYPE_ID")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_USER_TYPE_MST;
	}

//			ic user mst list ends 

	// ic user mst insert starts

	public void insertICUserTypeMst(IC_USER_TYPE_MST ic_user_type_mst) {

		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_type_mst.getUSERS_TYPE(), ic_user_type_mst.getUSER_TYPE_DESC(),
						ic_user_type_mst.getSTATUS(), ic_user_type_mst.getUSER_TYPE_ID());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_USER_TYPE_MST singleIC_USER_TYPE_MST(int id) {

		IC_USER_TYPE_MST singleIC_USER_TYPE_MST = new IC_USER_TYPE_MST();

		Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USER_TYPE_MST = new IC_USER_TYPE_MST(jsonData.getString("USERS_TYPE"),
					jsonData.getString("USER_TYPE_DESC"), jsonData.getString("STATUS"),
					jsonData.getString("USER_TYPE_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USER_TYPE_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICUserTypeMst(IC_USER_TYPE_MST ic_user_type_mst) {

		Map<String, Object> result = getAllStatesJdbcCall33.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_type_mst.getUSERS_TYPE(), ic_user_type_mst.getUSER_TYPE_DESC(),
						ic_user_type_mst.getSTATUS(), Integer.valueOf(ic_user_type_mst.getUSER_TYPE_ID()));

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUserTypeMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall34.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}
}
