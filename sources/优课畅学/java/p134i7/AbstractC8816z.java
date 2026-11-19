package p134i7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.z */
/* loaded from: classes5.dex */
public abstract class AbstractC8816z extends AbstractC8815y {
    /* renamed from: A */
    public static void m14795A(List list, Comparator comparator) {
        AbstractC9133u.m16133g(list, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: z */
    public static void m14796z(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
