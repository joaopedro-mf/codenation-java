package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        notelement(texto);
        String crypto = "";
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char pointer = texto.charAt(i);
            if (pointer >= 'a' && pointer <= 'z') {
                if ((int) pointer + 3 > 122) {
                    crypto += (char) (pointer - 23);
                } else {
                    crypto = crypto + (char) (pointer + 3);
                }
            } else {
                crypto = crypto + pointer;
            }
        }
        return crypto;
    }

    @Override
    public String descriptografar(String texto) {
        notelement(texto);
        String decrypt = "";
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++){
            char pointer = texto.charAt(i);
            if(pointer >='a' && pointer <='z' ){
                if((int) pointer - 3 < 97){
                    decrypt = decrypt + (char) (pointer + 23);
                } else {
                    decrypt = decrypt + (char) (pointer - 3);
                }
            } else{
                decrypt = decrypt + pointer;
            }
        }

        return decrypt;
    }

    private void notelement(String texto){
        if  (texto.equals(null)){
            throw new NullPointerException();
        }else if(texto.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

}