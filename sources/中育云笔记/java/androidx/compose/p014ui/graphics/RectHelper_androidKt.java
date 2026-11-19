package androidx.compose.p014ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.p014ui.unit.IntRect;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class RectHelper_androidKt {
    @InterfaceC10770a
    public static final Rect toAndroidRect(androidx.compose.p014ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    public static final RectF toAndroidRectF(androidx.compose.p014ui.geometry.Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    public static final IntRect toComposeIntRect(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.p014ui.geometry.Rect toComposeRect(Rect rect) {
        return new androidx.compose.p014ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final Rect toAndroidRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final androidx.compose.p014ui.geometry.Rect toComposeRect(RectF rectF) {
        return new androidx.compose.p014ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
