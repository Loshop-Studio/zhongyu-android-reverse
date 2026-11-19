package p070b.p074b.p105b.p106a0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.C0774o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: b.b.b.a0.j */
/* loaded from: classes.dex */
public class C0720j<T> implements InterfaceC0730t<T> {

    /* renamed from: a */
    public final /* synthetic */ Type f4222a;

    public C0720j(C0717g c0717g, Type type) {
        this.f4222a = type;
    }

    @Override // p070b.p074b.p105b.p106a0.InterfaceC0730t
    /* renamed from: a */
    public T mo2365a() {
        Type type = this.f4222a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbM2079g = C0561a.m2079g("Invalid EnumSet type: ");
            sbM2079g.append(this.f4222a.toString());
            throw new C0774o(sbM2079g.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder sbM2079g2 = C0561a.m2079g("Invalid EnumSet type: ");
        sbM2079g2.append(this.f4222a.toString());
        throw new C0774o(sbM2079g2.toString());
    }
}
