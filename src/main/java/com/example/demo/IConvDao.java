package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;

@Repository
public class IConvDao {
	@Autowired
	private JdbcTemplate jdbcTemplete;
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

	SimpleJdbcCall getAllStatesJdbcCall55;
	SimpleJdbcCall getAllStatesJdbcCall56;
	SimpleJdbcCall getAllStatesJdbcCall57;
	SimpleJdbcCall getAllStatesJdbcCall58;
	SimpleJdbcCall getAllStatesJdbcCall59;
	SimpleJdbcCall getAllStatesJdbcCall60;
	SimpleJdbcCall getAllStatesJdbcCall61;
	SimpleJdbcCall getAllStatesJdbcCall62;
	SimpleJdbcCall getAllStatesJdbcCall63;

	public IConvDao(DataSource dataSource) {
		// TODO Auto-generated method stub
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

		this.getAllStatesJdbcCall55 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall56 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall57 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall58 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall59 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall60 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall61 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall62 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall63 = new SimpleJdbcCall(dataSource);
	}

	public int insert_usage_cat_code(UsageCatCode usageCatCode) {
		if (usageCatCode.getStatus() == null) {
			usageCatCode.setStatus("0");
		}
		System.out.println(usageCatCode);
		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(usageCatCode.getUsageCatCode(), usageCatCode.getUsageCatName(), usageCatCode.getUsageType(),
						usageCatCode.getLineType(), usageCatCode.getAreaCode());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<UsagArea> showAreaName() {
		ArrayList<UsagArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("USAGE_INFO").withProcedureName("AREA_NAME")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new UsagArea(jsonData.getString("AREA_CODE"), jsonData.getString("AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<LineType> showLine() {
		ArrayList<LineType> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("USAGE_INFO").withProcedureName("LINETYPE")
				.declareParameters(new SqlOutParameter("LINEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LINEDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LineType(jsonData.getString("LINE_TYPE"), jsonData.getString("LINE_TYPE_NAME")));
		}
		return showList;
	}

	public ArrayList<ShowUsage> showUsage() {
		ArrayList<ShowUsage> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("USAGE_INFO")
				.withProcedureName("SHOW_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("USAGEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("USAGEDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ShowUsage(Integer.valueOf(jsonData.getString("USAGE_CAT_ID")),
					jsonData.getString("USAGE_CAT_CODE"), jsonData.getString("USAGE_CAT_NAME"),
					jsonData.getString("USAGE_TYPE"), jsonData.getString("LINE_TYPE_NAME"),
					jsonData.getString("AREA_NAME")));
		}
		return showList;
	}

	public int deleteUsage(int usageCatId) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(usageCatId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	String lines;
	String area;

	public ArrayList<EditUsage> editUsage(int useCatId) {
		ArrayList<EditUsage> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("USAGE_INFO").withProcedureName("EDIT_USAGE")
				.declareParameters(new SqlOutParameter("USAGEEDIT", OracleTypes.CURSOR)).execute(useCatId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("USAGEEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new EditUsage(Integer.valueOf(jsonData.getString("USAGE_CAT_ID")),
					jsonData.getString("USAGE_CAT_CODE"), jsonData.getString("USAGE_CAT_NAME"),
					jsonData.getString("USAGE_TYPE"), jsonData.getString("LINE_TYPE"), jsonData.getString("AREA_CODE"),
					jsonData.getString("LINE_TYPE_NAME"), jsonData.getString("AREA_NAME")));
		}
		lines = showList.get(0).getUsageLineCode();
		area = showList.get(0).getUsageType();

		System.out.println(lines);
		System.out.println(area);

		return showList;
	}

	public int update_usage_cat_code(UsageCatCode usageCatCode, int id) {
		if (usageCatCode.getAreaCode() == null) {
			usageCatCode.setAreaCode(area);
		}

		if (usageCatCode.getLineType() == null) {
			usageCatCode.setLineType(lines);
		}

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(usageCatCode.getUsageCatCode(), usageCatCode.getUsageCatName(), usageCatCode.getUsageType(),
						usageCatCode.getLineType(), usageCatCode.getAreaCode(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationShow> locationShow() {
		ArrayList<LocationShow> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_MASTER_LIST")
				.declareParameters(new SqlOutParameter("LOCDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationShow(Integer.valueOf(jsonData.getString("LOCATION_ID")),
					jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int insert_location_master(LocationInsert locationInsert) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public int deleteLocation(int locationId) {

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationInsert> locationEdit(int locationId) {
		ArrayList<LocationInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("EDIT_LOCATION")
				.declareParameters(new SqlOutParameter("LOCEDIT", OracleTypes.CURSOR)).execute(locationId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationInsert(jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int location_update(LocationInsert locationInsert, int locationId) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_LOCATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),
						locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<Area> areaShow() {
		ArrayList<Area> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_LIST")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Area(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("GEN_AREA_ID"))));
		}
		return showList;
	}

	public int insert_area(LocationInsert locationInsert) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("C");
		}
		System.out.println(locationInsert);

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);
		return val;
	}

	public int deleteArea(int areaId) {

		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(areaId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationInsert> areaEdit(int areaId) {
		ArrayList<LocationInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("USAGE_INFO")
				.withProcedureName("EDIT_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("AREAEDIT", OracleTypes.CURSOR)).execute(areaId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREAEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationInsert(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int areaUpdate(LocationInsert locationInsert, int areaId) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),
						areaId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<PowerPlantList> powerPlantShow() {
		ArrayList<PowerPlantList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_POWER_PLANT_LIST")
				.declareParameters(new SqlOutParameter("PLANTDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PLANTDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantList(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME"),
					Integer.valueOf(jsonData.getString("NO_OF_UNIT")),
					Double.valueOf(jsonData.getString("INSTALLED_CAPACITY")),
					Double.valueOf(jsonData.getString("MAX_CAPACITY")), jsonData.getString("GRID_CODE"),
					jsonData.getString("GRID_DESC"), jsonData.getString("STATUS"), jsonData.getString("OWNER_CODE"),
					jsonData.getString("OWNER_NAME"), jsonData.getString("SHORT_NAME"),
					jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					Integer.valueOf(jsonData.getString("PP_ID"))));
		}
		return showList;
	}

	public ArrayList<GenArea> genAreaLists() {
		ArrayList<GenArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("USAGE_INFO")
				.withProcedureName("GENAREALIST").declareParameters(new SqlOutParameter("GENAREA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GENAREA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GenArea(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<PPOwnerList> ppOwnerLists() {
		ArrayList<PPOwnerList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("USAGE_INFO")
				.withProcedureName("PPOWNERLIST").declareParameters(new SqlOutParameter("PODATA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PPOwnerList(jsonData.getString("OWNER_CODE"), jsonData.getString("OWNER_NAME")));
		}
		return showList;
	}

	public ArrayList<GridList> gridLists() {
		ArrayList<GridList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("USAGE_INFO").withProcedureName("GRIDLIST")
				.declareParameters(new SqlOutParameter("GRIDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GRIDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GridList(jsonData.getString("GRID_CODE"), jsonData.getString("GRID_DESC")));
		}
		return showList;
	}

	public int insert_power_plant(PowerPlantInsert powerPlantInsert) {
		if (powerPlantInsert.getStatus() == null) {
			powerPlantInsert.setStatus("C");
		}

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(powerPlantInsert.getPowerPointCode(), powerPlantInsert.getPowerPointName(),
						powerPlantInsert.getNoOfUnit(), powerPlantInsert.getInstallenCapacity(),
						powerPlantInsert.getGridCode(), powerPlantInsert.getOwnerCode(),
						powerPlantInsert.getGenAreaCode(), powerPlantInsert.getMaxCapacity(),
						powerPlantInsert.getShortName(), powerPlantInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PowerPlantList> powerPlantEdits(String ppCode) {
		ArrayList<PowerPlantList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_POWER_PLANT_EDIT")
				.declareParameters(new SqlOutParameter("PPDATA", OracleTypes.CURSOR)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PPDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantList(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME"),
					Integer.valueOf(jsonData.getString("NO_OF_UNIT")),
					Double.valueOf(jsonData.getString("INSTALLED_CAPACITY")),
					Double.valueOf(jsonData.getString("MAX_CAPACITY")), jsonData.getString("GRID_CODE"),
					jsonData.getString("GRID_DESC"), jsonData.getString("STATUS"), jsonData.getString("OWNER_CODE"),
					jsonData.getString("OWNER_NAME"), jsonData.getString("SHORT_NAME"),
					jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					Integer.valueOf(jsonData.getString("PP_ID"))));
		}
		return showList;
	}

	public int update_power_plant(PowerPlantInsert powerPlantInsert, String id, String genACode, String OwnerCode,
			String gridCode) {
		if (powerPlantInsert.getStatus() == null) {
			powerPlantInsert.setStatus("YES");
		}
		if (powerPlantInsert.getGenAreaCode() == null) {
			powerPlantInsert.setGenAreaCode(genACode);
		}
		if (powerPlantInsert.getOwnerCode() == null) {
			powerPlantInsert.setOwnerCode(OwnerCode);
		}
		if (powerPlantInsert.getGridCode() == null) {
			powerPlantInsert.setGridCode(gridCode);
		}

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(powerPlantInsert.getPowerPointName(), powerPlantInsert.getNoOfUnit(),
						powerPlantInsert.getInstallenCapacity(), powerPlantInsert.getGridCode(),
						powerPlantInsert.getOwnerCode(), powerPlantInsert.getGenAreaCode(),
						powerPlantInsert.getMaxCapacity(), powerPlantInsert.getShortName(),
						powerPlantInsert.getStatus(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deletePowerPoint(String ppCode) {

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<DemandPhaseList> demandPhaseLists() {
		ArrayList<DemandPhaseList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_LIST")
				.declareParameters(new SqlOutParameter("DEMANDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("DEMANDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new DemandPhaseList(jsonData.getString("DP_CODE"), jsonData.getString("DEMAND_PHASE"),
					Integer.valueOf(jsonData.getString("SRL_NO")), jsonData.getString("STATUS"),
					Integer.valueOf(jsonData.getString("DP_ID"))));
		}

		return showList;
	}

	public int demandPhaseInsert(DemandPhaseInsert demandPhaseInsert) {
		if (demandPhaseInsert.getStatus() == null) {
			demandPhaseInsert.setStatus("YES");
		}
		System.out.println(demandPhaseInsert);

		Map<String, Object> result = getAllStatesJdbcCall27.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(demandPhaseInsert.getDpCode(), demandPhaseInsert.getDemandPhase(),
						demandPhaseInsert.getSrlNo(), demandPhaseInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<DemandPhaseList> demandPhaseEdit(String demandCode) {
		ArrayList<DemandPhaseList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_EDIT")
				.declareParameters(new SqlOutParameter("DPMDATA", OracleTypes.CURSOR)).execute(demandCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("DPMDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new DemandPhaseList(jsonData.getString("DP_CODE"), jsonData.getString("DEMAND_PHASE"),
					Integer.valueOf(jsonData.getString("SRL_NO")), jsonData.getString("STATUS"),
					Integer.valueOf(jsonData.getString("DP_ID"))));
		}
		return showList;
	}

	public int demandPhaseUpdate(DemandPhaseInsert demandPhaseInsert) {
		if (demandPhaseInsert.getStatus() == null) {
			demandPhaseInsert.setStatus("YES");
		}

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(demandPhaseInsert.getDemandPhase(), demandPhaseInsert.getSrlNo(),
						demandPhaseInsert.getStatus(), demandPhaseInsert.getDpCode());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteDemandPhase(String demandCode) {
		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(demandCode);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<ActivityList> activityListShow() {
		ArrayList<ActivityList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_LIST")
				.declareParameters(new SqlOutParameter("ACTIVITYDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("ACTIVITYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityList(Integer.valueOf(jsonData.getString("ACTIVITY_ID")),
					jsonData.getString("ACTIVITY_CODE"), jsonData.getString("ACTIVITY_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int insert_activity(ActivityInsert activityInsert) {
		if (activityInsert.getStatus() == null) {
			activityInsert.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<ActivityInsert> activityedit(int activityId) {
		ArrayList<ActivityInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_EDIT")
				.declareParameters(new SqlOutParameter("ACTIDATA", OracleTypes.CURSOR)).execute(activityId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("ACTIDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityInsert(jsonData.getString("ACTIVITY_CODE"), jsonData.getString("ACTIVITY_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int updateActivity(ActivityInsert activityInsert, int activityId) {
		if (activityInsert.getStatus() == null) {
			activityInsert.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus(),
						activityId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteActivity(int activityId) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(activityId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<PeriodList> periodListShow() {
		ArrayList<PeriodList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall55.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IC_PERIOD_MST")
				.declareParameters(new SqlOutParameter("PEROPDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PEROPDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PeriodList(jsonData.getString("YEAR_CODE"), jsonData.getString("PERIOD_CODE"),
					jsonData.getString("PERIOD_DESC"), jsonData.getString("FROM_DATE"), jsonData.getString("TO_DATE"),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("PR_ID"))));
		}

		return showList;
	}

	public ArrayList<IppPaymentList> ippPaymentList(String billCycleCode) {
		ArrayList<IppPaymentList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall56.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("PAYDATA", OracleTypes.CURSOR)).execute(billCycleCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IppPaymentList(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME"), jsonData.getString("ENRG_PURCHASED"),
					jsonData.getString("PAY_AMOUNT"), jsonData.getString("PAY_DATE"),
					Integer.valueOf(jsonData.getString("IPP_PAY_ID")), jsonData.getString("STATUS")));
		}
		return showList;
	}

	public ArrayList<PowerPlantDropdown> pppDropdown(String billCycleCode) {
		ArrayList<PowerPlantDropdown> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall57.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_POWER_PLANT_DROPDOWN")
				.declareParameters(new SqlOutParameter("PDDATA", OracleTypes.CURSOR)).execute(billCycleCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantDropdown(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME")));
		}

		return showList;
	}

	public int insertPppPayment(InsertIppPayment insertIppPayment) {
		if (insertIppPayment.getStatus() == null) {
			insertIppPayment.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall58.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertIppPayment.getBillCycleCode(), insertIppPayment.getPpCode(),
						insertIppPayment.getEngrPurchased(), insertIppPayment.getPayAmount(),
						insertIppPayment.getPayDate(), insertIppPayment.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PpModList> ppModListListShow(String periodCode) {
		ArrayList<PpModList> ppModList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall59.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MOD_DATA").declareParameters(new SqlOutParameter("MODATA", OracleTypes.CURSOR))
				.execute(periodCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList.add(new PpModList(Integer.valueOf(jsonData.getString("PP_MOD_ID")),
					jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("STATUS"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME")));
		}
		return ppModList;
	}

	public int insertPpMod(InsertPpMod insertPpMod) {
		if (insertPpMod.getStatus() == null) {
			insertPpMod.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall60.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertPpMod.getBillCycleCode(), insertPpMod.getPpCode(), insertPpMod.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteIcPpPayment(int id) {

		Map<String, Object> result = getAllStatesJdbcCall61.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<IcPpPaymentEdit> icPaymentEdit(int iPpPayId) {
		ArrayList<IcPpPaymentEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall62.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_EDIT")
				.declareParameters(new SqlOutParameter("PAYMENTDATA", OracleTypes.CURSOR)).execute(iPpPayId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYMENTDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IcPpPaymentEdit(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_NAME"),
					jsonData.getString("ENRG_PURCHASED"), Integer.valueOf(jsonData.getString("PAY_AMOUNT")),
					jsonData.getString("STATUS")));
		}

		return showList;
	}

	public int updatePayment(IcPpPaymentEdit icPpPaymentEdit, int payId) {
		if (icPpPaymentEdit.getStatus() == null) {
			icPpPaymentEdit.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall63.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(icPpPaymentEdit.getPayAmount(), icPpPaymentEdit.getEnrgPuchansed(),
						icPpPaymentEdit.getStatus(), payId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

}
