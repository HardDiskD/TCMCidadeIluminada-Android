package br.com.bilac.tcm.cidadeiluminada.services.cidadeiluminada.models;

import br.com.bilac.tcm.cidadeiluminada.models.Protocolo;

/**
 * Created by arthur on 04/04/15.
 */
public class CidadeIluminadaApiResponse {
    private String status;

    public Protocolo getProtocolo() {
        return protocolo;
    }

    private static class Errors {
        private String cod_protocolo;
        private String cep;
        private String email;
        private String nome;
        private String estado;
        private String cidade;
        private String bairro;
        private String logradouro;
        private String numero;
        private String arquivo_protocolo;


        public Errors() {
        }

        @Override
        public String toString() {
            return "Errors{" +
                    "cod_protocolo='" + cod_protocolo + '\'' +
                    ", cep='" + cep + '\'' +
                    ", email='" + email + '\'' +
                    ", nome='" + nome + '\'' +
                    ", estado='" + estado + '\'' +
                    ", cidade='" + cidade + '\'' +
                    ", bairro='" + bairro + '\'' +
                    ", logradouro='" + logradouro + '\'' +
                    ", numero='" + numero + '\'' +
                    ", arquivo_protocolo='" + arquivo_protocolo + '\'' +
                    '}';
        }
    }

    private Errors errors;

    private Protocolo protocolo;

    public CidadeIluminadaApiResponse() {
    }

    @Override
    public String toString() {
        return "CidadeIluminadaApiResponse{" +
                "status='" + status + '\'' +
                ", errors=" + errors +
                ", protocolo=" + protocolo +
                '}';
    }
}
