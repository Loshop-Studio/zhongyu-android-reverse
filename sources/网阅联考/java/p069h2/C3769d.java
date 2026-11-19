package p069h2;

import com.bumptech.glide.AbstractC2857b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p049d2.InterfaceC3704a;
import p049d2.InterfaceC3706c;
import p059f2.AbstractC3735b;

/* renamed from: h2.d */
/* loaded from: classes2.dex */
public final class C3769d implements InterfaceC3704a, InterfaceC3706c {

    /* renamed from: a */
    public final Set f4455a = new HashSet();

    /* renamed from: b */
    public boolean f4456b = false;

    /* renamed from: a */
    public void m4871a() {
        AbstractC3735b.m4731a();
        this.f4456b = true;
        Iterator it = this.f4455a.iterator();
        if (it.hasNext()) {
            AbstractC2857b.m1678a(it.next());
            throw null;
        }
    }
}
