/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2.datasources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cx
 */
public class DesignPatternDataSourceImpl implements DesignPatternDataSource{
    List<DesignPatternDao> patternData = new ArrayList<>(); // add data here
    @Override
    public Iterator<DesignPatternDao> iterator() {
        return patternData.iterator();
    }
    
}
