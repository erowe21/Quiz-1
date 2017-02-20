package passerRating;

public class QBR {

	private double Touchdowns;
	private double Yards;
	private double Completions;
	private double PassAttempts;
	private double Interceptions;
	public QBR(double touchdowns, double yards, double completions,double passattempts, double interceptions) {
		Touchdowns = touchdowns;
		Yards = yards;
		Completions = completions;
		PassAttempts = passattempts;
		Interceptions = interceptions;
	}
	public double getTouchdowns() {
		return Touchdowns;
	}
	public double getYards() {
		return Yards;
	}
	public double getCompletions() {
		return Completions;
	}
	public double getPassAttempts() {
		return PassAttempts;
	}
	public double getInterceptions() {
		return Interceptions;
	}
	public double part1() {
		return (((Completions/PassAttempts)-.3) * 5);
	}
	public double part2() {
		return (((Yards/PassAttempts)-3) * .25);
	}
	public double part3() {
		return ((Touchdowns/PassAttempts) * 20);
	}
	public double part4() {
		return (2.375-((Interceptions/PassAttempts)*25));
	}
	public double Qbr() 
	{
		return ((part1()+part2()+part3()+part4())/6) *100; 
	}
	
}

