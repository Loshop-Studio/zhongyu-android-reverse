package p134i7;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.s0 */
/* loaded from: classes5.dex */
public final class C8804s0 extends AbstractC8773d implements RandomAccess {

    /* renamed from: a */
    public final List f16481a;

    /* renamed from: b */
    public int f16482b;

    /* renamed from: c */
    public int f16483c;

    public C8804s0(List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f16481a = list;
    }

    /* renamed from: c */
    public final void m14749c(int i10, int i11) {
        AbstractC8773d.Companion.m14514d(i10, i11, this.f16481a.size());
        this.f16482b = i10;
        this.f16483c = i11 - i10;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public Object get(int i10) {
        AbstractC8773d.Companion.m14512b(i10, this.f16483c);
        return this.f16481a.get(this.f16482b + i10);
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.f16483c;
    }
}
