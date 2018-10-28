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
public abstract class CategorizedDesignPatternInfo implements CategorizedDesignPattern, DesignPatternInfo {

    @Override
    public boolean areSameType(CategorizedDesignPattern pattern1) {
        return patternType().equals(pattern1.patternType());
    }

    abstract DesignPatternInfo getDesignPatternInfo(); // package private

}
