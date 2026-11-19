package androidx.core.os;

import java.lang.Throwable;

/* loaded from: classes2.dex */
public interface OutcomeReceiverCompat<R, E extends Throwable> {
    default void onError(E e10) {
    }

    void onResult(R r9);
}
