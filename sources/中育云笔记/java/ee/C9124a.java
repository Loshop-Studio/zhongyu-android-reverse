package ee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* renamed from: ee.a */
/* loaded from: classes6.dex */
public final class C9124a {

    /* renamed from: a */
    public final String f21290a;

    /* renamed from: b */
    public List f21291b;

    /* renamed from: c */
    public final List f21292c;

    /* renamed from: d */
    public final Set f21293d;

    /* renamed from: e */
    public final List f21294e;

    /* renamed from: f */
    public final List f21295f;

    /* renamed from: g */
    public final List f21296g;

    public C9124a(String serialName) {
        AbstractC9979u.m20294g(serialName, "serialName");
        this.f21290a = serialName;
        this.f21291b = AbstractC10978w.m24136n();
        this.f21292c = new ArrayList();
        this.f21293d = new HashSet();
        this.f21294e = new ArrayList();
        this.f21295f = new ArrayList();
        this.f21296g = new ArrayList();
    }

    /* renamed from: b */
    public static /* synthetic */ void m17947b(C9124a c9124a, String str, InterfaceC9129f interfaceC9129f, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC10978w.m24136n();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c9124a.m17948a(str, interfaceC9129f, list, z10);
    }

    /* renamed from: a */
    public final void m17948a(String elementName, InterfaceC9129f descriptor, List annotations, boolean z10) {
        AbstractC9979u.m20294g(elementName, "elementName");
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(annotations, "annotations");
        if (this.f21293d.add(elementName)) {
            this.f21292c.add(elementName);
            this.f21294e.add(descriptor);
            this.f21295f.add(annotations);
            this.f21296g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f21290a).toString());
    }

    /* renamed from: c */
    public final List m17949c() {
        return this.f21291b;
    }

    /* renamed from: d */
    public final List m17950d() {
        return this.f21295f;
    }

    /* renamed from: e */
    public final List m17951e() {
        return this.f21294e;
    }

    /* renamed from: f */
    public final List m17952f() {
        return this.f21292c;
    }

    /* renamed from: g */
    public final List m17953g() {
        return this.f21296g;
    }

    /* renamed from: h */
    public final void m17954h(List list) {
        AbstractC9979u.m20294g(list, "<set-?>");
        this.f21291b = list;
    }
}
