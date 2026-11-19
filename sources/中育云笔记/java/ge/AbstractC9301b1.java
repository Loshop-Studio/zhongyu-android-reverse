package ge;

import ee.AbstractC9137n;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.b1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9301b1 implements InterfaceC9129f {

    /* renamed from: a */
    public final InterfaceC9129f f21675a;

    /* renamed from: b */
    public final int f21676b;

    public /* synthetic */ AbstractC9301b1(InterfaceC9129f interfaceC9129f, AbstractC9972n abstractC9972n) {
        this(interfaceC9129f);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return InterfaceC9129f.a.m17964b(this);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21676b;
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
            return this.f21675a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + mo17961f() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC9301b1)) {
            return false;
        }
        AbstractC9301b1 abstractC9301b1 = (AbstractC9301b1) obj;
        return AbstractC9979u.m20289b(this.f21675a, abstractC9301b1.f21675a) && AbstractC9979u.m20289b(mo17961f(), abstractC9301b1.mo17961f());
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
        return AbstractC9138o.b.f21333a;
    }

    public int hashCode() {
        return (this.f21675a.hashCode() * 31) + mo17961f().hashCode();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return InterfaceC9129f.a.m17963a(this);
    }

    public String toString() {
        return mo17961f() + '(' + this.f21675a + ')';
    }

    public AbstractC9301b1(InterfaceC9129f interfaceC9129f) {
        this.f21675a = interfaceC9129f;
        this.f21676b = 1;
    }
}
