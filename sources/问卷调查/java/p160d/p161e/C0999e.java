package p160d.p161e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;

/* renamed from: d.e.e */
/* loaded from: classes.dex */
public class C0999e extends C0998d {
    /* renamed from: a */
    public static final byte[] m2794a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C1011d.m2809e(bArr, "$this$copyInto");
        C1011d.m2809e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: b */
    public static /* synthetic */ byte[] m2795b(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m2794a(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* renamed from: c */
    public static final <T> List<T> m2796c(T... tArr) {
        C1011d.m2809e(tArr, "elements");
        C1011d.m2809e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        C1011d.m2809e(tArr, "$this$filterNotNullTo");
        C1011d.m2809e(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final <T> List<T> m2797d(T... tArr) {
        C1011d.m2809e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C0997c(tArr, true));
    }

    /* renamed from: e */
    public static final <T, C extends Collection<? super T>> C m2798e(Iterable<? extends T> iterable, C c2) {
        C1011d.m2809e(iterable, "$this$toCollection");
        C1011d.m2809e(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    /* renamed from: f */
    public static final <T> List<T> m2799f(Iterable<? extends T> iterable) {
        C1001g c1001g = C1001g.f5478b;
        C1011d.m2809e(iterable, "$this$toList");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        return size != 0 ? size != 1 ? m2800g(collection) : C0787a.m2489w(((List) iterable).get(0)) : c1001g;
    }

    /* renamed from: g */
    public static final <T> List<T> m2800g(Collection<? extends T> collection) {
        C1011d.m2809e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }
}
