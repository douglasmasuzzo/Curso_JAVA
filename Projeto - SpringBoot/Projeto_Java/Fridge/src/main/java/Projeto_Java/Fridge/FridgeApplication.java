package Projeto_Java.Fridge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeApplication.class, args);
	}
}

// ** CÓDIGO
//  -> INSERT INTO CONTROLE_COMIDA( prato, quantidade, preco )
//  -> VALUES ( 'string' , 'valor', 'valor' );
//  -> SELECT * FROM CONTROLE_COMIDA
