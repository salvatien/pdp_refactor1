/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;

import java.util.HashMap;
import java.util.Map;
import refactorpatterns2.datasources.DesignPatternDataSource;
import refactorpatterns2.datasources.DesignPatternDataSourceImpl;

/**
 *
 * @author cx
 */
public class DesignPatternManager {

    private Map<String, CategorizedDesignPatternInfo> patternsMap; 
    private static volatile DesignPatternManager designPatternManager = new DesignPatternManager();

    private DesignPatternManager() {
        DesignPatternDataSource dataSource = new DesignPatternDataSourceImpl(); // provide impl of data source
        patternsMap = DesignPatternLoader.getPatterns(dataSource);
    }

    public static DesignPatternManager getInstance() {
        return designPatternManager; // can be chenged to lazy
    }

    public DesignPatternInfoProvider getInfoProvider() {
        Map<String, DesignPatternInfo> patternInfos = new HashMap<>();
        for (String pattern : patternsMap.keySet()) {
            patternInfos.put(pattern, patternsMap.get(pattern).getDesignPatternInfo());
        }
        return new DesignPatternInfoProviderImpl(patternInfos);
    }

    public CategorizedDesignPattern getPatternByName(String patternName) {
        return patternsMap.get(patternName);
    }
}
