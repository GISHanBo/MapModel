package com.map.geometry;

/**
 * 文字注记
 */
public class Label {
    private Point point;
    private String text;

    /**
     * 构造器
     * @param point 位置
     * @param text 注记内容
     */
    public Label(Point point, String text) {
        this.point = point;
        this.text = text;
    }

    /**
     * 获取注记位置
     * @return 注记位置
     */
    public Point getPoint() {
        return point;
    }

    /**
     * 设置注记位置
     * @param point 位置
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * 获取注记文字
     * @return 注记文字
     */
    public String getText() {
        return text;
    }

    /**
     * 设置文本
     * @param text 注记内容
     */
    public void setText(String text) {
        this.text = text;
    }
}
