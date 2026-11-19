package androidx.core.util;

import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(InterfaceC9324c<? super T> interfaceC9324c) {
        return new AndroidXContinuationConsumer(interfaceC9324c);
    }
}
