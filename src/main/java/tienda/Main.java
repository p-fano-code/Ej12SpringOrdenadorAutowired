package tienda;

import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Ordenador o1 = context.getBean("ordenador", Ordenador.class);
		System.out.println(o1);
		System.out.println("El coste total del ordenador es de "+o1.calcularPrecioComponentes(o1)+" €");
		DaoOrdenador.crearFicheroOrdenador(o1);
		
	}

}
