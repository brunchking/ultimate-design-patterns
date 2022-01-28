package com.ultimate.patterns.adapter;

public class Main {
	public static void main(String[] args) {
		Exporter exporter = new ExportUtil();
		exporter.export();
		
		Exporter fileWriterExporter = new WriterAdapter(new FileWriter());
		fileWriterExporter.export();
	}
}
