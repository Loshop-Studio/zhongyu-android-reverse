package ge;

import ee.InterfaceC9129f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p280od.InterfaceC10469c;
import p325rc.AbstractC10964p;

/* renamed from: ge.l2 */
/* loaded from: classes6.dex */
public final class C9351l2 extends AbstractC9392w {

    /* renamed from: b */
    public final InterfaceC10469c f21761b;

    /* renamed from: c */
    public final InterfaceC9129f f21762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9351l2(InterfaceC10469c kClass, InterfaceC5432b eSerializer) {
        super(eSerializer, null);
        AbstractC9979u.m20294g(kClass, "kClass");
        AbstractC9979u.m20294g(eSerializer, "eSerializer");
        this.f21761b = kClass;
        this.f21762c = new C9309d(eSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21762c;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18328a() {
        return new ArrayList();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo18329b(ArrayList arrayList) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo18330c(ArrayList arrayList, int i10) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator mo18331d(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return AbstractC9963e.m20268a(objArr);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int mo18332e(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return objArr.length;
    }

    @Override // ge.AbstractC9392w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18344n(ArrayList arrayList, int i10, Object obj) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18337k(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return new ArrayList(AbstractC10964p.m24014g(objArr));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] mo18338l(ArrayList arrayList) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        return AbstractC9394w1.m18587q(arrayList, this.f21761b);
    }
}
