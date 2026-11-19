package androidx.core.util;

import androidx.annotation.RequiresApi;
import p179m7.InterfaceC9324c;

@RequiresApi(24)
/* loaded from: classes2.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(InterfaceC9324c<? super T> interfaceC9324c) {
        return new ContinuationConsumer(interfaceC9324c);
    }
}
