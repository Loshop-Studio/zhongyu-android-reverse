package androidx.compose.p009ui.platform;

import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.geometry.RoundRect;
import androidx.compose.p009ui.graphics.AndroidPath_androidKt;
import androidx.compose.p009ui.graphics.Outline;
import androidx.compose.p009ui.graphics.Path;
import androidx.compose.p009ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7880d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nShapeContainingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n48#2:161\n53#2:164\n48#2:167\n53#2:170\n48#2:173\n53#2:176\n53#2:179\n48#2:182\n48#2:185\n48#2:188\n53#2:191\n53#2:194\n48#2:197\n53#2:200\n60#3:162\n70#3:165\n60#3:168\n70#3:171\n60#3:174\n70#3:177\n70#3:180\n60#3:183\n60#3:186\n60#3:189\n70#3:192\n70#3:195\n60#3:198\n70#3:201\n22#4:163\n22#4:166\n22#4:169\n22#4:172\n22#4:175\n22#4:178\n22#4:181\n22#4:184\n22#4:187\n22#4:190\n22#4:193\n22#4:196\n22#4:199\n22#4:202\n*S KotlinDebug\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n*L\n76#1:161\n77#1:164\n79#1:167\n80#1:170\n82#1:173\n83#1:176\n85#1:179\n86#1:182\n110#1:185\n111#1:188\n112#1:191\n113#1:194\n129#1:197\n130#1:200\n76#1:162\n77#1:165\n79#1:168\n80#1:171\n82#1:174\n83#1:177\n85#1:180\n86#1:183\n110#1:186\n111#1:189\n112#1:192\n113#1:195\n129#1:198\n130#1:201\n76#1:163\n77#1:166\n79#1:169\n80#1:172\n82#1:175\n83#1:178\n85#1:181\n86#1:184\n110#1:187\n111#1:190\n112#1:193\n113#1:196\n129#1:199\n130#1:202\n*E\n"})
/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return Float.intBitsToFloat((int) (roundRect.m13708getTopLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m13709getTopRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m13706getBottomLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m13707getBottomRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m13708getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m13706getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight() && Float.intBitsToFloat((int) (roundRect.m13709getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m13707getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(Outline outline, float f6, float f7, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f6, f7);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f6, f7, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f6, f7, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f6, float f7, Path path, Path path2, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            path = null;
        }
        if ((i6 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f6, f7, path, path2);
    }

    private static final boolean isInPath(Path path, float f6, float f7, Path path2, Path path3) {
        Rect rect = new Rect(f6 - 0.005f, f7 - 0.005f, f6 + 0.005f, f7 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo13791opN5in7k0(path, path2, PathOperation.INSTANCE.m14192getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f6, float f7) {
        return rect.getLeft() <= f6 && f6 < rect.getRight() && rect.getTop() <= f7 && f7 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f6, float f7, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f6 < roundRect.getLeft() || f6 >= roundRect.getRight() || f7 < roundRect.getTop() || f7 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f6, f7, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m13708getTopLeftCornerRadiuskKHJgLs() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m13708getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m13709getTopRightCornerRadiuskKHJgLs() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m13709getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m13707getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m13707getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.m13706getBottomLeftCornerRadiuskKHJgLs()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m13706getBottomLeftCornerRadiuskKHJgLs() >> 32));
        if (f6 < left && f7 < top) {
            return m15691isWithinEllipseVE1yxkc(f6, f7, roundRect.m13708getTopLeftCornerRadiuskKHJgLs(), left, top);
        }
        if (f6 < left2 && f7 > bottom2) {
            return m15691isWithinEllipseVE1yxkc(f6, f7, roundRect.m13706getBottomLeftCornerRadiuskKHJgLs(), left2, bottom2);
        }
        if (f6 > right && f7 < top2) {
            return m15691isWithinEllipseVE1yxkc(f6, f7, roundRect.m13709getTopRightCornerRadiuskKHJgLs(), right, top2);
        }
        if (f6 <= right2 || f7 <= bottom) {
            return true;
        }
        return m15691isWithinEllipseVE1yxkc(f6, f7, roundRect.m13707getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m15691isWithinEllipseVE1yxkc(float f6, float f7, long j6, float f8, float f9) {
        float f10 = f6 - f8;
        float f11 = f7 - f9;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return ((f10 * f10) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f11 * f11) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
