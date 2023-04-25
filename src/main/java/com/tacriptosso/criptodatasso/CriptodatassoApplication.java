package com.tacriptosso.criptodatasso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("us/TransAmericaCripto")
@SpringBootApplication
public class CriptodatassoApplication {

	@GetMapping
	public static String getmessage(){
		return "hola mundo";
	}

	@PostMapping
	public static String encripData(@RequestBody String jsonRequest) {
		Gson gson = new Gson();
		SeismicSSOData_Model.DataModel dataModel = gson.fromJson(jsonRequest, SeismicSSOData_Model.DataModel.class);
		return encriptData.generateTokenDomain(dataModel);
	}

	public static void main(String[] args) {
		SpringApplication.run(CriptodatassoApplication.class, args);
	}

}
