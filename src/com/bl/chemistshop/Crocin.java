package com.bl.chemistshop;

public class Crocin extends Medicine {
	public Crocin() {
		companyName = "GSK";
		composition = new String[3];
		composition[0] = "paracitamal";
		composition[1] = "caffeine";
		composition[2] = "sodium methaile parabine";
		type = Medicine.Type.ALLOPATHY;
		name = "crocin";
		
	}
	
}
