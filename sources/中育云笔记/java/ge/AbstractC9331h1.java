package ge;

import ee.AbstractC9137n;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.h1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9331h1 implements InterfaceC9129f {

    /* renamed from: a */
    public final String f21729a;

    /* renamed from: b */
    public final InterfaceC9129f f21730b;

    /* renamed from: c */
    public final InterfaceC9129f f21731c;

    /* renamed from: d */
    public final int f21732d;

    public /* synthetic */ AbstractC9331h1(String str, InterfaceC9129f interfaceC9129f, InterfaceC9129f interfaceC9129f2, AbstractC9972n abstractC9972n) {
        this(str, interfaceC9129f, interfaceC9129f2);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return InterfaceC9129f.a.m17964b(this);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21732d;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return String.valueOf(i10);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f21730b;
            }
            if (i11 == 1) {
                return this.f21731c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo17961f() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC9331h1)) {
            return false;
        }
        AbstractC9331h1 abstractC9331h1 = (AbstractC9331h1) obj;
        return AbstractC9979u.m20289b(mo17961f(), abstractC9331h1.mo17961f()) && AbstractC9979u.m20289b(this.f21730b, abstractC9331h1.f21730b) && AbstractC9979u.m20289b(this.f21731c, abstractC9331h1.f21731c);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21729a;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo17961f() + " expects only non-negative indices").toString());
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return AbstractC9138o.c.f21334a;
    }

    public int hashCode() {
        return (((mo17961f().hashCode() * 31) + this.f21730b.hashCode()) * 31) + this.f21731c.hashCode();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    public String toString() {
        return mo17961f() + '(' + this.f21730b + ", " + this.f21731c + ')';
    }

    public AbstractC9331h1(String str, InterfaceC9129f interfaceC9129f, InterfaceC9129f interfaceC9129f2) {
        this.f21729a = str;
        this.f21730b = interfaceC9129f;
        this.f21731c = interfaceC9129f2;
        this.f21732d = 2;
    }
}
