package com.cg.fas.exception;

public class SupplierNotFoundException extends RuntimeException {

 

    private static final long serialVersionUID = 1L;
        public SupplierNotFoundException()
        {
        super();

        }
        public SupplierNotFoundException(String message)
        {
            super(message);
        }
}