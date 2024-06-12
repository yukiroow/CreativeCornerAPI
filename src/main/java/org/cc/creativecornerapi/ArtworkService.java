package org.cc.creativecornerapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtworkService {
    private ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    public List<Artwork> getAllArtworks() {
        List<Artwork> artworks = new ArrayList<Artwork>();
        artworkRepository.findAll().forEach(artworks::add);
        return artworks;
    }

    public Artwork getArtwork(int id) {
        Optional<Artwork> artwork = artworkRepository.findById(id);
        return artwork.orElse(null);
    }
}
