package androidx.compose.p014ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.text.TextLayoutResult;

@RequiresApi(34)
/* loaded from: classes2.dex */
final class CursorAnchorInfoApi34Helper {
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    public static final CursorAnchorInfo.Builder addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        int lineForVerticalPosition;
        int lineForVerticalPosition2;
        if (!rect.isEmpty() && (lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(rect.getTop())) <= (lineForVerticalPosition2 = textLayoutResult.getLineForVerticalPosition(rect.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(lineForVerticalPosition), textLayoutResult.getLineTop(lineForVerticalPosition), textLayoutResult.getLineRight(lineForVerticalPosition), textLayoutResult.getLineBottom(lineForVerticalPosition));
                if (lineForVerticalPosition == lineForVerticalPosition2) {
                    break;
                }
                lineForVerticalPosition++;
            }
        }
        return builder;
    }
}
