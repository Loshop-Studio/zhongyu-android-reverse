package p207y6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5837r;
import kotlin.reflect.KVariance;

/* renamed from: y6.s */
/* loaded from: classes2.dex */
public final class C6795s {

    /* renamed from: c */
    public static final /* synthetic */ int f11461c = 0;

    /* renamed from: a */
    public final KVariance f11462a;

    /* renamed from: b */
    public final InterfaceC6793q f11463b;

    static {
        new C6795s(null, null);
    }

    public C6795s(KVariance kVariance, C5837r c5837r) {
        String str;
        this.f11462a = kVariance;
        this.f11463b = c5837r;
        if ((kVariance == null) == (c5837r == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6795s)) {
            return false;
        }
        C6795s c6795s = (C6795s) obj;
        return this.f11462a == c6795s.f11462a && AbstractC5830k.m5325b(this.f11463b, c6795s.f11463b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f11462a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        InterfaceC6793q interfaceC6793q = this.f11463b;
        return iHashCode + (interfaceC6793q != null ? interfaceC6793q.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f11462a;
        int i = kVariance == null ? -1 : AbstractC6794r.f11460a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        InterfaceC6793q interfaceC6793q = this.f11463b;
        if (i == 1) {
            return String.valueOf(interfaceC6793q);
        }
        if (i == 2) {
            return "in " + interfaceC6793q;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + interfaceC6793q;
    }
}
