package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.entite.CarteFidelite;
import org.example.tpcafechaimasammoud.entite.Client;
import org.example.tpcafechaimasammoud.repositeries.CarteFideliteRepository;
import org.example.tpcafechaimasammoud.repositeries.ClientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService {
    CarteFideliteRepository carteFideliteRepository;
    ClientRepository clientRepository;

    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite carteFidelite) {
        return carteFideliteRepository.save(carteFidelite);
    }

    @Override
    public List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite) {
        return carteFideliteRepository.saveAll(cartesFidelite);
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(long id) {
        return carteFideliteRepository.findById(id).get();
    }

    @Override
public CarteFidelite selectCarteFideliteByIdWithOrElse(long id) {
    CarteFidelite fakeCarteFidelite = CarteFidelite.builder()
        .pointsAccumules(100)
        .dateCreation(LocalDate.now())
        .build();
    return carteFideliteRepository.findById(id).orElse(fakeCarteFidelite);
}

    @Override
    public List<CarteFidelite> selectAllCartesFidelite() {
        return carteFideliteRepository.findAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite carteFidelite) {
        carteFideliteRepository.delete(carteFidelite);
    }

    @Override
    public void deleteAllCartesFidelite() {
        carteFideliteRepository.deleteAll();
    }

    @Override
    public void deleteCarteFideliteById(long id) {
        carteFideliteRepository.deleteById(id);
    }

    @Override
    public long countingCartesFidelite() {
        return carteFideliteRepository.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return carteFideliteRepository.existsById(id);
    }
    public void ajouterClientEtCarteFidelite(CarteFidelite carteFidelite) {
        Client c=clientRepository.save(carteFidelite.getClient());
        carteFidelite=carteFideliteRepository.save(carteFidelite);
        // parent ?  howa client child ? howa carte fidelite
        c.setCarteFidelite(carteFidelite);
        clientRepository.save(c);

        // Implementation pending
    }
    public void addClientEtCarteFidelite(Client client){
        // la creation de la carte fidelité se fait dans le code
        CarteFidelite carteFidelite= CarteFidelite.builder()
                .pointsAccumules(0)
                .dateCreation(LocalDate.now())
                .build();
        client.setCarteFidelite(carteFidelite);
        clientRepository.save(client);
    }
}