public class AgenteIA {
    public void processarPrompt(String prompt) throws FalhaProcessamentoAgenteException, PromptInadequadoException{
        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }
        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
        }

        if ( prompt.toLowerCase().contains("hackear") || prompt.toLowerCase().contains("roubar")){
            throw new PromptInadequadoException("Prompt contem palavras inadequadas!");
        }

        System.out.println("Agente processando: " + prompt);
    }

    public void chamarModeloExterno() throws ErroComunicacaoIAException{
        if(Math.random() > 0.7){
            throw new ErroComunicacaoIAException("Erro de comunicaçao");
        }
    }
}