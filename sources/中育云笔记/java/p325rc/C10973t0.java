package p325rc;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.t0 */
/* loaded from: classes6.dex */
public final class C10973t0 extends AbstractC10940d implements RandomAccess {

    /* renamed from: c */
    public final List f26475c;

    /* renamed from: d */
    public int f26476d;

    /* renamed from: e */
    public int f26477e;

    public C10973t0(List list) {
        AbstractC9979u.m20294g(list, "list");
        this.f26475c = list;
    }

    /* renamed from: d */
    public final void m24120d(int i10, int i11) {
        AbstractC10940d.Companion.m23888d(i10, i11, this.f26475c.size());
        this.f26476d = i10;
        this.f26477e = i11 - i10;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public Object get(int i10) {
        AbstractC10940d.Companion.m23886b(i10, this.f26477e);
        return this.f26475c.get(this.f26476d + i10);
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.f26477e;
    }
}
