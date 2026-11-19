package ge;

import ee.InterfaceC9129f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.y0 */
/* loaded from: classes6.dex */
public final class C9401y0 extends AbstractC9336i1 {

    /* renamed from: c */
    public final InterfaceC9129f f21828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9401y0(InterfaceC5432b kSerializer, InterfaceC5432b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC9979u.m20294g(kSerializer, "kSerializer");
        AbstractC9979u.m20294g(vSerializer, "vSerializer");
        this.f21828c = new C9397x0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9336i1, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21828c;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo18328a() {
        return new LinkedHashMap();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo18329b(LinkedHashMap linkedHashMap) {
        AbstractC9979u.m20294g(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo18330c(LinkedHashMap linkedHashMap, int i10) {
        AbstractC9979u.m20294g(linkedHashMap, "<this>");
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
    public LinkedHashMap mo18337k(Map map) {
        AbstractC9979u.m20294g(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo18338l(LinkedHashMap linkedHashMap) {
        AbstractC9979u.m20294g(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
