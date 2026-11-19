package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ImageReaderProxyProvider {
    @NonNull
    ImageReaderProxy newInstance(int i10, int i11, int i12, int i13, long j10);
}
