package p290w8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;

/* renamed from: w8.f */
/* loaded from: classes5.dex */
public final class C10386f extends AbstractC10463x {

    /* renamed from: b */
    public final InterfaceC10210f f20682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10386f(InterfaceC10052b element) {
        super(element);
        AbstractC9133u.m16133g(element, "element");
        this.f20682b = new C10381e(element.getDescriptor());
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20682b;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList mo19302a() {
        return new ArrayList();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo19303b(ArrayList arrayList) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo19304c(ArrayList arrayList, int i10) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // p290w8.AbstractC10459w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo19318n(ArrayList arrayList, int i10, Object obj) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo19311k(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List mo19312l(ArrayList arrayList) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        return arrayList;
    }
}
