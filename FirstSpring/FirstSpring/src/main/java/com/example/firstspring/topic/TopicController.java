package com.example.firstspring.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring","spring framework", "spring framework description"),
                new Topic("java","java framework", "java framework description"),
                new Topic("javascript","js framework", "js framework description")
        );
    }
}
