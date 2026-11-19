package p268u8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* renamed from: u8.a */
/* loaded from: classes5.dex */
public final class C10205a {

    /* renamed from: a */
    public final String f20351a;

    /* renamed from: b */
    public List f20352b;

    /* renamed from: c */
    public final List f20353c;

    /* renamed from: d */
    public final Set f20354d;

    /* renamed from: e */
    public final List f20355e;

    /* renamed from: f */
    public final List f20356f;

    /* renamed from: g */
    public final List f20357g;

    public C10205a(String serialName) {
        AbstractC9133u.m16133g(serialName, "serialName");
        this.f20351a = serialName;
        this.f20352b = AbstractC8809v.m14771n();
        this.f20353c = new ArrayList();
        this.f20354d = new HashSet();
        this.f20355e = new ArrayList();
        this.f20356f = new ArrayList();
        this.f20357g = new ArrayList();
    }

    /* renamed from: b */
    public static /* synthetic */ void m19075b(C10205a c10205a, String str, InterfaceC10210f interfaceC10210f, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c10205a.m19076a(str, interfaceC10210f, list, z10);
    }

    /* renamed from: a */
    public final void m19076a(String elementName, InterfaceC10210f descriptor, List annotations, boolean z10) {
        AbstractC9133u.m16133g(elementName, "elementName");
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(annotations, "annotations");
        if (this.f20354d.add(elementName)) {
            this.f20353c.add(elementName);
            this.f20355e.add(descriptor);
            this.f20356f.add(annotations);
            this.f20357g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f20351a).toString());
    }

    /* renamed from: c */
    public final List m19077c() {
        return this.f20352b;
    }

    /* renamed from: d */
    public final List m19078d() {
        return this.f20356f;
    }

    /* renamed from: e */
    public final List m19079e() {
        return this.f20355e;
    }

    /* renamed from: f */
    public final List m19080f() {
        return this.f20353c;
    }

    /* renamed from: g */
    public final List m19081g() {
        return this.f20357g;
    }

    /* renamed from: h */
    public final void m19082h(List list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.f20352b = list;
    }
}
