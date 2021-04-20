package com.lab11.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
   AlbumRepository albumRepository;




    @GetMapping("/songs")
    public String getSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs.html";
    }



//
//    @PostMapping("/songs")
//    public RedirectView addSongs(int album , String title, int length, int trackNumber)
//    {
//        Album albums = albumRepository.findAlbumById(album);
//        Song song = new Song(title, length, trackNumber,albums);
//        songRepository.save(song);
//        return  new RedirectView("/songs");
//    }


    @PostMapping("/songs")

    public RedirectView addSong(String title ,int albumId, int length,int trackNumber) {

        try {
            Album album = albumRepository.findAlbumById(albumId);
            Song song = new Song(title, length, trackNumber, album);
            songRepository.save(song);
            return new RedirectView("/songs");
         }catch (Exception ex){
        return new RedirectView ("error.html");
    }
    }






}
