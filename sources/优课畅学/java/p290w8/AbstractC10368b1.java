package p290w8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.AbstractC10218n;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;

/* renamed from: w8.b1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10368b1 implements InterfaceC10210f {

    /* renamed from: a */
    public final InterfaceC10210f f20648a;

    /* renamed from: b */
    public final int f20649b;

    public /* synthetic */ AbstractC10368b1(InterfaceC10210f interfaceC10210f, AbstractC9126n abstractC9126n) {
        this(interfaceC10210f);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return InterfaceC10210f.a.m19092b(this);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20649b;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return String.valueOf(i10);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        if (i10 >= 0) {
            return this.f20648a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo19089f() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10368b1)) {
            return false;
        }
        AbstractC10368b1 abstractC10368b1 = (AbstractC10368b1) obj;
        return AbstractC9133u.m16128b(this.f20648a, abstractC10368b1.f20648a) && AbstractC9133u.m16128b(mo19089f(), abstractC10368b1.mo19089f());
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo19089f() + " expects only non-negative indices").toString());
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return AbstractC10219o.b.f20394a;
    }

    public int hashCode() {
        return (this.f20648a.hashCode() * 31) + mo19089f().hashCode();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    public String toString() {
        return mo19089f() + '(' + this.f20648a + ')';
    }

    public AbstractC10368b1(InterfaceC10210f interfaceC10210f) {
        this.f20648a = interfaceC10210f;
        this.f20649b = 1;
    }
}
