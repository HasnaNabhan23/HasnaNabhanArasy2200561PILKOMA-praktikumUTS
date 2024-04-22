package uts_pbo;

public class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;

    public LimasSegiEmpat(){
        luasAlas = 1;
        luasSelubungLimas = 1;
        tinggi = 1;
    }

    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
        luasAlas = luasAlasBaru;
        luasSelubungLimas = luasSelubungLimasBaru;
        tinggi = tinggiBaru;
    }

    double getLuas(){
        return  luasAlas + luasSelubungLimas;
    }
    
    double getVolume(){
        return luasAlas * tinggi / 3;
    }

    public void setLuasAlas(double luasAlasBaru){
        luasAlas = luasAlasBaru;
    }
    public void setLuasselubungLimas(double luasSelubungLimasBaru){
        luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru){
        tinggi = tinggiBaru;
    }
}
