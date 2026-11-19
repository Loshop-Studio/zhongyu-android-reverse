package p084d5;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.C0038b;
import p117g5.AbstractC8053a;
import p243s5.InterfaceC9482j;

/* renamed from: d5.h */
/* loaded from: classes4.dex */
public final class C7748h {

    /* renamed from: e */
    public static final a f13062e = new a(null);

    /* renamed from: a */
    public final C0038b f13063a;

    /* renamed from: b */
    public final ArrayList f13064b;

    /* renamed from: c */
    public final ArrayList f13065c;

    /* renamed from: d */
    public final ArrayList f13066d;

    /* renamed from: d5.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7748h(C0038b graphControl) {
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13063a = graphControl;
        this.f13064b = new ArrayList();
        this.f13065c = new ArrayList();
        this.f13066d = new ArrayList();
    }

    /* renamed from: a */
    public final void m12090a(InterfaceC9482j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13066d.add(listener);
    }

    /* renamed from: b */
    public final C7749i m12091b() {
        if (this.f13065c.isEmpty()) {
            return null;
        }
        C7749i c7749i = (C7749i) CollectionsKt.last((List) this.f13065c);
        this.f13063a.mo221x(c7749i.m12096c().copy());
        this.f13063a.mo200c(c7749i.m12094a());
        this.f13063a.mo215r(c7749i.m12095b());
        this.f13063a.mo202e();
        this.f13065c.remove(c7749i);
        this.f13064b.add(c7749i);
        ArrayList arrayList = this.f13066d;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((InterfaceC9482j) obj).mo2218a(this.f13064b.size() > 1, true ^ this.f13065c.isEmpty());
        }
        return c7749i;
    }

    /* renamed from: c */
    public final void m12092c(AbstractC8053a rootGraph, int i9, BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f13064b.add(new C7749i(rootGraph.copy(), i9, backgroundLineConfig));
        while (this.f13064b.size() > 11) {
            CollectionsKt.removeFirst(this.f13064b);
        }
        this.f13065c.clear();
        ArrayList arrayList = this.f13066d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC9482j) obj).mo2218a(this.f13064b.size() > 1, true ^ this.f13065c.isEmpty());
        }
    }

    /* renamed from: d */
    public final C7749i m12093d() {
        if (this.f13064b.size() <= 1) {
            return null;
        }
        C7749i c7749i = (C7749i) CollectionsKt.last((List) this.f13064b);
        this.f13064b.remove(c7749i);
        this.f13065c.add(c7749i);
        C7749i c7749i2 = (C7749i) CollectionsKt.lastOrNull((List) this.f13064b);
        if (c7749i2 == null) {
            return null;
        }
        this.f13063a.mo221x(c7749i2.m12096c().copy());
        this.f13063a.mo200c(c7749i2.m12094a());
        this.f13063a.mo215r(c7749i2.m12095b());
        this.f13063a.mo202e();
        ArrayList arrayList = this.f13066d;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((InterfaceC9482j) obj).mo2218a(this.f13064b.size() > 1, !this.f13065c.isEmpty());
        }
        return c7749i2;
    }
}
