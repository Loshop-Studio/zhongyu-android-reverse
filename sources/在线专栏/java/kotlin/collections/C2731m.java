package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.m */
/* loaded from: classes.dex */
public class C2731m extends C2730l {
    /* renamed from: p */
    public static <T> int m9149p(@NotNull Iterable<? extends T> iterable, int i4) {
        C2769l.m9241e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i4;
    }
}
