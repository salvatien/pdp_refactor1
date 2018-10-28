/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;

/**
 *
 * @author cx
 */
public interface CategorizedDesignPattern extends DesignPattern{
    public boolean areSameType(CategorizedDesignPattern pattern1);
    public String patternType();
    public String patternName();
}
