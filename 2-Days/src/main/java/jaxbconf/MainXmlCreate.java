package jaxbconf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainXmlCreate {
	
	public static void main(String[] args) throws JAXBException, IOException {
		ProductWrapper productWrapper= new ProductWrapper();
		ProductDTO dto=new ProductDTO();
		productWrapper.setProducts(dto.result());
		
		JAXBContext context=JAXBContext.newInstance(ProductWrapper.class);

		//console
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(productWrapper, System.out);
		
		//xml üretim
		File file=new File("product.xml");
		FileWriter fileWriter=new FileWriter(file);
		marshaller.marshal(productWrapper, fileWriter);		
		
	}
}
