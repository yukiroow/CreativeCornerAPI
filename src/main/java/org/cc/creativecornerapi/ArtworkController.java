package org.cc.creativecornerapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {

    private ArtworkService artworkService;

    public ArtworkController(ArtworkService artworkService) {
        this.artworkService = artworkService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Artwork>> getAllArtworks() {
        return new ResponseEntity<>(artworkService.getAllArtworks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artwork> getArtworkById(@PathVariable int id) {
        Artwork artwork = artworkService.getArtwork(id);
        return artwork == null ? new ResponseEntity<>(null, HttpStatus.NOT_FOUND) : new ResponseEntity<>(artwork, HttpStatus.OK);
    }

}
