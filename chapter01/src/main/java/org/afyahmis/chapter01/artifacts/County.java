package org.afyahmis.chapter01.artifacts;

public class County {
    private final int code;
    private final String name;
    private String governor;
    private String deputyGovernor;
    private String senator;
    private String womenRep;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getGovernor() {
        return governor;
    }

    public String getDeputyGovernor() {
        return deputyGovernor;
    }

    public String getSenator() {
        return senator;
    }

    public String getWomenRep() {
        return womenRep;
    }


    public static class Builder {
        private final int code;
        private final String name;
        private String governor;
        private String deputyGovernor;
        private String senator;
        private String womenRep;

        public Builder(int code,String name){
            this.code=code;
            this.name=name;
        }
        public Builder Governor(String val) {
            this.governor = val;
            return this;
        }
        public Builder DeputyGovernor(String val) {
            this.deputyGovernor = val;
            return this;
        }
        public Builder Senator(String val) {
            this.senator = val;
            return this;
        }
        public Builder WomenRep(String val) {
            this.womenRep = val;
            return this;
        }
        public County Build(){
            return new County(this);
        }
    }
    private County(Builder builder){
        this.code=builder.code;
        this.name=builder.name;
        this.governor=builder.governor;
        this.deputyGovernor=builder.deputyGovernor;
        this.senator=builder.senator;
        this.womenRep=builder.womenRep;
    }

    @Override
    public String toString() {
        return this.code+" "+this.name;
    }
}
