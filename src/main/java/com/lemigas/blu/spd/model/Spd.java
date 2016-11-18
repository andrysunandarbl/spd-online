/**
 * Innovez-One, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, Innovez-One and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Innovez-One.
 *
 *  Website : http://www.innovez-one.com/
 *  Report bugs to <techsupport@innovez-one.com>.
 *  Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.lemigas.blu.spd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author andry on 16/11/16.
 */
@Entity
@Table
public class Spd {

    @Id
    private String noSpd;

    @Column
    private int nip;

    public Spd() {
    }

    public Spd(String noSpd, int nip) {
        this.noSpd = noSpd;
        this.nip = nip;
    }

    public String getNoSpd() {
        return noSpd;
    }

    public void setNoSpd(String noSpd) {
        this.noSpd = noSpd;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    
}
