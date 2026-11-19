package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(33)
/* loaded from: classes.dex */
public final class CursorAnchorInfoApi33Helper {
    public static final int $stable = 0;
    public static final CursorAnchorInfoApi33Helper INSTANCE = new CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(CursorAnchorInfo.Builder builder, Rect rect) {
        return builder.setEditorBoundsInfo(AbstractC1864m.m960a().setEditorBounds(RectHelper_androidKt.toAndroidRectF(rect)).setHandwritingBounds(RectHelper_androidKt.toAndroidRectF(rect)).build());
    }
}
