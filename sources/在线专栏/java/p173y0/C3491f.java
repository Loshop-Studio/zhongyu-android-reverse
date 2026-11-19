package p173y0;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0821f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p002a1.C0008b;
import p085f1.C2520r;
import p085f1.InterfaceC2521s;
import p090g1.C2633e;
import p169x0.AbstractC3445n;
import p169x0.C3433b;

/* renamed from: y0.f */
/* loaded from: classes.dex */
public class C3491f {

    /* renamed from: a */
    private static final String f12178a = AbstractC3445n.m10503f("Schedulers");

    /* renamed from: a */
    static InterfaceC3490e m10575a(Context context, C3494i c3494i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0008b c0008b = new C0008b(context, c3494i);
            C2633e.m8834a(context, SystemJobService.class, true);
            AbstractC3445n.m10501c().mo10504a(f12178a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return c0008b;
        }
        InterfaceC3490e interfaceC3490eM10577c = m10577c(context);
        if (interfaceC3490eM10577c != null) {
            return interfaceC3490eM10577c;
        }
        C0821f c0821f = new C0821f(context);
        C2633e.m8834a(context, SystemAlarmService.class, true);
        AbstractC3445n.m10501c().mo10504a(f12178a, "Created SystemAlarmScheduler", new Throwable[0]);
        return c0821f;
    }

    /* renamed from: b */
    public static void m10576b(C3433b c3433b, WorkDatabase workDatabase, List<InterfaceC3490e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC2521s interfaceC2521sMo4171M = workDatabase.mo4171M();
        workDatabase.m3542e();
        try {
            List<C2520r> listMo8462j = interfaceC2521sMo4171M.mo8462j(c3433b.m10454g());
            List<C2520r> listMo8472t = interfaceC2521sMo4171M.mo8472t(200);
            if (listMo8462j != null && listMo8462j.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<C2520r> it = listMo8462j.iterator();
                while (it.hasNext()) {
                    interfaceC2521sMo4171M.mo8456d(it.next().f10165a, jCurrentTimeMillis);
                }
            }
            workDatabase.m3539A();
            if (listMo8462j != null && listMo8462j.size() > 0) {
                C2520r[] c2520rArr = (C2520r[]) listMo8462j.toArray(new C2520r[listMo8462j.size()]);
                for (InterfaceC3490e interfaceC3490e : list) {
                    if (interfaceC3490e.mo57e()) {
                        interfaceC3490e.mo58f(c2520rArr);
                    }
                }
            }
            if (listMo8472t == null || listMo8472t.size() <= 0) {
                return;
            }
            C2520r[] c2520rArr2 = (C2520r[]) listMo8472t.toArray(new C2520r[listMo8472t.size()]);
            for (InterfaceC3490e interfaceC3490e2 : list) {
                if (!interfaceC3490e2.mo57e()) {
                    interfaceC3490e2.mo58f(c2520rArr2);
                }
            }
        } finally {
            workDatabase.m3546i();
        }
    }

    /* renamed from: c */
    private static InterfaceC3490e m10577c(Context context) {
        try {
            InterfaceC3490e interfaceC3490e = (InterfaceC3490e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC3445n.m10501c().mo10504a(f12178a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return interfaceC3490e;
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10504a(f12178a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
