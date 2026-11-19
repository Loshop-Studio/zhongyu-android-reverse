package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.j2 */
/* loaded from: classes6.dex */
public final class C9342j2 implements InterfaceC9129f {

    /* renamed from: a */
    public final String f21749a;

    /* renamed from: b */
    public final AbstractC9128e f21750b;

    public C9342j2(String serialName, AbstractC9128e kind) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(kind, "kind");
        this.f21749a = serialName;
        this.f21750b = kind;
    }

    /* renamed from: a */
    private final Void m18470a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return InterfaceC9129f.a.m17964b(this);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return 0;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        m18470a();
        throw new KotlinNothingValueException();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        m18470a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9342j2)) {
            return false;
        }
        C9342j2 c9342j2 = (C9342j2) obj;
        return AbstractC9979u.m20289b(mo17961f(), c9342j2.mo17961f()) && AbstractC9979u.m20289b(getKind(), c9342j2.getKind());
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21749a;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        m18470a();
        throw new KotlinNothingValueException();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC9128e getKind() {
        return this.f21750b;
    }

    public int hashCode() {
        return mo17961f().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo17961f() + ')';
    }
}
