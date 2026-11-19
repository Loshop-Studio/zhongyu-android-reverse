package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i10, InterfaceC10574p interfaceC10574p) {
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            interfaceC10574p.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
