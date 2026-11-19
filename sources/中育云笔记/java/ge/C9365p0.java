package ge;

import ee.InterfaceC9129f;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.p0 */
/* loaded from: classes6.dex */
public final class C9365p0 extends AbstractC9396x {

    /* renamed from: b */
    public final InterfaceC9129f f21778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9365p0(InterfaceC5432b eSerializer) {
        super(eSerializer);
        AbstractC9979u.m20294g(eSerializer, "eSerializer");
        this.f21778b = new C9361o0(eSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21778b;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet mo18328a() {
        return new HashSet();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18329b(HashSet hashSet) {
        AbstractC9979u.m20294g(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18330c(HashSet hashSet, int i10) {
        AbstractC9979u.m20294g(hashSet, "<this>");
    }

    @Override // ge.AbstractC9392w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo18344n(HashSet hashSet, int i10, Object obj) {
        AbstractC9979u.m20294g(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet mo18337k(Set set) {
        AbstractC9979u.m20294g(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo18338l(HashSet hashSet) {
        AbstractC9979u.m20294g(hashSet, "<this>");
        return hashSet;
    }
}
