package com.ktds.ronanam.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.ronanam.dao.support.JDBCDaoSupport;
import com.ktds.ronanam.dao.support.QueryHandler;
import com.ktds.ronanam.dao.support.annotation.BindData;
import com.ktds.ronanam.hr.vo.CountriesVO;
import com.ktds.ronanam.hr.vo.DepartmentsVO;
import com.ktds.ronanam.hr.vo.EmployeesVO;
import com.ktds.ronanam.hr.vo.JobsVO;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {

	// 인터페이스 객체화는 아래와 같이한다. 익명클래스로! (anomynous)
	@Override
	public List<EmployeesVO> getAllEmployees() {

		// 인터페이스: 특징 -> 구현이 안되어있고 정의만 되어있다.
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
//				String query = " SELECT  " + " EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
//						+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
//						+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";
//				return query;
				StringBuffer query = new StringBuffer();
				
				query.append(" SELECT EMPLOYEE_ID   " );
				query.append(" ,FIRST_NAME    ");
				query.append(" ,LAST_NAME     ");
				query.append(" ,EMAIL         ");
				query.append(" ,PHONE_NUMBER  ");
				query.append(" ,HIRE_DATE     ");
				query.append(" ,JOB_ID        ");
				query.append(" ,SALARY        ");
				query.append(" ,COMMISSION_PCT");
				query.append(" ,MANAGER_ID    ");
				query.append(" ,DEPARTMENT_ID ");
				query.append(" FROM EMPLOYEES      ");
				
				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException{
				//쿼리에 파라미터가 있다면 만들어준다.
				
			
			}

			@Override
			public Object getData(ResultSet rs) { //하나의 row를 정제하는 객체
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}

		});

		// try {
		//
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		// } catch (ClassNotFoundException e) {
		// System.out.println("오라클 드라이버 오류.");
		// return null;
		// }
		//
		// Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		// PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		// ResultSet rs = null; // 결과를 받아옴.
		//
		// String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		// try {
		// conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
		// String query =
		//
		// " SELECT " + " EMPLOYEE_ID, FIRST_NAME, LAST_NAME, " + " EMAIL,
		// PHONE_NUMBER, HIRE_DATE, "
		// + " JOB_ID, SALARY, COMMISSION_PCT, " + " MANAGER_ID, DEPARTMENT_ID "
		// + " FROM HR.EMPLOYEES ";
		//
		// stmt = conn.prepareStatement(query);
		//
		// rs = stmt.executeQuery();
		//
		// EmployeesVO employeesVO = null;
		// List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
		// while (rs.next()) {
		// // rs.previous() // 역출력 이런거 쓰지 x DB에서 차라리 oder by로 해주면 됨
		//
		// employeesVO = new EmployeesVO();
		// employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		// employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
		// employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
		// employeesVO.setEmail(rs.getString("EMAIL"));
		// employeesVO.setFirstName(rs.getString("FIRST_NAME"));
		// employeesVO.setHireDate(rs.getString("HIRE_DATE"));
		// employeesVO.setJobId(rs.getString("JOB_ID"));
		// employeesVO.setLastName(rs.getString("LAST_NAME"));
		// employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
		// employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
		// employeesVO.setSalary(rs.getInt("SALARY"));
		//
		// employees.add(employeesVO);
		// }
		//
		// return employees;
		//
		// } catch (SQLException e) {
		// System.out.println("오라클 접속 에러");
		// return null;
		// } finally {
		// try {
		// if (rs != null) {
		// rs.close();
		// }
		// } catch (SQLException e) {
		// }
		// try {
		// if (stmt != null) {
		// stmt.close();
		// }
		// } catch (SQLException e) {
		// }
		// try {
		// if (conn != null) {
		// conn.close();
		// }
		// } catch (SQLException e) {
		// }
		// }

	}

	@Override
	public List<EmployeesVO> getJoinEmployeesDepartments() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			return null;
		}

		Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		ResultSet rs = null; // 결과를 받아옴.

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			String query =

					" SELECT  " + " E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
							+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  "
							+ "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  " + "   E.MANAGER_ID, "
							+ " E.DEPARTMENT_ID E_DEPARTMENT_ID, " + "D.DEPARTMENT_ID D_DEPARTMENT_ID, "
							+ " D.DEPARTMENT_NAME, " + " D.MANAGER_ID D_MANAGER_ID, " + "D.LOCATION_ID "
							+ " FROM HR.EMPLOYEES E, " + " DEPARTMENTS D "
							+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				employeesVO = new EmployeesVO();
				// employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				// employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				// employeesVO.setDepartmentId(rs.getInt("E_DEPARTMENT_ID"));
				// employeesVO.setEmail(rs.getString("EMAIL"));
				// employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				// employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				// employeesVO.setJobId(rs.getString("JOB_ID"));
				// employeesVO.setLastName(rs.getString("LAST_NAME"));
				// employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				// employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				// employeesVO.setSalary(rs.getInt("SALARY"));
				// .으로 연결 : 데이터 채이닝 채이닝을 하기 때문에 getter에서 null인지
				// 아닌지 체크하는 if 구현
				// 채이닝은 한 스텝 정도로만.. ! 끊는다는 의미는?
				// 채이닝이 너무 길면 객체로 빼서 정리하기.
				// DepartmentsVO departmentsVO = null;
				// departmentsVO = employeesVO.getDepartments();
				// departmentsVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				// //
				// employeesVO.getDepartments().setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				// departmentsVO.setDapartmentName(rs.getString("DEPARTMENT_NAME"));
				// departmentsVO.setManagerId(rs.getInt("MANAGER_ID"));
				// departmentsVO.setLocationId(rs.getInt("LOCATION_ID"));
				//
				employees.add(employeesVO);
				BindData.bindData(rs, employeesVO);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속 에러");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			return null;
		}

		Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		ResultSet rs = null; // 결과를 받아옴.

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			String query =

					" SELECT  " + " E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
							+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  "
							+ "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
							+ "   E.MANAGER_ID, E.DEPARTMENT_ID E_DEPARTMENT_ID, "

							+ "D.DEPARTMENT_ID D_DEPARTMENT_ID, "
							+ " D.DEPARTMENT_NAME,  D.MANAGER_ID D_MANAGER_ID, D.LOCATION_ID, "

							+ " J.JOB_ID, J.JOB_TITLE, J.MIN_SALARY, J.MAX_SALARY"

							+ " FROM  EMPLOYEES E,  DEPARTMENTS D, JOBS J " + " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID"
							+ " AND E.JOB_ID = J.JOB_ID";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setDepartmentId(rs.getInt("E_DEPARTMENT_ID"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setSalary(rs.getInt("SALARY"));

				DepartmentsVO departmentsVO = null;

				departmentsVO = employeesVO.getDepartments();
				departmentsVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				departmentsVO.setDapartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentsVO.setManagerId(rs.getInt("MANAGER_ID"));
				departmentsVO.setLocationId(rs.getInt("LOCATION_ID"));

				JobsVO jobsVO = null;
				jobsVO = employeesVO.getJob();
				jobsVO.setJobId(rs.getString("JOB_ID"));
				jobsVO.setJobTitle(rs.getString("JOB_TITLE"));
				jobsVO.setMinSalary(rs.getInt("MIN_SALARY"));
				jobsVO.setMaxSalary(rs.getInt("MAX_SALARY"));

				employees.add(employeesVO);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속 에러");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}
	}

	@Override
	public List<CountriesVO> getJoinCountriesRegions() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 접속 x");
		}

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String orcleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(orcleUrl, "HR", "hr");
			String query = " SELECT  C.COUNTRY_ID " + "        ,C.COUNTRY_NAME  " + "                ,R.REGION_ID "
					+ "        ,R.REGION_NAME  " + " FROM    COUNTRIES C , " + "        REGIONS R  "
					+ " WHERE   C.REGION_ID = R.REGION_ID  ";

			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();

			CountriesVO countriesVO = null;
			List<CountriesVO> country = new ArrayList<CountriesVO>();
			while (rs.next()) {
				countriesVO = new CountriesVO();
				countriesVO.setCountryId(rs.getString("COUNTRY_ID"));
				countriesVO.setCountryName(rs.getString("COUNTRY_NAME"));

				countriesVO.getRegionsVO().setName(rs.getString("REGION_NAME"));
				countriesVO.getRegionsVO().setRegionId(rs.getInt("REGION_ID"));
				country.add(countriesVO);
			}

			return country;

		} catch (SQLException e) {
			e.getStackTrace();
			System.out.println("오라클 연동 x");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}

			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
			}
		}
	}

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {
		
		return (EmployeesVO) selectOne(new QueryHandler() {
			
			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT  EMPLOYEE_ID ");
				query.append("        ,FIRST_NAME ");
				query.append("        ,LAST_NAME ");
				query.append("        ,EMAIL ");
				query.append("        ,PHONE_NUMBER ");
				query.append("        ,HIRE_DATE ");
				query.append("        ,JOB_ID ");
				query.append("        ,SALARY ");
				query.append("        ,COMMISSION_PCT ");
				query.append("        ,MANAGER_ID ");
				query.append("        ,DEPARTMENT_ID ");
				query.append(" FROM    EMPLOYEES ");
				query.append(" WHERE   EMPLOYEE_ID = ? ");
				return query.toString();
			}
			
			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, employeeId);
			}
			
			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
		});
		
		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("오라클 드라이버 접속 error");
