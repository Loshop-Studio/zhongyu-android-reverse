package p177n4;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5127j;
import p142k4.C7879b;
import p210q4.AbstractC8886a;

/* renamed from: n4.f */
/* loaded from: classes4.dex */
public final class C8626f {

    /* renamed from: e */
    public static final a f14284e = new a(null);

    /* renamed from: a */
    public final C7879b f14285a;

    /* renamed from: b */
    public final ArrayList f14286b;

    /* renamed from: c */
    public final ArrayList f14287c;

    /* renamed from: d */
    public final ArrayList f14288d;

    /* renamed from: n4.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C8626f(C7879b graphControl) {
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f14285a = graphControl;
        this.f14286b = new ArrayList();
        this.f14287c = new ArrayList();
        this.f14288d = new ArrayList();
    }

    /* renamed from: a */
    public final void m14198a(InterfaceC5127j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14288d.add(listener);
    }

    /* renamed from: b */
    public final C8627g m14199b() {
        if (this.f14287c.isEmpty()) {
            return null;
        }
        C8627g c8627g = (C8627g) CollectionsKt.last((List) this.f14287c);
        this.f14285a.mo13451p(c8627g.m14204c().mo6746c());
        this.f14285a.mo13438c(c8627g.m14202a());
        this.f14285a.mo13455t(c8627g.m14203b());
        this.f14285a.mo13440e();
        this.f14287c.remove(c8627g);
        this.f14286b.add(c8627g);
        ArrayList arrayList = this.f14288d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC5127j) obj).mo2787a(this.f14286b.size() > 1, true ^ this.f14287c.isEmpty());
        }
        return c8627g;
    }

    /* renamed from: c */
    public final void m14200c(AbstractC8886a rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f14286b.add(new C8627g(rootGraph.mo6746c(), i10, backgroundLineConfig));
        while (this.f14286b.size() > 11) {
            CollectionsKt.removeFirst(this.f14286b);
        }
        this.f14287c.clear();
        ArrayList arrayList = this.f14288d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((InterfaceC5127j) obj).mo2787a(this.f14286b.size() > 1, true ^ this.f14287c.isEmpty());
        }
    }

    /* renamed from: d */
    public final C8627g m14201d() {
        if (this.f14286b.size() <= 1) {
            return null;
        }
        C8627g c8627g = (C8627g) CollectionsKt.last((List) this.f14286b);
        this.f14286b.remove(c8627g);
        this.f14287c.add(c8627g);
        C8627g c8627g2 = (C8627g) CollectionsKt.lastOrNull((List) this.f14286b);
        if (c8627g2 == null) {
            return null;
        }
        this.f14285a.mo13451p(c8627g2.m14204c().mo6746c());
        this.f14285a.mo13438c(c8627g2.m14202a());
        this.f14285a.mo13455t(c8627g2.m14203b());
        this.f14285a.mo13440e();
        ArrayList arrayList = this.f14288d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC5127j) obj).mo2787a(this.f14286b.size() > 1, !this.f14287c.isEmpty());
        }
        return c8627g2;
    }
}
