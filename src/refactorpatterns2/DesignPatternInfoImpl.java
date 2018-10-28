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
public class DesignPatternInfoImpl implements DesignPatternInfo{

    public DesignPatternInfoImpl(String usageExample, String description) {
        this.usageExample = usageExample;
        this.description = description;
    }

    private String usageExample;
    private String description;
    
    @Override
    public String getUsageExample() {
        return usageExample;
    }

    @Override
    public String getDescription() {
        return description;
    }

    
}
