package Session3;

	import java.sql.Date;

	public class Empleado {

	    private int empNo;
	    private String nombre;
	    private String trabajo;
	    private int mgr;
	    private Date fechaAntiguedad;
	    private double salario;
	    private double comision;
	    private int deptNo;

	    public Empleado() {
	        // Constructor vacío
	    }

	    public Empleado(int empNo, String nombre, String trabajo, int mgr, Date fechaAntiguedad, double salario,
	        double comision, int deptNo) {
	        this.empNo = empNo;
	        this.nombre = nombre;
	        this.trabajo = trabajo;
	        this.mgr = mgr;
	        this.fechaAntiguedad = fechaAntiguedad;
	        this.salario = salario;
	        this.comision = comision;
	        this.deptNo = deptNo;
	    }

	    public int getEmpNo() {
	        return empNo;
	    }

	    public void setEmpNo(int empNo) {
	        this.empNo = empNo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getTrabajo() {
	        return trabajo;
	    }

	    public void setTrabajo(String trabajo) {
	        this.trabajo = trabajo;
	    }

	    public int getMgr() {
	        return mgr;
	    }

	    public void setMgr(int mgr) {
	        this.mgr = mgr;
	    }

	    public Date getFechaAntiguedad() {
	        return fechaAntiguedad;
	    }

	    public void setFechaAntiguedad(Date fechaAntiguedad) {
	        this.fechaAntiguedad = fechaAntiguedad;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public double getComision() {
	        return comision;
	    }

	    public void setComision(double comision) {
	        this.comision = comision;
	    }

	    public int getDeptNo() {
	        return deptNo;
	    }

	    public void setDeptNo(int deptNo) {
	        this.deptNo = deptNo;
	    }

	    @Override
	    public String toString() {
	        return "Empleado [empNo=" + empNo + ", nombre=" + nombre + ", trabajo=" + trabajo + ", mgr=" + mgr
	                + ", fechaAntiguedad=" + fechaAntiguedad + ", salario=" + salario + ", comision=" + comision
	                + ", deptNo=" + deptNo + "]";
	    }

	}



