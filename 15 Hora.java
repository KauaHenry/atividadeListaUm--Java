public class Hora {
	private int hora;
	private int min;
	public Hora (int h, int m) {
		this.hora = h;
		this.min = m;
		
	}
	public int getHora () {
		return hora;
		
	}
	public int getMin ( ) {
		return min;
	
	}

    public void setHora (int h) {
    	this.hora = h;
    }
    
    public void setMin (int m) {
    	this.min = m;
    }
    
    public String print () {
    	return hora + ":" + min;
    }
    
}
