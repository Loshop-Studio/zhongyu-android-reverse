package androidx.compose.p011ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010 \u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0018H&¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\rH&¢\u0006\u0004\b'\u0010(J\u001a\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H&ø\u0001\u0000¢\u0006\u0004\b+\u0010,J*\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H&ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b7\u0010\u000bJ,\u0010?\u001a\u00020<2\u0006\u00108\u001a\u0002032\u0006\u0010:\u001a\u0002092\b\b\u0001\u0010;\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001d\u0010B\u001a\u0002032\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ<\u0010M\u001a\u00020<2\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010IH&ø\u0001\u0000¢\u0006\u0004\bK\u0010LJR\u0010M\u001a\u00020<2\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010Q\u001a\u00020PH&ø\u0001\u0000¢\u0006\u0004\bR\u0010SJZ\u0010M\u001a\u00020<2\u0006\u0010D\u001a\u00020C2\u0006\u0010U\u001a\u00020T2\b\b\u0002\u0010V\u001a\u00020\r2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010Q\u001a\u00020PH&ø\u0001\u0000¢\u0006\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010ZR\u0014\u0010a\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010ZR\u0014\u0010c\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010ZR\u0014\u0010e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010ZR\u0014\u0010h\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0001\u0001pø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006qÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "(I)Landroidx/compose/ui/geometry/Rect;", "lineIndex", "", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "getBoundingBox", "range", "", "array", "arrayStart", "Ld6/s;", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getWidth", "()F", "width", "getHeight", "height", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "getLineCount", "()I", "lineCount", "", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Paragraph {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return paragraph.getLineEnd(i, z8);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m12628paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j7, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo12584paintLG529CI(canvas, (i8 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7, (i8 & 4) != 0 ? null : shadow, (i8 & 8) != 0 ? null : textDecoration, (i8 & 16) == 0 ? drawStyle : null, (i8 & 32) != 0 ? DrawScope.INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m12629paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j7, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i & 2) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        paragraph.mo12585paintRPmYEkk(canvas, j7, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m12630painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i8 & 4) != 0) {
            f = Float.NaN;
        }
        paragraph.mo12586painthn5TExg(canvas, brush, f, (i8 & 8) != 0 ? null : shadow, (i8 & 16) != 0 ? null : textDecoration, (i8 & 32) != 0 ? null : drawStyle, (i8 & 64) != 0 ? DrawScope.INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo12578fillBoundingBoxes8ffj60Q(long range, @NotNull float[] array, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int arrayStart);

    @NotNull
    ResolvedTextDirection getBidiRunDirection(int offset);

    @NotNull
    Rect getBoundingBox(int offset);

    @NotNull
    Rect getCursorRect(int offset);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int offset, boolean usePrimaryDirection);

    float getLastBaseline();

    float getLineBaseline(int lineIndex);

    float getLineBottom(int lineIndex);

    int getLineCount();

    int getLineEnd(int lineIndex, boolean visibleEnd);

    int getLineForOffset(int offset);

    int getLineForVerticalPosition(float vertical);

    float getLineHeight(int lineIndex);

    float getLineLeft(int lineIndex);

    float getLineRight(int lineIndex);

    int getLineStart(int lineIndex);

    float getLineTop(int lineIndex);

    float getLineWidth(int lineIndex);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo12580getOffsetForPositionk4lQ0M(long position);

    @NotNull
    ResolvedTextDirection getParagraphDirection(int offset);

    @NotNull
    Path getPathForRange(int start, int end);

    @NotNull
    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo12582getRangeForRect86BmAI(@NotNull Rect rect, int granularity, @NotNull TextInclusionStrategy inclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo12583getWordBoundaryjx7JFs(int offset);

    boolean isLineEllipsized(int lineIndex);

    /* renamed from: paint-LG529CI */
    void mo12584paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode);

    /* renamed from: paint-RPmYEkk */
    void mo12585paintRPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo12586painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode);
}
