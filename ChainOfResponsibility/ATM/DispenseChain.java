package com.swep.design.chainofresponsibility;
 
public interface DispenseChain {
 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}