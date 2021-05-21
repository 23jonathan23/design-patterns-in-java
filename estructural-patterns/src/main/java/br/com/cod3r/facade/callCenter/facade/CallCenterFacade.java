package br.com.cod3r.facade.callCenter.facade;

import java.util.List;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.CardService;
import br.com.cod3r.facade.callCenter.services.PaymentService;
import br.com.cod3r.facade.callCenter.services.RegisterService;
import br.com.cod3r.facade.callCenter.services.ReportService;
import br.com.cod3r.facade.callCenter.services.SecurityService;

public class CallCenterFacade {
    private CardService _cardService; 
    private RegisterService _registerService; 
    private ReportService _reportService; 
    private PaymentService _paymentService; 
    private SecurityService _securityService;
    
    public CallCenterFacade() {
        _cardService = new CardService();
        _registerService = new RegisterService();
        _reportService = new ReportService(_registerService);
        _paymentService = new PaymentService(_registerService);
        _securityService = new SecurityService(_cardService, _registerService);
    }

    public Card getCardByUser(Long l) {
        return _cardService.getCardByUser(l);
    }

    public void getSumary(Card card) {
        _reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        _paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = _registerService.getRegistersByCard(card);
        _registerService.removeByIndex(card, registers.size() - 1);

        List<Register> pendingRegisters = _securityService.blockCard(card);
        
        Card newCard = _cardService.createNewCard(123456L, 33445566L);
        _registerService.addCardRegisters(newCard, pendingRegisters);
        _reportService.getSumary(newCard);
    }
}
