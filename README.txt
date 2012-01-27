This is what needs to be edited. 

*You should have JDK, Eclipse and Android SDK with API-15 installed.

*If you get errors when you load in Eclipse, right click, properties, java compiler, set it to Java 1.6.



The following java files need to be edited...

AnalogClockWidget.java

017 - import x.x.x.R;

Docks.java

017 - import x.x.x.R;

GoLauncher.java

017 - import x.x.x.R;

Icons.java

017 - import x.x.x.R;

Wallpaper.java

017 - import x.x.x.R;



The following lines in HelperActivity.java need to be edited...

017 - import x.x.x.R;

051 - intent.putExtra("org.adw.launcher.theme.NAME","x.x.x");

199 - intent.setComponent(new ComponentName("x.x.x","x.x.x.Wallpaper"));

212 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=x.x.x"));

226 - String aEmailList[] = { "x.x.x@gmail.com","x.x.x@gmail.com" }; 

228 - emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Theme Bugs");

242 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://twitter.com/x.x.x"));

255 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/x.x.x"));

278 - new ComponentName("x.x.x",

279 - "x.x.x.HelperActivity");



The following lines in AndroidManifest.xml need to be edited...

003 - package="x.x.x"

050 - <activity android:name="x.x.x.GoLauncher"

062 - <provider android:name="x.x.x.DocksProvider"  android:authorities="x.x.x.DocksProvider" />



The following lines in strings.xml need to be edited...

004 - <string name="app_name">Template</string>

006 - <string name="theme_title">Template</string>

009 - <string name="theme_description">Awesome, thanks for trying Template Theme!
	This Template is basically a Template. Enjoy</string>
	
011 - <string name="theme_info">Awesome, thanks for trying Template Theme!
	This Template is basically a Template. Enjoy</string>

016 - <string name="wp_theme_title">Template</string>

029 - <string name="analog_gadget">Template Clock</string>

033 - <string name="hello">Template</string>

