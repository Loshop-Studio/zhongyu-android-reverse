package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    @NonNull
    public static ImageReaderProxy createIsolatedReader(int i10, int i11, int i12, int i13) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i10, i11, i12, i13));
    }
}
