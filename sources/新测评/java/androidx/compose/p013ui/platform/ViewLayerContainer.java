package androidx.compose.p013ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0004¨\u0006\n"}, m13558d2 = {"Landroidx/compose/ui/platform/ViewLayerContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "dispatchGetDisplayList", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 0;

    public ViewLayerContainer(Context context) {
        super(context);
    }

    @Override // androidx.compose.p013ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public final void dispatchGetDisplayList() {
    }
}
