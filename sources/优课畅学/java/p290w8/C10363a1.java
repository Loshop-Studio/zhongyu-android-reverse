package p290w8;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;

/* renamed from: w8.a1 */
/* loaded from: classes5.dex */
public final class C10363a1 extends AbstractC10463x {

    /* renamed from: b */
    public final InterfaceC10210f f20644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10363a1(InterfaceC10052b eSerializer) {
        super(eSerializer);
        AbstractC9133u.m16133g(eSerializer, "eSerializer");
        this.f20644b = new C10472z0(eSerializer.getDescriptor());
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20644b;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo19302a() {
        return new LinkedHashSet();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo19303b(LinkedHashSet linkedHashSet) {
        AbstractC9133u.m16133g(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo19304c(LinkedHashSet linkedHashSet, int i10) {
        AbstractC9133u.m16133g(linkedHashSet, "<this>");
    }

    @Override // p290w8.AbstractC10459w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo19318n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        AbstractC9133u.m16133g(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo19311k(Set set) {
        AbstractC9133u.m16133g(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo19312l(LinkedHashSet linkedHashSet) {
        AbstractC9133u.m16133g(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
