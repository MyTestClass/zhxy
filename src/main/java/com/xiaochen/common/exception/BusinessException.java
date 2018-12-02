package com.xiaochen.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 2031122546279731273L;
	private String code;
	private String message;
	public BusinessException(){
	}
	public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }
	@Override
	public String toString() {
		return this.message+"; code:"+this.code;
	}
}
