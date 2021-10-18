package com.VChaikovsky.shapes.specification.impl;

import com.VChaikovsky.shapes.entity.impl.Point;
import com.VChaikovsky.shapes.entity.impl.Pyramid;
import com.VChaikovsky.shapes.service.impl.ParameterCalculator;
import com.VChaikovsky.shapes.specification.Specification;

public class BasesCenterPointSpecification implements Specification {
    double minDistanceToZeroPoint;
    double maxDistanceToZeroPoint;

    public BasesCenterPointSpecification(double minDistanceToZeroPoint, double maxDistanceToZeroPoint) {
        this.minDistanceToZeroPoint = minDistanceToZeroPoint;
        this.maxDistanceToZeroPoint = maxDistanceToZeroPoint;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        Point basesCenterPoint = pyramid.getBasesCenter();
        double distanceToZeroPoint = ParameterCalculator
                .getInstance()
                .findDistanceToZeroPoint(basesCenterPoint);
        boolean result = distanceToZeroPoint >= minDistanceToZeroPoint && distanceToZeroPoint <= maxDistanceToZeroPoint;

        return result;
    }
}