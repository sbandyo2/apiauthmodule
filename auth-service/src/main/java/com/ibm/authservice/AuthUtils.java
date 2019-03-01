package com.ibm.authservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class AuthUtils {
	private static final String CREDENTIAL_FILE = "credential.properties";

	public static String getCredentialConfig(String key) {
		Properties properties = null;
		String value = "";
		properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = AuthUtils.class.getClassLoader().getResourceAsStream(
					CREDENTIAL_FILE);

			if (inputStream != null)
				properties.load(inputStream);
			if (properties != null)
				value = properties.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
