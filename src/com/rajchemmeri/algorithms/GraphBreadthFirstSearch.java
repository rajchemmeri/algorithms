package com.rajchemmeri.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBreadthFirstSearch {
	int[][] graphDS;
	int size;
	int rootNode;
	boolean visited[];

	public GraphBreadthFirstSearch(int size){
		this.size = size;
		int rootNode = 0;;
		graphDS = new int[size][size];
		visited = new boolean[size];
	}

	public GraphBreadthFirstSearch(int[][] graph){
		this.size = graph.length;
		graphDS = new int[this.size][this.size];
		visited = new boolean[size];

		for(int i = 0 ; i<this.size ; ++i){
			for(int j=0;j<this.size; ++j){
				graphDS[i][j] = graph[i][j];
			}
		}

	}

	private void bfs(){
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(rootNode);

		visited[rootNode] = true;

		System.out.println(" "+ rootNode);
		
		while(!queue.isEmpty()){
			int data = queue.peek();

			int child = getNextChildPosition(data);

			if(child != -1){
				visited[child] = true;
				queue.add(child);
				System.out.println(" "+child);
			}else{
				queue.remove();
			}


		}
		clearVisited();

	}
	void clearVisited()
	{
		int i;

		for (i = 0; i < visited.length; i++)
			visited[i] = false;
	}
	private int getNextChildPosition(int node){

		for(int j=0;j<this.size;++j){

			if(graphDS[node][j] > 0){

				if(!visited[j]){

					return j;

				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				          //0  1  2  3  4  5  6  7  8
		int[][] conn = {  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
				          { 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1
				          { 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
				          { 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
				          { 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
				          { 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
				          { 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
				          { 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
				          { 1, 0, 0, 0, 1, 0, 0, 0, 0 } // 8
						};

		GraphBreadthFirstSearch G = new GraphBreadthFirstSearch(conn);

		G.bfs();

	}

}
