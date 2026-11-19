package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ImageReaderProxyProvider {
    @NonNull
    ImageReaderProxy newInstance(int i, int i8, int i9, int i10, long j7);
}
