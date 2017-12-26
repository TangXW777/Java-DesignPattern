package com.tang.facade;

public class Computer {
	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	

	public Computer() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup(){
		System.out.println("start the computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("computer finish start");
	}
	
	public void shutdown(){
		System.out.println("computer begin shutdown");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer finish shutdown");
	}
	
	
}
