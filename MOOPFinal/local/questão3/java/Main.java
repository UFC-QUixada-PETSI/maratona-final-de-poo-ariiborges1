import java.util.Scanner;

// O ALUNO DEVE CRIAR AS CLASSES AQUI EM CIMA OU EM ARQUIVOS SEPARADOS

public class Arma{

}

public class Personagem{

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Crie as classes Personagem e Arma, depois descomente as listas abaixo:
        ArrayList<Personagem> grupo = new ArrayList<>();
        ArrayList<Arma> inventario = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) continue;
            System.out.println("$" + linha);
            String[] tokens = linha.split(" ");
            String cmd = tokens[0].toLowerCase();

            try {
                switch (cmd) {
                    case "end": scanner.close(); return;

                    // --- ITENS ---
                    case "add_espada": 
                        // TODO 2: Crie a classe Espada e descomente abaixo
                        inventario.add(new Espada(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
                        break;

                    case "add_cajado":
                        // TODO 3: Crie a classe Cajado e descomente abaixo
                        // inventario.add(new Cajado(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
                        break;

                    // --- PERSONAGENS ---
                    case "create_knight":
                        // TODO 4: Crie a classe Cavaleiro e descomente abaixo
                        // grupo.add(new Cavaleiro(tokens[1]));
                        break;

                    case "create_mage":
                        // TODO 5: Crie a classe Mago e descomente abaixo
                        // grupo.add(new Mago(tokens[1]));
                        break;

                    // --- AÇÕES ---
                    case "equipar":
                        // TODO 6: Implemente equipar(Arma a) em Personagem e descomente
                        // Personagem pEquip = grupo.get(Integer.parseInt(tokens[1]));
                        // Arma aEquip = inventario.get(Integer.parseInt(tokens[2]));
                        // pEquip.equipar(aEquip);
                        break;

                    case "descansar":
                        // TODO 7: Implemente descansar() em Personagem e descomente
                        // grupo.get(Integer.parseInt(tokens[1])).descansar();
                        break;

                    case "atacar":
                        // TODO 8: Implemente atacar() com as Exceções e Polimorfismo
                        // Personagem pAtk = grupo.get(Integer.parseInt(tokens[1]));
                        // try {
                        //     System.out.println(pAtk.atacar());
                        // } catch (SemEstaminaException e) {
                        //     System.out.println("FALHA: " + e.getMessage());
                        // } catch (ArmaQuebradaException e) {
                        //     System.out.println("FALHA: " + e.getMessage());
                        // } catch (NullPointerException e) {
                        //     System.out.println("FALHA: O personagem esta desarmado!");
                        // }
                        break;
                        
                    case "status_arma":
                        // TODO 9: Implemente toString() em Arma e descomente
                        // Arma arma = inventario.get(Integer.parseInt(tokens[1]));
                        // System.out.println(arma); 
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro critico no sistema (Main): " + e.getMessage());
            }
        }
    }
}