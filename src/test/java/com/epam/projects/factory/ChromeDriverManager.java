package com.epam.projects.factory;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createWebDriver() {
		String projectPath;
		//set path for chrome driver
		System.setProperty("webdriver.chrome.driver", "resources\\drivers\\chromedriver.exe");
		
		//desired capabilities
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		//chrome driver service
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(
						new File("resources\\drivers\\chromedriver.exe"))
				.usingAnyFreePort().build();
		
		//chrome options
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--aggressive-cache-discard");
		options.addArguments("--disable-cache");
		options.addArguments("--disable-application-cache");
		options.addArguments("--disable-offline-load-stale-cache");
		options.addArguments("--disk-cache-size=0");
		// options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--dns-prefetch-disable");
		options.addArguments("--no-proxy-server");
		options.addArguments("--log-level=3");
		options.addArguments("disable-features=NetworkService");
		// options.addArguments("--force-device-scale-factor=1");
		// options.addArguments("--silent");
		options.addArguments("--disable-browser-side-navigation");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        
		//preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory",
				projectPath = System.getProperty("user.dir") + File.separator + "Downloads" + File.separator);
		prefs.put("download.directory_upgrade", "true");
		prefs.put("download.extensions_to_open", "");
		prefs.put("download.prompt_for_download", false);
		prefs.put("pdfjs.disabled", true);
		prefs.put("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		options.setExperimentalOption("prefs", prefs);
		options.setProxy(null);

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		capabilities.setCapability("pageLoadStrategy", "none");
		capabilities.setCapability("pageLoadStrategy", "eager");

		options.merge(capabilities);
		driver = new ChromeDriver(service, options);

	
	}

}
