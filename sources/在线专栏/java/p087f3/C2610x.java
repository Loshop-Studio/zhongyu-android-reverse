package p087f3;

import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: f3.x */
/* loaded from: classes.dex */
final class C2610x {

    /* renamed from: a */
    @Nullable
    public final Object f10309a;

    /* renamed from: b */
    @Nullable
    public final AbstractC2564j f10310b;

    /* renamed from: c */
    @Nullable
    public final InterfaceC3470l<Throwable, C2925r> f10311c;

    /* renamed from: d */
    @Nullable
    public final Object f10312d;

    /* renamed from: e */
    @Nullable
    public final Throwable f10313e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2610x(@Nullable Object obj, @Nullable AbstractC2564j abstractC2564j, @Nullable InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, @Nullable Object obj2, @Nullable Throwable th) {
        this.f10309a = obj;
        this.f10310b = abstractC2564j;
        this.f10311c = interfaceC3470l;
        this.f10312d = obj2;
        this.f10313e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C2610x m8753b(C2610x c2610x, Object obj, AbstractC2564j abstractC2564j, InterfaceC3470l interfaceC3470l, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = c2610x.f10309a;
        }
        if ((i4 & 2) != 0) {
            abstractC2564j = c2610x.f10310b;
        }
        AbstractC2564j abstractC2564j2 = abstractC2564j;
        if ((i4 & 4) != 0) {
            interfaceC3470l = c2610x.f10311c;
        }
        InterfaceC3470l interfaceC3470l2 = interfaceC3470l;
        if ((i4 & 8) != 0) {
            obj2 = c2610x.f10312d;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = c2610x.f10313e;
        }
        return c2610x.m8754a(obj, abstractC2564j2, interfaceC3470l2, obj4, th);
    }

    @NotNull
    /* renamed from: a */
    public final C2610x m8754a(@Nullable Object obj, @Nullable AbstractC2564j abstractC2564j, @Nullable InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, @Nullable Object obj2, @Nullable Throwable th) {
        return new C2610x(obj, abstractC2564j, interfaceC3470l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m8755c() {
        return this.f10313e != null;
    }

    /* renamed from: d */
    public final void m8756d(@NotNull C2576m<?> c2576m, @NotNull Throwable th) {
        AbstractC2564j abstractC2564j = this.f10310b;
        if (abstractC2564j != null) {
            c2576m.m8617k(abstractC2564j, th);
        }
        InterfaceC3470l<Throwable, C2925r> interfaceC3470l = this.f10311c;
        if (interfaceC3470l == null) {
            return;
        }
        c2576m.m8618m(interfaceC3470l, th);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2610x)) {
            return false;
        }
        C2610x c2610x = (C2610x) obj;
        return C2769l.m9237a(this.f10309a, c2610x.f10309a) && C2769l.m9237a(this.f10310b, c2610x.f10310b) && C2769l.m9237a(this.f10311c, c2610x.f10311c) && C2769l.m9237a(this.f10312d, c2610x.f10312d) && C2769l.m9237a(this.f10313e, c2610x.f10313e);
    }

    public int hashCode() {
        Object obj = this.f10309a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2564j abstractC2564j = this.f10310b;
        int iHashCode2 = (iHashCode + (abstractC2564j == null ? 0 : abstractC2564j.hashCode())) * 31;
        InterfaceC3470l<Throwable, C2925r> interfaceC3470l = this.f10311c;
        int iHashCode3 = (iHashCode2 + (interfaceC3470l == null ? 0 : interfaceC3470l.hashCode())) * 31;
        Object obj2 = this.f10312d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10313e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f10309a + ", cancelHandler=" + this.f10310b + ", onCancellation=" + this.f10311c + ", idempotentResume=" + this.f10312d + ", cancelCause=" + this.f10313e + ')';
    }

    public /* synthetic */ C2610x(Object obj, AbstractC2564j abstractC2564j, InterfaceC3470l interfaceC3470l, Object obj2, Throwable th, int i4, C2764g c2764g) {
        this(obj, (i4 & 2) != 0 ? null : abstractC2564j, (i4 & 4) != 0 ? null : interfaceC3470l, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
