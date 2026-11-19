package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC4657l0;

/* renamed from: com.blankj.utilcode.util.x */
/* loaded from: classes3.dex */
public abstract class AbstractC4673x {

    /* renamed from: com.blankj.utilcode.util.x$a */
    public static class a {

        /* renamed from: b */
        public static final a f2145b = new a(AbstractC4657l0.m2250a().getPackageName(), AbstractC4657l0.m2250a().getPackageName(), 3);

        /* renamed from: a */
        public NotificationChannel f2146a;

        public a(String str, CharSequence charSequence, int i6) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2146a = AbstractC4672w.m2435a(str, charSequence, i6);
            }
        }

        /* renamed from: b */
        public NotificationChannel m2438b() {
            return this.f2146a;
        }
    }

    /* renamed from: a */
    public static Notification m2436a(a aVar, AbstractC4657l0.b bVar) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            ((NotificationManager) AbstractC4657l0.m2250a().getSystemService("notification")).createNotificationChannel(aVar.m2438b());
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(AbstractC4657l0.m2250a());
        if (i6 >= 26) {
            builder.setChannelId(aVar.f2146a.getId());
        }
        if (bVar != null) {
            bVar.accept(builder);
        }
        return builder.build();
    }
}
