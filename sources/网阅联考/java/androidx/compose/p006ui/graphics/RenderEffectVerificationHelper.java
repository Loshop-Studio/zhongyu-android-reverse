package androidx.compose.p006ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(31)
@Metadata(m5174d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m5175d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "()V", "createBlurEffect", "Landroid/graphics/RenderEffect;", "inputRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "createBlurEffect-8A-3gB4", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "createOffsetEffect", "offset", "Landroidx/compose/ui/geometry/Offset;", "createOffsetEffect-Uv8p0NA", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final RenderEffect m9458createBlurEffect8A3gB4(RenderEffect inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        if (inputRenderEffect == null) {
            RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(radiusX, radiusY, AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(edgeTreatment));
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "{\n            android.gr…)\n            )\n        }");
            return renderEffectCreateBlurEffect;
        }
        RenderEffect renderEffectCreateBlurEffect2 = RenderEffect.createBlurEffect(radiusX, radiusY, inputRenderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(edgeTreatment));
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateBlurEffect2;
    }

    @DoNotInline
    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final RenderEffect m9459createOffsetEffectUv8p0NA(RenderEffect inputRenderEffect, long offset) {
        if (inputRenderEffect == null) {
            RenderEffect renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(Offset.m8945getXimpl(offset), Offset.m8946getYimpl(offset));
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "{\n            android.gr…et.x, offset.y)\n        }");
            return renderEffectCreateOffsetEffect;
        }
        RenderEffect renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(Offset.m8945getXimpl(offset), Offset.m8946getYimpl(offset), inputRenderEffect.asAndroidRenderEffect());
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateOffsetEffect2;
    }
}
