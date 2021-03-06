package de.gexcode.algorithm;

import de.gexcode.api.Algorithm;
import de.gexcode.api.JVArray;

public class BubbleSort extends Algorithm<JVArray> {
	JVArray data;

	public BubbleSort(String name, JVArray data) {
		super(name, data);
		this.data = data;
	}

	@Override
	public void algorithm() {
		int length = data.length;
		while(length > 0) {
			for(int i = 0; i < length; i++) {
				if( (i+1) < length ) {
					if(data.getValue(i) > data.getValue(i+1)) {
						data.swap(i, i+1);
					}
				}
			}
			length--;
		}
		
	}

}
