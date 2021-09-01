package genericLibrary;
/**
 * 
 * @author Sudarshan
 *
 */
public interface IAutoConstants {
  String CHROME_KEY ="webdriver.chrome.driver";
  String CHROME_VALUE="./src/main/resources/chromedriver.exe";
  
  String FIREFOX_KEY ="webdriver.gecko.driver";
  String FIREFOX_VALUE="./src/main/resources/geckodriver.exe";
  
  String URL="http://localhost:8888/index.php?action=Login&module=Users";
  String USER_NAME="admin";
  String PASSWORD="root";
  
  String EXCEL_PATH="./src/test/resources/file.xlsx";
  String PROPERTY_PATH="./src/test/resources/property.properties";
  
}
