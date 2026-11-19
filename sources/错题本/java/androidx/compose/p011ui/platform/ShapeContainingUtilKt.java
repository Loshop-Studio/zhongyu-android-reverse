package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathOperation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m5110d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nShapeContainingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n48#2:161\n53#2:164\n48#2:167\n53#2:170\n48#2:173\n53#2:176\n53#2:179\n48#2:182\n48#2:185\n48#2:188\n53#2:191\n53#2:194\n48#2:197\n53#2:200\n60#3:162\n70#3:165\n60#3:168\n70#3:171\n60#3:174\n70#3:177\n70#3:180\n60#3:183\n60#3:186\n60#3:189\n70#3:192\n70#3:195\n60#3:198\n70#3:201\n22#4:163\n22#4:166\n22#4:169\n22#4:172\n22#4:175\n22#4:178\n22#4:181\n22#4:184\n22#4:187\n22#4:190\n22#4:193\n22#4:196\n22#4:199\n22#4:202\n*S KotlinDebug\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n*L\n76#1:161\n77#1:164\n79#1:167\n80#1:170\n82#1:173\n83#1:176\n85#1:179\n86#1:182\n110#1:185\n111#1:188\n112#1:191\n113#1:194\n129#1:197\n130#1:200\n76#1:162\n77#1:165\n79#1:168\n80#1:171\n82#1:174\n83#1:177\n85#1:180\n86#1:183\n110#1:186\n111#1:189\n112#1:192\n113#1:195\n129#1:198\n130#1:201\n76#1:163\n77#1:166\n79#1:169\n80#1:172\n82#1:175\n83#1:178\n85#1:181\n86#1:184\n110#1:187\n111#1:190\n112#1:193\n113#1:196\n129#1:199\n130#1:202\n*E\n"})
/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        if (Float.intBitsToFloat((int) (roundRect.m10492getTopRightCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m10491getTopLeftCornerRadiuskKHJgLs() >> 32)) > roundRect.getWidth()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (roundRect.m10490getBottomRightCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m10489getBottomLeftCornerRadiuskKHJgLs() >> 32)) > roundRect.getWidth()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (roundRect.m10489getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m10491getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight()) {
            return Float.intBitsToFloat((int) (roundRect.m10490getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m10492getTopRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
        }
        return false;
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f, float f7, @Nullable Path path, @Nullable Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f, f7);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f, f7, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f, f7, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f, float f7, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f7, path, path2);
    }

    private static final boolean isInPath(Path path, float f, float f7, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f7 - 0.005f, f + 0.005f, f7 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo10574opN5in7k0(path, path2, PathOperation.INSTANCE.m10975getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f, float f7) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f7 && f7 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f, float f7, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f7 < roundRect.getTop() || f7 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f, f7, path, path2);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m10491getTopLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (roundRect.m10491getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m10492getTopRightCornerRadiuskKHJgLs() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRect.m10492getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m10490getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m10490getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.m10489getBottomLeftCornerRadiuskKHJgLs()));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (roundRect.m10489getBottomLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        if (f < fIntBitsToFloat && f7 < fIntBitsToFloat2) {
            return m12504isWithinEllipseVE1yxkc(f, f7, roundRect.m10491getTopLeftCornerRadiuskKHJgLs(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f < fIntBitsToFloat4 && f7 > bottom2) {
            return m12504isWithinEllipseVE1yxkc(f, f7, roundRect.m10489getBottomLeftCornerRadiuskKHJgLs(), fIntBitsToFloat4, bottom2);
        }
        if (f > right && f7 < fIntBitsToFloat3) {
            return m12504isWithinEllipseVE1yxkc(f, f7, roundRect.m10492getTopRightCornerRadiuskKHJgLs(), right, fIntBitsToFloat3);
        }
        if (f <= right2 || f7 <= bottom) {
            return true;
        }
        return m12504isWithinEllipseVE1yxkc(f, f7, roundRect.m10490getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m12504isWithinEllipseVE1yxkc(float f, float f7, long j7, float f8, float f9) {
        float f10 = f - f8;
        float f11 = f7 - f9;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return ((f11 * f11) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f10 * f10) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
