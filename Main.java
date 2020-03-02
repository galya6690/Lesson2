package com.gmail.galya6690;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


import java.io.File;


public class Main {
    public static void main(String[] args) {
     ValCurs valCurs=new ValCurs();
     valCurs.add(new Valute(66,"first",77,"element",8.9));
     valCurs.add(new Valute(55,"last",66,"element",1));

     try {
        File file=new File("C://Users//Galinka//Desktop//mydoc//100.txt");
        JAXBContext  jaxbContext = JAXBContext.newInstance(ValCurs.class);
         Marshaller marshaller = jaxbContext.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
         marshaller.marshal(valCurs,file);
         marshaller.marshal(valCurs,System.out);
         Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();
         valCurs=(ValCurs)unmarshaller.unmarshal(file);
         System.out.println(valCurs);
     }
    catch (JAXBException e){
      e.printStackTrace();
     }

}
}