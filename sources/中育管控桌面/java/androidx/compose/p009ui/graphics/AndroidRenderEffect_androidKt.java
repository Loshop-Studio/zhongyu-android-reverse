package androidx.compose.p009ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7880d2 = {"asComposeRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class AndroidRenderEffect_androidKt {
    public static final RenderEffect asComposeRenderEffect(RenderEffect renderEffect) {
        return new AndroidRenderEffect(renderEffect);
    }
}
