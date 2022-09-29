package org.afyahmis.chapter01;

import org.afyahmis.chapter01.artifacts.Country;
import org.afyahmis.chapter01.artifacts.County;
import org.afyahmis.chapter01.artifacts.PhoneNumber;

public class Lesson101 {

    public Country useTelescope(String code, String name, String region){
        return new Country.Builder(code,name)
                .AddRegion(region)
                .Build();
    }

    public County useBuilder(int code, String name, String governor, String deputyGovernor, String senator, String womenRep) {
        return new County.Builder(code, name)
                .Governor(governor)
                .DeputyGovernor(deputyGovernor)
                .Senator(senator)
                .WomenRep(womenRep)
                .Build();
    }

    public boolean checkIfEqual(PhoneNumber a, PhoneNumber b) {
        return a.equals(b);
    }
}
