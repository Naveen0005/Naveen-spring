package com.bean;

public class Player {
  private String name;
  private int score;
  private double average;
  private int runs;
  
  Player(){
	  
  }
  
  Player(String name,int score,double average,int runs){
	  this.name=name;
	  this.score=score;
	  this.average=average;
	  this.runs=runs;
  }
	  
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
	 
	 public void setscore(int score) {
		 this.score=score;
	 }
	 public int getscore() {
		 return score;
	 }

	public double getaverage() {
		return average;
	}

	public void setaverage(double average) {
		this.average= average;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", average=" + average + ", runs=" + runs + "]";
	}
	
	
  }

