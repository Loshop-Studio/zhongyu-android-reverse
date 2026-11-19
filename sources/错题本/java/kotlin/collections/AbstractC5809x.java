package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.collections.x */
/* loaded from: classes2.dex */
public abstract class AbstractC5809x extends AbstractC5808w {
    /* renamed from: P */
    public static void m5288P(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
    }

    /* renamed from: Q */
    public static void m5289Q(List list, Comparator comparator) {
        AbstractC5830k.m5330g(list, "<this>");
        AbstractC5830k.m5330g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
