package com.currencyconvertor.currency;

import com.currencyconvertor.constants.CountryConstants;

public class Currency {
	
	public double currencyConvertor(String fromCountry, String toCountry, double amount) {
		
		double usdInr = 82.8325;
		double poundInr = 91.8323;
		
		if(fromCountry == CountryConstants.INDIA && toCountry == CountryConstants.USA) {
			return amount / usdInr;
		}
		else if(fromCountry == CountryConstants.USA && toCountry == CountryConstants.INDIA) {
			return amount * usdInr;
		}
		else if(fromCountry == CountryConstants.INDIA && toCountry == CountryConstants.UK){
			return amount / poundInr;
		}
		else if(fromCountry == CountryConstants.UK && toCountry == CountryConstants.INDIA) {
			return amount * poundInr;
		}
		return 0.0;
	}

}
