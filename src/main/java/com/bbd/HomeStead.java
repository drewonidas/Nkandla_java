package com.bbd;

import static java.sql.Types.NULL;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class HomeStead {
    private String Name;
    private String District;
    private String Province;
    private String Country;

    public HomeStead(String name, String district, String province, String country) {
        Name = name;
        District = district;
        Province = province;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "HomeStead{" +
                "Name='" + Name + '\'' +
                ", District='" + District + '\'' +
                ", Province='" + Province + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    public void accept(IVisitor visitor) {
        if (!visitor.equals(NULL))
            visitor.visit(this);
    }
}
