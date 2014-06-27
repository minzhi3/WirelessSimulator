package sim;

public class Signal{
	int idFrom;
	String contentString;
	int countDown;
	public Signal(int id,String s,int l){
		this.idFrom=id;
		this.contentString=s;
		this.countDown=l;
	}
}