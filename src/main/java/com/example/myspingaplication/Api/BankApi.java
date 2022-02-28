package com.example.myspingaplication.Api;

import com.example.myspingaplication.entity.Bank;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("api/v1/banks")
public class BankApi {
    static ArrayList<Bank> list = new ArrayList<>();
    {
        list.add(new Bank(1,2,3,4));
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Bank>> getList(){
        return new ResponseEntity<ArrayList<Bank>>(list, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody Bank bank){

        list.add(bank);

        return new ResponseEntity<>(bank, HttpStatus.CREATED);
    }
}
