package com.cbgmall.service;

import com.cbgmall.dto.EmailDTO;

public interface EmailService {

	public void sendMail(EmailDTO dto, String message);
}
