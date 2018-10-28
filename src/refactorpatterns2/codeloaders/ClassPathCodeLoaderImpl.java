/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2.codeloaders;

/**
 *
 * @author cx
 */
public class ClassPathCodeLoaderImpl implements CodeLoader{

    @Override
    public String readCode() {
        return "Bad code from class path";
    }
    
}
