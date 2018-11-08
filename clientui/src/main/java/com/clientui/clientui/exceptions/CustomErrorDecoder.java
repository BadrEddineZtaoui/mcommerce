package com.clientui.clientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CostumErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if(response.status() == 404){
            return new ProductNotFoundException("Produit non trouvé !!");
        }
        return null;
    }
}
