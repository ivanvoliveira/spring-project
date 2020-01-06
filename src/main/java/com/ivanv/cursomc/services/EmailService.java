package com.ivanv.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ivanv.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
