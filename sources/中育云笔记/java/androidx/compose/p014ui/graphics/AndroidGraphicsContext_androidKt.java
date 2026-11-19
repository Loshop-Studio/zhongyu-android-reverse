package androidx.compose.p014ui.graphics;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidGraphicsContext_androidKt {
    public static final GraphicsContext GraphicsContext(ViewGroup viewGroup) {
        return new AndroidGraphicsContext(viewGroup);
    }

    public static final boolean isLayerManagerInitialized(GraphicsContext graphicsContext) {
        AbstractC9979u.m20292e(graphicsContext, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        return ((AndroidGraphicsContext) graphicsContext).isLayerManagerInitialized();
    }

    public static final boolean isLayerPersistenceEnabled() {
        return false;
    }
}
