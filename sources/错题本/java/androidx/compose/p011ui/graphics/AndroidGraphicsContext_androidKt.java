package androidx.compose.p011ui.graphics;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0004H\u0000\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002¨\u0006\b"}, m5110d2 = {"isLayerPersistenceEnabled", "", "()Z", "GraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "layerContainer", "Landroid/view/ViewGroup;", "isLayerManagerInitialized", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidGraphicsContext_androidKt {
    @NotNull
    public static final GraphicsContext GraphicsContext(@NotNull ViewGroup viewGroup) {
        return new AndroidGraphicsContext(viewGroup);
    }

    public static final boolean isLayerManagerInitialized(@NotNull GraphicsContext graphicsContext) {
        AbstractC5830k.m5328e(graphicsContext, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        return ((AndroidGraphicsContext) graphicsContext).isLayerManagerInitialized();
    }

    public static final boolean isLayerPersistenceEnabled() {
        return false;
    }
}
