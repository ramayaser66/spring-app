package com.lab11.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

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

    @Autowired
    AlbumRepository albumRepository;

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





}
