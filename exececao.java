 int divisor , dividendo , quociente = 0;
        String controle = "s";

        Scanner s = new Scanner ( System.in );
        do {
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();


            /*
            //COMO MODIFICAR A MENSAGEM DE ERRO NO OBJETO

            try{
                if (divisor==0) {
                    throw new ArithmeticException("Divisor nulo");
                }
            }
            catch (ArithmeticException e ) {
                System.out.println("Voce digitou zero. Erro: "+e.getMessage());
            }
             finally {
                System.out.println("Sempre serei executado, independente do que aconteça acima");
            }

            

            */



            /*

            //TRATAMENTO DE EXECEÇÃO BASICO
            try{
                quociente = dividendo / divisor;
            }
            catch (Exception e) {
                System.out.println("Erro por zero..."+ e);
            }
            */
