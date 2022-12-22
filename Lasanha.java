public class Lasanha {

    /*
     * Neste exercício, você escreverá algum código para ajudá-lo a cozinhar uma lasanha brilhante de seu livro de culinária favorito.
Você tem quatro tarefas, todas relacionadas ao tempo gasto para cozinhar a lasanha.
     */
    public static void main(String[] args){
        System.out.println( EsperandoMinutosForno() );
    }

    // 1. Defina o tempo esperado de forno em minutos . Deve retorna o valor de 40 minutos de forno
    public static int EsperandoMinutosForno ()
    {
      return 40;
    }
    // 2. Calcule o tempo restante do forno em minutos. Deve retornar uma subtração de tempo esperado no formo - o tempo atual
    public static int TempoRestanteForno (int x)
    {
      return Lasanha.EsperandoMinutosForno() - x;
    }
    //3. Calcule o tempo de preparo em minutos. O Tempo de preparo de camada por padrão deverá ser 2, então fazer uma multiplacação do número de camadas * 2 minutos 

    public static int TempodePreparoCamadas (int y)
    {
      return y * 2;
    }
    //4. Calcule o tempo total de trabalho em minutos. O tempo que você passando criando a lasanha + o tempo que você passou esperando ela no forno

    public int TempoTotalGasto(int num_camadas,int MinutosPassado)
    {
       return Lasanha.TempodePreparoCamadas(num_camadas)+ Lasanha.TempoRestanteForno(MinutosPassado);
    }
}
