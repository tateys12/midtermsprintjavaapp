//package com.keyin.demo;
//
//import org.apache.commons.io.FileUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//@RestController
//@RequestMapping("/cities")
//public class CityController {
//
//    @GetMapping
//    public List<String> getCities() throws IOException {
//        File file = new File("C:\\Users\\tfoll\\Downloads\\demo\\demo\\src\\main\\java\\com\\keyin\\demo\\cities.txt");
//        return FileUtils.readLines(file, "UTF-8");
//    }
//}
