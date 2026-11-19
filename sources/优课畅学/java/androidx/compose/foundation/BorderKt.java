package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawResult;
import androidx.compose.p013ui.geometry.CornerRadius;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.RoundRect;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathOperation;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class BorderKt {
    @Stable
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m20363borderziNgDLE(modifier, borderStroke.m20376getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m20361borderxT4_qwU(Modifier modifier, float f10, long j10, Shape shape) {
        return m20363borderziNgDLE(modifier, f10, new SolidColor(j10, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20362borderxT4_qwU$default(Modifier modifier, float f10, long j10, Shape shape, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m20361borderxT4_qwU(modifier, f10, j10, shape);
    }

    @Stable
    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m20363borderziNgDLE(Modifier modifier, float f10, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f10, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f10, RoundRect roundRect) {
        return new RoundRect(f10, f10, roundRect.getWidth() - f10, roundRect.getHeight() - f10, m20365shrinkKibmq7A(roundRect.m24085getTopLeftCornerRadiuskKHJgLs(), f10), m20365shrinkKibmq7A(roundRect.m24086getTopRightCornerRadiuskKHJgLs(), f10), m20365shrinkKibmq7A(roundRect.m24084getBottomRightCornerRadiuskKHJgLs(), f10), m20365shrinkKibmq7A(roundRect.m24083getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f10, boolean z10) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z10) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f10, roundRect), null, 2, null);
            path.mo24168opN5in7k0(path, Path, PathOperation.Companion.m24568getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new InterfaceC10570l() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m20364drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j10, long j11, boolean z10, float f10) {
        final long jM24051getZeroF1C5BW0 = z10 ? Offset.Companion.m24051getZeroF1C5BW0() : j10;
        final long jM23889getSizeNHjbRc = z10 ? cacheDrawScope.m23889getSizeNHjbRc() : j11;
        final DrawStyle stroke = z10 ? Fill.INSTANCE : new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new InterfaceC10570l() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m24820drawRectAsUm42w$default(contentDrawScope, brush, jM24051getZeroF1C5BW0, jM23889getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m20365shrinkKibmq7A(long j10, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10);
        return CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }
}
