package p292x4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p292x4.AbstractC9879c;
import p292x4.AbstractC9882f;

/* renamed from: x4.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9880d {
    /* renamed from: a */
    public static final List m16908a(List list) {
        if (list == null || list.isEmpty()) {
            return m16909b();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC9882f.c(((Number) it.next()).intValue(), false, 2, null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m16909b() {
        return CollectionsKt.listOf((Object[]) new AbstractC9882f[]{new AbstractC9882f.b(0, false, false, 7, null), new AbstractC9882f.a(false, 1, null), new AbstractC9882f.e(false, 1, null), new AbstractC9882f.d(false, 1, null)});
    }

    /* renamed from: c */
    public static final AbstractC9882f.b m16910c(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC9882f) next) instanceof AbstractC9882f.b) {
                break;
            }
        }
        if (next instanceof AbstractC9882f.b) {
            return (AbstractC9882f.b) next;
        }
        return null;
    }

    /* renamed from: d */
    public static final AbstractC9879c.b m16911d(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC9879c) next) instanceof AbstractC9879c.b) {
                break;
            }
        }
        if (next instanceof AbstractC9879c.b) {
            return (AbstractC9879c.b) next;
        }
        return null;
    }

    /* renamed from: e */
    public static final AbstractC9879c.f m16912e(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC9879c) next) instanceof AbstractC9879c.f) {
                break;
            }
        }
        if (next instanceof AbstractC9879c.f) {
            return (AbstractC9879c.f) next;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC9879c.g m16913f(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC9879c) next) instanceof AbstractC9879c.g) {
                break;
            }
        }
        if (next instanceof AbstractC9879c.g) {
            return (AbstractC9879c.g) next;
        }
        return null;
    }

    /* renamed from: g */
    public static final void m16914g(List list, int i9, Function1 isCustomExist) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(isCustomExist, "isCustomExist");
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (i10 != 0 && ((AbstractC9882f) list.get(i10)).m16921a() == i9) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 && ((Boolean) isCustomExist.invoke(Integer.valueOf(i9))).booleanValue()) {
            ((AbstractC9882f) list.get(0)).m16924d(i9);
            i10 = 0;
        }
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((AbstractC9882f) obj).m16923c(i11 == i10);
            i11 = i12;
        }
    }

    /* renamed from: h */
    public static final void m16915h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC9882f abstractC9882f = (AbstractC9882f) it.next();
            abstractC9882f.m16923c(abstractC9882f instanceof AbstractC9882f.b);
            if (abstractC9882f instanceof AbstractC9882f.b) {
                ((AbstractC9882f.b) abstractC9882f).m16926f(true);
            }
        }
    }
}
