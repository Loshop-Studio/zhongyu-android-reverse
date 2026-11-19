package p290w8;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;

/* renamed from: w8.p0 */
/* loaded from: classes5.dex */
public final class C10432p0 extends AbstractC10463x {

    /* renamed from: b */
    public final InterfaceC10210f f20751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10432p0(InterfaceC10052b eSerializer) {
        super(eSerializer);
        AbstractC9133u.m16133g(eSerializer, "eSerializer");
        this.f20751b = new C10428o0(eSerializer.getDescriptor());
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20751b;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet mo19302a() {
        return new HashSet();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo19303b(HashSet hashSet) {
        AbstractC9133u.m16133g(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo19304c(HashSet hashSet, int i10) {
        AbstractC9133u.m16133g(hashSet, "<this>");
    }

    @Override // p290w8.AbstractC10459w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo19318n(HashSet hashSet, int i10, Object obj) {
        AbstractC9133u.m16133g(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet mo19311k(Set set) {
        AbstractC9133u.m16133g(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo19312l(HashSet hashSet) {
        AbstractC9133u.m16133g(hashSet, "<this>");
        return hashSet;
    }
}
