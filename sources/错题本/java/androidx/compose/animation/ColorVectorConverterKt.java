package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\";\u0010\b\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "ColorToVector", "Lr6/c;", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lr6/c;", "VectorConverter", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {

    @NotNull
    private static final InterfaceC6471c ColorToVector = new InterfaceC6471c() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // p152r6.InterfaceC6471c
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m6586invoke8_81llA(((Color) obj).m10692unboximpl());
                }

                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final AnimationVector4D m6586invoke8_81llA(long j7) {
                    long jM10679convertvNxB06k = Color.m10679convertvNxB06k(j7, ColorSpaces.INSTANCE.getOklab());
                    return new AnimationVector4D(Color.m10684getAlphaimpl(jM10679convertvNxB06k), Color.m10688getRedimpl(jM10679convertvNxB06k), Color.m10687getGreenimpl(jM10679convertvNxB06k), Color.m10685getBlueimpl(jM10679convertvNxB06k));
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Color.m10672boximpl(m6587invokevNxB06k((AnimationVector4D) obj));
                }

                /* renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m6587invokevNxB06k(AnimationVector4D animationVector4D) {
                    float v2 = animationVector4D.getV2();
                    if (v2 < 0.0f) {
                        v2 = 0.0f;
                    }
                    if (v2 > 1.0f) {
                        v2 = 1.0f;
                    }
                    float v32 = animationVector4D.getV3();
                    if (v32 < -0.5f) {
                        v32 = -0.5f;
                    }
                    if (v32 > 0.5f) {
                        v32 = 0.5f;
                    }
                    float v4 = animationVector4D.getV4();
                    float f = v4 >= -0.5f ? v4 : -0.5f;
                    float f7 = f <= 0.5f ? f : 0.5f;
                    float v12 = animationVector4D.getV1();
                    float f8 = v12 >= 0.0f ? v12 : 0.0f;
                    return Color.m10679convertvNxB06k(ColorKt.Color(v2, v32, f7, f8 <= 1.0f ? f8 : 1.0f, ColorSpaces.INSTANCE.getOklab()), colorSpace);
                }
            });
        }
    };

    @NotNull
    public static final InterfaceC6471c getVectorConverter(@NotNull Color.Companion companion) {
        return ColorToVector;
    }
}
