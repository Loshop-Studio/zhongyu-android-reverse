package p422y9;

import ba.AbstractC5179a;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10223k;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p377v9.C11551b;

/* renamed from: y9.k */
/* loaded from: classes5.dex */
public final class C11932k {

    /* renamed from: e */
    public static final a f28291e = new a(null);

    /* renamed from: a */
    public final C11551b f28292a;

    /* renamed from: b */
    public final ArrayList f28293b;

    /* renamed from: c */
    public final ArrayList f28294c;

    /* renamed from: d */
    public final ArrayList f28295d;

    /* renamed from: y9.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C11932k(C11551b graphControl) {
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f28292a = graphControl;
        this.f28293b = new ArrayList();
        this.f28294c = new ArrayList();
        this.f28295d = new ArrayList();
    }

    /* renamed from: a */
    public final void m26480a(InterfaceC10223k listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f28295d.add(listener);
    }

    /* renamed from: b */
    public final void m26481b() {
        while (this.f28293b.size() != 1) {
            AbstractC10937b0.m23869N(this.f28293b);
        }
        this.f28294c.clear();
        ArrayList arrayList = this.f28295d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC10223k) obj).mo17149a(this.f28293b.size() > 1, !this.f28294c.isEmpty());
        }
    }

    /* renamed from: c */
    public final C11933l m26482c() {
        if (this.f28294c.isEmpty()) {
            return null;
        }
        C11933l c11933l = (C11933l) AbstractC10947g0.m23956y0(this.f28294c);
        this.f28292a.mo25419E(c11933l.m26487c().mo2733c());
        this.f28292a.mo25444d(c11933l.m26485a());
        this.f28292a.mo25459s(c11933l.m26486b());
        this.f28292a.mo25447g();
        this.f28294c.remove(c11933l);
        this.f28293b.add(c11933l);
        ArrayList arrayList = this.f28295d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC10223k) obj).mo17149a(this.f28293b.size() > 1, true ^ this.f28294c.isEmpty());
        }
        return c11933l;
    }

    /* renamed from: d */
    public final void m26483d(AbstractC5179a rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        this.f28293b.add(new C11933l(rootGraph.mo2733c(), i10, backgroundLineConfig));
        while (this.f28293b.size() > 11) {
            AbstractC10937b0.m23868M(this.f28293b);
        }
        this.f28294c.clear();
        ArrayList arrayList = this.f28295d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((InterfaceC10223k) obj).mo17149a(this.f28293b.size() > 1, true ^ this.f28294c.isEmpty());
        }
    }

    /* renamed from: e */
    public final C11933l m26484e() {
        if (this.f28293b.size() <= 1) {
            return null;
        }
        C11933l c11933l = (C11933l) AbstractC10947g0.m23956y0(this.f28293b);
        this.f28293b.remove(c11933l);
        this.f28294c.add(c11933l);
        C11933l c11933l2 = (C11933l) AbstractC10947g0.m23957z0(this.f28293b);
        if (c11933l2 == null) {
            return null;
        }
        this.f28292a.mo25419E(c11933l2.m26487c().mo2733c());
        this.f28292a.mo25444d(c11933l2.m26485a());
        this.f28292a.mo25459s(c11933l2.m26486b());
        this.f28292a.mo25447g();
        ArrayList arrayList = this.f28295d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC10223k) obj).mo17149a(this.f28293b.size() > 1, !this.f28294c.isEmpty());
        }
        return c11933l2;
    }
}
