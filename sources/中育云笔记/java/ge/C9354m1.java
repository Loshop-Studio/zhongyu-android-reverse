package ge;

import ee.AbstractC9137n;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import kotlin.KotlinNothingValueException;

/* renamed from: ge.m1 */
/* loaded from: classes6.dex */
public final class C9354m1 implements InterfaceC9129f {

    /* renamed from: a */
    public static final C9354m1 f21764a = new C9354m1();

    /* renamed from: b */
    public static final AbstractC9137n f21765b = AbstractC9138o.d.f21335a;

    /* renamed from: c */
    public static final String f21766c = "kotlin.Nothing";

    /* renamed from: a */
    public final Void m18495a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m18495a();
        throw new KotlinNothingValueException();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        m18495a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return f21766c;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        m18495a();
        throw new KotlinNothingValueException();
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return f21765b;
    }

    public int hashCode() {
        return mo17961f().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
