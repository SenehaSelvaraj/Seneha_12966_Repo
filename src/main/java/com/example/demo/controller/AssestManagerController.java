package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AssestEntity;
import com.example.demo.repo.AssestRepo;

@RestController
@RequestMapping("asset")
@CrossOrigin(origins="http://localhost:5174/")
public class AssestManagerController {
	
	@Autowired
	private AssestRepo assestrepo;
	
	@PostMapping
	public AssestEntity add(@RequestBody AssestEntity assest) {
		return assestrepo.save(assest);
	}
	
	@GetMapping
	public List<AssestEntity>getAll(){
		return assestrepo.findAll();
	}
	
	@PutMapping("/update")
	public AssestEntity update(@RequestParam Integer id,@RequestParam String mediaAssest,@RequestParam String tags,@RequestParam String campaigns, @RequestParam String usageRights) {
		AssestEntity a=assestrepo.findById(id).orElse(null);
		if(a!=null) {
			a.setMediaAssest(mediaAssest);
			a.setTags(tags);
			a.setCampaigns(campaigns);
			a.setUsageRights(usageRights);
			return assestrepo.save(a);
		}
		return null;
	}
	
	@DeleteMapping("/delete")
		public String delete(@RequestParam Integer id) {
			assestrepo.deleteById(id);
			return "deleted";
			}
	}

