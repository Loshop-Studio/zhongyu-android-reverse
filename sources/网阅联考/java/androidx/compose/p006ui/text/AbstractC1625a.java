package androidx.compose.p006ui.text;

import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.text.style.TextDecoration;

/* renamed from: androidx.compose.ui.text.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1625a {
    /* renamed from: a */
    public static /* synthetic */ int m845a(Paragraph paragraph, int i4, boolean z3, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        return paragraph.getLineEnd(i4, z3);
    }

    /* renamed from: b */
    public static /* synthetic */ void m846b(Paragraph paragraph, Canvas canvas, long j4, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo10944paintLG529CI(canvas, (i5 & 2) != 0 ? Color.INSTANCE.m9214getUnspecified0d7_KjU() : j4, (i5 & 4) != 0 ? null : shadow, (i5 & 8) != 0 ? null : textDecoration, (i5 & 16) == 0 ? drawStyle : null, (i5 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }

    /* renamed from: c */
    public static /* synthetic */ void m847c(Paragraph paragraph, Canvas canvas, long j4, Shadow shadow, TextDecoration textDecoration, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i4 & 2) != 0) {
            j4 = Color.INSTANCE.m9214getUnspecified0d7_KjU();
        }
        paragraph.mo10945paintRPmYEkk(canvas, j4, (i4 & 4) != 0 ? null : shadow, (i4 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: d */
    public static /* synthetic */ void m848d(Paragraph paragraph, Canvas canvas, Brush brush, float f4, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        paragraph.mo10946painthn5TExg(canvas, brush, (i5 & 4) != 0 ? Float.NaN : f4, (i5 & 8) != 0 ? null : shadow, (i5 & 16) != 0 ? null : textDecoration, (i5 & 32) != 0 ? null : drawStyle, (i5 & 64) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : i4);
    }
}
