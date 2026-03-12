package com.sgp.util;

/**
 * Classe utilitária para validação de dados de entrada.
 * Contém métodos estáticos para validar nome, idade e altura,
 * além de retornar mensagens de erro apropriadas.
 * 
 * Esta classe não pode ser instanciada (padrão Utility Class).
 */
public class Validacoes {

    /**
     * Construtor privado para impedir a criação de instâncias.
     * Segue o padrão de classe utilitária (Utility Class Pattern).
     */
    private Validacoes() {
        // Construtor privado para evitar instância
    }

    /**
     * Verifica se o nome informado é válido.
     * Um nome válido não pode ser nulo, vazio ou conter números.
     * 
     * @param especie O nome a ser validado
     * @return true se o nome for válido, false caso contrário
     */
    public static boolean especieValido(String especie) {
        // Retorna false se o nome for nulo, vazio ou contiver dígitos
        return !(especie == null || especie.trim().isEmpty() || especie.matches(".*\\d+.*"));
    }

    /**
     * Retorna uma mensagem de erro caso o nome seja inválido.
     * 
     * @param especie O nome a ser verificado
     * @return Mensagem de erro descritiva ou string vazia se válido
     */
    public static String mensagemErroNome(String especie) {
        // Verifica se o nome é nulo ou vazio
        if (especie == null || especie.trim().isEmpty()) {
            return "Erro: A especie não pode estar vazio!";
        // Verifica se o nome contém números usando regex
        } else if (especie.matches(".*\\d+.*")) {
            return "Erro: A especie não pode conter números!";
        }
        // Retorna string vazia se o nome for válido
        return "";
    }

    /**
     * Verifica se a idade informada é válida.
     * A idade deve estar entre 0 e 150 anos.
     * 
     * @param idade A idade a ser validada
     * @return true se a idade estiver no intervalo válido, false caso contrário
     */
    public static boolean idadeValida(int idade) {
        // Idade válida: entre 0 e 150 anos (inclusive)
        
        return idade >=0 && idade <= 15;
    }

    /**
     * Retorna uma mensagem de erro caso a idade seja inválida.
     * 
     * @param idade A idade a ser verificada
     * @return Mensagem de erro descritiva ou string vazia se válida
     */
    public static String mensagemErroIdade(int idade) {
        // Verifica se a idade é negativa
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa!";
        // Verifica se a idade excede o limite máximo
        } else if (idade > 90) {
            return "Erro: Idade inválida!";
        }
        // Retorna string vazia se a idade for válida
        return "";
    }

    /**
     * Verifica se a altura informada é válida.
     * A altura deve estar entre 0.3 e 3.0 metros.
     * 
     * @param tamanho A altura a ser validada (em metros)
     * @return true se a altura estiver no intervalo válido, false caso contrário
     */
    public static boolean tamanhoValida(double tamanho) {
        // Altura válida: entre 0.3m e 3.0m (inclusive)
        return tamanho >= 0.1 && tamanho <= 3.0;
    }

    /**
     * Retorna uma mensagem de erro caso a altura seja inválida.
     * 
     * @param tamanho A altura a ser verificada (em metros)
     * @return Mensagem de erro descritiva ou string vazia se válida
     */
    public static String mensagemErroTamanho(double tamanho) {
        // Verifica se a altura é muito baixa
        if (tamanho < 0.1) {
            return "Erro: Tamanho muito baixo!";
        // Verifica se a altura excede o limite máximo
        } else if (tamanho > 3.0) {
            return "Erro: Tamanho inválido!";
        }
        // Retorna string vazia se a altura for válida
        return "";
    }
}