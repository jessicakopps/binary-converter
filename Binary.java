    public class Binary {
    
    public static int binarioParaDecimal(int[] vetor){
        int index = 0;
        int binario = 0;
        for(int i = vetor.length -1; i >= 0; i--){
            if(vetor[i] == 1){
                binario += Math.pow(2,index);
            }
            index++;
        }
        return binario;
    }

    public static String decimalParaBinario(int valor){
        int potencia = 0;
        double resultado = 0.0;

        //verificar limite da potencia
        while (true) {
            if (resultado > valor || Math.pow(2, (potencia + 1)) > valor) {
                break;
            } else {
                resultado = Math.pow(2, potencia);
                potencia++;
            }
        }

        //realiza a conversao de decimal para binario
        double resto = valor;
        String binario = "";

        for (int i = potencia; i >= 0; i--) {
            double r = Math.pow(2, i);

            if (r <= resto) {
                binario += "1";
                resto -= r;
            } else {
                binario += "0";
            }
        }
        return binario;
    }
}
