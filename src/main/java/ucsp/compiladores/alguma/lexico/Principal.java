/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream; 
import org.antlr.v4.runtime.CharStreams; 
import org.antlr.v4.runtime.Token;

/**
 *
 * @author renzoalesandro
 */
public class Principal {
    public static void main(String[] args) {
        try {
            // args[0] es el primer argumento de la linea de comando 
            CharStream cs = CharStreams.fromFileName(args[0]); 
            AlgumaLexer lex = new AlgumaLexer(cs);
            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                System.out.println("<"+AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText()+">");
            }
        } catch (IOException ex) {
        } 
    }
}