package p325rc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.a0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10935a0 extends AbstractC10984z {
    /* renamed from: A */
    public static void m23853A(List list, Comparator comparator) {
        AbstractC9979u.m20294g(list, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: z */
    public static void m23854z(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