//			e.printStackTrace(); // error 추적하기 편하라고. 실무에서는 해킹 때문에 x
//			return null;
//		}
//
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//
//		try {
//
//			// String : 불변(데이터 재할당) / StringBuffer: 가변
//			String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
//			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
//			StringBuffer query = new StringBuffer();
//			query.append(" SELECT  EMPLOYEE_ID ");
//			query.append("        ,FIRST_NAME ");
//			query.append("        ,LAST_NAME ");
//			query.append("        ,EMAIL ");
//			query.append("        ,PHONE_NUMBER ");
//			query.append("        ,HIRE_DATE ");
//			query.append("        ,JOB_ID ");
//			query.append("        ,SALARY ");
//			query.append("        ,COMMISSION_PCT ");
//			query.append("        ,MANAGER_ID ");
//			query.append("        ,DEPARTMENT_ID ");
//			query.append(" FROM    EMPLOYEES ");
//			query.append(" WHERE   EMPLOYEE_ID = ? ");
//			// query.append(" WHERE EMPLOYEE_ID IN (?,?)") IN의 뜻이 or니까 0~2개
//
//			// stmt = conn.prepareStatement(query);
//			// Buffer: 임시 공간. 메모리에 String을 계속 붙이다가 toString()을 붙이는 순간 String으로!
//			stmt = conn.prepareStatement(query.toString());
//
//			// Index가 0부터 시작되는 것은 배열, 리스트 뿐이고, 나머지는 다 1부터 시작한다.
//			// 아래와 같은 코드를 써주지 않으면 binding error 발생
//			stmt.setInt(1, employeeId);
//
//			rs = stmt.executeQuery();
//			EmployeesVO employeesVO = null;
//			if (rs.next()) {// "데이터가 있다면"의 뜻
//				// rs.next()는 while이나 if가 필요해. 근데 데이터가 1줄이면 if 문 사용
//				// employeesVO = new EmployeesVO();
//				// employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
//				// employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
//				// employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
//				// employeesVO.setEmail(rs.getString("EMAIL"));
//				// employeesVO.setFirstName(rs.getString("FIRST_NAME"));
//				// employeesVO.setHireDate(rs.getString("HIRE_DATE"));
//				// employeesVO.setJobId(rs.getString("JOB_ID"));
//				// employeesVO.setLastName(rs.getString("LAST_NAME"));
//				// employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
//				// employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
//				// employeesVO.setSalary(rs.getInt("SALARY"));
//
//				employeesVO = new EmployeesVO();
//				// rs를 employeesVO에 넣어주겠다.
//				BindData.bindData(rs, employeesVO);
//			}
//
//			return employeesVO;
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("오라클 연동 error");
//			return null;
//		} finally {
//			try {
//				rs.close();
//			} catch (SQLException e) {
//			}
//			try {
//				stmt.close();
//			} catch (SQLException e) {
//			}
//			try {
//				conn.close();
//			} catch (SQLException e) {
//			}
//		}
	}
}
