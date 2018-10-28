/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;


import java.util.Set;

/**
 *
 * @author cx
 */
public interface DesignPatternInfoProvider {
    public Set<String> listPatternNames();
    public String getUsageExample(String patternName);
    public String getDescription(String patternName);
}
