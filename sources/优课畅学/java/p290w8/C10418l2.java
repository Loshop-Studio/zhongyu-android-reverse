package p290w8;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p134i7.AbstractC8797p;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;

/* renamed from: w8.l2 */
/* loaded from: classes5.dex */
public final class C10418l2 extends AbstractC10459w {

    /* renamed from: b */
    public final InterfaceC8375c f20734b;

    /* renamed from: c */
    public final InterfaceC10210f f20735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10418l2(InterfaceC8375c kClass, InterfaceC10052b eSerializer) {
        super(eSerializer, null);
        AbstractC9133u.m16133g(kClass, "kClass");
        AbstractC9133u.m16133g(eSerializer, "eSerializer");
        this.f20734b = kClass;
        this.f20735c = new C10376d(eSerializer.getDescriptor());
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20735c;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList mo19302a() {
        return new ArrayList();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo19303b(ArrayList arrayList) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo19304c(ArrayList arrayList, int i10) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator mo19305d(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return AbstractC9117e.m16110a(objArr);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int mo19306e(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return objArr.length;
    }

    @Override // p290w8.AbstractC10459w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo19318n(ArrayList arrayList, int i10, Object obj) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo19311k(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return new ArrayList(AbstractC8797p.m14640g(objArr));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] mo19312l(ArrayList arrayList) {
        AbstractC9133u.m16133g(arrayList, "<this>");
        return AbstractC10461w1.m19559q(arrayList, this.f20734b);
    }
}
