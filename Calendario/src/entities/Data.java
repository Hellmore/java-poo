package entities;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1800 && ano <= 2024){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 01;
            this.mes = 01;
            this.ano = 2000;
        }
    }
    
    public int compara(Data outraData){
        if (outraData.ano == this.ano){
            if (outraData.mes > this.mes){
                return -1;
            } else if (outraData.mes < this.mes){
                return 1;
            } else if (outraData.mes == this.mes){
                if (outraData.dia > this.dia){
                    return -1;
                } else if( outraData.dia < this.dia){
                    return 1;
                } else if (outraData.dia == this.dia){
                    return 0;
                }
            }
        } else if (outraData.ano < this.ano){
            return 1;
        } else if (outraData.ano > this.ano){
            return -1;
        }
        return 2;
    } 
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public String getMesExtenso(){
        String[] meses = {"Janeiro", "fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[this.mes - 1];
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String isBissexto(){
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0)) {
            return "Verdadeiro";
        } else {
            return "Falso";
        }
    }
    
    public Data clone(){
        Data cloneData = new Data(this.dia, this.mes, this.ano);
        return cloneData;
        
    }
}
