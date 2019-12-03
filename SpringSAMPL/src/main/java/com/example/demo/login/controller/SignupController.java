package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

		//ラジオボタンの実装
	private Map<String , String> radioMarriage;


	/**
	 * ラジオボタンの初期化メソッド
	 * @return
	 */
	public Map<String , String> initRadioMarriage(){

		Map<String , String> radio = new LinkedHashMap<>();


		radio.put("既婚", "true");
		radio.put("未婚", "false");

		return radio;
	}


	@GetMapping("/signup")
	public String getSignUp(Model model) {

		radioMarriage = this.initRadioMarriage();

		//ラジオボタン用のMapをModelに登録
		model.addAttribute("radioMarriage", radioMarriage);

		return "login/signup";
	}

	@PostMapping("/signup")
	public String postSignUp() {

			//login.htmlにリダイレクト
		return "redirect:/login";
	}
}
