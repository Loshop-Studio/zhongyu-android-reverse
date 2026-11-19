package androidx.core.util;

import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return new ContinuationRunnable(interfaceC11588c);
    }
}
