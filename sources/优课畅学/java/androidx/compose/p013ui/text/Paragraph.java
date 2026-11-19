package androidx.compose.p013ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.text.style.TextDecoration;
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
    static /* synthetic */ void m26222paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo26178paintLG529CI(canvas, (i11 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10, (i11 & 4) != 0 ? null : shadow, (i11 & 8) != 0 ? null : textDecoration, (i11 & 16) == 0 ? drawStyle : null, (i11 & 32) != 0 ? DrawScope.Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m26223paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i10 & 2) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        paragraph.mo26179paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m26224painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        paragraph.mo26180painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.Companion.m24829getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo26172fillBoundingBoxes8ffj60Q(long j10, float[] fArr, @IntRange(from = 0) int i10);

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
    int mo26174getOffsetForPositionk4lQ0M(long j10);

    ResolvedTextDirection getParagraphDirection(int i10);

    Path getPathForRange(int i10, int i11);

    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo26176getRangeForRect86BmAI(Rect rect, int i10, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo26177getWordBoundaryjx7JFs(int i10);

    boolean isLineEllipsized(int i10);

    /* renamed from: paint-LG529CI */
    void mo26178paintLG529CI(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10);

    /* renamed from: paint-RPmYEkk */
    void mo26179paintRPmYEkk(Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo26180painthn5TExg(Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10);
}
