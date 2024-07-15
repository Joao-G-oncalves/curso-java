package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
    
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

}

}
