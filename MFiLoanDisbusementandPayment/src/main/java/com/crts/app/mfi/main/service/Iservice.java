package com.crts.app.mfi.main.service;

import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.PaymentAcknowledgeLetter;

@Service
public interface Iservice 
{
    public void saveData(PaymentAcknowledgeLetter pal);
    
}
