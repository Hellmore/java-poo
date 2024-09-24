package equips;

public class herancaEquipamentos {

    public static void main(String[] args) {
        EquipamentoCorrigido TVs = new EquipamentoCorrigido(4);
        System.out.println("Numero de elementos: " + TVs.getNumeroEquipamentos());
        
        for (int i = 0; i < 4; i++){
            TVs.setValor(i, i + 10);
        }
        
        for (int i = 0; i < 4; i++){
            TVs.setMesCompra(i, i + 1);
        }
        
        for (int i = 0; i < 4; i++){
            System.out.println("Definindo : Equipamento numero " + i + " Valor = " + TVs.getValor(i) + " Mes de compra = " + TVs.getMesCompra(i) + "\n");
        }
        
        TVs.corrige(10);
        System.out.println("Corrige: Equipamento numero " + 0 + " Valor = " + TVs.getValor(0) + " Mes de compra = " + TVs.getMesCompra(0) + "\n");
        
        EquipamentoCorrigido OutroEquipamento = new EquipamentoCorrigido(4);
        for (int i = 0; i < 4; i++){
            OutroEquipamento.setValor(i, i + 1000);
        }
        
        for (int i = 0; i < 4; i++){
           OutroEquipamento.setMesCompra(i, i + 2);
        }
        
        TVs.substitui(OutroEquipamento);
        for (int i = 0; i < TVs.getNumeroEquipamentos(); i++){
            System.out.println("Substitui : Equipamento numero" + i + " Valor = " + TVs.getValor(i) + " Mes de compra = " + TVs.getMesCompra(i) + "\n");
        }  
    }
    
}
