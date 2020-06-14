# ayudantia-2
//control de excepciones.
    
    public void validador(){

        try{

            if (numeroCasillas>=4) {

                System.out.println("numero valido");
            }else if(numeroCasillas<=4){
                System.out.println("no se permite este numero, ingrese otro");
                validador();


            }


        }catch(Exception exception) {
            System.out.println("no es un numero, ingrese otro");
            validador();
        }
    }


