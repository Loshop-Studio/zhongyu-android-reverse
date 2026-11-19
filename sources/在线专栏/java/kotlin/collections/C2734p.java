package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.p */
/* loaded from: classes.dex */
public class C2734p extends C2733o {
    /* renamed from: q */
    public static <T extends Comparable<? super T>> void m9150q(@NotNull List<T> list) {
        C2769l.m9241e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
