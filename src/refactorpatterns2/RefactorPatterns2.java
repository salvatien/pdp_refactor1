/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorpatterns2;

import refactorpatterns2.codeloaders.CodeLoader;
import java.util.ArrayList;
import java.util.List;
import refactorpatterns2.codeloaders.FileCodeLoaderImpl;

/**
 *
 * @author cx
 */
public class RefactorPatterns2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> betterCode = new ArrayList<>();
        DesignPatternManager designPatternManager = DesignPatternManager.getInstance();
        DesignPatternInfoProvider infoProvider = designPatternManager.getInfoProvider();
        CodeLoader codeLoader = new FileCodeLoaderImpl("code.java");
        for (String pattern : infoProvider.listPatternNames()) {
            betterCode.add(designPatternManager.getPatternByName(pattern)
                          .refactorCode(codeLoader.readCode())
            );
        }
    }

}
