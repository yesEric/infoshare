package cn.pptech.service;

import cn.pptech.domain.City;
import cn.pptech.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;
    @Override
    public City findOne(Long id) {
        return cityRepository.findOne(id);
    }
}
