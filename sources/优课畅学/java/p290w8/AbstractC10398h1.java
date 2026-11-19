package p290w8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.AbstractC10218n;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;

/* renamed from: w8.h1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10398h1 implements InterfaceC10210f {

    /* renamed from: a */
    public final String f20702a;

    /* renamed from: b */
    public final InterfaceC10210f f20703b;

    /* renamed from: c */
    public final InterfaceC10210f f20704c;

    /* renamed from: d */
    public final int f20705d;

    public /* synthetic */ AbstractC10398h1(String str, InterfaceC10210f interfaceC10210f, InterfaceC10210f interfaceC10210f2, AbstractC9126n abstractC9126n) {
        this(str, interfaceC10210f, interfaceC10210f2);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return InterfaceC10210f.a.m19092b(this);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20705d;
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f20703b;
            }
            if (i11 == 1) {
                return this.f20704c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo19089f() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10398h1)) {
            return false;
        }
        AbstractC10398h1 abstractC10398h1 = (AbstractC10398h1) obj;
        return AbstractC9133u.m16128b(mo19089f(), abstractC10398h1.mo19089f()) && AbstractC9133u.m16128b(this.f20703b, abstractC10398h1.f20703b) && AbstractC9133u.m16128b(this.f20704c, abstractC10398h1.f20704c);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20702a;
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
        return AbstractC10219o.c.f20395a;
    }

    public int hashCode() {
        return (((mo19089f().hashCode() * 31) + this.f20703b.hashCode()) * 31) + this.f20704c.hashCode();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    public String toString() {
        return mo19089f() + '(' + this.f20703b + ", " + this.f20704c + ')';
    }

    public AbstractC10398h1(String str, InterfaceC10210f interfaceC10210f, InterfaceC10210f interfaceC10210f2) {
        this.f20702a = str;
        this.f20703b = interfaceC10210f;
        this.f20704c = interfaceC10210f2;
        this.f20705d = 2;
    }
}
