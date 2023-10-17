///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package study;
//
///**
// *
// * @author mousa
// */
//public class Geo {
//    
//  private String color = "white";
//  private boolean filled;
//  private java.util.Date dateCreated;
//  public Geo() {   
//      System.out.println("no argo cunstracorz");
//      dateCreated = new java.util.Date();  }
//  public Geo(String color, boolean filled) {
//    dateCreated = new java.util.Date();
//    this.color = color;
//    this.filled = filled;
//  }
//  public String getColor() {    return color;  }
//  public void setColor(String color) {    this.color = color;  }
//  public boolean isFilled() {    return filled;  }
//  public void setFilled(boolean filled) {    this.filled = filled;  }
//  public java.util.Date getDateCreated() {    return dateCreated;  }
//  public String toString() {
//    return "created on "+dateCreated+"\ncolor: "+color+" and filled: " +filled;  
//  }
//
//}
// class Circle  extends Geo{
//  private double radius;
//  public Circle() {  }
//  public Circle(double radius) {    this.radius = radius;  }
//  public Circle(double radius, String color, boolean filled) {
//    this.radius = radius;
//    setColor(color);
//    setFilled(filled);
//  }
//  public double getRadius() {    return radius;  }
//  public void setRadius(double radius) {    this.radius = radius;  }
//  public double getArea() {    return radius * radius * Math.PI;  }
//  public double getDiameter() {    return 2 * radius;  }
//  public double getPerimeter() {    return 2 * radius * Math.PI;  }
//  public void printCircle() {
//    System.out.println("The circle is created " +getDateCreated()+" and the radius is "+radius);
//  }
// }
//class Rectangle extends Geo{
//  private double width;
//  private double height;
//  public Rectangle() {  }
//  public Rectangle(double width, double height) {
//    this.width = width;
//    this.height = height;
//  }
//  public Rectangle(double width, double height, String color, boolean filled) {
//    this.width = width;
//    this.height = height;
//    setColor(color);
//    setFilled(filled);
//  }
//  public double getWidth() {    return width;  }
//  public void setWidth(double width) {    this.width = width;  }
//  public double getHeight() {    return height;  }
//  public void setHeight(double height) {    this.height = height;  }
//  public double getArea() {    return width * height;  }
//  public double getPerimeter() {    return 2 * (width + height);  }
//}
//class eltesto extends Geo{
//    private int sars;
//    public eltesto(int sars){
//        super();
//        this.sars=sars;
//        
//        //System.out.println(super.getColor());
//    }
//    public eltesto(){
//        this(8);
//    }
//    public int getSars(){
//        return sars;
//    }
//    
//}