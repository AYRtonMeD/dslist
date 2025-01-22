package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Getter;

@Getter
public class GameMinDto {

    private Long id;
    private String title;
    private String year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
