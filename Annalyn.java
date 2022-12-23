public class Annalyn {

    /*
     * Neste exercício, você implementará a lógica de busca para um novo jogo de RPG que um amigo está desenvolvendo. O personagem principal do jogo é Annalyn, uma garota corajosa com um cão de estimação feroz e leal. Infelizmente, ocorre um desastre, pois sua melhor amiga foi sequestrada enquanto procurava frutas silvestres na floresta. Annalyn tentará encontrar e libertar sua melhor amiga, opcionalmente levando seu cachorro com ela nessa missão.

Depois de algum tempo seguindo o rastro de sua melhor amiga, ela encontra o acampamento em que sua melhor amiga está presa. Acontece que há dois sequestradores: um poderoso cavaleiro e um astuto arqueiro.

Tendo encontrado os sequestradores, Annalyn considera qual das seguintes ações ela pode realizar:

Ataque rápido: um ataque rápido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele vestir sua armadura, então ele ficará vulnerável.

Espião: o grupo pode ser espionado se pelo menos um deles estiver acordado. Caso contrário, espionar é uma perda de tempo.

Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por meio de sons de pássaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros são treinados em sinalização de pássaros, para que possam interceptar a mensagem.

Prisioneiro livre : Annalyn pode tentar entrar sorrateiramente no acampamento para libertar o prisioneiro. Isso é uma coisa arriscada de se fazer e só pode ser bem-sucedida de duas maneiras:
Se Annalyn estiver com seu cachorro de estimação, ela pode resgatar o prisioneiro se o arqueiro estiver dormindo. O cavaleiro está com medo do cachorro e o arqueiro não terá tempo de se preparar antes que Annalyn e o prisioneiro possam escapar.
Se Annalyn não tem seu cachorro, então ela e o prisioneiro devem ser muito sorrateiros! Annalyn pode libertar o prisioneiro se o prisioneiro estiver acordado e o cavaleiro e o arqueiro estiverem dormindo, mas se o prisioneiro estiver dormindo, eles não podem ser resgatados: o prisioneiro ficaria assustado com a aparição repentina de Annalyn e acordaria o cavaleiro e o arqueiro.


Você tem quatro tarefas: implementar a lógica para determinar se as ações acima estão disponíveis com base no estado dos três personagens encontrados na floresta e se o cachorro de estimação de Annalyn está presente ou não.
     */

     //1. Verifique se um ataque rápido pode ser feito  "KnightIsAwake esta acordado então esse ataque tem que retornar false"
    public static boolean canFastAttack(boolean knightIsAwake)
    {
        return !knightIsAwake;
    }
    // 2 Verifique se o grupo pode ser espionado  " Para a espionagem ser feita pelo menos 1 tem que está arcordado então ela tem que retornar true"
    public static boolean canSignalPrisoner(boolean knightIsAwake,boolean archerIsAwake , boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    // 3. Verifique se o preso pode ser sinalizado "Para o prisoneira ser sinalizado o arqueiro tem que está dormindo e o priosoneiro tem que estar acordado no caso essa função tem que retornar true"
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
     }
    // 4. Verifique se o prisioneiro pode ser libertado "Cavaleiro está acordado arqueiro está dormindo  o prisioneiro esta arcodado então a libertação pode ser feita mas Annyln não tem o cachorro então esse método deve retornar false"
     public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
        }
      

        
}
