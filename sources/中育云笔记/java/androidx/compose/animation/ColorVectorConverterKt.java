package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.colorspace.ColorSpace;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final InterfaceC9540l ColorToVector = new InterfaceC9540l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // p181hd.InterfaceC9540l
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m26782invoke8_81llA(((Color) obj).m30888unboximpl());
                }

                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final AnimationVector4D m26782invoke8_81llA(long j10) {
                    long jM30875convertvNxB06k = Color.m30875convertvNxB06k(j10, ColorSpaces.INSTANCE.getOklab());
                    return new AnimationVector4D(Color.m30880getAlphaimpl(jM30875convertvNxB06k), Color.m30884getRedimpl(jM30875convertvNxB06k), Color.m30883getGreenimpl(jM30875convertvNxB06k), Color.m30881getBlueimpl(jM30875convertvNxB06k));
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Color.m30868boximpl(m26783invokevNxB06k((AnimationVector4D) obj));
                }

                /* renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m26783invokevNxB06k(AnimationVector4D animationVector4D) {
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
                    return Color.m30875convertvNxB06k(ColorKt.Color(v22, v32, f11, f12 <= 1.0f ? f12 : 1.0f, ColorSpaces.INSTANCE.getOklab()), colorSpace);
                }
            });
        }
    };

    public static final InterfaceC9540l getVectorConverter(Color.Companion companion) {
        return ColorToVector;
    }
}
