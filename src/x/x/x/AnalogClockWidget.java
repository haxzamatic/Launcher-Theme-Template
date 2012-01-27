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

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class AnalogClockWidget extends AppWidgetProvider
{    
    public void onReceive(Context context, Intent intent)
    {
        String action = intent.getAction();
        if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(action))
        {
       	
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.analog_appwidget);
            
            Intent AlarmClockIntent = new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER).setComponent(new ComponentName("com.android.alarmclock", "com.android.alarmclock.AlarmClock"));
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, AlarmClockIntent, 0);
            views.setOnClickPendingIntent(R.id.analog_appwidget, pendingIntent);
                                    
            AppWidgetManager.getInstance(context).updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), views);
        }
    }
}
