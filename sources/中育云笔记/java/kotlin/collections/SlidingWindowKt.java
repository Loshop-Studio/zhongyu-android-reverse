package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p296pd.AbstractC10662j;
import p325rc.C10951i0;

/* loaded from: classes6.dex */
public abstract class SlidingWindowKt {
    /* renamed from: a */
    public static final void m20086a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final Iterator m20087b(Iterator iterator, int i10, int i11, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(iterator, "iterator");
        return !iterator.hasNext() ? C10951i0.f26455c : AbstractC10662j.m22557a(new SlidingWindowKt$windowedIterator$1(i10, i11, iterator, z11, z10, null));
    }
}
