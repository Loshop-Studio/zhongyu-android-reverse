package p084d5;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;

/* renamed from: d5.i */
/* loaded from: classes4.dex */
public final class C7749i {

    /* renamed from: a */
    public final AbstractC8053a f13067a;

    /* renamed from: b */
    public final int f13068b;

    /* renamed from: c */
    public final BackgroundLineConfig f13069c;

    public C7749i(AbstractC8053a rootGraph, int i9, BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f13067a = rootGraph;
        this.f13068b = i9;
        this.f13069c = backgroundLineConfig;
    }

    /* renamed from: a */
    public final int m12094a() {
        return this.f13068b;
    }

    /* renamed from: b */
    public final BackgroundLineConfig m12095b() {
        return this.f13069c;
    }

    /* renamed from: c */
    public final AbstractC8053a m12096c() {
        return this.f13067a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7749i)) {
            return false;
        }
        C7749i c7749i = (C7749i) obj;
        return Intrinsics.areEqual(this.f13067a, c7749i.f13067a) && this.f13068b == c7749i.f13068b && Intrinsics.areEqual(this.f13069c, c7749i.f13069c);
    }

    public int hashCode() {
        return (((this.f13067a.hashCode() * 31) + Integer.hashCode(this.f13068b)) * 31) + this.f13069c.hashCode();
    }

    public String toString() {
        return "HistoryData(rootGraph=" + this.f13067a + ", backgroundColor=" + this.f13068b + ", backgroundLineConfig=" + this.f13069c + ')';
    }
}
