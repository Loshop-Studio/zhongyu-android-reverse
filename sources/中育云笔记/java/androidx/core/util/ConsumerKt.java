package androidx.core.util;

import androidx.annotation.RequiresApi;
import vc.InterfaceC11588c;

@RequiresApi(24)
/* loaded from: classes2.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(InterfaceC11588c<? super T> interfaceC11588c) {
        return new ContinuationConsumer(interfaceC11588c);
    }
}
