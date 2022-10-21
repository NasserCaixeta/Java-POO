public class ConversaoDeUnidadesDeVolume {

    public void cmcubico(double litro){
        litro = litro * 1000;
    }
    public void metro_cubico_para_litro(double litro, double metro_cub){
        metro_cub = litro * 1000;
    }
    public void metro_cub_para_pes_cub(double metro_cub, double pes_cub){
        metro_cub = 35.32 * pes_cub;
    }
    public void galao_ame_para_pole_cub(double galao_ame, double pole_cub){
        galao_ame = 231 * pole_cub;
    }
    public void galao_ame_para_litro(double galao_ame,double litro){
        galao_ame = 3785 * litro;
    }
}
