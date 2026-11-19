package ge;

import ee.AbstractC9133j;
import ee.AbstractC9136m;
import ee.AbstractC9137n;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;

/* renamed from: ge.f0 */
/* loaded from: classes6.dex */
public final class C9320f0 extends C9312d2 {

    /* renamed from: l */
    public final AbstractC9137n f21710l;

    /* renamed from: m */
    public final InterfaceC10773d f21711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9320f0(final String name, final int i10) {
        super(name, null, i10, 2, null);
        AbstractC9979u.m20294g(name, "name");
        this.f21710l = AbstractC9137n.b.f21331a;
        this.f21711m = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: ge.e0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C9320f0.m18415w(i10, name, this);
            }
        });
    }

    /* renamed from: w */
    public static final InterfaceC9129f[] m18415w(int i10, String str, C9320f0 c9320f0) {
        InterfaceC9129f[] interfaceC9129fArr = new InterfaceC9129f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9129fArr[i11] = AbstractC9136m.m17983i(str + '.' + c9320f0.mo17959d(i11), AbstractC9138o.d.f21335a, new InterfaceC9129f[0], null, 8, null);
        }
        return interfaceC9129fArr;
    }

    @Override // ge.C9312d2, ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return m18416x()[i10];
    }

    @Override // ge.C9312d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC9129f)) {
            return false;
        }
        InterfaceC9129f interfaceC9129f = (InterfaceC9129f) obj;
        return interfaceC9129f.getKind() == AbstractC9137n.b.f21331a && AbstractC9979u.m20289b(mo17961f(), interfaceC9129f.mo17961f()) && AbstractC9979u.m20289b(AbstractC9398x1.m18592a(this), AbstractC9398x1.m18592a(interfaceC9129f));
    }

    @Override // ge.C9312d2, ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return this.f21710l;
    }

    @Override // ge.C9312d2
    public int hashCode() {
        int iHashCode = mo17961f().hashCode();
        int iHashCode2 = 1;
        for (String str : AbstractC9133j.m17972b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // ge.C9312d2
    public String toString() {
        return AbstractC10947g0.m23954w0(AbstractC9133j.m17972b(this), ", ", mo17961f() + '(', ")", 0, null, null, 56, null);
    }

    /* renamed from: x */
    public final InterfaceC9129f[] m18416x() {
        return (InterfaceC9129f[]) this.f21711m.getValue();
    }
}
