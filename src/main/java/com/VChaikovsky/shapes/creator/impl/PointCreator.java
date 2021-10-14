package com.VChaikovsky.shapes.creator.impl;

import com.VChaikovsky.shapes.creator.CreatorFactoryInt;
import com.VChaikovsky.shapes.entity.GeometryEntity;
import com.VChaikovsky.shapes.entity.impl.Point;
import com.VChaikovsky.shapes.idgenerator.IdGenerator;

public class PointCreator implements CreatorFactoryInt {
    @Override
    public Point createEntity(double[] coordinates) {
        double x = coordinates[0];
        double y = coordinates[1];
        double z = coordinates[2];

        Point point = new Point(x, y, z);
        //((Point) point).setId(generateId()); // if point's id will be necessary

        return point;
    }

    @Override
    public long generateId() {
        return IdGenerator.generateId();
    }
}