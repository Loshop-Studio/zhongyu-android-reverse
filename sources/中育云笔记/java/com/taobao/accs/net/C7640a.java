package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* renamed from: com.taobao.accs.net.a */
/* loaded from: classes5.dex */
public class C7640a extends AbstractC7646f {

    /* renamed from: c */
    private PendingIntent f13049c;

    /* renamed from: d */
    private AlarmManager f13050d;

    public C7640a(Context context) {
        super(context);
        try {
            this.f13050d = (AlarmManager) this.f13077a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        } catch (Throwable th) {
            ALog.m10117e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC7646f
    /* renamed from: a */
    public void mo10013a(int i10) {
        if (this.f13050d == null) {
            this.f13050d = (AlarmManager) this.f13077a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        }
        if (this.f13050d == null) {
            ALog.m10118e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (this.f13049c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f13077a.getPackageName());
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            this.f13049c = PendingIntent.getBroadcast(this.f13077a, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, i10);
        this.f13050d.set(0, calendar.getTimeInMillis(), this.f13049c);
    }
}
