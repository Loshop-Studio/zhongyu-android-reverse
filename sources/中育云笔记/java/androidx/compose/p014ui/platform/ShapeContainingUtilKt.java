package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathOperation;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight() && Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(Outline outline, float f10, float f11, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f10, f11);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f10, f11, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f10, f11, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f10, float f11, Path path, Path path2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            path = null;
        }
        if ((i10 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f10, f11, path, path2);
    }

    private static final boolean isInPath(Path path, float f10, float f11, Path path2, Path path3) {
        Rect rect = new Rect(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo30770opN5in7k0(path, path2, PathOperation.Companion.m31171getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f10, float f11) {
        return rect.getLeft() <= f10 && f10 < rect.getRight() && rect.getTop() <= f11 && f11 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f10, float f11, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f10 < roundRect.getLeft() || f10 >= roundRect.getRight() || f11 < roundRect.getTop() || f11 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f10, f11, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32));
        float top3 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.m30685getBottomLeftCornerRadiuskKHJgLs()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32));
        if (f10 < left && f11 < top2) {
            return m32700isWithinEllipseVE1yxkc(f10, f11, roundRect.m30687getTopLeftCornerRadiuskKHJgLs(), left, top2);
        }
        if (f10 < left2 && f11 > bottom2) {
            return m32700isWithinEllipseVE1yxkc(f10, f11, roundRect.m30685getBottomLeftCornerRadiuskKHJgLs(), left2, bottom2);
        }
        if (f10 > right && f11 < top3) {
            return m32700isWithinEllipseVE1yxkc(f10, f11, roundRect.m30688getTopRightCornerRadiuskKHJgLs(), right, top3);
        }
        if (f10 <= right2 || f11 <= bottom) {
            return true;
        }
        return m32700isWithinEllipseVE1yxkc(f10, f11, roundRect.m30686getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m32700isWithinEllipseVE1yxkc(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
