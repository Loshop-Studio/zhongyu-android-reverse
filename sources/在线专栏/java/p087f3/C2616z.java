package p087f3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: f3.z */
/* loaded from: classes.dex */
public final class C2616z {

    /* renamed from: a */
    @Nullable
    public final Object f10318a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC3470l<Throwable, C2925r> f10319b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2616z(@Nullable Object obj, @NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        this.f10318a = obj;
        this.f10319b = interfaceC3470l;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2616z)) {
            return false;
        }
        C2616z c2616z = (C2616z) obj;
        return C2769l.m9237a(this.f10318a, c2616z.f10318a) && C2769l.m9237a(this.f10319b, c2616z.f10319b);
    }

    public int hashCode() {
        Object obj = this.f10318a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f10319b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f10318a + ", onCancellation=" + this.f10319b + ')';
    }
}
