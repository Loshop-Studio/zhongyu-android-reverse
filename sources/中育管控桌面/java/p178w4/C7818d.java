package p178w4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p087k.AbstractC6619r;
import p143r4.InterfaceC7648a;
import p143r4.InterfaceC7650c;
import p164u4.AbstractC7774b;

/* renamed from: w4.d */
/* loaded from: classes4.dex */
public final class C7818d implements InterfaceC7648a, InterfaceC7650c {

    /* renamed from: a */
    public final Set f10380a = new HashSet();

    /* renamed from: b */
    public boolean f10381b = false;

    /* renamed from: a */
    public void m9408a() {
        AbstractC7774b.m9305a();
        this.f10381b = true;
        Iterator it = this.f10380a.iterator();
        if (it.hasNext()) {
            AbstractC6619r.m7572a(it.next());
            throw null;
        }
    }
}
