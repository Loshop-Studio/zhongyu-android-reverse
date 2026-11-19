package p090g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p085f1.C2506d;
import p149s0.InterfaceC3371b;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public class C2631c {

    /* renamed from: a */
    private final WorkDatabase f10409a;

    public C2631c(WorkDatabase workDatabase) {
        this.f10409a = workDatabase;
    }

    /* renamed from: a */
    public static void m8828a(Context context, InterfaceC3371b interfaceC3371b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i4 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i5 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC3371b.mo3506f();
            try {
                interfaceC3371b.mo3514z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i4)});
                interfaceC3371b.mo3514z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                sharedPreferences.edit().clear().apply();
                interfaceC3371b.mo3513x();
            } finally {
                interfaceC3371b.mo3505e();
            }
        }
    }

    /* renamed from: c */
    private int m8829c(String str) {
        this.f10409a.m3542e();
        try {
            Long lMo8429a = this.f10409a.mo4166H().mo8429a(str);
            int i4 = 0;
            int iIntValue = lMo8429a != null ? lMo8429a.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i4 = iIntValue + 1;
            }
            m8830e(str, i4);
            this.f10409a.m3539A();
            return iIntValue;
        } finally {
            this.f10409a.m3546i();
        }
    }

    /* renamed from: e */
    private void m8830e(String str, int i4) {
        this.f10409a.mo4166H().mo8430b(new C2506d(str, i4));
    }

    /* renamed from: b */
    public int m8831b() {
        int iM8829c;
        synchronized (C2631c.class) {
            iM8829c = m8829c("next_alarm_manager_id");
        }
        return iM8829c;
    }

    /* renamed from: d */
    public int m8832d(int i4, int i5) {
        synchronized (C2631c.class) {
            int iM8829c = m8829c("next_job_scheduler_id");
            if (iM8829c < i4 || iM8829c > i5) {
                m8830e("next_job_scheduler_id", i4 + 1);
            } else {
                i4 = iM8829c;
            }
        }
        return i4;
    }
}
