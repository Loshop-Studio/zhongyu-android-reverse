package androidx.core.util;

import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return new ContinuationRunnable(interfaceC9324c);
    }
}
