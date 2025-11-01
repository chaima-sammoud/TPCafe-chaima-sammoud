package org.example.tpcafechaimasammoud.Services;

import org.example.tpcafechaimasammoud.entite.CarteFidelite;

import java.util.List;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite carteFidelite);
    List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite);
    CarteFidelite selectCarteFideliteByIdWithGet(long id);
    CarteFidelite selectCarteFideliteByIdWithOrElse(long id);
    List<CarteFidelite> selectAllCartesFidelite();
    void deleteCarteFidelite(CarteFidelite carteFidelite);
    void deleteAllCartesFidelite();
    void deleteCarteFideliteById(long id);
    long countingCartesFidelite();
    boolean verifCarteFideliteById(long id);
}