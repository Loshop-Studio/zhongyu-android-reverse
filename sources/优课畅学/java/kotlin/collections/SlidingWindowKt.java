package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8472j;
import p134i7.C8782h0;

/* loaded from: classes5.dex */
public abstract class SlidingWindowKt {
    /* renamed from: a */
    public static final void m15941a(int i10, int i11) {
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
    public static final Iterator m15942b(Iterator iterator, int i10, int i11, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(iterator, "iterator");
        return !iterator.hasNext() ? C8782h0.f16461a : AbstractC8472j.m13826a(new SlidingWindowKt$windowedIterator$1(i10, i11, iterator, z11, z10, null));
    }
}
