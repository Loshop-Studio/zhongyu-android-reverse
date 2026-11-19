package p101k7;

import android.support.v4.media.AbstractC0037f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: k7.a */
/* loaded from: classes4.dex */
public final class C5759a {

    /* renamed from: a */
    public final String f9109a;

    /* renamed from: b */
    public List f9110b;

    /* renamed from: c */
    public final ArrayList f9111c;

    /* renamed from: d */
    public final HashSet f9112d;

    /* renamed from: e */
    public final ArrayList f9113e;

    /* renamed from: f */
    public final ArrayList f9114f;

    /* renamed from: g */
    public final ArrayList f9115g;

    public C5759a(String serialName) {
        AbstractC5830k.m5330g(serialName, "serialName");
        this.f9109a = serialName;
        this.f9110b = EmptyList.INSTANCE;
        this.f9111c = new ArrayList();
        this.f9112d = new HashSet();
        this.f9113e = new ArrayList();
        this.f9114f = new ArrayList();
        this.f9115g = new ArrayList();
    }

    /* renamed from: a */
    public static void m5098a(C5759a c5759a, String str, InterfaceC5765g descriptor) {
        EmptyList annotations = EmptyList.INSTANCE;
        c5759a.getClass();
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(annotations, "annotations");
        if (!c5759a.f9112d.add(str)) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Element with name '", str, "' is already registered in ");
            sbM100y.append(c5759a.f9109a);
            throw new IllegalArgumentException(sbM100y.toString().toString());
        }
        c5759a.f9111c.add(str);
        c5759a.f9113e.add(descriptor);
        c5759a.f9114f.add(annotations);
        c5759a.f9115g.add(false);
    }
}
