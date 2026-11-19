package p275v7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p217q.AbstractC9343a;
import p225q7.InterfaceC9375a;
import p225q7.InterfaceC9377c;
import p255t7.AbstractC9635b;

/* renamed from: v7.d */
/* loaded from: classes5.dex */
public final class C9772d implements InterfaceC9375a, InterfaceC9377c {

    /* renamed from: a */
    public final Set f17382a = new HashSet();

    /* renamed from: b */
    public boolean f17383b = false;

    /* renamed from: a */
    public void m16556a() {
        AbstractC9635b.m15908a();
        this.f17383b = true;
        Iterator it = this.f17382a.iterator();
        if (it.hasNext()) {
            AbstractC9343a.m15285a(it.next());
            throw null;
        }
    }
}
