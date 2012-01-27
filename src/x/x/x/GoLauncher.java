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
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;

public class GoLauncher extends Activity {
	
	class CustomAlertDialog extends AlertDialog {
		public CustomAlertDialog(Context context) {
			super(context);
		}
		
		@Override
	    public boolean onKeyDown(int keyCode, KeyEvent event) {
			boolean ret = super.onKeyDown(keyCode, event);
			finish();
			return ret;
		}
	}
	
	private CustomAlertDialog mDialog;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gotheme);
	    
	    if (isExistSkin("com.gau.go.launcherex")) {
	    	startGOLauncher("com.gau.go.launcherex");
	    	finish();
	    	return;
	    }
	    
	    mDialog = new CustomAlertDialog(this);
	    mDialog.setTitle(R.string.dialogtitle);
	    mDialog.setMessage(getResources().getString(R.string.dialogcontent));
	    mDialog.setButton(DialogInterface.BUTTON_POSITIVE, getResources().getString(R.string.dialogok), 
	    		new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				String marketuriString = "market://search?q=pname:com.gau.go.launcherex";
				Intent EMarketintent = new Intent(Intent.ACTION_VIEW, Uri.parse(marketuriString));
				EMarketintent.setPackage("com.android.vending");
				EMarketintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(marketuriString));		
				try {
					startActivity(EMarketintent);
				} catch (ActivityNotFoundException e) {
					String link = "http://61.145.124.93/soft/3GHeart/com.gau.go.launcherex.apk";
					Uri browserUri = Uri.parse(link);
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, browserUri);
					browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					try {
						startActivity(browserIntent);
					} catch (ActivityNotFoundException e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
				finish();
				
			}
		});
	    mDialog.show();
    }

	
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	android.os.Process.killProcess(android.os.Process.myPid());
    }
    
    private boolean isExistSkin(String packageName) {
		try {
				createPackageContext(packageName,
						Context.CONTEXT_IGNORE_SECURITY);
			} catch (NameNotFoundException e) {
				return false;
			}
        return true;
	}
    
    private void startGOLauncher(String packageName){
		PackageManager packageMgr = this.getPackageManager();
		Intent launchIntent = packageMgr.getLaunchIntentForPackage(packageName);
		if (null != launchIntent){
			try
			{
				this.startActivity(launchIntent);
			}
			catch(ActivityNotFoundException e)
			{
				
			}
		}
    }
}