package p290w8;

import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p268u8.AbstractC10214j;
import p268u8.AbstractC10217m;
import p268u8.AbstractC10218n;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;
import p300x7.InterfaceC10559a;

/* renamed from: w8.f0 */
/* loaded from: classes5.dex */
public final class C10387f0 extends C10379d2 {

    /* renamed from: l */
    public final AbstractC10218n f20683l;

    /* renamed from: m */
    public final InterfaceC8724d f20684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10387f0(final String name, final int i10) {
        super(name, null, i10, 2, null);
        AbstractC9133u.m16133g(name, "name");
        this.f20683l = AbstractC10218n.b.f20392a;
        this.f20684m = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w8.e0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10387f0.m19389w(i10, name, this);
            }
        });
    }

    /* renamed from: w */
    public static final InterfaceC10210f[] m19389w(int i10, String str, C10387f0 c10387f0) {
        InterfaceC10210f[] interfaceC10210fArr = new InterfaceC10210f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC10210fArr[i11] = AbstractC10217m.m19111i(str + '.' + c10387f0.mo19087d(i11), AbstractC10219o.d.f20396a, new InterfaceC10210f[0], null, 8, null);
        }
        return interfaceC10210fArr;
    }

    @Override // p290w8.C10379d2, p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return m19390x()[i10];
    }

    @Override // p290w8.C10379d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC10210f)) {
            return false;
        }
        InterfaceC10210f interfaceC10210f = (InterfaceC10210f) obj;
        return interfaceC10210f.getKind() == AbstractC10218n.b.f20392a && AbstractC9133u.m16128b(mo19089f(), interfaceC10210f.mo19089f()) && AbstractC9133u.m16128b(AbstractC10465x1.m19564a(this), AbstractC10465x1.m19564a(interfaceC10210f));
    }

    @Override // p290w8.C10379d2, p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return this.f20683l;
    }

    @Override // p290w8.C10379d2
    public int hashCode() {
        int iHashCode = mo19089f().hashCode();
        int iHashCode2 = 1;
        for (String str : AbstractC10214j.m19100b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p290w8.C10379d2
    public String toString() {
        return AbstractC8778f0.m14576v0(AbstractC10214j.m19100b(this), ", ", mo19089f() + '(', ")", 0, null, null, 56, null);
    }

    /* renamed from: x */
    public final InterfaceC10210f[] m19390x() {
        return (InterfaceC10210f[]) this.f20684m.getValue();
    }
}
