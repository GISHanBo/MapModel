package com.map.geometry;

/**
 * 由经度纬度组成的点实体
 */
public class Point {
    private double lat;
    private double lng;

    /**
     * 构造器
     * @param lat 纬度
     * @param lng 经度
     */
    public Point(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    /**
     * 获取纬度
     * @return 纬度
     */
    public double getLat() {
        return lat;
    }

    /**
     * 设置纬度
     * @param lat 纬度
     */
    public void setLat(double lat) {
        this.lat = lat;
    }
    /**
     * 获取经度
     * @return 经度
     */
    public double getLng() {
        return lng;
    }
    /**
     * 设置经度
     * @param lng 经度
     */
    public void setLng(double lng) {
        this.lng = lng;
    }
}
