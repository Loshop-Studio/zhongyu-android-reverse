package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p049e1.InterfaceFutureC5453a;

@FunctionalInterface
/* loaded from: classes.dex */
public interface AsyncFunction<I, O> {
    @NonNull
    InterfaceFutureC5453a apply(@Nullable I i) throws Exception;
}
