package androidx.compose.p013ui.graphics;

import android.graphics.PathEffect;

/* loaded from: classes2.dex */
public final class AndroidPathEffect implements PathEffect {
    private final PathEffect nativePathEffect;

    public AndroidPathEffect(PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
