package com.br.emanuelap.geojsonproject.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class TrechoCursoDagua extends ItemGeojson {

    private List<TrechoCursoDagua> trechoCursoDaguas;
    private List<CursoDagua> cursoDaguas;
}
