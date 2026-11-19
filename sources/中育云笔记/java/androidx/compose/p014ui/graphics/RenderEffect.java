package androidx.compose.p014ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public abstract class RenderEffect {
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(AbstractC9972n abstractC9972n) {
        this();
    }

    @RequiresApi(31)
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect renderEffectCreateRenderEffect = createRenderEffect();
        this.internalRenderEffect = renderEffectCreateRenderEffect;
        return renderEffectCreateRenderEffect;
    }

    @RequiresApi(31)
    public abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private RenderEffect() {
    }
}
