package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5366h0;

/* renamed from: com.blankj.utilcode.util.u */
/* loaded from: classes3.dex */
public abstract class AbstractC5384u {

    /* renamed from: com.blankj.utilcode.util.u$a */
    public static class a {

        /* renamed from: b */
        public static final a f2764b = new a(AbstractC5366h0.m2478a().getPackageName(), AbstractC5366h0.m2478a().getPackageName(), 3);

        /* renamed from: a */
        public NotificationChannel f2765a;

        public a(String str, CharSequence charSequence, int i10) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2765a = AbstractC5383t.m2664a(str, charSequence, i10);
            }
        }

        /* renamed from: b */
        public NotificationChannel m2667b() {
            return this.f2765a;
        }
    }

    /* renamed from: a */
    public static Notification m2665a(a aVar, AbstractC5366h0.b bVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ((NotificationManager) AbstractC5366h0.m2478a().getSystemService("notification")).createNotificationChannel(aVar.m2667b());
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(AbstractC5366h0.m2478a());
        if (i10 >= 26) {
            builder.setChannelId(aVar.f2765a.getId());
        }
        if (bVar != null) {
            bVar.accept(builder);
        }
        return builder.build();
    }
}
