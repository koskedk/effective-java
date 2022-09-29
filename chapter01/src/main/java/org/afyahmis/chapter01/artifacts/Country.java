package org.afyahmis.chapter01.artifacts;

public class Country {
    private final String code;
    private final String name;
    private final String region;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public static class Builder{
        private final String code;
        private final String name;
        private String region;

        public Builder(String code, String name) {
            this.code = code.toUpperCase();
            this.name = name;
        }
        public Builder AddRegion(String val){
            this.region=val;
            return this;
        }
        public Country Build(){
            return new Country(this);
        }
    }

    public Country(Builder builder) {
        this.code=builder.code;
        this.name=builder.name;
        this.region=builder.region;
    }

}
