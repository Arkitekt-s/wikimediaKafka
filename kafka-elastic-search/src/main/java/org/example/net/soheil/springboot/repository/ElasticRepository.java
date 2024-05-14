package org.example.net.soheil.springboot.repository;

import org.example.net.soheil.springboot.entity.ElasticData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRepository extends ElasticsearchRepository<ElasticData, String> {
}
