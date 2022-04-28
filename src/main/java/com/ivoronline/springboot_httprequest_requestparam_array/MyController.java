package com.ivoronline.springboot_httprequest_requestparam_array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {

  //==========================================================
  // READ INTO ARRAY
  //==========================================================
  @RequestMapping("ReadIntoArray")
  String[] readIntoArray(@RequestParam String[] names) {

    //READ REQUEST PARAMETERS
    for(String name : names) {
      System.out.println(name);
    }

    //RETURN REQUEST PARAMETERS
    return names;

  }

  //==========================================================
  // READ INTO LIST
  //==========================================================
  @RequestMapping("ReadIntoList")
  List<String> readIntoList(@RequestParam List<String> names) {

    //READ REQUEST PARAMETERS
    for(String name : names) {
      System.out.println(name);
    }

    //RETURN REQUEST PARAMETERS
    return names;

  }

}
