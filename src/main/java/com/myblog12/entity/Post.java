package com.myblog12.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="posts")

@Data
@AllArgsConstructor//Constructors with below arguments will be created
 @NoArgsConstructor// for creating default constructor

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;


}
