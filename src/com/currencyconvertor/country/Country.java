package com.currencyconvertor.country;

import java.util.Scanner;

import com.currencyconvertor.constants.CountryConstants;
import com.currencyconvertor.driver.CurrencyConvertorDemo;

public class Country {

	
public String countrySelector(CurrencyConvertorDemo currencyCovertorDemo){
		
		try {
			System.out.println(CountryConstants.COUNTRY_LIST);
			
			currencyCovertorDemo.scanner = new Scanner(System.in);
			currencyCovertorDemo.countryId = currencyCovertorDemo.scanner.nextInt();
		}
		catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		
				switch(currencyCovertorDemo.countryId) {
						
					case 1: currencyCovertorDemo.country = CountryConstants.USA;	
							break;
					case 2: currencyCovertorDemo.country = CountryConstants.UK;
							break;
					case 3: currencyCovertorDemo.country = CountryConstants.INDIA;
							break;
					case 4: currencyCovertorDemo.country = CountryConstants.CHINA;
							break;
							
					case 5: currencyCovertorDemo.country = CountryConstants.JAPAN;
							break;
							
					case 6: currencyCovertorDemo.country = CountryConstants.AUSTRALIA;
							break;
							
					default:
							currencyCovertorDemo.country = CountryConstants.INVALID_COUNTRY_NAME;
							break;
				}
		return currencyCovertorDemo.country;
	}
}
