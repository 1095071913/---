package com.maozi.oauth.config;

import com.maozi.base.error.code.SystemErrorCode;
import com.maozi.common.BaseCommon;
import com.maozi.utils.MapperUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.security.web.firewall.RequestRejectedHandler;

@Configuration
public class IRequestRejectedHandler extends BaseCommon<SystemErrorCode> implements RequestRejectedHandler {

    private Integer errorCode = 402;

   @Override
   public void handle(HttpServletRequest request, HttpServletResponse response,RequestRejectedException ex){
	   MapperUtils.setResponseBody(response,error(getCodes().MALICE_REQUEST_ERROR,errorCode).autoIdentifyHttpCode());
   }
   
}