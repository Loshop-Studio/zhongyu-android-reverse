package androidx.compose.p014ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class AndroidRenderEffect extends RenderEffect {
    private final RenderEffect androidRenderEffect;

    public AndroidRenderEffect(RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.p014ui.graphics.RenderEffect
    public RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    public final RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
