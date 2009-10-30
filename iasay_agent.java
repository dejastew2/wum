package Agents.iasay;

import BotEnvironment.SearchBot.*;

public class iasay_agent extends WumpusAgent {

	public iasay_agent() {
		super();
		setDeveloperName("Isaac Asay");
	}

	public void step() {
		// Continue moving to nearest unvisited safe node
		/* If move successfull
				If current node unvisited 
					Loop through percepts
						Update memory with current percept
						Update external beliefs with current percept
					Update memory with inferences
					Locate next unvisited safe node
				If current node visited, do nothing
			If move unsuccessful
				Mark attempted destination as wall in memory
				Mark attempted destination as wall in external beliefs
				Update memory with inferences
				Locate next unvisited safe node
		*/
	}
	
	// Used to locate the next safe unvisited node
	private Node bfsNextSafe() {
		
	}
	
	// Used to update memory with new inferences
	private void updateInferences() {
		// Use reasoning to discern new information within memory
		// Update external beliefs with any newly inferred facts
	}

	public void reset() {
		super.reset();
	}
}

private class MemNode {
	private enum Attribute { SAFE, MINION, PIT, WUMPUS, GOLD, WALL }
	private boolean visited;
	private int[] attributes;
	private MemNode[] neighbor;
	
	public MemNode() {
		visited = false;
		
		attributes = new int[6];
		for (Attribute att : Attribute.values())
			attributes[att] = -1;
		
		neighbor = new MemNode[4];
		for (int i = 0; i < 4; i ++)
			neighbor[i] = null;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public int getSafe() {
		return attributes[SAFE];
	}
	
	public int getMinion() {
		return attributes[MINION];
	}
	
	public int getPit() {
		return attributes[PIT];
	}
	
	public int getWumpus() {
		return attributes[WUMPUS];
	}
	
	public int getGold() {
		return attributes[GOLD];
	}
	
	public int getWall() {
		return attributes[WALL];
	}
	
	public void setVisited(boolean val) {
		visited = val;
	}
	
	public void setSafe(int val) {
		attributes[SAFE] = val;	
	}
	
	public void setMinion(int val) {
		attributes[MINION] = val;	
	}
	
	public void setPit(int val) {
		attributes[PIT] = val;	
	}
	
	public void setWumpus(int val) {
		attributes[WUMPUS] = val;	
	}
	
	public void setGold(int val) {
		attributes[GOLD] = val;	
	}
	
	public void setWall(int val) {
		attributes[WALL] = val;	
	}
}
