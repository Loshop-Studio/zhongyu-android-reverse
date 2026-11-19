package ge;

import ee.InterfaceC9129f;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.a1 */
/* loaded from: classes6.dex */
public final class C9296a1 extends AbstractC9396x {

    /* renamed from: b */
    public final InterfaceC9129f f21671b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9296a1(InterfaceC5432b eSerializer) {
        super(eSerializer);
        AbstractC9979u.m20294g(eSerializer, "eSerializer");
        this.f21671b = new C9405z0(eSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21671b;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo18328a() {
        return new LinkedHashSet();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18329b(LinkedHashSet linkedHashSet) {
        AbstractC9979u.m20294g(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18330c(LinkedHashSet linkedHashSet, int i10) {
        AbstractC9979u.m20294g(linkedHashSet, "<this>");
    }

    @Override // ge.AbstractC9392w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18344n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        AbstractC9979u.m20294g(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo18337k(Set set) {
        AbstractC9979u.m20294g(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo18338l(LinkedHashSet linkedHashSet) {
        AbstractC9979u.m20294g(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
