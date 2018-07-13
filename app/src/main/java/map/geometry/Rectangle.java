package com.map.geometry;

/**
 * 长方形
 */
public class Rectangle {
    private Point pointStart;
    private Point pointEnd;

    /**
     * 构造器
     * @param pointStart 左下角点
     * @param pointEnd 右上角点
     */
    public Rectangle(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    /**
     * 构造器
     * @param latMin 最小纬度
     * @param lngMin 最小经度
     * @param latMax 最大纬度
     * @param lngMax 最大经度
     */
    public Rectangle(double latMin,double lngMin,double latMax,double lngMax){
        this.pointStart=new Point(latMin,lngMin);
        this.pointEnd=new Point(latMax,lngMax);
    }


}
