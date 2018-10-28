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
public class CategorizedDesignPatternInfoImpl extends CategorizedDesignPatternInfo {

    private CategorizedDesignPatternInfoImpl(CategorizedDesignPatternInfoBuilder initializer) {
        this.patternName = initializer.patternName;
        this.patternCode = initializer.patternCode;
        this.patternType = initializer.patternType;
        this.patternExample = initializer.patternExample;
        this.patternDescription = initializer.patternDescription;
    }

    private String patternName;
    private String patternCode;
    private String patternType;
    private String patternExample;
    private String patternDescription;

    @Override
    public String patternType() {
        return patternType; // Strings are immutable, so it's ok to return field
    }

    @Override
    public String refactorCode(String badCode) {
        // using patternCode create:
        return "Refactored code";
    }

    @Override
    public String getUsageExample() {
        return patternExample;
    }

    @Override
    public String getDescription() {
        return patternDescription;
    }

    @Override
    public String patternName() {
        return patternName;
    }

    @Override
    DesignPatternInfo getDesignPatternInfo() {
        return new DesignPatternInfoImpl(patternDescription, patternExample);
    }

    public static class CategorizedDesignPatternInfoBuilder {

        private CategorizedDesignPatternInfoBuilder() {
        }

        public CategorizedDesignPatternInfoBuilder withPatternCode(String patternCode) {
            this.patternCode = patternCode;
            return this;
        }

        public CategorizedDesignPatternInfoBuilder withPatternType(String patternType) {
            this.patternType = patternType;
            return this;
        }

        public CategorizedDesignPatternInfoBuilder withPatternExample(String patternExample) {
            this.patternExample = patternExample;
            return this;
        }

        public CategorizedDesignPatternInfoBuilder withPatternDescription(String patternDescription) {
            this.patternDescription = patternDescription;
            return this;
        }

        public CategorizedDesignPatternInfoBuilder withPatternName(String patternName) {
            this.patternName = patternName;
            return this;
        }
        
        private String patternName;
        private String patternCode;
        private String patternType;
        private String patternExample;
        private String patternDescription;

        public CategorizedDesignPatternInfo build() {
            if (null == patternCode || null == patternType || null == patternName
                    || null == patternExample || null == patternDescription) {
                throw new IllegalArgumentException("Arguments must not be null");
            }
            return new CategorizedDesignPatternInfoImpl(this);
        }
    }

    public static CategorizedDesignPatternInfoBuilder builder() {
        return new CategorizedDesignPatternInfoBuilder();
    }

}
