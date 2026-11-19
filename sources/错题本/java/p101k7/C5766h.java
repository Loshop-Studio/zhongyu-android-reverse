package p101k7;

import androidx.navigation.C2827b;
import coil3.network.AbstractC3315g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5773a;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5776a0;
import kotlin.collections.C5778b0;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5429e;
import p118m7.AbstractC6191y0;
import p118m7.InterfaceC6151l;

/* renamed from: k7.h */
/* loaded from: classes4.dex */
public final class C5766h implements InterfaceC5765g, InterfaceC6151l {

    /* renamed from: a */
    public final String f9130a;

    /* renamed from: b */
    public final AbstractC3315g f9131b;

    /* renamed from: c */
    public final int f9132c;

    /* renamed from: d */
    public final List f9133d;

    /* renamed from: e */
    public final HashSet f9134e;

    /* renamed from: f */
    public final String[] f9135f;

    /* renamed from: g */
    public final InterfaceC5765g[] f9136g;

    /* renamed from: h */
    public final List[] f9137h;

    /* renamed from: i */
    public final boolean[] f9138i;

    /* renamed from: j */
    public final Map f9139j;

    /* renamed from: k */
    public final InterfaceC5765g[] f9140k;

    /* renamed from: l */
    public final InterfaceC5429e f9141l;

    public C5766h(String serialName, AbstractC3315g abstractC3315g, int i, List typeParameters, C5759a c5759a) {
        AbstractC5830k.m5330g(serialName, "serialName");
        AbstractC5830k.m5330g(typeParameters, "typeParameters");
        this.f9130a = serialName;
        this.f9131b = abstractC3315g;
        this.f9132c = i;
        this.f9133d = c5759a.f9110b;
        ArrayList arrayList = c5759a.f9111c;
        AbstractC5830k.m5330g(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC5785e0.m5149C(AbstractC5806u.m5277p(arrayList, 12)));
        AbstractC5805t.m5214A0(arrayList, hashSet);
        this.f9134e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f9135f = strArr;
        this.f9136g = AbstractC6191y0.m5833c(c5759a.f9113e);
        this.f9137h = (List[]) c5759a.f9114f.toArray(new List[0]);
        this.f9138i = AbstractC5805t.m5246z0(c5759a.f9115g);
        AbstractC5830k.m5330g(strArr, "<this>");
        C5767i c5767i = new C5767i(new C2827b(strArr, 16), 6);
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(c5767i, 10));
        Iterator it = c5767i.iterator();
        while (true) {
            C5778b0 c5778b0 = (C5778b0) it;
            if (!c5778b0.f9168b.hasNext()) {
                this.f9139j = AbstractC5785e0.m5155I(arrayList2);
                this.f9140k = AbstractC6191y0.m5833c(typeParameters);
                this.f9141l = AbstractC5773a.m5117b(new C2827b(this, 15));
                return;
            }
            C5776a0 c5776a0 = (C5776a0) c5778b0.next();
            arrayList2.add(new Pair(c5776a0.f9164b, Integer.valueOf(c5776a0.f9163a)));
        }
    }

    @Override // p118m7.InterfaceC6151l
    /* renamed from: a */
    public final Set mo5107a() {
        return this.f9134e;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        Integer num = (Integer) this.f9139j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return this.f9132c;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return this.f9135f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5766h) {
            InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj;
            if (AbstractC5830k.m5325b(this.f9130a, interfaceC5765g.mo5105h()) && Arrays.equals(this.f9140k, ((C5766h) obj).f9140k)) {
                int iMo5101d = interfaceC5765g.mo5101d();
                int i = this.f9132c;
                if (i == iMo5101d) {
                    for (int i8 = 0; i8 < i; i8++) {
                        InterfaceC5765g[] interfaceC5765gArr = this.f9136g;
                        if (AbstractC5830k.m5325b(interfaceC5765gArr[i8].mo5105h(), interfaceC5765g.mo5104g(i8).mo5105h()) && AbstractC5830k.m5325b(interfaceC5765gArr[i8].getKind(), interfaceC5765g.mo5104g(i8).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return this.f9137h[i];
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return this.f9136g[i];
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        return this.f9133d;
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9131b;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9130a;
    }

    public final int hashCode() {
        return ((Number) this.f9141l.getValue()).intValue();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return this.f9138i[i];
    }

    public final String toString() {
        return AbstractC6191y0.m5843m(this);
    }
}
