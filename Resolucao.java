import java.text.Normalizer;

class Resolucao{
    static boolean fibonacci(int num){
        int anterior = 0;
        int atual = 1;
        while (atual <= num){
            if (anterior == num){
                return true;
            }
            anterior = atual;
            atual = anterior + atual;
        }
        return false;
    }

    
    static int countA(String s){
        s = s.toLowerCase();
        s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""); // remover acentos
        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a'){
                sum++;
            }
        }

        return sum;
    }

    public static void main (String[] args){
        System.out.println(fibonacci(26)?"Pertence":"Nao pertence");
        System.out.println(countA("Num ninho de mafagafos há sete mafagafinhos. Quando a mafagafa gafa, gafam os sete mafagafinhos."));
    }
}