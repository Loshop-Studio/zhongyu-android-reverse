package ge;

import ee.InterfaceC9129f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.f */
/* loaded from: classes6.dex */
public final class C9319f extends AbstractC9396x {

    /* renamed from: b */
    public final InterfaceC9129f f21709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9319f(InterfaceC5432b element) {
        super(element);
        AbstractC9979u.m20294g(element, "element");
        this.f21709b = new C9314e(element.getDescriptor());
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21709b;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18328a() {
        return new ArrayList();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18329b(ArrayList arrayList) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18330c(ArrayList arrayList, int i10) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // ge.AbstractC9392w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18344n(ArrayList arrayList, int i10, Object obj) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo18337k(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List mo18338l(ArrayList arrayList) {
        AbstractC9979u.m20294g(arrayList, "<this>");
        return arrayList;
    }
}
