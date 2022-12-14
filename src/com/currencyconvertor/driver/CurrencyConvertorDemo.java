package com.currencyconvertor.driver;

import java.util.Scanner;

import com.currencyconvertor.constants.CountryConstants;
import com.currencyconvertor.constants.CurrencyConstants;
import com.currencyconvertor.country.Country;
import com.currencyconvertor.currency.Currency;
/**
* The CurrencyConvertor program simply converts a
* currency of one country to the currency of another.
*
* @author  Jayant Kumar Agarwal.
* @version 1.0
* @since   2022-Oct-08
*/
public class CurrencyConvertorDemo {
	public Scanner scanner;
	public int countryId;
	public String country;
	public static void main(String[] args) {
		CurrencyConvertorDemo currencyCovertorDemo = new CurrencyConvertorDemo();
		Country country = new Country();
		Currency currency = new Currency();
		String fromCountry = null;
		String toCountry = null;
		System.out.println(CountryConstants.FROM_COUNTRY_CHOICE);		
		fromCountry = country.countrySelector(currencyCovertorDemo);
		System.out.println(CountryConstants.TO_COUNTRY_CHOICE);	
		toCountry = country.countrySelector(currencyCovertorDemo);
		System.out.println(CountryConstants.FROM_COUNTRY + CountryConstants.colon + fromCountry);
		System.out.println(CountryConstants.TO_COUNTRY + CountryConstants.colon + toCountry);
		System.out.println(CurrencyConstants.ENTER_AMOUNT);
		double amount = currencyCovertorDemo.scanner.nextDouble();
		double convertedAmount = currency.currencyConvertor(fromCountry, toCountry, amount);
		System.out.println(CurrencyConstants.CONVERTED_AMOUNT + convertedAmount);
	}
	

}
