package com.ultimate.patterns.adapter;

public class WriterAdapter implements Exporter{
	Writer writer;
	
	public WriterAdapter(Writer writer) {
		this.writer = writer;
	}
	
	@Override
	public void export() {
		// TODO Auto-generated method stub
		writer.write();
		
	}
}
