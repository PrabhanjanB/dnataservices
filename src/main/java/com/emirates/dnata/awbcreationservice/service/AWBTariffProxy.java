package com.emirates.dnata.awbcreationservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emirates.dnata.awbcreationservice.dto.AWBTariff;



@FeignClient(name="awb-tariff",url="localhost:8200")
public interface AWBTariffProxy {
	
	@GetMapping("/dnata/tariff/{awbweight}")
	public List<AWBTariff> getTariffCharges(@PathVariable("awbweight")double awbWeight);
}
