/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author cx
 */
public class DesignPatternInfoProviderImpl implements DesignPatternInfoProvider {

    private Map<String, DesignPatternInfo> patternInfos;

    DesignPatternInfoProviderImpl(Map<String, DesignPatternInfo> patternInfos) {
        this.patternInfos = patternInfos;
    }

    @Override
    public Set<String> listPatternNames() {
        return patternInfos.keySet();
    }

    @Override
    public String getUsageExample(String patternName) {
        DesignPatternInfo designPatternInfo = patternInfos.get(patternName);
        return null != designPatternInfo ? designPatternInfo.getUsageExample() : null;
    }

    @Override
    public String getDescription(String patternName) {
        DesignPatternInfo designPatternInfo = patternInfos.get(patternName);
        return null != designPatternInfo ? designPatternInfo.getDescription() : null;
    }

}
