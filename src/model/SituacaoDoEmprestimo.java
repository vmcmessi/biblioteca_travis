/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Beatriz
 */
public enum SituacaoDoEmprestimo {
    LOCADO("Locado"), DEVOLVIDO("Devolvido");
    
    private String descricao;
    
    SituacaoDoEmprestimo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
