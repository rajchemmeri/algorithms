package com.rajchemmeri.algorithms;

public class DepthFirstSearch {

	int[][] dsGraph = null;
	int rootNode = 0;
	boolean visited[] = null;
	int size = 0;


	public DepthFirstSearch(int size){

		this.size = size;
		dsGraph = new int[size][size];
		visited = new boolean[size];

	}

	public DepthFirstSearch(int[][] graph){

		visited = new boolean[size];
		rootNode = 0;
		this.size = graph.length;

		for(int i =0 ;i< this.size ; ++i){
			for(int j =0 ;j< this.size ; ++j){
				dsGraph[i][j] = graph[i][j];
			}
		}

	}

	public void dfs(int i){

		visited[i] =true;
		
		System.out.println(" "+i);
		
		for(int j=0;j< this.size ;++j){
			if(dsGraph[i][j] > 0 && !visited[j]){
				dfs(j);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
