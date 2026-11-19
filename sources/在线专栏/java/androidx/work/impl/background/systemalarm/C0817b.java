package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0820e;
import java.util.HashMap;
import java.util.Map;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p173y0.InterfaceC3487b;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C0817b implements InterfaceC3487b {

    /* renamed from: d */
    private static final String f4786d = AbstractC3445n.m10503f("CommandHandler");

    /* renamed from: a */
    private final Context f4787a;

    /* renamed from: b */
    private final Map<String, InterfaceC3487b> f4788b = new HashMap();

    /* renamed from: c */
    private final Object f4789c = new Object();

    C0817b(Context context) {
        this.f4787a = context;
    }

    /* renamed from: b */
    static Intent m4193b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: c */
    static Intent m4194c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    static Intent m4195d(Context context, String str, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        return intent;
    }

    /* renamed from: e */
    static Intent m4196e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m4197f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m4198g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m4199h(Intent intent, int i4, C0820e c0820e) {
        AbstractC3445n.m10501c().mo10504a(f4786d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C0818c(this.f4787a, i4, c0820e).m4209a();
    }

    /* renamed from: i */
    private void m4200i(Intent intent, int i4, C0820e c0820e) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4789c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
            String str = f4786d;
            abstractC3445nM10501c.mo10504a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f4788b.containsKey(string)) {
                AbstractC3445n.m10501c().mo10504a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                C0819d c0819d = new C0819d(this.f4787a, i4, string, c0820e);
                this.f4788b.put(string, c0819d);
                c0819d.m4215f();
            }
        }
    }

    /* renamed from: j */
    private void m4201j(Intent intent, int i4) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z3 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC3445n.m10501c().mo10504a(f4786d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i4)), new Throwable[0]);
        mo4206a(string, z3);
    }

    /* renamed from: k */
    private void m4202k(Intent intent, int i4, C0820e c0820e) {
        AbstractC3445n.m10501c().mo10504a(f4786d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i4)), new Throwable[0]);
        c0820e.m4223g().m10617x();
    }

    /* renamed from: l */
    private void m4203l(Intent intent, int i4, C0820e c0820e) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
        String str = f4786d;
        abstractC3445nM10501c.mo10504a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseM10613s = c0820e.m4223g().m10613s();
        workDatabaseM10613s.m3542e();
        try {
            C2520r c2520rMo8463k = workDatabaseM10613s.mo4171M().mo8463k(string);
            if (c2520rMo8463k == null) {
                AbstractC3445n.m10501c().mo10508h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (c2520rMo8463k.f10166b.m10524a()) {
                AbstractC3445n.m10501c().mo10508h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jM8447a = c2520rMo8463k.m8447a();
            if (c2520rMo8463k.m8448b()) {
                AbstractC3445n.m10501c().mo10504a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jM8447a)), new Throwable[0]);
                C0816a.m4191c(this.f4787a, c0820e.m4223g(), string, jM8447a);
                c0820e.m4226k(new C0820e.b(c0820e, m4193b(this.f4787a), i4));
            } else {
                AbstractC3445n.m10501c().mo10504a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jM8447a)), new Throwable[0]);
                C0816a.m4191c(this.f4787a, c0820e.m4223g(), string, jM8447a);
            }
            workDatabaseM10613s.m3539A();
        } finally {
            workDatabaseM10613s.m3546i();
        }
    }

    /* renamed from: m */
    private void m4204m(Intent intent, C0820e c0820e) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC3445n.m10501c().mo10504a(f4786d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c0820e.m4223g().m10603C(string);
        C0816a.m4189a(this.f4787a, c0820e.m4223g(), string);
        c0820e.mo4206a(string, false);
    }

    /* renamed from: n */
    private static boolean m4205n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        synchronized (this.f4789c) {
            InterfaceC3487b interfaceC3487bRemove = this.f4788b.remove(str);
            if (interfaceC3487bRemove != null) {
                interfaceC3487bRemove.mo4206a(str, z3);
            }
        }
    }

    /* renamed from: o */
    boolean m4207o() {
        boolean z3;
        synchronized (this.f4789c) {
            z3 = !this.f4788b.isEmpty();
        }
        return z3;
    }

    /* renamed from: p */
    void m4208p(Intent intent, int i4, C0820e c0820e) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4199h(intent, i4, c0820e);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m4202k(intent, i4, c0820e);
            return;
        }
        if (!m4205n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC3445n.m10501c().mo10505b(f4786d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m4203l(intent, i4, c0820e);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m4200i(intent, i4, c0820e);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m4204m(intent, c0820e);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m4201j(intent, i4);
        } else {
            AbstractC3445n.m10501c().mo10508h(f4786d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
