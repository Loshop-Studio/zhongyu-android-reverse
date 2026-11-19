package androidx.compose.p014ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes2.dex */
public interface Paragraph {

    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return paragraph.getLineEnd(i10, z10);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m32824paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo32780paintLG529CI(canvas, (i11 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10, (i11 & 4) != 0 ? null : shadow, (i11 & 8) != 0 ? null : textDecoration, (i11 & 16) == 0 ? drawStyle : null, (i11 & 32) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m32825paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i10 & 2) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        paragraph.mo32781paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m32826painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        paragraph.mo32782painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo32774fillBoundingBoxes8ffj60Q(long j10, float[] fArr, @IntRange(from = 0) int i10);

    ResolvedTextDirection getBidiRunDirection(int i10);

    Rect getBoundingBox(int i10);

    Rect getCursorRect(int i10);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i10, boolean z10);

    float getLastBaseline();

    float getLineBaseline(int i10);

    float getLineBottom(int i10);

    int getLineCount();

    int getLineEnd(int i10, boolean z10);

    int getLineForOffset(int i10);

    int getLineForVerticalPosition(float f10);

    float getLineHeight(int i10);

    float getLineLeft(int i10);

    float getLineRight(int i10);

    int getLineStart(int i10);

    float getLineTop(int i10);

    float getLineWidth(int i10);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo32776getOffsetForPositionk4lQ0M(long j10);

    ResolvedTextDirection getParagraphDirection(int i10);

    Path getPathForRange(int i10, int i11);

    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo32778getRangeForRect86BmAI(Rect rect, int i10, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo32779getWordBoundaryjx7JFs(int i10);

    boolean isLineEllipsized(int i10);

    /* renamed from: paint-LG529CI */
    void mo32780paintLG529CI(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10);

    /* renamed from: paint-RPmYEkk */
    void mo32781paintRPmYEkk(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo32782painthn5TExg(Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10);
}
