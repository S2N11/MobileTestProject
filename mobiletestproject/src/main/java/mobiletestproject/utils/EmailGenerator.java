package mobiletestproject.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class EmailGenerator {

	public StringBuilder generateEmail() {

		String gmail = "@gmail.com";

		StringBuilder firstPartOfMail = new StringBuilder(RandomStringUtils.randomAlphanumeric(17).toUpperCase())
				.append(gmail);

		return firstPartOfMail;
	}

}