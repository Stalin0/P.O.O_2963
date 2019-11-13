package ec.edu.espe.demo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.util.Person;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @GetMapping
    public String hello(){
        return "HOLA MUNDO SOY EL SERVICIO REST";
    }
    @GetMapping("/goodbye")
    public String goodBye(){
        return "ADIOS!!!!!!!!!!!!";
    }
    @GetMapping(value = "/callme/{name}/{age}/{dni}")
    public Person name(@PathVariable String name,@PathVariable int age, @PathVariable String dni ){
        return new Person(name, age, main(dni));
    }

    public  String main(String dni) {
       
        String cedula=dni;
        int c, suma=0, acum, resta=0;
        
        for (int i = 0; i < cedula.length()-1; i++) {
            c=Integer.parseInt(cedula.charAt(i)+"");
            if(i%2==0){
                c=c*2;
                if(c>9){
                    c=c-9;
                }
            }
            
            suma=suma+c;
        }
        
        if (suma%10 !=0) {
            acum=((suma/10)+1)*10;
            resta=acum-suma;
        }
        
        int ultimo=Integer.parseInt(cedula.charAt(9)+"");
        
        if (ultimo==resta) {
            return "la cédula ingresa es correcta";
        }else{
            return "la cedula es incorrecta";
        }
        
    } 

    
}
