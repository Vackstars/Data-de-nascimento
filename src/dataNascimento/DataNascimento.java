package dataNascimento;
import java.util.Scanner;
public class DataNascimento {


    public static void main(String[] args) {

        String dtNasc;
        // declarando scanner que sera usado para receber a data do usuario

        Scanner leitura=new Scanner(System.in);


        System.out.println("Coloque a data no formato DD/MM/AAAA");
        dtNasc=leitura.next();

        //usando metodo .split que quebra a string quando achar o simbolo "/"

        String[] dtQuebrada=dtNasc.split("/");

        //transformando o dia, mes, ano para int, para poder comparar nos metodos condicionais

        int dtDia=Integer.parseInt(dtQuebrada[0]);
        int dtMes=Integer.parseInt(dtQuebrada[1]);
        int dtAno=Integer.parseInt(dtQuebrada[2]);

        //condicionais para verificar se a data esta correta
        if(dtMes==2 && dtDia<29 && dtAno <=2022){
            System.out.println(dtNasc);
        }else if ((dtMes==4 || dtMes==6 || dtMes==9 || dtMes==11) && dtDia<31 & dtAno<=2022){
            System.out.println(dtNasc);
        }else if ((dtMes==1 || dtMes==3 || dtMes==5 || dtMes==7 || dtMes==8 || dtMes==10 || dtMes==12) && dtDia<=31 & dtAno<=2022){
            System.out.println(dtNasc);
        }else System.out.println("data invalida");






    }

}