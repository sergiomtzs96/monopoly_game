/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sergiomtzs.monopoly.data;

/**
 *
 * @author Sergio
 */
public class Casilla extends BaseCasilla {
    GroupColor grupoColor;

    public Casilla() {
    }

    public GroupColor getGrupoColor() {
        return grupoColor;
    }

    public String getName() {
        return name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setGrupoColor(GroupColor grupoColor) {
        this.grupoColor = grupoColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}

class CasillaComunityBox extends BaseCasilla{

    public CasillaComunityBox() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}

class CasillaSuerte extends BaseCasilla{

    public CasillaSuerte() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}

class CasillaStation extends BaseCasilla{
    Station station;

    public CasillaStation() {
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}



class CasillaTax extends BaseCasilla{
    Tax tax;

    public CasillaTax() {
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}

class CasillaPublicServices extends BaseCasilla{
    PublicServices services;

    public CasillaPublicServices() {
    }

    public PublicServices getServices() {
        return services;
    }

    public void setServices(PublicServices services) {
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
}

enum Special {
    START, JAIL, PARKING, GOTOJAIL
}

enum GroupColor{
    MARRON, CELESTE, MAGENTA, NARANJA, ROJO, AMARILLO, VERDE, AZUL
}

enum PublicServices{
    LUZ, AGUA
}

enum Tax{
    LUJO, ALCOHOL
}

enum Station{
    NORTE, SUR, ESTE, OESTE
}