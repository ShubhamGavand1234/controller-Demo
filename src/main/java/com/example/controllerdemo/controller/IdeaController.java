package com.example.controllerdemo.controller;

import com.example.controllerdemo.dto.IdeaResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/demo_app")
public class IdeaController {

    private static final Map<Integer, IdeaResource> IDEA_MAP = new HashMap<>(); // this acts as ain memory storage

    public  IdeaController(){
        IdeaResource ideaResource1 =new IdeaResource(121,"crazy idea","this will make people crazy", "Shubham");
        IdeaResource ideaResource2 =new IdeaResource(122,"simple idea","this is not crazy", "Mau");
        IDEA_MAP.put(ideaResource1.getId(), ideaResource1);
        IDEA_MAP.put(ideaResource2.getId(), ideaResource2);
    }

//    Search idea based on id by using  Path variable

    @GetMapping(value = "/ideas/{X}")
    public ResponseEntity fetchIdeaBasedOnId(@PathVariable(name="X") int id){
        return new ResponseEntity( IDEA_MAP.get(id), HttpStatus.OK);
    }

}
