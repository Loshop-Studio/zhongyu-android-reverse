package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final InterfaceC10570l ColorToVector = new InterfaceC10570l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // p300x7.InterfaceC10570l
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m20180invoke8_81llA(((Color) obj).m24286unboximpl());
                }

                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final AnimationVector4D m20180invoke8_81llA(long j10) {
                    long jM24273convertvNxB06k = Color.m24273convertvNxB06k(j10, ColorSpaces.INSTANCE.getOklab());
                    return new AnimationVector4D(Color.m24278getAlphaimpl(jM24273convertvNxB06k), Color.m24282getRedimpl(jM24273convertvNxB06k), Color.m24281getGreenimpl(jM24273convertvNxB06k), Color.m24279getBlueimpl(jM24273convertvNxB06k));
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Color.m24266boximpl(m20181invokevNxB06k((AnimationVector4D) obj));
                }

                /* renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m20181invokevNxB06k(AnimationVector4D animationVector4D) {
                    float v22 = animationVector4D.getV2();
                    if (v22 < 0.0f) {
                        v22 = 0.0f;
                    }
                    if (v22 > 1.0f) {
                        v22 = 1.0f;
                    }
                    float v32 = animationVector4D.getV3();
                    if (v32 < -0.5f) {
                        v32 = -0.5f;
                    }
                    if (v32 > 0.5f) {
                        v32 = 0.5f;
                    }
                    float v42 = animationVector4D.getV4();
                    float f10 = v42 >= -0.5f ? v42 : -0.5f;
                    float f11 = f10 <= 0.5f ? f10 : 0.5f;
                    float v12 = animationVector4D.getV1();
                    float f12 = v12 >= 0.0f ? v12 : 0.0f;
                    return Color.m24273convertvNxB06k(ColorKt.Color(v22, v32, f11, f12 <= 1.0f ? f12 : 1.0f, ColorSpaces.INSTANCE.getOklab()), colorSpace);
                }
            });
        }
    };

    public static final InterfaceC10570l getVectorConverter(Color.Companion companion) {
        return ColorToVector;
    }
}
