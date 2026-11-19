package p177n4;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.Intrinsics;
import p210q4.AbstractC8886a;

/* renamed from: n4.g */
/* loaded from: classes4.dex */
public final class C8627g {

    /* renamed from: a */
    public final AbstractC8886a f14289a;

    /* renamed from: b */
    public final int f14290b;

    /* renamed from: c */
    public final BackgroundLineConfig f14291c;

    public C8627g(AbstractC8886a rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f14289a = rootGraph;
        this.f14290b = i10;
        this.f14291c = backgroundLineConfig;
    }

    /* renamed from: a */
    public final int m14202a() {
        return this.f14290b;
    }

    /* renamed from: b */
    public final BackgroundLineConfig m14203b() {
        return this.f14291c;
    }

    /* renamed from: c */
    public final AbstractC8886a m14204c() {
        return this.f14289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8627g)) {
            return false;
        }
        C8627g c8627g = (C8627g) obj;
        return Intrinsics.areEqual(this.f14289a, c8627g.f14289a) && this.f14290b == c8627g.f14290b && Intrinsics.areEqual(this.f14291c, c8627g.f14291c);
    }

    public int hashCode() {
        return (((this.f14289a.hashCode() * 31) + Integer.hashCode(this.f14290b)) * 31) + this.f14291c.hashCode();
    }

    public String toString() {
        return "HistoryData(rootGraph=" + this.f14289a + ", backgroundColor=" + this.f14290b + ", backgroundLineConfig=" + this.f14291c + ')';
    }
}
