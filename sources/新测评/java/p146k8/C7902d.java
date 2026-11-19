package p146k8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p091f8.InterfaceC7494a;
import p091f8.InterfaceC7496c;
import p124i8.AbstractC7715b;
import p137k.AbstractC7846r;

/* renamed from: k8.d */
/* loaded from: classes5.dex */
public final class C7902d implements InterfaceC7494a, InterfaceC7496c {

    /* renamed from: a */
    public final Set f13775a = new HashSet();

    /* renamed from: b */
    public boolean f13776b = false;

    /* renamed from: a */
    public void m13523a() {
        AbstractC7715b.m12889a();
        this.f13776b = true;
        Iterator it = this.f13775a.iterator();
        if (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            throw null;
        }
    }
}
