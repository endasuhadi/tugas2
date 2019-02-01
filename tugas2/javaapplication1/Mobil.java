package javaapplication1;
public class Mobil{

	public static int kec, gigi, kecAktual;
	
	void start(){
		this.kec = 10;
		System.out.println("Mobil dijalankan.");
	}

	void stop(){
		kec = 0;
                System.out.println("Mobil berhenti.");
	}
	
	void rem(){
                System.out.println("Mobil direm. kecepatan berkurang dari "+kec+" menjadi "+kec/2);
	}

	void gas(){
		if(kec == 0){
			System.out.println("Mobil belum jalan.");
		}else{
                    if(gigi < 2){
                        System.out.println("Mobil digas. kecepatan " + kec + "km/j" );
                    }else{
                        System.out.println("Mobil digas. kecepatan " + kec*gigi + "km/j" );
                        this.kec = kec*gigi;
                    }
		}
	}

	void gantiGigi(int gigi){
		this.gigi = gigi;
                System.out.println("Ganti gigi, mobil pada gigi: "+gigi );
	}
	
	public static void main (String[] Args){
		Mobil mobil = new Mobil();
		mobil.start();
		mobil.gas();
		mobil.gantiGigi(2);
		mobil.gas();
		mobil.rem();
		mobil.stop();
                mobil.gas();
	}
        
        /*outputnya 
        Mobil dijalankan.
        Mobil digas. kecepatan 10km/j
        Ganti gigi, mobil pada gigi: 2
        Mobil digas. kecepatan 20km/j
        Mobil direm. kecepatan berkurang dari 20 menjadi 10
        Mobil berhenti.
        Mobil belum jalan.
        */

}
