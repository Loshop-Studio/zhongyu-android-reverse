package p290w8;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;

/* renamed from: w8.j2 */
/* loaded from: classes5.dex */
public final class C10409j2 implements InterfaceC10210f {

    /* renamed from: a */
    public final String f20722a;

    /* renamed from: b */
    public final AbstractC10209e f20723b;

    public C10409j2(String serialName, AbstractC10209e kind) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(kind, "kind");
        this.f20722a = serialName;
        this.f20723b = kind;
    }

    /* renamed from: a */
    private final Void m19444a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return InterfaceC10210f.a.m19092b(this);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return 0;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        m19444a();
        throw new KotlinNothingValueException();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        m19444a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10409j2)) {
            return false;
        }
        C10409j2 c10409j2 = (C10409j2) obj;
        return AbstractC9133u.m16128b(mo19089f(), c10409j2.mo19089f()) && AbstractC9133u.m16128b(getKind(), c10409j2.getKind());
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20722a;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        m19444a();
        throw new KotlinNothingValueException();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC10209e getKind() {
        return this.f20723b;
    }

    public int hashCode() {
        return mo19089f().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo19089f() + ')';
    }
}
