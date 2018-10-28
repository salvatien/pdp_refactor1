/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import refactorpatterns2.datasources.DesignPatternDao;
import refactorpatterns2.datasources.DesignPatternDataSource;

/**
 *
 * @author cx
 */
class DesignPatternLoader {

    private static volatile Map<String, CategorizedDesignPatternInfo> patternsMap;

    static Map<String, CategorizedDesignPatternInfo> getPatterns(DesignPatternDataSource dataSource) {
        if (null == patternsMap) {
            patternsMap = new HashMap<>();
            Iterator<DesignPatternDao> dataSourceIterator = dataSource.iterator();
            while (dataSourceIterator.hasNext()) {
                DesignPatternDao designPatternDao = dataSourceIterator.next();
                CategorizedDesignPatternInfoImpl.CategorizedDesignPatternInfoBuilder builder
                        = CategorizedDesignPatternInfoImpl.builder();

                CategorizedDesignPatternInfo pattern = builder
                        .withPatternCode(designPatternDao.getCode())
                        .withPatternDescription(designPatternDao.getDescription())
                        .withPatternExample(designPatternDao.getUsageExample())
                        .withPatternType(designPatternDao.patternType())
                        .withPatternName(designPatternDao.patternName())
                        .build();
                patternsMap.put(pattern.patternName(), pattern);
            }
        }
        return patternsMap;
    }
}

