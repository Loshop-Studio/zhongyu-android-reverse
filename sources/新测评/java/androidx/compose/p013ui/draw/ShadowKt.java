package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m13558d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n113#2:147\n113#2:148\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n65#1:147\n108#1:148\n104#1:149\n*E\n"})
/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m20610shadows4CzXII(Modifier modifier, float f10, Shape shape, boolean z9, long j10, long j11) {
        return (C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl((float) 0)) > 0 || z9) ? modifier.then(new ShadowGraphicsLayerElement(f10, shape, z9, j10, j11, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20611shadows4CzXII$default(Modifier modifier, float f10, Shape shape, boolean z9, long j10, long j11, int i10, Object obj) {
        boolean z10;
        Shape rectangleShape = (i10 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i10 & 4) != 0) {
            z10 = false;
            if (C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl(0)) > 0) {
                z10 = true;
            }
        } else {
            z10 = z9;
        }
        return m20610shadows4CzXII(modifier, f10, rectangleShape, z10, (i10 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m20612shadowziNgDLE(Modifier modifier, float f10, Shape shape, boolean z9) {
        return m20610shadows4CzXII(modifier, f10, shape, z9, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20613shadowziNgDLE$default(Modifier modifier, float f10, Shape shape, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z9 = false;
            if (C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl(0)) > 0) {
                z9 = true;
            }
        }
        return m20612shadowziNgDLE(modifier, f10, shape, z9);
    }
}
