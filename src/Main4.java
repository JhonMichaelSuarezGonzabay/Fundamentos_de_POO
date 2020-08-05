
public class Main4 {

	public static void subirVolumen(Tv tv) {
		// TODO Auto-generated method stub
		tv.subirVolumen();

	}
	public static void subirVolumen(int volumen) {
		volumen = volumen + 10;
	}

	public static void main(String [] args) {
		//varibale por valor o primitivas int, float, double, char
		//Variable por referencia u objeto creados por new
		int volumen = 100;
		Tv tv1 = new Tv();
		tv1.encender();
		tv1.subirVolumen();
		tv1.subirVolumen();
		
		subirVolumen(volumen);
		subirVolumen(tv1);
		
		System.out.println(volumen);
		System.out.println(tv1.volumen);
	}
}
