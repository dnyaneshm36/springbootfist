package com.dnyanesh.learn.crudjdbc.model;

import it.unisa.dia.gas.jpbc.Element;

public class SetupParamter {

        Element P;
        Element master_key_lamda;
        Element PKc;
        Element SKc;
        public SetupParamter(Element p, Element master_key_lamda, Element pKc, Element sKc) {
            this.P = p.duplicate();
            this.master_key_lamda = master_key_lamda.duplicate();
            this.PKc = pKc.duplicate();
            this.SKc = sKc.duplicate();
        }
        public SetupParamter() {
        }
        public Element getP() {
            return P;
        }
        public void setP(Element p) {
            P = p.duplicate();
        }
        public Element getMaster_key_lamda() {
            return master_key_lamda;
        }
        public void setMaster_key_lamda(Element master_key_lamda) {
            this.master_key_lamda = master_key_lamda;
        }
        public Element getPKc() {
            return PKc;
        }
        public void setPKc(Element pKc) {
            PKc = pKc.duplicate();
        }
        public Element getSKc() {
            return SKc;
        }
        public void setSKc(Element sKc) {
            SKc = sKc.duplicate();
        }
        @Override
        public String toString() {
            return "SetupParamter { P= [ " + P + " ] , PKc= [ " + PKc + " ] , SKc= [ " + SKc + " ] , master_key_lamda= [ " + master_key_lamda
                    + " ] }";
        }
        
    
}
