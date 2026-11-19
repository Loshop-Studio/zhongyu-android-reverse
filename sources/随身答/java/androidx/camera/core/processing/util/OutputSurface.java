package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class OutputSurface {
    @NonNull
    /* renamed from: of */
    public static OutputSurface m660of(@NonNull EGLSurface eGLSurface, int i9, int i10) {
        return new AutoValue_OutputSurface(eGLSurface, i9, i10);
    }

    @NonNull
    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
