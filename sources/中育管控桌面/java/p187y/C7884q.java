package p187y;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;

/* renamed from: y.q */
/* loaded from: classes3.dex */
public final class C7884q implements InterfaceC7877j {

    /* renamed from: a */
    public final InterfaceC6611j f10600a;

    /* renamed from: b */
    public final C7872e f10601b;

    /* renamed from: c */
    public final DataSource f10602c;

    /* renamed from: d */
    public final InterfaceC7708d.b f10603d;

    /* renamed from: e */
    public final String f10604e;

    /* renamed from: f */
    public final boolean f10605f;

    /* renamed from: g */
    public final boolean f10606g;

    public C7884q(InterfaceC6611j interfaceC6611j, C7872e c7872e, DataSource dataSource, InterfaceC7708d.b bVar, String str, boolean z6, boolean z7) {
        this.f10600a = interfaceC6611j;
        this.f10601b = c7872e;
        this.f10602c = dataSource;
        this.f10603d = bVar;
        this.f10604e = str;
        this.f10605f = z6;
        this.f10606g = z7;
    }

    @Override // p187y.InterfaceC7877j
    /* renamed from: a */
    public C7872e mo9568a() {
        return this.f10601b;
    }

    /* renamed from: b */
    public final DataSource m9672b() {
        return this.f10602c;
    }

    /* renamed from: c */
    public final String m9673c() {
        return this.f10604e;
    }

    /* renamed from: d */
    public InterfaceC6611j m9674d() {
        return this.f10600a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7884q)) {
            return false;
        }
        C7884q c7884q = (C7884q) obj;
        return Intrinsics.areEqual(this.f10600a, c7884q.f10600a) && Intrinsics.areEqual(this.f10601b, c7884q.f10601b) && this.f10602c == c7884q.f10602c && Intrinsics.areEqual(this.f10603d, c7884q.f10603d) && Intrinsics.areEqual(this.f10604e, c7884q.f10604e) && this.f10605f == c7884q.f10605f && this.f10606g == c7884q.f10606g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f10600a.hashCode() * 31) + this.f10601b.hashCode()) * 31) + this.f10602c.hashCode()) * 31;
        InterfaceC7708d.b bVar = this.f10603d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f10604e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f10605f)) * 31) + Boolean.hashCode(this.f10606g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f10600a + ", request=" + this.f10601b + ", dataSource=" + this.f10602c + ", memoryCacheKey=" + this.f10603d + ", diskCacheKey=" + this.f10604e + ", isSampled=" + this.f10605f + ", isPlaceholderCached=" + this.f10606g + ')';
    }
}
