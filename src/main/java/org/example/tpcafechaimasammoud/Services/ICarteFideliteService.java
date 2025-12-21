package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteRequest;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.util.List;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite a);
    CarteFideliteResponse saveCarteFideliteDTO(CarteFideliteRequest c);

    List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> carteFidilites);
    List<CarteFideliteResponse> saveListCarteFidelteDTO(List<CarteFideliteRequest> c);

    CarteFidelite selectCarteFideliteByIdWithGet(long id);
    CarteFideliteResponse getCarteFideliteByIdDTO(long id);

    CarteFidelite selectCarteFideliteByIdWithOrElse(long id);
    List<CarteFidelite> selectAllCarteFidelite();
    List<CarteFideliteResponse> getAllCarteFideliteDTO();

    void deleteCarteFidelite(CarteFidelite a);
    void deleteAllCarteFidelite();
    void deleteCarteFideliteById(long id);
    long countingCarteFidelite();
    boolean verifCarteFideliteById(long id);

    void affecterCarteAClient(long idCarte , long idClient);
    List<String> incrementerPointsFidelite();
}
