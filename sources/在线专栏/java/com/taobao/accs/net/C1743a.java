package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* renamed from: com.taobao.accs.net.a */
/* loaded from: classes.dex */
public class C1743a extends AbstractC1749f {

    /* renamed from: c */
    private PendingIntent f7651c;

    /* renamed from: d */
    private AlarmManager f7652d;

    public C1743a(Context context) {
        super(context);
        try {
            this.f7652d = (AlarmManager) this.f7679a.getSystemService("alarm");
        } catch (Throwable th) {
            ALog.m6091e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC1749f
    /* renamed from: a */
    protected void mo5987a(int i4) {
        if (this.f7652d == null) {
            this.f7652d = (AlarmManager) this.f7679a.getSystemService("alarm");
        }
        if (this.f7652d == null) {
            ALog.m6092e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (this.f7651c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f7679a.getPackageName());
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f7651c = PendingIntent.getBroadcast(this.f7679a, 0, intent, 67108864);
            } else {
                this.f7651c = PendingIntent.getBroadcast(this.f7679a, 0, intent, 0);
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, i4);
        this.f7652d.set(0, calendar.getTimeInMillis(), this.f7651c);
    }
}
