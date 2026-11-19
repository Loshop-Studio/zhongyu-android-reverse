package p109h4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p109h4.AbstractC7625c;
import p109h4.AbstractC7628f;

/* renamed from: h4.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7626d {
    /* renamed from: a */
    public static final List m12581a(List list) {
        if (list == null || list.isEmpty()) {
            return m12582b();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC7628f.c(((Number) it.next()).intValue(), false, 2, null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m12582b() {
        return CollectionsKt.listOf((Object[]) new AbstractC7628f[]{new AbstractC7628f.b(0, false, false, 7, null), new AbstractC7628f.a(false, 1, null), new AbstractC7628f.e(false, 1, null), new AbstractC7628f.d(false, 1, null)});
    }

    /* renamed from: c */
    public static final AbstractC7628f.b m12583c(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC7628f) next) instanceof AbstractC7628f.b) {
                break;
            }
        }
        if (next instanceof AbstractC7628f.b) {
            return (AbstractC7628f.b) next;
        }
        return null;
    }

    /* renamed from: d */
    public static final AbstractC7625c.b m12584d(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC7625c) next) instanceof AbstractC7625c.b) {
                break;
            }
        }
        if (next instanceof AbstractC7625c.b) {
            return (AbstractC7625c.b) next;
        }
        return null;
    }

    /* renamed from: e */
    public static final AbstractC7625c.f m12585e(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC7625c) next) instanceof AbstractC7625c.f) {
                break;
            }
        }
        if (next instanceof AbstractC7625c.f) {
            return (AbstractC7625c.f) next;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC7625c.g m12586f(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC7625c) next) instanceof AbstractC7625c.g) {
                break;
            }
        }
        if (next instanceof AbstractC7625c.g) {
            return (AbstractC7625c.g) next;
        }
        return null;
    }

    /* renamed from: g */
    public static final void m12587g(List list, int i10, Function1 isCustomExist) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(isCustomExist, "isCustomExist");
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (i11 != 0 && ((AbstractC7628f) list.get(i11)).m12594a() == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 && ((Boolean) isCustomExist.invoke(Integer.valueOf(i10))).booleanValue()) {
            ((AbstractC7628f) list.get(0)).m12597d(i10);
            i11 = 0;
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((AbstractC7628f) obj).m12596c(i12 == i11);
            i12 = i13;
        }
    }

    /* renamed from: h */
    public static final void m12588h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7628f abstractC7628f = (AbstractC7628f) it.next();
            abstractC7628f.m12596c(abstractC7628f instanceof AbstractC7628f.b);
            if (abstractC7628f instanceof AbstractC7628f.b) {
                ((AbstractC7628f.b) abstractC7628f).m12599f(true);
            }
        }
    }
}
