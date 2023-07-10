package service.calculate;

public class MathOperation {

    double result=0.0;
    String message=null;

    public double mathOperationFunction(String name, int var1, int var2, int var3, char varChar){
        switch (name){
            case "cilindru":
                if (varChar=='p') {
                    /**V=PI*r*r*h*/
                    result = Math.PI * (Math.pow(var1, 2)) * var2;
                }
                break;
            case "sfera":
                if (varChar=='v'){
                    /**V=4/3*(PI*r*r*r)*/
                    result=4.0/3.0*(Math.PI*(Math.pow(var1, 3)));
                }
                break;
            case "patrat":
                if (varChar=='v'){
                    /**V=a*a*a*/
                    result=var1*var2*var3;
                }
                break;
            default:
                result=0.0;
                message="plase insert data";
                System.out.println(message);
                break;
        }
        System.out.println(result);
        return result;
    }
}
