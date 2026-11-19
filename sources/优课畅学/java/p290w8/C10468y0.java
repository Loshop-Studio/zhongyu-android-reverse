package p290w8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;

/* renamed from: w8.y0 */
/* loaded from: classes5.dex */
public final class C10468y0 extends AbstractC10403i1 {

    /* renamed from: c */
    public final InterfaceC10210f f20801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10468y0(InterfaceC10052b kSerializer, InterfaceC10052b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC9133u.m16133g(kSerializer, "kSerializer");
        AbstractC9133u.m16133g(vSerializer, "vSerializer");
        this.f20801c = new C10464x0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // p290w8.AbstractC10403i1, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20801c;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo19302a() {
        return new LinkedHashMap();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo19303b(LinkedHashMap linkedHashMap) {
        AbstractC9133u.m16133g(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo19304c(LinkedHashMap linkedHashMap, int i10) {
        AbstractC9133u.m16133g(linkedHashMap, "<this>");
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator mo19305d(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int mo19306e(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        return map.size();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo19311k(Map map) {
        AbstractC9133u.m16133g(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo19312l(LinkedHashMap linkedHashMap) {
        AbstractC9133u.m16133g(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
