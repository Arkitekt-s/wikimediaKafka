package org.example.net.soheil.springboot.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//data from lombok is used to generate getters and setters
@Data
//document its looks like table in elasticsearch
@Document(indexName = "elasticdata")
public class ElasticData {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String description;
}
