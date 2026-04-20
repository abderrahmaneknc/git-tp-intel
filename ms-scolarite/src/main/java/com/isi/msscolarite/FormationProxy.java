package com.isi.msscolarite;

import com.isi.msscolarite.Model.Formation;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation")
@LoadBalancerClient(name="ms-formation")

//Invoquer le microservice ms-formation pour recuperer les info de formation
public interface FormationProxy {
    @GetMapping("/api/formations/{id}")
    public Formation getFormation(@PathVariable("id") Long idf);


}
