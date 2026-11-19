package p290w8;

import kotlin.KotlinNothingValueException;
import p268u8.AbstractC10218n;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;

/* renamed from: w8.m1 */
/* loaded from: classes5.dex */
public final class C10421m1 implements InterfaceC10210f {

    /* renamed from: a */
    public static final C10421m1 f20737a = new C10421m1();

    /* renamed from: b */
    public static final AbstractC10218n f20738b = AbstractC10219o.d.f20396a;

    /* renamed from: c */
    public static final String f20739c = "kotlin.Nothing";

    /* renamed from: a */
    public final Void m19469a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m19469a();
        throw new KotlinNothingValueException();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        m19469a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return f20739c;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        m19469a();
        throw new KotlinNothingValueException();
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return f20738b;
    }

    public int hashCode() {
        return mo19089f().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return InterfaceC10210f.a.m19091a(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
