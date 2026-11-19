package p128o2;

import java.io.Serializable;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o2.k */
/* loaded from: classes.dex */
public final class C2918k<A, B> implements Serializable {

    /* renamed from: a */
    private final A f11407a;

    /* renamed from: b */
    private final B f11408b;

    public C2918k(A a4, B b4) {
        this.f11407a = a4;
        this.f11408b = b4;
    }

    /* renamed from: a */
    public final A m9985a() {
        return this.f11407a;
    }

    /* renamed from: b */
    public final B m9986b() {
        return this.f11408b;
    }

    /* renamed from: c */
    public final A m9987c() {
        return this.f11407a;
    }

    /* renamed from: d */
    public final B m9988d() {
        return this.f11408b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2918k)) {
            return false;
        }
        C2918k c2918k = (C2918k) obj;
        return C2769l.m9237a(this.f11407a, c2918k.f11407a) && C2769l.m9237a(this.f11408b, c2918k.f11408b);
    }

    public int hashCode() {
        A a4 = this.f11407a;
        int iHashCode = (a4 == null ? 0 : a4.hashCode()) * 31;
        B b4 = this.f11408b;
        return iHashCode + (b4 != null ? b4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.f11407a + ", " + this.f11408b + ')';
    }
}
