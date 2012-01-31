This is what needs to be edited. 

*You should have JDK, Eclipse and Android SDK with API-15 installed.

*If you get errors when you load in Eclipse, right click, properties, java compiler, set it to Java 1.6.


Quick Tut

Open Eclipse, Select File, New, Android Project, 
Project From Existing Source, Browse, Point it to the extracted template, Click Finish,
in /src right click x.x.x, refractor, rename, change it from x.x.x to com.yourname.appname.

The following java files also need to be edited...

AnalogClockWidget.java

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname

Docks.java

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname

GoLauncher.java

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname

Icons.java

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname

Wallpaper.java

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname



The following lines in HelperActivity.java need to be edited...

017 - import x.x.x.R; ==> Replace x.x.x with com.yourname.appname

051 - intent.putExtra("org.adw.launcher.theme.NAME","x.x.x"); ==> Replace x.x.x with com.yourname.appname

199 - intent.setComponent(new ComponentName("x.x.x","x.x.x.Wallpaper")); ==> Replace x.x.x with com.yourname.appname

212 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=x.x.x")); ==> Replace x.x.x with com.yourname.appname

226 - String aEmailList[] = { "x.x.x@gmail.com","x.x.x@gmail.com" }; ==> Replace x.x.x with your email, mybe setup a new account for theme stuff?

228 - emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Theme Bugs"); ==> Replace Theme Bugs with subject you want emails to use by default.

242 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://twitter.com/x.x.x")); ==> Replace x.x.x with your twitter username

255 - final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/x.x.x")); ==> Replace https://plus.google.com/x.x.x with your G+ profile link.

278 - new ComponentName("x.x.x", ==> Replace x.x.x with com.yourname.appname

279 - "x.x.x.HelperActivity"); ==> Replace x.x.x with com.yourname.appname



The following lines in AndroidManifest.xml need to be edited...

003 - package="x.x.x" ==> Replace x.x.x with com.yourname.appname

050 - <activity android:name="x.x.x.GoLauncher" ==> Replace x.x.x with com.yourname.appname

062 - <provider android:name="x.x.x.DocksProvider"  android:authorities="x.x.x.DocksProvider" /> ==> Replace x.x.x with com.yourname.appname



The following lines in strings.xml need to be edited...

004 - <string name="app_name">Template</string> ==> Replace Template with your App name.

006 - <string name="theme_title">Template</string> ==> Replace Template with your App name.

009 - <string name="theme_description">Awesome, thanks for trying Template Theme!
	This Template is basically a Template. Enjoy</string> ==> Replace with theme discription. 
	
011 - <string name="theme_info">Awesome, thanks for trying Template Theme!
	This Template is basically a Template. Enjoy</string> ==> Replace with theme discription.

016 - <string name="wp_theme_title">Template</string> ==> Replace Template with your App name.

029 - <string name="analog_gadget">Template Clock</string> ==> Replace Template Clock with your App name.

033 - <string name="hello">Template</string> ==> Replace Template with your App name.


After this you can edit whatever you want. I may be missing a step or two, full guide coming soon :)



