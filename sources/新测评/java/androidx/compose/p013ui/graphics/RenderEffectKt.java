package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13558d2 = {"BlurEffect", "Landroidx/compose/ui/graphics/BlurEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "BlurEffect-3YTHUZs", "(FFI)Landroidx/compose/ui/graphics/BlurEffect;", "OffsetEffect", "Landroidx/compose/ui/graphics/OffsetEffect;", "offsetX", "offsetY", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRenderEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,78:1\n30#2:79\n53#3,3:80\n*S KotlinDebug\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n*L\n71#1:79\n71#1:80,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RenderEffectKt {
    @Stable
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m21284BlurEffect3YTHUZs(float f10, float f11, int i10) {
        return new BlurEffect(null, f10, f11, i10, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m21285BlurEffect3YTHUZs$default(float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = TileMode.INSTANCE.m21349getClamp3opZhB0();
        }
        return m21284BlurEffect3YTHUZs(f10, f11, i10);
    }

    @Stable
    public static final OffsetEffect OffsetEffect(float f10, float f11) {
        return new OffsetEffect(null, Offset.m20727constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)), null);
    }
}
