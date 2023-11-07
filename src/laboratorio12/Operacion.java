/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

/**
 *
 * @author usuario
 */
public class Operacion {
    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;

    public Operacion(CajaValidacion caja1, 
            CajaValidacion caja2, CajaValidacion resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }
   
    

  
    public void suma (){
        float res= this.caja1.getValor()
                +this.caja2.getValor();
        this.resultado.mostrarInfo(res+"");
    }
    public void resta (){
       float res= this.caja1.getValor()
                -this.caja2.getValor();
        this.resultado.mostrarInfo(res+"");
    }
     public void mul (){
       float res= this.caja1.getValor()
                *this.caja2.getValor();
        this.resultado.mostrarInfo(res+"");
    }
     public void div (){
       float res= this.caja1.getValor()
                /this.caja2.getValor();
       if(this.caja2.getValor()==0){
           this.resultado.mostrarError("No se puede dividir entre 0");
       }else if(this.caja1.getValor()==0&&this.caja2.getValor()==0){
           this.resultado.mostrarError("Ambos numeros no deben ser  cero");
      
       } else{
               this.resultado.mostrarInfo(res +"");
       }
     }
}
