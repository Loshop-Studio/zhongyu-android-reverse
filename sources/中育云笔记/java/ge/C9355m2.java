package ge;

import ee.AbstractC9137n;
import ee.InterfaceC9129f;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.m2 */
/* loaded from: classes6.dex */
public final class C9355m2 implements InterfaceC9129f, InterfaceC9356n {

    /* renamed from: a */
    public final InterfaceC9129f f21767a;

    /* renamed from: b */
    public final String f21768b;

    /* renamed from: c */
    public final Set f21769c;

    public C9355m2(InterfaceC9129f original) {
        AbstractC9979u.m20294g(original, "original");
        this.f21767a = original;
        this.f21768b = original.mo17961f() + '?';
        this.f21769c = AbstractC9398x1.m18592a(original);
    }

    @Override // ge.InterfaceC9356n
    /* renamed from: a */
    public Set mo17969a() {
        return this.f21769c;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return true;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21767a.mo17958c();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return this.f21767a.mo17959d(i10);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return this.f21767a.mo17960e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9355m2) && AbstractC9979u.m20289b(this.f21767a, ((C9355m2) obj).f21767a);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21768b;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        return this.f21767a.mo17962g(i10);
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return this.f21767a.getKind();
    }

    /* renamed from: h */
    public final InterfaceC9129f m18496h() {
        return this.f21767a;
    }

    public int hashCode() {
        return this.f21767a.hashCode() * 31;
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return this.f21767a.isInline();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21767a);
        sb2.append('?');
        return sb2.toString();
    }
}
