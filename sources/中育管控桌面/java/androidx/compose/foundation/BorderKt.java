package androidx.compose.foundation;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.draw.CacheDrawScope;
import androidx.compose.p009ui.draw.DrawResult;
import androidx.compose.p009ui.geometry.CornerRadius;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.geometry.RoundRect;
import androidx.compose.p009ui.graphics.AndroidPath_androidKt;
import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Path;
import androidx.compose.p009ui.graphics.PathOperation;
import androidx.compose.p009ui.graphics.RectangleShapeKt;
import androidx.compose.p009ui.graphics.Shape;
import androidx.compose.p009ui.graphics.SolidColor;
import androidx.compose.p009ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.graphics.drawscope.DrawStyle;
import androidx.compose.p009ui.graphics.drawscope.Fill;
import androidx.compose.p009ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a>\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m7880d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", "border", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,468:1\n1#2:469\n48#3:470\n53#3:473\n60#4:471\n70#4:474\n53#4,3:476\n22#5:472\n33#6:475\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n467#1:470\n467#1:473\n467#1:471\n467#1:474\n467#1:476,3\n467#1:472\n467#1:475\n*E\n"})
/* loaded from: classes.dex */
public final class BorderKt {
    @Stable
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m10126borderziNgDLE(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m10124borderxT4_qwU(Modifier modifier, float f6, long j6, Shape shape) {
        return m10126borderziNgDLE(modifier, f6, new SolidColor(j6, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10125borderxT4_qwU$default(Modifier modifier, float f6, long j6, Shape shape, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m10124borderxT4_qwU(modifier, f6, j6, shape);
    }

    @Stable
    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m10126borderziNgDLE(Modifier modifier, float f6, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f6, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f6, RoundRect roundRect) {
        return new RoundRect(f6, f6, roundRect.getWidth() - f6, roundRect.getHeight() - f6, m10128shrinkKibmq7A(roundRect.m13708getTopLeftCornerRadiuskKHJgLs(), f6), m10128shrinkKibmq7A(roundRect.m13709getTopRightCornerRadiuskKHJgLs(), f6), m10128shrinkKibmq7A(roundRect.m13707getBottomRightCornerRadiuskKHJgLs(), f6), m10128shrinkKibmq7A(roundRect.m13706getBottomLeftCornerRadiuskKHJgLs(), f6), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f6, boolean z6) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z6) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f6, roundRect), null, 2, null);
            path.mo13791opN5in7k0(path, Path, PathOperation.INSTANCE.m14191getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m10127drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j6, long j7, boolean z6, float f6) {
        final long jM13674getZeroF1C5BW0 = z6 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6;
        final long jM13519getSizeNHjbRc = z6 ? cacheDrawScope.m13519getSizeNHjbRc() : j7;
        final DrawStyle stroke = z6 ? Fill.INSTANCE : new Stroke(f6, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m14443drawRectAsUm42w$default(contentDrawScope, brush, jM13674getZeroF1C5BW0, jM13519getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m10128shrinkKibmq7A(long j6, float f6) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j6 >> 32)) - f6);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j6 & 4294967295L)) - f6);
        return CornerRadius.m13612constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }
}
