package p122h6;

import com.blankj.utilcode.util.AbstractC5379p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p037c6.InterfaceC5270a;
import p037c6.InterfaceC5272c;
import p099f6.AbstractC8461b;

/* renamed from: h6.d */
/* loaded from: classes5.dex */
public final class C8720d implements InterfaceC5270a, InterfaceC5272c {

    /* renamed from: a */
    public final Set f16345a = new HashSet();

    /* renamed from: b */
    public boolean f16346b = false;

    /* renamed from: a */
    public void m14227a() {
        AbstractC8461b.m13789a();
        this.f16346b = true;
        Iterator it = this.f16345a.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            throw null;
        }
    }
}
