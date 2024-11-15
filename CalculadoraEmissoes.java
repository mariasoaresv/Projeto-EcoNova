import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introdução:
        System.out.println("Calculo das emissões de carbono mensais da empresa: ");
        System.out.println("Por favor, insira os dados coletados no mês:");
        System.out.printf("Gostaria de calcular todas as categorias de emissão? Responda com sim ou não:"); //Essa parte ainda está incompleta

        String calcularTudo = scanner.nextLine(); //Essa parte ainda está incompleta

        //1- Veículos
        System.out.println("\nDigite quantos veículos possuem na frota da empresa: ");
        int quantVeiculos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        double emissaoVTotal = 0; // Emissão total inicial da frota

        // Loop que executa dependendo do número de veículos inseridos pelo usuário
        for (int i = 1; i <= quantVeiculos; i++) {
            System.out.println("\nVeículo " + i + ": ");

            System.out.println("\nDigite a distância percorrida pelo veículo (em km): ");
            double kmRodados = scanner.nextDouble();

            scanner.nextLine(); // Consumir a quebra de linha
            System.out.println("\nDigite o tipo de combustível (gasolina, álcool, diesel, gás ou elétrico):");
            String tipoCombustivel = scanner.nextLine().toLowerCase();

            System.out.println("\nDigite o consumo médio do veículo (em km/L, ou, no caso de veículos elétricos em kWh):");
            double consumo = scanner.nextDouble();

            double emissaoCombustivel;
            switch (tipoCombustivel) {
                case "gasolina":
                    emissaoCombustivel = 2.31;
                    break;
                case "alcool":
                    emissaoCombustivel = 1.86;
                    break;
                case "diesel":
                    emissaoCombustivel = 2.68;
                    break;
                case "gas":
                    emissaoCombustivel = 2.75;
                    break;
                case "eletrico":
                    emissaoCombustivel = 0.5;
                    break;
                default:
                    emissaoCombustivel = 0;
                    System.out.println("Combustível inválido. Emissão não calculada para este veículo.");
                    continue; // Pular para o próximo veículo
            }

            //Calcula a emissão de cada veículo e adiciona ao total
            double veiculo = (kmRodados / consumo) * emissaoCombustivel;
            emissaoVTotal += veiculo;
        }

        //2- Eletricidade
        System.out.println("\nDigite o consumo de eletricidade TOTAL da empresa (em kWh): ");
        double consumoEletrico = scanner.nextDouble();

        double emissaoEletricidade = 0.5;

        double eletricidade = consumoEletrico * emissaoEletricidade;

        //3- Gás natural
        System.out.println("\nDigite o consumo de gás natural (em m³): ");
        double consumoGas = scanner.nextDouble();

        double emissaoGas = 2.0;

        double gas = consumoGas * emissaoGas;

        //4- Resíduos (lixo)
        System.out.println("\nDigite a quantidade de resíduos gerados (em kg): ");
        double kgResiduos = scanner.nextDouble();

        double emissaoResiduo = 1.2;

        double residuo = kgResiduos * emissaoResiduo;

        //5- Uso de papel
        System.out.println("\nDigite a quantidade de papel consumida (em kg): ");
        double kgPapel = scanner.nextDouble();

        double emissaoPapel = 1.5;

        double papel = kgPapel * emissaoPapel;

        //Calcula a emissão total da empresa
        double emissaoTotal = emissaoVTotal + eletricidade + gas + residuo + papel;

        //Obtém o mês atual e traduz para português
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM").withLocale(new java.util.Locale("pt", "BR"));
        String mesAtual = dataAtual.format(formatter);

        System.out.printf("\nA emissão de carbono total da empresa no mês de %s é: %.2f kg de CO2\n", mesAtual, emissaoTotal);

        scanner.close();
    }
}

