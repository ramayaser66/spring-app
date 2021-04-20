package com.lab11.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;



    @GetMapping("/myAlbums")

    public String albums(Model m){
     Album rare = new Album("Rare", "Selena Gomes",3, 41.53, "https://images-na.ssl-images-amazon.com/images/I/51xbm7CXnfL._AC_SX425_.jpg");
     Album loud = new Album("loud", "Rihanna",7, 46.39, "https://images-na.ssl-images-amazon.com/images/I/518nzdVvXnL._SY355_.jpg");
     Album revival = new Album("revival", "Eminem",19, 77.39, "https://images-na.ssl-images-amazon.com/images/I/71pSCRiMfXL._SL1050_.jpg");




        List<Album> albums = new ArrayList<>();
        albums.add(rare);
        albums.add(loud);
        albums.add(revival);


        m.addAttribute("albums",albums);
        return "albums.html";
    }

    //lab-12



    @GetMapping("/albums")
    public String getAllStudents(Model m){
        m.addAttribute("albums" ,albumRepository.findAll());
        return "myAlbums.html";

    }



    @GetMapping("/addAlbum")
    public String getAddAlbum(){
        return "addAlbum.html";
    }

    @PostMapping("/albums")
    public RedirectView addStudent(@RequestParam(value = "title") String title ,
                                   @RequestParam(value= "artist") String artist,
                                   @RequestParam(value="songCount") int songCount,
                                   @RequestParam(value="length") double length,
                                   @RequestParam(value= "imageUrl") String imageUrl){

        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return  new RedirectView("/albums");
    }



    @GetMapping("/albums/{id}")
    public String getAllAlbums(@PathVariable int id , Model m){

        try {
            Album album = albumRepository.findById(id).get();
            List<Song> song = songRepository.findSongById(id);
            m.addAttribute("songs", song);
            m.addAttribute("album", album);
            return "theAlbum.html";
        }catch (Exception ex){
            return "error.html";
        }
    }





    @GetMapping("/addSongs/{id}")
    public String getAddedSongs(@PathVariable int id , Model m) {

        try {
            m.addAttribute("album", id);

            return "addedSongs.html";
        }catch (Exception ex){
            return "error.html";
        }
    }

    }
