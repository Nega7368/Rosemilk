package org.computer;

public  class Desktop implements Hardware,Software {
@Override
public void hardwareResource() {
	System.out.println(" Hardware resource is manufactured");
}
@Override
	public void softwareResource() {
	System.out.println(" Software Resource is testing");
		
	}	
	private void desktopModel() {
		System.out.println("Desktop model is Windows 7");
	}
	public static void main(String[] args) {
		Desktop a = new Desktop ();
		a.desktopModel();
		a.hardwareResource();
		a.softwareResource();
		
	}
	private void snega() {
		System.out.println("snega");
	}
	
	
}
