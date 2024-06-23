package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {


    private boolean succsess;
    private String message;
    private Integer code;
    private Object data;


    public ResponseWrapper( String message, Object data) {
        this.data = data;
        this.message = message;
        this.code= HttpStatus.OK.value();
        this.succsess=true;

    }

    public ResponseWrapper(String message){
        this.message=message;
        this.code=HttpStatus.OK.value();
        this.succsess=true;
    }
}
