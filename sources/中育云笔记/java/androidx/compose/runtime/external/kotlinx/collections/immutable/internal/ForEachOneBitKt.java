package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i10, InterfaceC9544p interfaceC9544p) {
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            interfaceC9544p.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
