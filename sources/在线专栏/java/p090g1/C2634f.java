package p090g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p085f1.C2506d;
import p149s0.InterfaceC3371b;

/* renamed from: g1.f */
/* loaded from: classes.dex */
public class C2634f {

    /* renamed from: a */
    private final WorkDatabase f10418a;

    public C2634f(WorkDatabase workDatabase) {
        this.f10418a = workDatabase;
    }

    /* renamed from: b */
    public static void m8835b(Context context, InterfaceC3371b interfaceC3371b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j5 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC3371b.mo3506f();
            try {
                interfaceC3371b.mo3514z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                interfaceC3371b.mo3514z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j5)});
                sharedPreferences.edit().clear().apply();
                interfaceC3371b.mo3513x();
            } finally {
                interfaceC3371b.mo3505e();
            }
        }
    }

    /* renamed from: a */
    public boolean m8836a() {
        Long lMo8429a = this.f10418a.mo4166H().mo8429a("reschedule_needed");
        return lMo8429a != null && lMo8429a.longValue() == 1;
    }

    /* renamed from: c */
    public void m8837c(long j4) {
        this.f10418a.mo4166H().mo8430b(new C2506d("last_cancel_all_time_ms", j4));
    }

    /* renamed from: d */
    public void m8838d(boolean z3) {
        this.f10418a.mo4166H().mo8430b(new C2506d("reschedule_needed", z3));
    }
}
