package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C0820e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p012b1.C1029d;
import p085f1.C2520r;
import p169x0.AbstractC3445n;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
class C0818c {

    /* renamed from: e */
    private static final String f4790e = AbstractC3445n.m10503f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f4791a;

    /* renamed from: b */
    private final int f4792b;

    /* renamed from: c */
    private final C0820e f4793c;

    /* renamed from: d */
    private final C1029d f4794d;

    C0818c(Context context, int i4, C0820e c0820e) {
        this.f4791a = context;
        this.f4792b = i4;
        this.f4793c = c0820e;
        this.f4794d = new C1029d(context, c0820e.m4222f(), null);
    }

    /* renamed from: a */
    void m4209a() {
        List<C2520r> listMo8471s = this.f4793c.m4223g().m10613s().mo4171M().mo8471s();
        ConstraintProxy.m4185a(this.f4791a, listMo8471s);
        this.f4794d.m4793d(listMo8471s);
        ArrayList arrayList = new ArrayList(listMo8471s.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C2520r c2520r : listMo8471s) {
            String str = c2520r.f10165a;
            if (jCurrentTimeMillis >= c2520r.m8447a() && (!c2520r.m8448b() || this.f4794d.m4792c(str))) {
                arrayList.add(c2520r);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C2520r) it.next()).f10165a;
            Intent intentM4194c = C0817b.m4194c(this.f4791a, str2);
            AbstractC3445n.m10501c().mo10504a(f4790e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C0820e c0820e = this.f4793c;
            c0820e.m4226k(new C0820e.b(c0820e, intentM4194c, this.f4792b));
        }
        this.f4794d.m4794e();
    }
}
