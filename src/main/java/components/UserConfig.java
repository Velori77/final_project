package components;

import utils.RandomEmails;

public class UserConfig {

  public static final String FIRST_NAME = "Valerii";
  public static final String LAST_NAME = "Kushnir";
  public static final String EMAIL = RandomEmails.generateEmail() + "@gmail.com";
  public static final String PASSWORD = "994466";
  public static final String BIRTHDATE = "01/11/1980";
  public static final String FIRST_AND_LAST_NAME = String.format("%s %s", FIRST_NAME, LAST_NAME);
  public static final String INVALID_NAME = "Blabla";

}
