/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package x.x.x;

import x.x.x.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

public class HelperActivity extends Activity {
        	
    private ImageButton adwtheme, adwextheme, lpsetting, gosetting, wallpaper, marketinfo, email, disable_helper, twitter, gplus;
        
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.helperactivity);
               
        
        adwextheme = (ImageButton) findViewById(R.id.adwextheme);
        adwextheme.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		Intent intent = new Intent("org.adw.launcher.SET_THEME");
                        intent.putExtra("org.adw.launcher.theme.NAME","x.x.x");
                        startActivity(Intent.createChooser(intent,"ADW Not Installed"));
                	} 
                	catch (ActivityNotFoundException e) {
                		AlertDialog.Builder alert = new AlertDialog.Builder(HelperActivity.this);

                		alert.setTitle("ADW Not Found");
                		alert.setMessage("Do you want to vist the ADW Launcher EX Android Market page?");
                		alert.setIcon(R.drawable.adwex_icon);
                		alert.setPositiveButton("Yes",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=org.adwfreak.launcher"));
                      		  startActivity(intent);
                		  }
                		 });
                		alert.setNegativeButton("No",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  return;
                		  }
                		 });

                		alert.show();
                		
                	} catch (Exception adwex) {
                		adwex.printStackTrace();
                	}
                }
                
        });
        
        adwtheme = (ImageButton) findViewById(R.id.adwtheme);
        adwtheme.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		Intent intent = new Intent(Intent.ACTION_MAIN);
                    	intent.setComponent(new ComponentName("org.adw.launcher","org.adw.launcher.Launcher"));
                    	startActivity(intent);
                	} 
                	catch (ActivityNotFoundException e) {
                		AlertDialog.Builder alert = new AlertDialog.Builder(HelperActivity.this);

                		alert.setTitle("ADW Not Found");
                		alert.setMessage("Do you want to vist the ADW Launcher Android Market page?");
                		alert.setIcon(R.drawable.adw_icon);
                		alert.setPositiveButton("Yes",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=org.adw.launcher"));
                      		  startActivity(intent);
                		  }
                		 });
                		alert.setNegativeButton("No",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  return;
                		  }
                		 });

                		alert.show();
                		
                	} catch (Exception adw) {
                		adw.printStackTrace();
                	}
                }
                
        });
        
        lpsetting = (ImageButton) findViewById(R.id.lpsetting);
        lpsetting.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		Intent intent = new Intent(Intent.ACTION_MAIN);
                    	intent.setComponent(new ComponentName("com.fede.launcher","com.fede.launcher.LauncherPreferencesActivity"));
                    	startActivity(intent);
                	} 
                	catch (ActivityNotFoundException e) {
                		AlertDialog.Builder alert = new AlertDialog.Builder(HelperActivity.this);

                		alert.setTitle("LP Not Found");
                		alert.setMessage("Do you want to vist the Launcher Pro Android Market page?");
                		alert.setIcon(R.drawable.lp_icon);
                		alert.setPositiveButton("Yes",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=com.fede.launcher"));
                      		  startActivity(intent);
                		  }
                		 });
                		alert.setNegativeButton("No",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  return;
                		  }
                		 });

                		alert.show();
                		
                	} catch (Exception lp) {
                		lp.printStackTrace();
                	}
                }
                
        });
        
        gosetting = (ImageButton) findViewById(R.id.gosetting);
        gosetting.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		try {
            		Intent intent = new Intent(Intent.ACTION_MAIN);
                	intent.setComponent(new ComponentName("com.gau.go.launcherex","com.jiubang.ggheart.apps.desks.diy.themescan.MyThemes"));
                	startActivity(intent);
            	} 
            	catch (ActivityNotFoundException e) {
            		AlertDialog.Builder alert = new AlertDialog.Builder(HelperActivity.this);

            		alert.setTitle("GO Not Found");
            		alert.setMessage("Do you want to vist the GO Launcher Android Market page?");
            		alert.setIcon(R.drawable.go_icon);
            		alert.setPositiveButton("Yes",
            		 new DialogInterface.OnClickListener() {
            		  public void onClick(DialogInterface dialog, int id) {
            			  final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=com.gau.go.launcherex"));
                  		  startActivity(intent);
            		  }
            		 });
            		alert.setNegativeButton("No",
            		 new DialogInterface.OnClickListener() {
            		  public void onClick(DialogInterface dialog, int id) {
            			  return;
            		  }
            		 });

            		alert.show();
            		
            	} catch (Exception go) {
            		go.printStackTrace();
            	}
            }
        	
        });
            	
        wallpaper = (ImageButton) findViewById(R.id.wallpaper);
        wallpaper.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.setComponent(new ComponentName("x.x.x","x.x.x.Wallpaper"));
                        startActivity(intent);
                	} 
                	catch (RuntimeException wall) {
                		wall.printStackTrace();
                	}
                }
        });
               
        marketinfo = (ImageButton) findViewById(R.id.marketinfo);
        marketinfo.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("market://details?id=x.x.x"));
                		startActivity(intent);
                	} 
                	catch (RuntimeException market) {
                		market.printStackTrace();
                	}	
                }
        });
        
        email = (ImageButton) findViewById(R.id.email);
        email.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);  
                		String aEmailList[] = { "x.x.x@gmail.com","x.x.x@gmail.com" };    
                		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);  
                		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Theme Bugs");  
                		emailIntent.setType("plain/text");  
                		startActivity(emailIntent);
                	} 
                	catch (RuntimeException email) {
                		email.printStackTrace();
                	}	
                }
        });
        
        twitter = (ImageButton) findViewById(R.id.twitter);
        twitter.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://twitter.com/x.x.x"));
                		startActivity(intent);
                	} 
                	catch (RuntimeException tw) {
                		tw.printStackTrace();
                	}	
                }
        });
        
        gplus = (ImageButton) findViewById(R.id.gplus);
        gplus.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/x.x.x"));
                		startActivity(intent);
                	} 
                	catch (RuntimeException gp) {
                		gp.printStackTrace();
                	}	
                }
        });

        
        disable_helper = (ImageButton) findViewById(R.id.disable_helper);
        disable_helper.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                	try {
                		AlertDialog.Builder alert = new AlertDialog.Builder(HelperActivity.this);

                		alert.setTitle("Remove App Icon?");
                		alert.setMessage("Are you sure you want to hide the app icon from your home screen? You will not be able to get to this helper again!");
                		alert.setIcon(R.drawable.theme_icon);
                		alert.setPositiveButton("Yes",
                		 new DialogInterface.OnClickListener() {
                		  public void onClick(DialogInterface dialog, int id) {
                			  ComponentName componentToDisable =
                                new ComponentName("x.x.x",
                                "x.x.x.HelperActivity");
                                			 
                              getPackageManager().setComponentEnabledSetting(
                                componentToDisable,
                                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                                PackageManager.DONT_KILL_APP);
                                Toast.makeText(HelperActivity.this, "Icon will be disabled on next reboot!", Toast.LENGTH_LONG).show();
                		            }
               		               });
               		                alert.setNegativeButton("No",
               		                 new DialogInterface.OnClickListener() {
               		                  public void onClick(DialogInterface dialog, int id) {
               		                	return;
               		                 }
               		                });

               		               alert.show();
               		               
                				} catch (Exception helper) {
                				helper.printStackTrace();
                			}
               	        }
       });
        
    }
    
    public void makeToast(String msg) {
        Context context = getApplicationContext();
        CharSequence text = msg;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
    
    
    