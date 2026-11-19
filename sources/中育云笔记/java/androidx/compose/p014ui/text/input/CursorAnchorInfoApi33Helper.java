package androidx.compose.p014ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.AbstractC1864m;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;

@RequiresApi(33)
/* loaded from: classes2.dex */
final class CursorAnchorInfoApi33Helper {
    public static final CursorAnchorInfoApi33Helper INSTANCE = new CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(CursorAnchorInfo.Builder builder, Rect rect) {
        return builder.setEditorBoundsInfo(AbstractC1864m.m960a().setEditorBounds(RectHelper_androidKt.toAndroidRectF(rect)).setHandwritingBounds(RectHelper_androidKt.toAndroidRectF(rect)).build());
    }
}
