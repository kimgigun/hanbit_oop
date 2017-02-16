package hospital;

public class Bmi extends Treatment {
	private double cm,kg;
	
	public void setCm(double cm){
		this.cm=cm;
	}
	public double getCm(){
		return cm;
	}
	public void setKg(double kg){
		this.kg=kg;
	}
	public double getKg(){
		return kg;
	}
	@Override
	public String treat() {
			String result = "";
			double bmi = kg / (cm  * cm );
			if (bmi > 30.0) {
				result = "고도비만";
			} else if (bmi > 25.0) {
				result = "비만";
			} else if (bmi > 23.0) {
				result = "과체중";
			} else if (bmi > 18.5) {
				result = "정상";
			} else {
				result = "저체중";
			}
			return result;
		} 
	}
