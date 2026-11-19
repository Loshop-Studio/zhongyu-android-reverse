package ge;

import ee.InterfaceC9129f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.n0 */
/* loaded from: classes6.dex */
public final class C9357n0 extends AbstractC9336i1 {

    /* renamed from: c */
    public final InterfaceC9129f f21770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9357n0(InterfaceC5432b kSerializer, InterfaceC5432b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC9979u.m20294g(kSerializer, "kSerializer");
        AbstractC9979u.m20294g(vSerializer, "vSerializer");
        this.f21770c = new C9353m0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9336i1, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21770c;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap mo18328a() {
        return new HashMap();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18329b(HashMap map) {
        AbstractC9979u.m20294g(map, "<this>");
        return map.size() * 2;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18330c(HashMap map, int i10) {
        AbstractC9979u.m20294g(map, "<this>");
    }

    @Override // ge.AbstractC9294a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator mo18331d(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int mo18332e(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        return map.size();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap mo18337k(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo18338l(HashMap map) {
        AbstractC9979u.m20294g(map, "<this>");
        return map;
    }
}
