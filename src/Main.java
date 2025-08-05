import java.util.Scanner;

class ExerciciosBasicos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS BÁSICOS EM JAVA ===\n");

        // Executa todos os exercícios
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
        exercicio10();
        exercicio11();
        exercicio12();
        exercicio13();
        exercicio14();
        exercicio15();
        exercicio16();
        exercicio17();
        exercicio18();
        exercicio19();
        exercicio20();
        exercicio21();
        exercicio22();
        exercicio23();
        exercicio24();
        exercicio25();
        exercicio26();
        exercicio27();
        exercicio28();
        exercicio29();
        exercicio30();
        exercicio31();
        exercicio32();
        exercicio33();
        exercicio34();
        exercicio35();
        exercicio36();
        exercicio37();
        exercicio38();
        exercicio39();
        exercicio40();
        exercicio41();
        exercicio42();
        exercicio43();
        exercicio44();
        exercicio45();
        exercicio46();
        exercicio47();
        exercicio48();

        scanner.close();
    }

    // 1. Leia um número inteiro e o imprima
    public static void exercicio1() {
        System.out.println("--- Exercício 1: Número Inteiro ---");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);
        System.out.println();
    }

    // 2. Leia um número real e o imprima
    public static void exercicio2() {
        System.out.println("--- Exercício 2: Número Real ---");
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        System.out.println("O número digitado foi: " + numero);
        System.out.println();
    }

    // 3. Peça três valores inteiros e imprima a soma
    public static void exercicio3() {
        System.out.println("--- Exercício 3: Soma de Três Inteiros ---");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;
        System.out.println("A soma dos três números é: " + soma);
        System.out.println();
    }

    // 4. Leia um número real e imprima o quadrado
    public static void exercicio4() {
        System.out.println("--- Exercício 4: Quadrado de um Número ---");
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        double quadrado = numero * numero;
        System.out.printf("O quadrado de %.2f é: %.2f%n", numero, quadrado);
        System.out.println();
    }

    // 5. Leia um número real e imprima a quinta parte
    public static void exercicio5() {
        System.out.println("--- Exercício 5: Quinta Parte de um Número ---");
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        double quintaParte = numero / 5.0;
        System.out.printf("A quinta parte de %.2f é: %.2f%n", numero, quintaParte);
        System.out.println();
    }

    // 6. Conversão Celsius para Fahrenheit
    public static void exercicio6() {
        System.out.println("--- Exercício 6: Celsius para Fahrenheit ---");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * (9.0/5.0) + 32.0;
        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        System.out.println();
    }

    // 7. Conversão Fahrenheit para Celsius
    public static void exercicio7() {
        System.out.println("--- Exercício 7: Fahrenheit para Celsius ---");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;
        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
        System.out.println();
    }

    // 8. Conversão Kelvin para Celsius
    public static void exercicio8() {
        System.out.println("--- Exercício 8: Kelvin para Celsius ---");
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.printf("%.2f K = %.2f°C%n", kelvin, celsius);
        System.out.println();
    }

    // 9. Conversão Celsius para Kelvin
    public static void exercicio9() {
        System.out.println("--- Exercício 9: Celsius para Kelvin ---");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f°C = %.2f K%n", celsius, kelvin);
        System.out.println();
    }

    // 10. Conversão km/h para m/s
    public static void exercicio10() {
        System.out.println("--- Exercício 10: km/h para m/s ---");
        System.out.print("Digite a velocidade em km/h: ");
        double kmh = scanner.nextDouble();
        double ms = kmh / 3.6;
        System.out.printf("%.2f km/h = %.2f m/s%n", kmh, ms);
        System.out.println();
    }

    // 11. Conversão m/s para km/h
    public static void exercicio11() {
        System.out.println("--- Exercício 11: m/s para km/h ---");
        System.out.print("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();
        double kmh = ms * 3.6;
        System.out.printf("%.2f m/s = %.2f km/h%n", ms, kmh);
        System.out.println();
    }

    // 12. Conversão milhas para quilômetros
    public static void exercicio12() {
        System.out.println("--- Exercício 12: Milhas para Quilômetros ---");
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();
        double quilometros = 1.61 * milhas;
        System.out.printf("%.2f milhas = %.2f km%n", milhas, quilometros);
        System.out.println();
    }

    // 13. Conversão quilômetros para milhas
    public static void exercicio13() {
        System.out.println("--- Exercício 13: Quilômetros para Milhas ---");
        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = scanner.nextDouble();
        double milhas = quilometros / 1.61;
        System.out.printf("%.2f km = %.2f milhas%n", quilometros, milhas);
        System.out.println();
    }

    // 14. Conversão graus para radianos
    public static void exercicio14() {
        System.out.println("--- Exercício 14: Graus para Radianos ---");
        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();
        double radianos = graus * Math.PI / 180.0;
        System.out.printf("%.2f° = %.4f rad%n", graus, radianos);
        System.out.println();
    }

    // 15. Conversão radianos para graus
    public static void exercicio15() {
        System.out.println("--- Exercício 15: Radianos para Graus ---");
        System.out.print("Digite o ângulo em radianos: ");
        double radianos = scanner.nextDouble();
        double graus = radianos * 180.0 / Math.PI;
        System.out.printf("%.4f rad = %.2f°%n", radianos, graus);
        System.out.println();
    }

    // 16. Conversão polegadas para centímetros
    public static void exercicio16() {
        System.out.println("--- Exercício 16: Polegadas para Centímetros ---");
        System.out.print("Digite o comprimento em polegadas: ");
        double polegadas = scanner.nextDouble();
        double centimetros = polegadas * 2.54;
        System.out.printf("%.2f pol = %.2f cm%n", polegadas, centimetros);
        System.out.println();
    }

    // 17. Conversão centímetros para polegadas
    public static void exercicio17() {
        System.out.println("--- Exercício 17: Centímetros para Polegadas ---");
        System.out.print("Digite o comprimento em centímetros: ");
        double centimetros = scanner.nextDouble();
        double polegadas = centimetros / 2.54;
        System.out.printf("%.2f cm = %.2f pol%n", centimetros, polegadas);
        System.out.println();
    }

    // 18. Conversão metros cúbicos para litros
    public static void exercicio18() {
        System.out.println("--- Exercício 18: Metros Cúbicos para Litros ---");
        System.out.print("Digite o volume em metros cúbicos: ");
        double m3 = scanner.nextDouble();
        double litros = 1000 * m3;
        System.out.printf("%.2f m³ = %.2f L%n", m3, litros);
        System.out.println();
    }

    // 19. Conversão litros para metros cúbicos
    public static void exercicio19() {
        System.out.println("--- Exercício 19: Litros para Metros Cúbicos ---");
        System.out.print("Digite o volume em litros: ");
        double litros = scanner.nextDouble();
        double m3 = litros / 1000.0;
        System.out.printf("%.2f L = %.6f m³%n", litros, m3);
        System.out.println();
    }

    // 20. Conversão quilogramas para libras
    public static void exercicio20() {
        System.out.println("--- Exercício 20: Quilogramas para Libras ---");
        System.out.print("Digite a massa em quilogramas: ");
        double quilogramas = scanner.nextDouble();
        double libras = quilogramas / 0.45;
        System.out.printf("%.2f kg = %.2f lb%n", quilogramas, libras);
        System.out.println();
    }

    // 21. Conversão libras para quilogramas
    public static void exercicio21() {
        System.out.println("--- Exercício 21: Libras para Quilogramas ---");
        System.out.print("Digite a massa em libras: ");
        double libras = scanner.nextDouble();
        double quilogramas = libras * 0.45;
        System.out.printf("%.2f lb = %.2f kg%n", libras, quilogramas);
        System.out.println();
    }

    // 22. Conversão jardas para metros
    public static void exercicio22() {
        System.out.println("--- Exercício 22: Jardas para Metros ---");
        System.out.print("Digite o comprimento em jardas: ");
        double jardas = scanner.nextDouble();
        double metros = 0.91 * jardas;
        System.out.printf("%.2f jardas = %.2f m%n", jardas, metros);
        System.out.println();
    }

    // 23. Conversão metros para jardas
    public static void exercicio23() {
        System.out.println("--- Exercício 23: Metros para Jardas ---");
        System.out.print("Digite o comprimento em metros: ");
        double metros = scanner.nextDouble();
        double jardas = metros / 0.91;
        System.out.printf("%.2f m = %.2f jardas%n", metros, jardas);
        System.out.println();
    }

    // 24. Conversão metros quadrados para acres
    public static void exercicio24() {
        System.out.println("--- Exercício 24: Metros Quadrados para Acres ---");
        System.out.print("Digite a área em metros quadrados: ");
        double m2 = scanner.nextDouble();
        double acres = m2 * 0.000247;
        System.out.printf("%.2f m² = %.6f acres%n", m2, acres);
        System.out.println();
    }

    // 25. Conversão acres para metros quadrados
    public static void exercicio25() {
        System.out.println("--- Exercício 25: Acres para Metros Quadrados ---");
        System.out.print("Digite a área em acres: ");
        double acres = scanner.nextDouble();
        double m2 = acres * 4048.58;
        System.out.printf("%.2f acres = %.2f m²%n", acres, m2);
        System.out.println();
    }

    // 26. Conversão metros quadrados para hectares
    public static void exercicio26() {
        System.out.println("--- Exercício 26: Metros Quadrados para Hectares ---");
        System.out.print("Digite a área em metros quadrados: ");
        double m2 = scanner.nextDouble();
        double hectares = m2 * 0.0001;
        System.out.printf("%.2f m² = %.4f ha%n", m2, hectares);
        System.out.println();
    }

    // 27. Conversão hectares para metros quadrados
    public static void exercicio27() {
        System.out.println("--- Exercício 27: Hectares para Metros Quadrados ---");
        System.out.print("Digite a área em hectares: ");
        double hectares = scanner.nextDouble();
        double m2 = hectares * 10000;
        System.out.printf("%.2f ha = %.2f m²%n", hectares, m2);
        System.out.println();
    }

    // 28. Soma dos quadrados de três valores
    public static void exercicio28() {
        System.out.println("--- Exercício 28: Soma dos Quadrados ---");
        System.out.print("Digite o primeiro valor: ");
        double val1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double val2 = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double val3 = scanner.nextDouble();

        double somaQuadrados = (val1 * val1) + (val2 * val2) + (val3 * val3);
        System.out.printf("A soma dos quadrados é: %.2f%n", somaQuadrados);
        System.out.println();
    }

    // 29. Média aritmética de quatro notas
    public static void exercicio29() {
        System.out.println("--- Exercício 29: Média de Quatro Notas ---");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.printf("A média aritmética é: %.2f%n", media);
        System.out.println();
    }

    // 30. Conversão Real para Dólar
    public static void exercicio30() {
        System.out.println("--- Exercício 30: Real para Dólar ---");
        System.out.print("Digite o valor em reais: ");
        double reais = scanner.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        double dolares = reais / cotacao;
        System.out.printf("R$ %.2f = US$ %.2f%n", reais, dolares);
        System.out.println();
    }

    // 31. Antecessor e sucessor de um número
    public static void exercicio31() {
        System.out.println("--- Exercício 31: Antecessor e Sucessor ---");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.printf("Antecessor: %d, Número: %d, Sucessor: %d%n", antecessor, numero, sucessor);
        System.out.println();
    }

    // 32. Soma do sucessor do triplo com antecessor do dobro
    public static void exercicio32() {
        System.out.println("--- Exercício 32: Sucessor do Triplo + Antecessor do Dobro ---");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int triplo = numero * 3;
        int dobro = numero * 2;
        int sucessorTriplo = triplo + 1;
        int antecessorDobro = dobro - 1;
        int soma = sucessorTriplo + antecessorDobro;
        System.out.printf("Sucessor do triplo (%d) + Antecessor do dobro (%d) = %d%n",
                sucessorTriplo, antecessorDobro, soma);
        System.out.println();
    }

    // 33. Área do quadrado
    public static void exercicio33() {
        System.out.println("--- Exercício 33: Área do Quadrado ---");
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.printf("A área do quadrado é: %.2f%n", area);
        System.out.println();
    }

    // 34. Valor com desconto de 12%
    public static void exercicio34() {
        System.out.println("--- Exercício 34: Desconto de 12% ---");
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        double desconto = valor * 0.12;
        double valorComDesconto = valor - desconto;
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (12%%): R$ %.2f%n", desconto);
        System.out.printf("Valor com desconto: R$ %.2f%n", valorComDesconto);
        System.out.println();
    }

    // 35. Salário com aumento de 25%
    public static void exercicio35() {
        System.out.println("--- Exercício 35: Aumento Salarial de 25% ---");
        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();
        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;
        System.out.printf("Salário atual: R$ %.2f%n", salario);
        System.out.printf("Aumento (25%%): R$ %.2f%n", aumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        System.out.println();
    }

    // 36. Divisão do prêmio do concurso
    public static void exercicio36() {
        System.out.println("--- Exercício 36: Divisão do Prêmio ---");
        double premio = 780000.00;
        double primeiro = premio * 0.46;
        double segundo = premio * 0.32;
        double terceiro = premio - primeiro - segundo;

        System.out.printf("Prêmio total: R$ %.2f%n", premio);
        System.out.printf("Primeiro ganhador (46%%): R$ %.2f%n", primeiro);
        System.out.printf("Segundo ganhador (32%%): R$ %.2f%n", segundo);
        System.out.printf("Terceiro ganhador (restante): R$ %.2f%n", terceiro);
        System.out.println();
    }

    // 37. Pagamento do encanador
    public static void exercicio37() {
        System.out.println("--- Exercício 37: Pagamento do Encanador ---");
        System.out.print("Digite o número de dias trabalhados: ");
        int dias = scanner.nextInt();
        double valorDiario = 30.00;
        double valorBruto = dias * valorDiario;
        double imposto = valorBruto * 0.08;
        double valorLiquido = valorBruto - imposto;

        System.out.printf("Dias trabalhados: %d%n", dias);
        System.out.printf("Valor bruto: R$ %.2f%n", valorBruto);
        System.out.printf("Imposto de renda (8%%): R$ %.2f%n", imposto);
        System.out.printf("Valor líquido: R$ %.2f%n", valorLiquido);
        System.out.println();
    }

    // 38. Salário com adicional de 10%
    public static void exercicio38() {
        System.out.println("--- Exercício 38: Salário com Adicional ---");
        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = scanner.nextDouble();

        double salarioBase = valorHora * horas;
        double adicional = salarioBase * 0.10;
        double salarioTotal = salarioBase + adicional;

        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
        System.out.printf("Adicional (10%%): R$ %.2f%n", adicional);
        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);
        System.out.println();
    }

    // 39. Salário com gratificação e imposto
    public static void exercicio39() {
        System.out.println("--- Exercício 39: Salário com Gratificação e Imposto ---");
        System.out.print("Digite o salário-base: ");
        double salarioBase = scanner.nextDouble();
        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("Salário-base: R$ %.2f%n", salarioBase);
        System.out.printf("Gratificação (5%%): R$ %.2f%n", gratificacao);
        System.out.printf("Imposto (7%%): R$ %.2f%n", imposto);
        System.out.printf("Salário a receber: R$ %.2f%n", salarioFinal);
        System.out.println();
    }

    // 40. Sistema de vendas
    public static void exercicio40() {
        System.out.println("--- Exercício 40: Sistema de Vendas ---");
        System.out.print("Digite o valor total da venda: ");
        double valorTotal = scanner.nextDouble();

        double valorComDesconto = valorTotal * 0.90; // 10% de desconto
        double parcelaSemJuros = valorTotal / 3.0;
        double comissaoVista = valorComDesconto * 0.05;
        double comissaoParcelada = valorTotal * 0.05;

        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        System.out.printf("Total com desconto de 10%%: R$ %.2f%n", valorComDesconto);
        System.out.printf("Parcela 3x sem juros: R$ %.2f%n", parcelaSemJuros);
        System.out.printf("Comissão venda à vista: R$ %.2f%n", comissaoVista);
        System.out.printf("Comissão venda parcelada: R$ %.2f%n", comissaoParcelada);
        System.out.println();
    }

    // 41. Cálculo de degraus
    public static void exercicio41() {
        System.out.println("--- Exercício 41: Cálculo de Degraus ---");
        System.out.print("Digite a altura de cada degrau (em cm): ");
        double alturaDegrau = scanner.nextDouble();
        System.out.print("Digite a altura desejada (em cm): ");
        double alturaDesejada = scanner.nextDouble();

        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);
        System.out.printf("Você precisará subir %d degraus%n", numeroDegraus);
        System.out.println();
    }

    // 42. Conversão maiúscula para minúscula
    public static void exercicio42() {
        System.out.println("--- Exercício 42: Maiúscula para Minúscula ---");
        System.out.print("Digite uma letra maiúscula: ");
        char letraMaiuscula = scanner.next().charAt(0);

        if (letraMaiuscula >= 'A' && letraMaiuscula <= 'Z') {
            char letraMinuscula = (char) (letraMaiuscula + 32);
            System.out.printf("Letra maiúscula: %c (ASCII: %d)%n", letraMaiuscula, (int)letraMaiuscula);
            System.out.printf("Letra minúscula: %c (ASCII: %d)%n", letraMinuscula, (int)letraMinuscula);
        } else {
            System.out.println("Por favor, digite uma letra maiúscula válida!");
        }
        System.out.println();
    }

    // 43. Número de 3 dígitos
    public static void exercicio43() {
        System.out.println("--- Exercício 43: Número de 3 Dígitos ---");
        System.out.print("Digite um número de 3 dígitos (100-999): ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            System.out.printf("Número lido: %d%n", numero);
        } else {
            System.out.println("Número deve ter 3 dígitos!");
        }
        System.out.println();
    }

    // 44. Inverter dígitos de número de 3 dígitos
    public static void exercicio44() {
        System.out.println("--- Exercício 44: Inverter Dígitos ---");
        System.out.print("Digite um número de 3 dígitos (100-999): ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int numeroInvertido = unidade * 100 + dezena * 10 + centena;

            System.out.printf("Número original: %d%n", numero);
            System.out.printf("Número invertido: %d%n", numeroInvertido);
        } else {
            System.out.println("Número deve ter 3 dígitos!");
        }
        System.out.println();
    }

    // 45. Imprimir dígitos de número de 4 dígitos
    public static void exercicio45() {
        System.out.println("--- Exercício 45: Dígitos Separados ---");
        System.out.print("Digite um número de 4 dígitos (1000-9999): ");
        int numero = scanner.nextInt();

        if (numero >= 1000 && numero <= 9999) {
            int milhar = numero / 1000;
            int centena = (numero % 1000) / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            System.out.printf("Número: %d%n", numero);
            System.out.println("Dígitos separados:");
            System.out.println(milhar);
            System.out.println(centena);
            System.out.println(dezena);
            System.out.println(unidade);
        } else {
            System.out.println("Número deve ter 4 dígitos!");
        }
        System.out.println();
    }

    // 46. Converter segundos em horas, minutos e segundos
    public static void exercicio46() {
        System.out.println("--- Exercício 46: Conversão de Tempo ---");
        System.out.print("Digite um valor em segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("%d segundos = %d horas, %d minutos e %d segundos%n",
                totalSegundos, horas, minutos, segundos);
        System.out.println();
    }

    // 47. Horário de término de experiência
    public static void exercicio47() {
        System.out.println("--- Exercício 47: Horário de Término ---");
        System.out.print("Digite a hora de início: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite o minuto de início: ");
        int minutoInicio = scanner.nextInt();
        System.out.print("Digite o segundo de início: ");
        int segundoInicio = scanner.nextInt();
        System.out.print("Digite a duração em segundos: ");
        int duracao = scanner.nextInt();

        // Converter tudo para segundos
        int inicioEmSegundos = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        int fimEmSegundos = inicioEmSegundos + duracao;

        // Converter de volta para horas, minutos e segundos
        int horaFim = (fimEmSegundos / 3600) % 24;
        int minutoFim = (fimEmSegundos % 3600) / 60;
        int segundoFim = fimEmSegundos % 60;

        System.out.printf("Horário de início: %02d:%02d:%02d%n", horaInicio, minutoInicio, segundoInicio);
        System.out.printf("Duração: %d segundos%n", duracao);
        System.out.printf("Horário de término: %02d:%02d:%02d%n", horaFim, minutoFim, segundoFim);
        System.out.println();
    }

    // 48. Calcular ano de nascimento
    public static void exercicio48() {
        System.out.println("--- Exercício 48: Ano de Nascimento ---");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int anoNascimento = anoAtual - idade;
        System.out.printf("Com %d anos em %d, você nasceu em %d%n", idade, anoAtual, anoNascimento);
        System.out.println();
    }
}