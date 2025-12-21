package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteRequest;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService{
    CarteFideliteRepository repo;
    CarteFideliteMapper mapper;
    ClientRepository clientRepo;
    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite a) {
        return repo.save(a);
    }

    @Override
    public CarteFideliteResponse saveCarteFideliteDTO(CarteFideliteRequest c) {
        return mapper.fromEntityToDTO(repo.save(mapper.fromDTOToEntity(c)));
    }

    @Override
    public List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> carteFidilites) {
        return repo.saveAll(carteFidilites);
    }

    @Override
    public List<CarteFideliteResponse> saveListCarteFidelteDTO(List<CarteFideliteRequest> c) {
        return mapper.fromListEntityToDTO(repo.saveAll(mapper.fromListDTOToListEntity(c)));
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(long id) {
        return repo.findById(id).get();
    }

    @Override
    public CarteFideliteResponse getCarteFideliteByIdDTO(long id) {
        return mapper.fromEntityToDTO(repo.findById(id).get());
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithOrElse(long id) {
        CarteFidelite fakeCarteFidelite = CarteFidelite.builder()
                .build();
        return repo.findById(id).orElse(fakeCarteFidelite);
    }

    @Override
    public List<CarteFidelite> selectAllCarteFidelite() {
        return repo.findAll();
    }

    @Override
    public List<CarteFideliteResponse> getAllCarteFideliteDTO() {
        return mapper.fromListEntityToDTO(repo.findAll());
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite a) {
        repo.delete(a);
    }

    @Override
    public void deleteAllCarteFidelite() {
        repo.deleteAll();
    }

    @Override
    public void deleteCarteFideliteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public long countingCarteFidelite() {
        return repo.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return repo.existsById(id);
    }

    @Override
    public void affecterCarteAClient(long idCarte, long idClient) {
        // 1- findById -> carte (child)
        CarteFidelite carte = repo.findById(idCarte).get();
        // 1- findById -> client
        Client client = clientRepo.findById(idClient).get();
        // On affecte le child au parent set
        client.setCarteFidelite(carte);
        // Persiste .save


    }

    @Override
    public List<String> incrementerPointsFidelite() {
        List<Client> clients = clientRepo.findAll();
        List<String> clientsUpdated = new ArrayList<>();
        for (Client c : clients) {
            CarteFidelite carte = c.getCarteFidelite();
            if (carte != null) {
                LocalDate creationDate = carte.getDateCreation();
                if (creationDate != null && creationDate.getMonth() == LocalDate.now().getMonth()) {
                    int currentPoints = carte.getPointsAccumules();
                    carte.setPointsAccumules(currentPoints + 100);
                    repo.save(carte);
                    clientsUpdated.add(c.getNom() + " " + c.getPrenom());
                }
            }
        }
        return clientsUpdated;

    }
}
