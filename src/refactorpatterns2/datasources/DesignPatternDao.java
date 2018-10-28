/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2.datasources;

import refactorpatterns2.CategorizedDesignPattern;
import refactorpatterns2.DesignPatternInfo;

/**
 *
 * @author cx
 */
public interface DesignPatternDao extends CategorizedDesignPattern, DesignPatternInfo{
    public String getCode();
}
