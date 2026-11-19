package p168e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p160d.p161e.C0999e;
import p160d.p161e.C1003i;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p177i.AbstractC1075c;

/* renamed from: e.c */
/* loaded from: classes.dex */
public final class C1030c {

    /* renamed from: c */
    public static final C1030c f5510c;

    /* renamed from: a */
    public final Set<Object> f5511a;

    /* renamed from: b */
    public final AbstractC1075c f5512b;

    static {
        ArrayList arrayList = new ArrayList();
        Set setSingleton = C1003i.f5480b;
        C1011d.m2809e(arrayList, "$this$toSet");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                int size2 = arrayList.size();
                if (size2 >= 0) {
                    size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                setSingleton = new LinkedHashSet(size2);
                C0999e.m2798e(arrayList, setSingleton);
            } else {
                setSingleton = Collections.singleton(arrayList.get(0));
                C1011d.m2808d(setSingleton, "java.util.Collections.singleton(element)");
            }
        }
        f5510c = new C1030c(setSingleton, null, 2);
    }

    public C1030c(Set<Object> set, AbstractC1075c abstractC1075c) {
        C1011d.m2809e(set, "pins");
        this.f5511a = set;
        this.f5512b = abstractC1075c;
    }

    public C1030c(Set set, AbstractC1075c abstractC1075c, int i) {
        int i2 = i & 2;
        C1011d.m2809e(set, "pins");
        this.f5511a = set;
        this.f5512b = null;
    }

    /* renamed from: a */
    public final C1030c m2830a(AbstractC1075c abstractC1075c) {
        C1011d.m2809e(abstractC1075c, "certificateChainCleaner");
        return C1011d.m2805a(this.f5512b, abstractC1075c) ? this : new C1030c(this.f5511a, abstractC1075c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1030c) {
            C1030c c1030c = (C1030c) obj;
            if (C1011d.m2805a(c1030c.f5511a, this.f5511a) && C1011d.m2805a(c1030c.f5512b, this.f5512b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f5511a.hashCode() + 1517) * 41;
        AbstractC1075c abstractC1075c = this.f5512b;
        return iHashCode + (abstractC1075c != null ? abstractC1075c.hashCode() : 0);
    }
}
