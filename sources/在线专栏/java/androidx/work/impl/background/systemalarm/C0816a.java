package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import p085f1.C2511i;
import p085f1.InterfaceC2512j;
import p090g1.C2631c;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
class C0816a {

    /* renamed from: a */
    private static final String f4785a = AbstractC3445n.m10503f("Alarms");

    /* renamed from: a */
    public static void m4189a(Context context, C3494i c3494i, String str) {
        InterfaceC2512j interfaceC2512jMo4168J = c3494i.m10613s().mo4168J();
        C2511i c2511iMo8437c = interfaceC2512jMo4168J.mo8437c(str);
        if (c2511iMo8437c != null) {
            m4190b(context, str, c2511iMo8437c.f10143b);
            AbstractC3445n.m10501c().mo10504a(f4785a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            interfaceC2512jMo4168J.mo8438d(str);
        }
    }

    /* renamed from: b */
    private static void m4190b(Context context, String str, int i4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, C0817b.m4194c(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f4785a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i4)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m4191c(Context context, C3494i c3494i, String str, long j4) {
        WorkDatabase workDatabaseM10613s = c3494i.m10613s();
        InterfaceC2512j interfaceC2512jMo4168J = workDatabaseM10613s.mo4168J();
        C2511i c2511iMo8437c = interfaceC2512jMo4168J.mo8437c(str);
        if (c2511iMo8437c != null) {
            m4190b(context, str, c2511iMo8437c.f10143b);
            m4192d(context, str, c2511iMo8437c.f10143b, j4);
        } else {
            int iM8831b = new C2631c(workDatabaseM10613s).m8831b();
            interfaceC2512jMo4168J.mo8435a(new C2511i(str, iM8831b));
            m4192d(context, str, iM8831b, j4);
        }
    }

    /* renamed from: d */
    private static void m4192d(Context context, String str, int i4, long j4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, C0817b.m4194c(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j4, service);
        }
    }
}
