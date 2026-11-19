package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawResult;
import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathOperation;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class BorderKt {
    @Stable
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m26965borderziNgDLE(modifier, borderStroke.m26978getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m26963borderxT4_qwU(Modifier modifier, float f10, long j10, Shape shape) {
        return m26965borderziNgDLE(modifier, f10, new SolidColor(j10, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26964borderxT4_qwU$default(Modifier modifier, float f10, long j10, Shape shape, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m26963borderxT4_qwU(modifier, f10, j10, shape);
    }

    @Stable
    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m26965borderziNgDLE(Modifier modifier, float f10, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f10, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f10, RoundRect roundRect) {
        return new RoundRect(f10, f10, roundRect.getWidth() - f10, roundRect.getHeight() - f10, m26967shrinkKibmq7A(roundRect.m30687getTopLeftCornerRadiuskKHJgLs(), f10), m26967shrinkKibmq7A(roundRect.m30688getTopRightCornerRadiuskKHJgLs(), f10), m26967shrinkKibmq7A(roundRect.m30686getBottomRightCornerRadiuskKHJgLs(), f10), m26967shrinkKibmq7A(roundRect.m30685getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f10, boolean z10) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z10) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f10, roundRect), null, 2, null);
            path.mo30770opN5in7k0(path, Path, PathOperation.Companion.m31170getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m26966drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j10, long j11, boolean z10, float f10) {
        final long jM30653getZeroF1C5BW0 = z10 ? Offset.Companion.m30653getZeroF1C5BW0() : j10;
        final long jM30491getSizeNHjbRc = z10 ? cacheDrawScope.m30491getSizeNHjbRc() : j11;
        final DrawStyle stroke = z10 ? Fill.INSTANCE : new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m31422drawRectAsUm42w$default(contentDrawScope, brush, jM30653getZeroF1C5BW0, jM30491getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m26967shrinkKibmq7A(long j10, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10);
        return CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }
}
