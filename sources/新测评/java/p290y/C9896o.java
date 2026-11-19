package p290y;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;

/* renamed from: y.o */
/* loaded from: classes3.dex */
public final class C9896o implements InterfaceC9889h {

    /* renamed from: a */
    public final InterfaceC7838j f17625a;

    /* renamed from: b */
    public final C9886e f17626b;

    /* renamed from: c */
    public final DataSource f17627c;

    /* renamed from: d */
    public final InterfaceC9363d.b f17628d;

    /* renamed from: e */
    public final String f17629e;

    /* renamed from: f */
    public final boolean f17630f;

    /* renamed from: g */
    public final boolean f17631g;

    public C9896o(InterfaceC7838j interfaceC7838j, C9886e c9886e, DataSource dataSource, InterfaceC9363d.b bVar, String str, boolean z9, boolean z10) {
        this.f17625a = interfaceC7838j;
        this.f17626b = c9886e;
        this.f17627c = dataSource;
        this.f17628d = bVar;
        this.f17629e = str;
        this.f17630f = z9;
        this.f17631g = z10;
    }

    @Override // p290y.InterfaceC9889h
    /* renamed from: a */
    public C9886e mo16611a() {
        return this.f17626b;
    }

    /* renamed from: b */
    public final DataSource m16711b() {
        return this.f17627c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9896o)) {
            return false;
        }
        C9896o c9896o = (C9896o) obj;
        return Intrinsics.areEqual(this.f17625a, c9896o.f17625a) && Intrinsics.areEqual(this.f17626b, c9896o.f17626b) && this.f17627c == c9896o.f17627c && Intrinsics.areEqual(this.f17628d, c9896o.f17628d) && Intrinsics.areEqual(this.f17629e, c9896o.f17629e) && this.f17630f == c9896o.f17630f && this.f17631g == c9896o.f17631g;
    }

    @Override // p290y.InterfaceC9889h
    public InterfaceC7838j getImage() {
        return this.f17625a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f17625a.hashCode() * 31) + this.f17626b.hashCode()) * 31) + this.f17627c.hashCode()) * 31;
        InterfaceC9363d.b bVar = this.f17628d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f17629e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17630f)) * 31) + Boolean.hashCode(this.f17631g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f17625a + ", request=" + this.f17626b + ", dataSource=" + this.f17627c + ", memoryCacheKey=" + this.f17628d + ", diskCacheKey=" + this.f17629e + ", isSampled=" + this.f17630f + ", isPlaceholderCached=" + this.f17631g + ')';
    }
}
