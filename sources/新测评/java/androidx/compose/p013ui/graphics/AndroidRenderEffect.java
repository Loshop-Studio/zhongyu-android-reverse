package androidx.compose.p013ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "androidRenderEffect", "Landroid/graphics/RenderEffect;", "(Landroid/graphics/RenderEffect;)V", "getAndroidRenderEffect", "()Landroid/graphics/RenderEffect;", "createRenderEffect", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidRenderEffect extends RenderEffect {
    private final RenderEffect androidRenderEffect;

    public AndroidRenderEffect(RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.p013ui.graphics.RenderEffect
    /* renamed from: createRenderEffect, reason: from getter */
    public RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }

    public final RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
