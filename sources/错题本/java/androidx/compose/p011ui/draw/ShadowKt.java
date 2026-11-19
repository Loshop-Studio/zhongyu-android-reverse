package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p011ui.graphics.RectangleShapeKt;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m5110d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n113#2:147\n113#2:148\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n65#1:147\n108#1:148\n104#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    @NotNull
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m10309shadows4CzXII(@NotNull Modifier modifier, float f, @NotNull Shape shape, boolean z8, long j7, long j8) {
        return (C2331Dp.m13304compareTo0680j_4(f, C2331Dp.m13305constructorimpl((float) 0)) > 0 || z8) ? modifier.then(new ShadowGraphicsLayerElement(f, shape, z8, j7, j8, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10310shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z8, long j7, long j8, int i, Object obj) {
        boolean z9;
        Shape rectangleShape = (i & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z9 = false;
            if (C2331Dp.m13304compareTo0680j_4(f, C2331Dp.m13305constructorimpl(0)) > 0) {
                z9 = true;
            }
        } else {
            z9 = z8;
        }
        return m10309shadows4CzXII(modifier, f, rectangleShape, z9, (i & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j7, (i & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j8);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m10311shadowziNgDLE(Modifier modifier, float f, Shape shape, boolean z8) {
        return m10309shadows4CzXII(modifier, f, shape, z8, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10312shadowziNgDLE$default(Modifier modifier, float f, Shape shape, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z8 = false;
            if (C2331Dp.m13304compareTo0680j_4(f, C2331Dp.m13305constructorimpl(0)) > 0) {
                z8 = true;
            }
        }
        return m10311shadowziNgDLE(modifier, f, shape, z8);
    }
}
