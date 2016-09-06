package factory;

import dataProvider.ConfigDetaProvider;
import dataProvider.ExcelDetaProvider;

public class DataProviderFactory {
	
	public static ConfigDetaProvider getConfig()
	{
		ConfigDetaProvider config = new ConfigDetaProvider();
		
		return config;
		
	}
	
	public static ExcelDetaProvider getExcel()
	{
		ExcelDetaProvider excel = new ExcelDetaProvider();
		
		return excel;
		
	}

}
