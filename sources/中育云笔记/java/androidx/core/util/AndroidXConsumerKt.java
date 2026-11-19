package androidx.core.util;

import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(InterfaceC11588c<? super T> interfaceC11588c) {
        return new AndroidXContinuationConsumer(interfaceC11588c);
    }
}
