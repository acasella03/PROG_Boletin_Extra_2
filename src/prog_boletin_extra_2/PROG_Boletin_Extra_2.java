package prog_boletin_extra_2;

public class PROG_Boletin_Extra_2 {

    public static void main(String[] args) {
        Cuenta obj1=new Cuenta ("Angi Casella","123456789",0,1000);
        Cuenta obj2=new Cuenta ("Francisco Sánchez","987654321",0,500);      
        
        System.out.println("El saldo de la cuenta de "+obj1.getNombre()+" es: "+obj1.getSaldo());
        System.out.println("El saldo de la cuenta de "+obj2.getNombre()+" es: "+obj2.getSaldo());
        
        obj1.transferencia(obj2, 450);
        System.out.println("Transferencia de 450");
        
        System.out.println("El saldo de la cuenta de "+obj1.getNombre()+" es: "+obj1.getSaldo());
        System.out.println("El saldo de la cuenta de "+obj2.getNombre()+" es: "+obj2.getSaldo());
        
    }
    
}
