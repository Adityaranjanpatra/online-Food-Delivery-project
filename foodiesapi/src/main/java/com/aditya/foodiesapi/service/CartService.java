package com.aditya.foodiesapi.service;

import com.aditya.foodiesapi.io.CartRequest;
import com.aditya.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
