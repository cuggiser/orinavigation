package com.orinavigation.datatype;

import com.vividsolutions.jts.geom.Coordinate;

public class Node {
    private int fromid; //the start node id of the edge

    private Edge firstEdge; //the first edge whose start node is fromid

    private boolean visited; //tag whether the node is visited

    private double dis2st;

    private Coordinate coordinate;

    private double totalCost;

    private int preid; //record the precursor node id of the navigation path

    public Node (int fromid){
        this.fromid = fromid;
        this.firstEdge = null;
        this.visited = false;
        this.dis2st = Double.MAX_VALUE;
    }

    public int getFromid(){
        return this.fromid;
    }

    public Edge getFirstEdge(){
        return this.firstEdge;
    }

    public boolean getVisited(){
        return this.visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void setFirstEdge(Edge firstEdge){
        this.firstEdge = firstEdge;
    }

    public double getDis2st(){
        return  this.dis2st;
    }

    public void setDis2st(double dis2st){
        this.dis2st = dis2st;
    }

    public int getPreid(){
        return this.preid;
    }

    public void setPreid(int preid){
        this.preid = preid;
    }

    public Coordinate getCoordinate(){
        return this.coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public double getTotalCost(){
        return this.totalCost;
    }

    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }
}
