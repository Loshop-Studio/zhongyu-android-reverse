package cc;

import ac.AbstractC0103b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p212k.AbstractC9764r;
import p408xb.InterfaceC11823a;
import p408xb.InterfaceC11825c;

/* renamed from: cc.d */
/* loaded from: classes6.dex */
public final class C5421d implements InterfaceC11823a, InterfaceC11825c {

    /* renamed from: a */
    public final Set f3504a = new HashSet();

    /* renamed from: b */
    public boolean f3505b = false;

    /* renamed from: a */
    public void m2899a() {
        AbstractC0103b.m275a();
        this.f3505b = true;
        Iterator it = this.f3504a.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }
}
