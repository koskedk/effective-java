package org.afyahmis.chapter01.artifacts;

import java.util.Objects;

public class PhoneNumber implements Cloneable {
    private int hashCode;
    private final long areaCode,number;
    private long prefix;
    public PhoneNumber(long areaCode, long prefix, long number) {
        this.areaCode = rangeCheck(areaCode, 255, "Area code");
        this.prefix = rangeCheck(prefix, 77, "Prefix");
        this.number = rangeCheck(number, 999999,"Number");
    }

    public void changeTo(long prefix)
    {
        this.prefix=prefix;
    }

    private long rangeCheck(long val,int max, String item) {
        if(val<0||val>max)
            throw new IllegalArgumentException(item+" is invalid !");
        return val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && number == that.number && prefix == that.prefix;
    }

    @Override
    public int hashCode() {
        int result=hashCode;
        if(result==0){
            result=Long.hashCode(areaCode);
            result=31*result+Long.hashCode(prefix);
            result=31*result+Long.hashCode(number);
            hashCode=result;
        }
        return result;
    }

    /*
            @Override
            public boolean equals(Object obj) {
                if(obj==this)
                    return true;
                if(!(obj instanceof PhoneNumber))
                    return false;
                PhoneNumber p=(PhoneNumber) obj;
                return p.areaCode==areaCode && p.prefix==prefix && p.number==number;
            }

            @Override
            public int hashCode() {
                int result=hashCode;
                if(result==0){
                    result=31*result+Long.hashCode(prefix);
                    result=32*result+Long.hashCode(number);
                    hashCode=result;
                }
                return result;
            }
        */

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return areaCode + "-" + prefix + "-" + number+" ["+hashCode()+"]";
    }
}
